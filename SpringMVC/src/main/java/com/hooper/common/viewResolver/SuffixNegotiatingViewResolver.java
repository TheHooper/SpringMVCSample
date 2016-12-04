package com.hooper.common.viewResolver;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.Ordered;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.support.WebApplicationObjectSupport;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.util.UrlPathHelper;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by 47123 on 2016/11/14.
 */
public class SuffixNegotiatingViewResolver extends WebApplicationObjectSupport implements ViewResolver, Ordered {

    private static final Log logger = LogFactory.getLog(SuffixNegotiatingViewResolver.class);

    private static final UrlPathHelper urlPathHelper = new UrlPathHelper();

    private int order = -2147483648;

    private ConcurrentMap<String,ViewResolver> suffixes = new ConcurrentHashMap();//定义的后缀-ViewName Map

    private ViewResolver defaultViewResolver;

    private boolean response404 = false;

    public void setSuffixes(Map<String, ViewResolver> suffixes) {
        Assert.notNull(suffixes, "\'suffixes\' must not be null");
        Iterator var3 = suffixes.entrySet().iterator();

        while(var3.hasNext()) {
            Map.Entry entry = (Map.Entry)var3.next();
            this.suffixes.put((String)entry.getKey(), (ViewResolver)entry.getValue());
        }
    }

    public void setDefaultViewResolver(ViewResolver defaultViewResolver) {
        this.defaultViewResolver = defaultViewResolver;
    }

    public void setResponse404(boolean response404) {
        this.response404 = response404;
    }

    private String getSuffix(HttpServletRequest request){
        String uri = urlPathHelper.getRequestUri(request);
        String viewName = WebUtils.extractFullFilenameFromUrlPath(uri);
        String suffix = StringUtils.getFilenameExtension(viewName);
        return suffix;
    }

    private View getBestView(String viewName,Locale locale, String suffix) throws Exception {
        View view = null;
        if(suffix != null){
            ViewResolver viewResolverName = this.suffixes.get(suffix);
            if(viewResolverName != null){
                view = viewResolverName.resolveViewName(viewName,locale);
            }
        }
        if(view == null && this.defaultViewResolver != null){
            view = this.defaultViewResolver.resolveViewName(viewName,locale);
        }
        if(view == null && this.response404){
            return new View() {
                @SuppressWarnings("unchecked")
                public void render(Map model, HttpServletRequest request,
                                   HttpServletResponse response) throws Exception {
                    response.setStatus(404);
                    response.getOutputStream().write(("view can not be found!").getBytes());
                }
                public String getContentType() {
                    return "text/html";
                }
            };
        }
        return view;
    }

    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        RequestAttributes attrs = RequestContextHolder.getRequestAttributes();
        Assert.isInstanceOf(ServletRequestAttributes.class, attrs);
        String suffix = this.getSuffix(((ServletRequestAttributes)attrs).getRequest());
        View bestView = this.getBestView(viewName, locale,suffix);
        return bestView;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public int getOrder() {
        return this.order;
    }
}

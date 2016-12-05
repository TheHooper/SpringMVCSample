package com.hooper.common.exception;

import com.alibaba.fastjson.JSON;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UrlPathHelper;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;


/**
 * Created by 47123 on 2016/11/15.
 */
public class ExceptionResolver  implements HandlerExceptionResolver {

    private static final UrlPathHelper urlPathHelper = new UrlPathHelper();


    private ConcurrentMap<Exception,String> normalExceptionCodes;


    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        String uri = urlPathHelper.getRequestUri(httpServletRequest);
        String viewName = WebUtils.extractFullFilenameFromUrlPath(uri);
        String suffix = StringUtils.getFilenameExtension(viewName);
        if(httpServletRequest.getHeader("Accept").indexOf("json")>-1 || "json".equals(suffix)){
            httpServletResponse.setContentType("application/json");
            httpServletResponse.setCharacterEncoding("UTF-8");
            Map<String,String> exInfoMap = new HashMap<String, String>();
            if( e instanceof ErrorCodeException){
                exInfoMap.put("state",((ErrorCodeException) e).getCode());
                exInfoMap.put("message",e.getMessage());

            }else if( e instanceof BindException) {
                exInfoMap.put("state","7777");
                exInfoMap.put("message",((BindException) e).getFieldError().getField()
                        +":"+((BindException) e).getFieldError().getDefaultMessage());
            }
            else {
                String exceptionName = e.getClass().getSimpleName();
                //这里可以做个配置，从配置文件里匹配常用异常名的对应错误码。
                exInfoMap.put("state","9999");
                exInfoMap.put("message",exceptionName);
            }
            try {
                String jsonStr = JSON.toJSONString(exInfoMap);
                httpServletResponse.getWriter().write(jsonStr);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            return null;
        }else{
            return modelAndView;
        }
    }


    public ConcurrentMap<Exception, String> getNormalExceptionCodes() {
        return normalExceptionCodes;
    }

    public void setNormalExceptionCodes(ConcurrentMap<Exception, String> normalExceptionCodes) {
        this.normalExceptionCodes = normalExceptionCodes;
    }
}

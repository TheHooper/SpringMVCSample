package com.hooper.common.viewResolver;

import com.alibaba.fastjson.JSON;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by 47123 on 2016/11/11.
 */
public class CustomJsonView implements View {

    public static final String DEFAULT_CONTENT_TYPE = "application/json";
    private ObjectMapper objectMapper = new ObjectMapper();
    private JsonEncoding encoding;
    private boolean prefixJson;
    private Set<String> renderedAttributes;
    private boolean disableCaching;
    private String contentType;


    public CustomJsonView(){
        this.encoding = JsonEncoding.UTF8;
        this.prefixJson = false;
        this.disableCaching = true;
        this.setContentType("application/json");
    }

    @Override
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    protected void prepareResponse(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType(this.getContentType());
        response.setCharacterEncoding(this.encoding.getJavaName());
        if(this.disableCaching) {
            response.addHeader("Pragma", "no-cache");
            response.addHeader("Cache-Control", "no-cache, no-store, max-age=0");
            response.addDateHeader("Expires", 1L);
        }

    }

    protected void renderMergedOutputModel(Map<String, Object> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        Object value = this.filterModel(map);
        System.out.println(httpServletRequest);
        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("state",0);
        resultMap.put("data",value);
        String json = JSON.toJSONString(resultMap);
        httpServletResponse.getWriter().write(json);
    }

    protected Object filterModel(Map<String, Object> model) {
        HashMap result = new HashMap(model.size());
        Set renderedAttributes = !CollectionUtils.isEmpty(this.renderedAttributes)?this.renderedAttributes:model.keySet();
        Iterator var5 = model.entrySet().iterator();

        while(var5.hasNext()) {
            Map.Entry entry = (Map.Entry)var5.next();
            if(!(entry.getValue() instanceof BindingResult) && renderedAttributes.contains(entry.getKey())
                    && !((String)entry.getKey()).toLowerCase().contains("input") && !((String)entry.getKey()).toLowerCase().contains("form") ) {
                result.put((String)entry.getKey(), entry.getValue());
            }
        }

        return result;
    }


    @Override
    public void render(Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        this.prepareResponse(httpServletRequest, httpServletResponse);
        this.renderMergedOutputModel((Map<String, Object>) map,httpServletRequest,httpServletResponse);
    }
}

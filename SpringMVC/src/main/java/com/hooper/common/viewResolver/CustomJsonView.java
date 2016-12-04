package com.hooper.common.viewResolver;

import com.alibaba.fastjson.JSON;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
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
public class CustomJsonView extends AbstractView {

    public static final String DEFAULT_CONTENT_TYPE = "application/json";
    private ObjectMapper objectMapper = new ObjectMapper();
    private JsonEncoding encoding;
    private boolean prefixJson;
    private Set<String> renderedAttributes;
    private boolean disableCaching;

    public CustomJsonView(){
        this.encoding = JsonEncoding.UTF8;
        this.prefixJson = false;
        this.disableCaching = true;
        this.setContentType("application/json");
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

    @Override
    protected void renderMergedOutputModel(Map<String, Object> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        Object value = this.filterModel(map);
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
            if(!(entry.getValue() instanceof BindingResult) && renderedAttributes.contains(entry.getKey())) {
                result.put((String)entry.getKey(), entry.getValue());
            }
        }

        return result;
    }
}

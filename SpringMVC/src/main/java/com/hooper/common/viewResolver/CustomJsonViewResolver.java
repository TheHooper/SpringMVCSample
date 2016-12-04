package com.hooper.common.viewResolver;

import org.springframework.core.Ordered;
import org.springframework.web.context.support.WebApplicationObjectSupport;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * Created by 47123 on 2016/11/14.
 */
public class CustomJsonViewResolver extends WebApplicationObjectSupport implements ViewResolver, Ordered {

    private int order = 214743648;

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public int getOrder() {
        return this.order;
    }

    @Override
    public View resolveViewName(String s, Locale locale) throws Exception {
        View view = (View) this.getWebApplicationContext().getBean(
                "customJsonView");
        return view;
    }
}

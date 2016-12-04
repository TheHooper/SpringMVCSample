package com.hooper.common.aspect;

import com.hooper.common.annotation.AuthAnnotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by hooper on 2016/11/16.
 */
@Component
@Aspect
public class PermissionAspect {


    //注解声明，代替在xml中声明
    //argNames 如果为小写，则不能识别，大写匹配了原本的类
    //@annotation 的 value 可以是 spring里的BeanName 也可以是全类名 也可以是大写的beanName
    //则可能需要配合 value = "@annotation(AuthAnnotation)&&args(argName)" 匹配argName
    @Pointcut(value = "@annotation(authAnnotation)",argNames="authAnnotation")
    public void poinCut(AuthAnnotation authAnnotation){
        System.out.println("poinCut");
    }


    @Around("poinCut(authAnnotation)")
    public Object around(ProceedingJoinPoint joinPoint,AuthAnnotation authAnnotation) throws Throwable {
        System.out.println(joinPoint);
        System.out.println(authAnnotation);
        joinPoint.proceed();
        return null;
    }
}

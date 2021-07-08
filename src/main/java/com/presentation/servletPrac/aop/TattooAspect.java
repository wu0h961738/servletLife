package com.presentation.servletPrac.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
@Order(1)
public class TattooAspect {

    @Pointcut(value = "execution(* com..controller..*(..))")
    public void tattooPointCut(){}

    @Before("tattooPointCut()")
    public void doBefore(){
        log.info("Aspect before : 刺昆蟲一定要搭配小瓢蟲");
    }

    @After("tattooPointCut()")
    public void doAfter(){
        log.info("Aspect After : 好看的話再加一隻");
    }
}

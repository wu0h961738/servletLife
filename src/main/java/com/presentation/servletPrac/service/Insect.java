package com.presentation.servletPrac.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Insect {
    public void butterfly(){
        log.info("cut a butterfly");
    }
}

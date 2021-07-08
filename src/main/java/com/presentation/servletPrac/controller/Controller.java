package com.presentation.servletPrac.controller;

import com.presentation.servletPrac.model.TattooRq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/handle")
@Slf4j
public class Controller {

    /**
     * get user
     */
    @RequestMapping(value = "/tattoo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public void doTattoo(@RequestBody TattooRq tattooRq) {
        log.info("刺個小蝴蝶");
    }
}

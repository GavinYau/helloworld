package com.gavinyau.helloworld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author Gavin
 * @date 2020/8/9 17:54
 */
@RestController
public class HelloWorldController {

    Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping({"/helloWorld", "/"})
    public String helloWorld() {
        logger.info("helloWorld");
        return "helloWorld";
    }

}

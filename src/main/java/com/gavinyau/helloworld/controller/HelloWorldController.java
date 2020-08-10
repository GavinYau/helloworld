package com.gavinyau.helloworld.controller;

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

    @GetMapping({"/helloWorld","/"})
    public String helloWorld() {
        return "helloWorld-GavinYau";
    }

}

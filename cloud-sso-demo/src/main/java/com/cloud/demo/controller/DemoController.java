package com.cloud.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author Aijm
 * @Description
 * @Date 2019/12/13
 */
@RestController
public class DemoController {
    @GetMapping("/user")
    public Authentication user(Authentication authentication) {
        return authentication;
    }
}

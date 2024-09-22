package com.wenjing.restfullApi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    private static final String PATH_LOGIN = "/login";
    private static final String PATH_SUCCESS = "/success";

    @GetMapping(PATH_LOGIN)
    public String login() {
        return "login";
    }

    @GetMapping(PATH_SUCCESS)
    public String success() {
        return "success";
    }
}

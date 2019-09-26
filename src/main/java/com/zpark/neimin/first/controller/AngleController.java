package com.zpark.neimin.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AngleController {
    @RequestMapping("/dashboard")
    public String dashbord() {
        return "dashboard";
    }
}

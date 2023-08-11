package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("view/dashboard-analytics")
    public String hello() {
        return "view/dashboard-analytics";
    }
}

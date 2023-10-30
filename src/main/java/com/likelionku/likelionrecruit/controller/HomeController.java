package com.likelionku.likelionrecruit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class HomeController {
    @GetMapping("/pmanddesign")
    public String pmanddesign() {
        return "imageURL";
    }
}

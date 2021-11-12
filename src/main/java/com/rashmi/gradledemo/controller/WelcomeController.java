package com.rashmi.gradledemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//http://localhost:8080/welcome
@Slf4j
@Controller
public class WelcomeController {

    @GetMapping("welcome")
    public String welcome(Model model){
        log.info("welcome method called");
        model.addAttribute("message", "Hello Gradle");
        return "welcome";
    }
}

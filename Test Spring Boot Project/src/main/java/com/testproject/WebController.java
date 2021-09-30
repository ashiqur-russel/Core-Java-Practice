package com.testproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/hello")

    public String sayHello(Model model) {

        System.out.println("Hello Spring Boot");

        model.addAttribute(" ", "Greeting from Ashiqur Russel");
        return "hello";

    }
}


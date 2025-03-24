package com.example.heroku_test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class viewController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "HOME PAGE");

        return "HOME";
    }
}

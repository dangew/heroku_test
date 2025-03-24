package com.example.heroku_test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class viewController {
    @GetMapping("/")
    public String home(Model model) {

        SendValue sendValue = new SendValue();
        sendValue.setValue("Hello, World!");

        model.addAttribute("sendValue", sendValue);

        return "HOME";
    }
}

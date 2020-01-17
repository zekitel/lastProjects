package com.zekitel.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //@RestController nesne döner //@Controller page döner
public class GreetingController {
    @GetMapping("/")
    String greetingPage(ModelMap map, @RequestParam(required = true) String name) {
        name = name == null || name.trim().equals("") ? "Thymeleaf" : name;
        String message = String.format("Merhaba %s!", name);
        map.put("message", message);
        return "index";
    }
}
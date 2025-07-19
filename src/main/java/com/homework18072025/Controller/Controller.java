package com.homework18072025.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home/cv")
public class Controller {
    @GetMapping("/cv")
    public String printData() {
        return "cv";
    }
}

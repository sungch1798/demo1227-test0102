package com.example.demo001.Control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainc {
    @GetMapping("/")
    public String main01(){
        return "index";
    }
}

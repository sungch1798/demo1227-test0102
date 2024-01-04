package com.example.demo0104.MControl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class Mcontrl
{
    @GetMapping("/")
    public String main(){
        return "index";
    }

    @GetMapping("/p01")
    public String main01(){
        return "page1";
    }

    @GetMapping("/p02")
    @ResponseBody
    public String main02(){
    java.util.Random random=new Random();
    return "<h3>這是從伺服器下載的內容01...亂數50000!</h3>"+ random.nextInt(50000);

    }

    @GetMapping("/aa")
    public String showFragementaa() {
        java.util.Random random = new Random();
        return "page2";
    }

    @GetMapping("/p03")
    @ResponseBody
    public String main03(){
        java.util.Random random=new Random();
        return "<h3>這是從伺服器下載的內容02...亂數10000!</h3>"+ random.nextInt(10000);
    }
}

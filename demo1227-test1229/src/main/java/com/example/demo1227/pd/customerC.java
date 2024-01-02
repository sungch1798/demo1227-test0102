package com.example.demo1227.pd;

import com.example.demo1227.midel.Customer;
import com.example.demo1227.serive.CS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class customerC {
    @Autowired
    CS cs;


    @GetMapping("/customers")
    public String showC(Model model){
        List<Customer> custs=cs.getCustomerAll();
        model.addAttribute("custs",custs);
        return "odl2";
    }
    @GetMapping("/reg")
    public String reg1(){
        return "reg";
    }

    @PostMapping("/regok")
    public String reg2(){
        return "regok";
    }
}

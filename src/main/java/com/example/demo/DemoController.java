package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DemoController {

    @RequestMapping(value="/index")
    String getIndex(){
        System.out.println("HELLO");

        return "index";
    }


    @GetMapping("/orders")
    String getOrders(){
        return "orders";
    }
}

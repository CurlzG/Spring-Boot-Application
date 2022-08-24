package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
@Controller
public class DemoController {

    @RequestMapping(value="/index")
    String getIndex(){
        System.out.println("HELLO");

        return "index";
    }


    @PostMapping(value="/index")
    String getOrders(String Name, String Address){
        System.out.println(Name);
        System.out.println(Address);
        if(Address != "" && Name != ""){
            return "orders";
        } else {
            return "index";
        }
    }
}

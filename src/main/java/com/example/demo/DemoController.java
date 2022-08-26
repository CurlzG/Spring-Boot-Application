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
    @RequestMapping(value="/popup")
    String getPopup(){
        //System.out.println("HELLO");

        return "popup";
    }


    @PostMapping(value="/index")
    String getOrders(Model mod, String Name, String Address){
        System.out.println(Name);
        System.out.println(Address);
        if(Address != "" && Name != ""){
            return "orders";
        } else {
            mod.addAttribute("Invalid", "No Name or Address Added");
            return "index";
        }
    }
}

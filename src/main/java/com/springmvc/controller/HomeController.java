// This is controller for sending data from controller to view


package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/first")
public class HomeController {

    @RequestMapping(value = "/home",method = RequestMethod.GET)  // when /home request will come then this will call index
    public String home(Model model){
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Poul");
        list.add("barak");
        list.add("trump");
        list.add("biden");
        model.addAttribute("Names",list);
        return "index";
    }
}

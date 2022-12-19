// This is controller for sending data from view to controller


package com.springmvc.controller;

import com.springmvc.model.User;
import com.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {

    @Autowired
    private UserService userService;

    @ModelAttribute
    public void commonDataForMode(Model model){
        model.addAttribute("Header","Created by Pratik Panchal");
    }

    @RequestMapping("/contact")
    public String show(Model m){
        return "contact";
    }

        /*@RequestMapping(path = "/processform",method = RequestMethod.POST)
    public String helper(@RequestParam("email") String email ,
                         @RequestParam("userName") String name ,
                         @RequestParam("userPassword") String password, Model model) {
            System.out.println("user email" + email);
            System.out.println("user name" + name);
            System.out.println("user password" + password);

            model.addAttribute("name", name);
            model.addAttribute("email", email);
            model.addAttribute("password", password);
            return "success";
        } */

    // Another method using model attribute
    // It will fetch data which is coming as request object means it is doing working of requestParam
    // It will set those data to user object
    // It will also set the user object to that model's add attribute method

    @RequestMapping(path = "/processform",method = RequestMethod.POST)
    public String helper(@ModelAttribute User user , Model model){
        this.userService.createuser(user);
        return "success";
    }


}


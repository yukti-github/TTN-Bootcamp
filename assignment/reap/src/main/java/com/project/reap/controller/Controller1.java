package com.project.reap.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controller1 {

    @RequestMapping(value = "/reap", method = RequestMethod.GET)
    public String dashboard() {
        return "Dashboard";
    }

    @RequestMapping(value = "/login.html", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/register.html", method = RequestMethod.GET)
    public String Ques1() {
        return "register";
    }

    @RequestMapping(value = "/forgot-password.html", method = RequestMethod.GET)
    public String Ques4() {
        return "forgot-password";
    }

}

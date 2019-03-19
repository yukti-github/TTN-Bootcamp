package com.SpringBoot.SpringBootAssignment.Controller;
import com.SpringBoot.SpringBootAssignment.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    User user;

    @GetMapping("/user")
    @ResponseBody
    public String getUser(){
        return "UserName is :" + user.getUserName() +" "+" Password is "+ user.getPassword();
    }
}

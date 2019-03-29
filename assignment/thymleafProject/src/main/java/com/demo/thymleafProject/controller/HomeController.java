package com.demo.thymleafProject.controller;

import com.demo.thymleafProject.Entity.Employee;
import com.demo.thymleafProject.Entity.User;
import com.demo.thymleafProject.Repository.EmployeeRepository;
import com.demo.thymleafProject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Optional;


@Controller
public class HomeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    UserRepository userRepository;

    //********QUES 1**********
    @RequestMapping(value = "/ques1", method = RequestMethod.GET)
    public String Ques1() {
        return "Ques1";
    }

    //********** Ques 2 *********
    @RequestMapping(value = "/ques2", method = RequestMethod.GET)
    public String Ques2() {
        return "Ques2";
    }

    //*********Ques 3*********
    @RequestMapping(value = "/ques3", method = RequestMethod.GET)
    public String ques3(Model model) {
        Employee employee = new Employee();
        model.addAttribute(employee);
        return "Ques3";
    }

    @RequestMapping(value = "/ques3Action", method = RequestMethod.POST)
    public String saveEmployees(Employee employee, Model model) {
        model.addAttribute(employee);
        return "Ques3output";
    }


    //*********QUES 4*************
    @RequestMapping("/ques4")
    public String question4(Model model) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setEmpName("yukti");
        employee.setSalary(10101001);
        employeeRepository.save(employee);
        Employee employee1 = new Employee();
        employee1.setId(2);
        employee1.setEmpName("shivani");
        employee1.setSalary(991001);
        employeeRepository.save(employee1);

        model.addAttribute("employee", employeeRepository.findAll());
        return "Ques4";
    }

    //**********QUES 5 *****************

    @RequestMapping("/saveUsersForQ5")
    @ResponseBody
    public void saveUserQ5() {
        User user = new User();
        user.setName("yukti");
        user.setEmail("yukti@mail.com");
        user.setAdmin(true);
        userRepository.save(user);
        User user1 = new User();
        user1.setName("riya");
        user1.setEmail("riyas@gmail.com");
        user1.setAdmin(false);
        userRepository.save(user1);
        User user2 = new User();
        user2.setName("rock");
        user2.setEmail("rock@gmail.com");
        user2.setAdmin(false);
        userRepository.save(user2);
    }

    @RequestMapping("/ques5")
    public String question5() {
        return "Ques5";
    }

    @RequestMapping("/q5FormAction")
    @ResponseBody
    public String question5(HttpServletRequest httpServletRequest) {
        String msg = "not a valid user id";
        Integer id = Integer.parseInt(httpServletRequest.getParameter("id"));
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            if (user.get().getAdmin())
                msg = "Hello admin : " + user.get().getName();
            else
                msg = "Hello user : " + user.get().getName();
        }
        return msg;
    }


    //***********QUES 7 ***************
    @RequestMapping("/ques7")
    public String question7() {
        return "Ques7";
    }

    @GetMapping("/getTime")
    @ResponseBody
    public String getTime() {
        return new Date().toLocaleString();
    }


    //*******QUES 8*******
    @RequestMapping("/ques8")
    public String question8(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "Ques8";
    }

    //******QUES 9********

    @RequestMapping("/ques9")
    public String question9(){
        return "Ques9";
    }

    @RequestMapping(value = "/getMsgQ9")
    @ResponseBody
    public String question9SetMsg(@RequestParam String type){
        String msg = "Hello : "+type.toLowerCase();
        return msg;
    }


//*********QUES 10 ***********
    @RequestMapping("/ques10")
    public String question10(){
        return "Ques10";
    }

    @PostMapping("/registerEmployee")
    @ResponseBody
    public String registerEmployee(@ModelAttribute Employee employee) throws InterruptedException {
        Thread.sleep(4000L);
        return employee.getEmpName();
    }
}

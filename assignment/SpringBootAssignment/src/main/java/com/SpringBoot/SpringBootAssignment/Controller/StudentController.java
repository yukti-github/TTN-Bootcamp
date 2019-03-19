package com.SpringBoot.SpringBootAssignment.Controller;

import com.SpringBoot.SpringBootAssignment.Entity.Student;
import com.SpringBoot.SpringBootAssignment.Event.Bootstrap;
import com.SpringBoot.SpringBootAssignment.Service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    public class StudentController {

        @Autowired
        StudentService studentService;

        @Autowired
         Bootstrap bootstrap;

        Logger logger= LoggerFactory.getLogger(StudentController.class);


        @GetMapping("/student")
        public List<Student> getStudents(){
            bootstrap.init();
            logger.info("......Getting Students......");
            logger.warn("warning log");
            return StudentService.getStudents();
        }
    }

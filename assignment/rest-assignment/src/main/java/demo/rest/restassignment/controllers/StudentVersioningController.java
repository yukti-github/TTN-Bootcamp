package demo.rest.restassignment.controllers;


import demo.rest.restassignment.entities.StudentV1;
import demo.rest.restassignment.entities.StudentV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentVersioningController {

    //URI Versioning
    @GetMapping("/student/version/V1")
    StudentV1 getStudentV1() {
        return new StudentV1("yukti sharma");
    }

    @GetMapping("/student/version/V2")
    StudentV2 getPersonV2() {
        System.out.println("vhjvhkbjlb");
        return new StudentV2("yukti", "sharma");
    }

    //Parameter Versioning
    @GetMapping(value = "/student/version/param", params = "version=1")
    StudentV1 getStudentParam1() {
        return new StudentV1("yukti sharma");
    }

    @GetMapping(value = "/student/version/param", params = "version=2")
    StudentV2 getStudentParam2() {
        return new StudentV2("yukti", "sharma");
    }


    //Header Versioning
    @GetMapping(value = "/student/version/header", headers = "x-api-key=1")
    StudentV1 getStudentHeader1() {
        return new StudentV1("yukti sharma");
    }

    @GetMapping(value = "/student/version/header", headers = "x-api-key=2")
    StudentV2 getStudentHeader2() {
        return new StudentV2("yukti", "sharma");
    }
}
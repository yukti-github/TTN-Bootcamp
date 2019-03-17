package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class StudentController2 {

    @RequestMapping("/")
    ModelAndView display() {
        ModelAndView modelAndView = new ModelAndView("Instructions");
        return modelAndView;
    }

    //Solution-3
    @RequestMapping("/second")
    ModelAndView index2() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    //Solution-4
    @RequestMapping("/hello")
    @ResponseBody
    String hello() {
        return "Hello World";
    }

    //Solution-5
    @RequestMapping("/third")
    ModelAndView index3() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("msg", "HelloWorld from yukti (Ques5)");
        return modelAndView;
    }

    //Solution-6

    @RequestMapping("/name/{first}/{last}")
    @ResponseBody
    String returnFirstAndLastName(@PathVariable String first, @PathVariable String last) {
        return "First name is " + first + " Last name is- " + last;
    }

    //Solution-7

    @RequestMapping("/yourname/{FirstName}/{LastName}")
    @ResponseBody
    String returnFirstAndLastName(@PathVariable Map<String, String> requestMap) {
        return "First name is " + requestMap.get("FirstName") + " Last name is- " + requestMap.get("LastName");

    }
}

//Solution- 8

@Controller
@RequestMapping("/form")
class StudentController3 {

    @RequestMapping(value = "/formdata", method = RequestMethod.GET)
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("form");
        return modelAndView;
    }

    @RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(@RequestParam("firstName") String firstName,
                      @RequestParam("lastName") String lastName) {
        return "Your first name is " + firstName + " ,and last name is-  " + lastName;
    }
}


//Solution-9

@Controller
@RequestMapping("/studentco")
 class StudentController4 {

    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("form2");
        return modelAndView;
    }

    @RequestMapping(value = "/index2.html", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(StudentCO student) {
        return "Name (via StudentCO) is- " + student.getFirstName() + " Last name (via StudentCO) is - " + student.getLastname();
    }
}


//Solution- 10

@Controller
@RequestMapping("/form3")
 class StudentController5 {
    @ModelAttribute
    void addingObject(Model model){
        model.addAttribute("heading","Spring MVC Demo");
    }

    @RequestMapping(value = "/formdata", method = RequestMethod.GET)
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("form3");
        return modelAndView;
    }

    @RequestMapping(value = "/submitForm3.html", method = RequestMethod.POST)
    @ResponseBody
    ModelAndView submitForm(@ModelAttribute("user") StudentCO user) {
        ModelAndView modelAndView = new ModelAndView("submit");
        return modelAndView;
    }
}

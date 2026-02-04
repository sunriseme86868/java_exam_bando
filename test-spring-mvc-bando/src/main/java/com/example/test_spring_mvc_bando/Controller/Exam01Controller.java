package com.example.test_spring_mvc_bando.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {

    @RequestMapping("show-self-introduction")
    public String showpage(){
        return "exam-01";
    }

}

package com.example.test_spring_mvc_bando.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

    @RequestMapping("/show-company-introduction")
    public String showinfo(){
    return "redirect{/exam02/show-company-introduction}";
    }
    
    @RequestMapping("show-company-introduction2")
    public String showinfo2(){
        return "exam02";
    }
}

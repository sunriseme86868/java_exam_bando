package com.example.test_spring_mvc_bando.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_mvc_bando.form.exam03form;

@Controller
@RequestMapping("exam03")
public class Exam03Controller {

    @ModelAttribute
    public exam03form setUpForm(){
        return new exam03form();
    }

    @RequestMapping("")
    public String index(){
        return "name-form";
    }

    @RequestMapping("/recieve-info")
    public String recieveinfo(exam03form form,Model model){

        System.out.println("入力された値は"+form.getName()+"です。");
        model.addAttribute("f",form.getName());
        return "finished";
    }

}

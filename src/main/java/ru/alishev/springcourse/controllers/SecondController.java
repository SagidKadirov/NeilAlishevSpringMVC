package ru.alishev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class SecondController {
    @GetMapping("/exit")
    public String exit(){
        System.out.println("Обращение на exit");
        return "second/exit";
    }
}

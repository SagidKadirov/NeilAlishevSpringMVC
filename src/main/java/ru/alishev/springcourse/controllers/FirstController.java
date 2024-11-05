package ru.alishev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam("name")String name,
                            @RequestParam("surname") String surname){

        System.out.println("Обращение на hello\nПрием параметров\nИмя: "+name+"\nФамилия: "+surname);
        return "first/hello";

    }

    @GetMapping("/goodbye")
    public String goodByePage(@RequestParam("name")String name,
                              @RequestParam("surname") String surname){

        System.out.println("Обращение на goodbye\nПрием параметров\nИмя: "+name+"\nФамилия: "+surname);
        return "first/goodbye";

    }
}
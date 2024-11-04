package ru.alishev.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController{

    @GetMapping("/hello-world")
    public String sayHello(){
        System.out.println("422231231231");
        return "hello_world";
    }
}

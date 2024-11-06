package ru.alishev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {
        model.addAttribute(" message", "name: " + name + ", surname: " + surname);
        System.out.println("Обращение на hello\nПрием параметров\nИмя: " + name + "\nФамилия: " + surname);
        return "first/hello";

    }

    @GetMapping("/goodbye")
    public String goodByePage(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "surname", required = false) String surname,
                              Model model) {
        model.addAttribute(" message", "имя: " + name + ", фамилия: " + surname);
        System.out.println("Обращение на goodbye\nПрием параметров\nИмя: " + name + "\nФамилия: " + surname);
        return "first/goodbye";

    }
}

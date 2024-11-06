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
        model.addAttribute("message", "name: " + name + ", surname: " + surname);
        System.out.println("Обращение на hello\nПрием параметров\nИмя: " + name + "\nФамилия: " + surname);
        return "first/hello";

    }

    @GetMapping("/goodbye")
    public String goodByePage(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "surname", required = false) String surname,
                              Model model) {
        model.addAttribute("message", "имя: " + name + ", фамилия: " + surname);
        System.out.println("Обращение на goodbye\nПрием параметров\nИмя: " + name + "\nФамилия: " + surname);
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculatorPage(@RequestParam(value= "a",required = false) Integer a,
                                 @RequestParam(value = "b", required = false) Integer b,
                                 @RequestParam(value = "action",required = false) String action,
                                 Model model){
        if(a!=null&&b!=null&&action!=null)
        {
            double c;
        switch (action)
        {
            case "addition":
                c=a+b;
                model.addAttribute("result", "The result of addition number = "+ a+" and number = "+b+" is "+c);
                break;
            case "subtraction":
                c=a-b;
                model.addAttribute("result", "The result of subtraction number = "+ a+" and number = "+b+" is "+c);
                break;
            case "multiplication":
                c=a*b;
                model.addAttribute("result", "The result of multiplication number = "+ a+" and number = "+b+" is "+c);
                break;
            case "division":
                if(b!=0){
                    c=a/(double)b;
                    model.addAttribute("result", "The result of division number = "+ a+" and number = "+b+" is "+c);
                }
                else {
                    model.addAttribute("result", "Can't divide by zero");
                }
                break;
            default:
                model.addAttribute("result", "Error the calculator don't understand your wishes");
        }
        }


        return "first/calculator";
    }
}

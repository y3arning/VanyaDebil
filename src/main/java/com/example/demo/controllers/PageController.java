package com.example.demo.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;





@Controller
public class PageController {




    @GetMapping("/about")
    public String about (Model model) {
        return "about";
    }

    @GetMapping("/hhh")
    public String hhh (Model model) {
        return "hhh";
    }


    @GetMapping("/contacts")
    public String contacts (Model model) {
        return "contacts";
    }

    @GetMapping("/product")
    public String product (Model model) {
        return "product";
    }


    @GetMapping("/partners")
    public String partners (Model model) {
        return "partners";
    }


    @GetMapping("/ru-us")
    public String ruUs (Model model) {
        return "ru-us";
    }




}

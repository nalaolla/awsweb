package com.nalaolla.awsweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

    @GetMapping("/")
    public String main(Model model) {

        model.addAttribute("title", "awsweb title");
        model.addAttribute("contents", "awsweb contents");

        return "/main";
    }
}

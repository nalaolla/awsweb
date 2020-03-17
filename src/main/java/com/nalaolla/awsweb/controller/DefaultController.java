package com.nalaolla.awsweb.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/")
public class DefaultController {

    @GetMapping("main")
    public String main(Model model) {

        model.addAttribute("title", "awsweb title");
        model.addAttribute("contents", "awsweb contents");

        return "main";
    }

    @GetMapping("error")
    public String getError(Model model) {

        model.addAttribute("title", "awsweb error");
        model.addAttribute("contents", "awsweb error");

        return "error";
    }

    @GetMapping("")
    public String postError(Model model) {

        model.addAttribute("title", "awsweb error");
        model.addAttribute("contents", "awsweb error");

        return "default";
    }
}

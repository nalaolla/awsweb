package com.nalaolla.awsweb.controller;

import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/")
public class DefaultController {

    private static final Logger logger = LogManager.getLogger(DefaultController.class);

    @GetMapping("main")
    public String main(Model model) {

        model.addAttribute("title", "awsweb title");
        model.addAttribute("contents", "awsweb contents");
        logger.debug("배포테스트");
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

        model.addAttribute("title", "awsweb default");
        model.addAttribute("contents", "awsweb default");
//        logger.debug("배포테스트");
        System.out.println("배포테스트 진행");
        return "default";
    }
}

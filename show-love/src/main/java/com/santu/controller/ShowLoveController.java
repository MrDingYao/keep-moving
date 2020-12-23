package com.santu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author santu
 * @date 2020/11/16 21:52
 */
@RequestMapping("/love")
@Controller
public class ShowLoveController {

    @GetMapping
    public String index() {
        return "/index";
    }

    @GetMapping("merry-christmas")
    public String merryChristmas() {
        return "merry-christmas";
    }

}

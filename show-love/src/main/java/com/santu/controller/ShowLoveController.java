package com.santu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author santu
 * @date 2020/11/16 21:52
 */
@Controller
public class ShowLoveController {

    @RequestMapping("love")
    public String index() {
        System.out.println("love is here");
        return "show-love";
    }

}

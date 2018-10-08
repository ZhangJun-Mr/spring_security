package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangjun
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping("/")
    String root(){
        return "redirect:/index";
    }

    @RequestMapping("/index")
    String index(){
        return "index";
    }

    @RequestMapping("/user/index")
    String userIndex(){
        return "user/index";
    }

    @RequestMapping("/login")
    String login(){
        return "login";
    }

    @RequestMapping("/login-error")
    String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }

    @RequestMapping("/401")
    String accessDenied(){
        return "401";
    }
}

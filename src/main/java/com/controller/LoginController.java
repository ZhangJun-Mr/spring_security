package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("/")
public class LoginController {

    @RequestMapping("/login")
    public ModelAndView login(ModelAndView modelAndView){
        modelAndView.setViewName("/index");
        return modelAndView;
    }
}

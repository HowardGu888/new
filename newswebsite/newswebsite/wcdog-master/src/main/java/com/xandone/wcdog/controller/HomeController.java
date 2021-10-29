package com.xandone.wcdog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ：xandone
 * created on  ：2021/10/23 16:52
 * description：
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping(value = "/front")
    public String frontHome() {
        return "wcdog-web/main";
    }
}

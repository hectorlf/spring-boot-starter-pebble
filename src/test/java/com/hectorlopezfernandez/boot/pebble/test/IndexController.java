package com.hectorlopezfernandez.boot.pebble.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index.action")
    public String index(ModelMap model) {
        return "index";
    }

}
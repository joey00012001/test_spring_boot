package com.example.demo_jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {
    @RequestMapping("/jsp")
    public  String getJsp(){
        return "index";
    }
}

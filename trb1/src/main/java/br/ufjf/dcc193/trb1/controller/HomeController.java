package br.ufjf.dcc193.trb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
    
    @RequestMapping("")
    public String index(){
        return "index";
    }
    @RequestMapping("Home")
    public String home(){
        return "index";
    }
}
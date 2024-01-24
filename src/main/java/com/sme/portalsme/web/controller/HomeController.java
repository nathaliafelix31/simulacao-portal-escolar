package com.sme.portalsme.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"/", "/home"})
    public String home(){

        return "/home.html";
    }

    @RequestMapping({"/rede"})
    public String Rede(){

        return "/rede.html";
    }

}

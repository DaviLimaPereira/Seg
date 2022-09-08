package com.wintech.sge.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController{
    
    //método para executar a page index
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute( "titulo", "S.G.E. - Home");
        return "index";
    }
}
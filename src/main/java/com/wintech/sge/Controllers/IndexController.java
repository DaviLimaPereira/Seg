package com.wintech.sge;

@Controller
public class IndexController{
    
    //método para executar a page index
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
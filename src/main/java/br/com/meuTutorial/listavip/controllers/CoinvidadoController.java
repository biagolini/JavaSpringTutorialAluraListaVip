package br.com.meuTutorial.listavip.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoinvidadoController {    

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    
}

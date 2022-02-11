package br.com.meuTutorial.listavip.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.meuTutorial.listavip.Entities.Convidados;
import br.com.meuTutorial.listavip.repository.ConvidadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;


@Controller
public class CoinvidadoController {    

    @Autowired
	private ConvidadoRepository repository;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/listavip")
	public String listaConvidados(Model model){
		
		Iterable<Convidados> convidados = repository.findAll();		
		model.addAttribute("convidados", convidados);		
		return "listaconvidados";
	}
    
}

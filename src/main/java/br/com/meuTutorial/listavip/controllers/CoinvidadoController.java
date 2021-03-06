package br.com.meuTutorial.listavip.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.meuTutorial.listavip.Entities.Convidados;
import br.com.meuTutorial.listavip.repository.ConvidadoRepository;


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

    @PostMapping(value = "salvar")
	public String salvar(@RequestParam("nome") String nome, @RequestParam("email")String email, 
			@RequestParam("telefone") String telefone, Model model){
		
		Convidados novoConvidado = new Convidados(nome, email, telefone);
		
		repository.save(novoConvidado);
		
		Iterable<Convidados> convidados = repository.findAll();
		
		
		model.addAttribute("convidados", convidados);
		
		return "listaconvidados";
        }
    
}

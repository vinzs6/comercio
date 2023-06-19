package com.itb.inf2cm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2cm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	@GetMapping("/listar")
	public String testProduto(Model model) {
	List<Produto> listaDeProdutos = new ArrayList<Produto>();
		
		Produto p1 = new Produto();
		
		p1.setId(2l);
		p1.setNome("televisor samsung");
		p1.setCodigoBarras("infinito12425");
		p1.setPreco(100);
		p1.setDescricao("tv boa utilitaria");
		
		Produto p2 = new Produto();
	p2.setNome("tv nao utilitaria mas boa");
	 p2.setCodigoBarras("95849294");
	 p2.setId(12l);
	 p2.setPreco(150.00);
	 p2.setDescricao("televisor samsung oi");
	 
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		
		model.addAttribute("listaDeProdutos", listaDeProdutos);
		return "produtos"; // retorna o nome do template
	}
	@GetMapping("/novo-produto")
	public String adicionarProduto () {
		
		return "novo-prod";
	}
}

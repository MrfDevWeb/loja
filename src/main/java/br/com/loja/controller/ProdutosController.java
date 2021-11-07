package br.com.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.loja.models.Produto;

@Controller
public class ProdutosController {
	
	@RequestMapping("/produto")
	public String form() {
		return "produto/form";
	}
	
	@RequestMapping("/salvar")
	public String salvar(Produto produto) {
		System.out.println(produto);
		return "produto/OK";
	}

}

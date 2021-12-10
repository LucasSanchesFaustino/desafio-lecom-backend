package br.com.ShopAll.microservice.ShopAll_Loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ShopAll.microservice.ShopAll_Loja.client.CatalogoClient;
import br.com.ShopAll.microservice.ShopAll_Loja.dto.ProdutoDTO;

@Controller
@RequestMapping("catalogo")
public class CatalogoController {

	@Autowired
	private CatalogoClient catalogoClient;

	@GetMapping
	public String home(Model model) {
		List<ProdutoDTO> produtos = catalogoClient.getProdutoAll();
		model.addAttribute("produtos", produtos);
		return "catalogo/home";
	}

	@GetMapping("/{categoria}")
	public String getPorCategoria(@PathVariable String categoria, Model model) {
		List<ProdutoDTO> produtos = catalogoClient.getInfoProdutoPorCategoria(categoria);
		model.addAttribute("produtos", produtos);
		return "catalogo/home";
	}
}

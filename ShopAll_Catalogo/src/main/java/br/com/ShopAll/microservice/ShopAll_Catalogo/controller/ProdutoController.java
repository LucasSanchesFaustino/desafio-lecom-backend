package br.com.ShopAll.microservice.ShopAll_Catalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ShopAll.microservice.ShopAll_Catalogo.model.Produto;
import br.com.ShopAll.microservice.ShopAll_Catalogo.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping("/{categoria}")
	public List<Produto> getInfoPorCategoria(@PathVariable String categoria) {
		return produtoService.getInfoProdutoPorCategoria(categoria);
	}
	
	@RequestMapping("/listar")
	public List<Produto> getProdutoAll() {
		return produtoService.getInfoProdutoAll();
	}
	
	@RequestMapping("/listar/{codigo}")
	public Produto getProdutoPorCodigo(@PathVariable Integer codigo) {
		return produtoService.getInfoProdutoPorCodigo(codigo);
	}

}
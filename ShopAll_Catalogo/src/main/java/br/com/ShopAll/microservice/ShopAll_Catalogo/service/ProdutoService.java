package br.com.ShopAll.microservice.ShopAll_Catalogo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ShopAll.microservice.ShopAll_Catalogo.model.Produto;
import br.com.ShopAll.microservice.ShopAll_Catalogo.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> getInfoProdutoAll() {
		return produtoRepository.findAll();
	}
	
	public List<Produto> getInfoProdutoPorCategoria(String categoria) {
		return produtoRepository.findByCategoria(categoria);
	}

	public Produto getInfoProdutoPorCodigo(Integer codigo) {
		return produtoRepository.findByCodigo(codigo);
	}
	
}

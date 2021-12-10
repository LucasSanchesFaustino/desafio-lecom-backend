package br.com.ShopAll.microservice.ShopAll_Loja.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ShopAll.microservice.ShopAll_Loja.dto.ProdutoDTO;

@FeignClient("Catalogo")
public interface CatalogoClient {

	@RequestMapping("/produto/{categoria}")
	List<ProdutoDTO> getInfoProdutoPorCategoria(@PathVariable String categoria);
	
	@RequestMapping("/produto/listar")
	List<ProdutoDTO> getProdutoAll();
	
	@RequestMapping("/produto/listar/{codigo}")
	ProdutoDTO getProdutoPorCodigo(@PathVariable String codigo);
}

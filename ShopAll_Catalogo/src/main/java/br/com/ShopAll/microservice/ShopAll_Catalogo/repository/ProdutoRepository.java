package br.com.ShopAll.microservice.ShopAll_Catalogo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ShopAll.microservice.ShopAll_Catalogo.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	
	List<Produto> findByCategoria(String categoria);
	
	Produto findByCodigo(Integer codigo);
}

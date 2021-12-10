package br.com.ShopAll.microservice.ShopAll_Transportadora.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ShopAll.microservice.ShopAll_Transportadora.model.Transporte;

@Repository
public interface TransporteRepository extends JpaRepository<Transporte, Long> {

	List<Transporte> findByStatusDoPedido(String status);

	Transporte findByCodigoPedido(String codigo);
	
}

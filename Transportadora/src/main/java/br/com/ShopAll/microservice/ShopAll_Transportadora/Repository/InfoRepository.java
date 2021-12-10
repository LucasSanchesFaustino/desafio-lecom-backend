package br.com.ShopAll.microservice.ShopAll_Transportadora.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ShopAll.microservice.ShopAll_Transportadora.model.InfoTransportadora;

@Repository
public interface InfoRepository extends JpaRepository<InfoTransportadora, Long>{

	
	InfoTransportadora findByEstado(String estado);
	
}
 
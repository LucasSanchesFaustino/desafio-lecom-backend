package br.com.ShopAll.microservice.ShopAll_Loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ShopAll.microservice.ShopAll_Loja.client.TransportadoraClient;
import br.com.ShopAll.microservice.ShopAll_Loja.dto.InfoFornecedorDTO;

@Service
public class ConsultarInfoService {

	@Autowired
	private TransportadoraClient transportadorClient;
	
	
	public void listarTodasAsTransportadoras() {
		
		InfoFornecedorDTO info = transportadorClient.getInfoTransportadoraPorEstado("SP");
		System.out.println(info.getEndereco());
	}
}

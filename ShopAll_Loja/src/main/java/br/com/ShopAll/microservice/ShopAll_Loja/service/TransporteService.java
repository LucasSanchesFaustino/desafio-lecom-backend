package br.com.ShopAll.microservice.ShopAll_Loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ShopAll.microservice.ShopAll_Loja.client.TransportadoraClient;
import br.com.ShopAll.microservice.ShopAll_Loja.dto.TransporteDTO;

@Service
public class TransporteService {

	@Autowired
	private TransportadoraClient transportadoraClient;
	
	public TransporteDTO editaTransporte(TransporteDTO transporte) {
		return transportadoraClient.updateTransporte(transporte);
	}
}

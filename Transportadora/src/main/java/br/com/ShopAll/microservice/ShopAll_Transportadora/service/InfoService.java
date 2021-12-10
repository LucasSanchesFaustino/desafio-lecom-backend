package br.com.ShopAll.microservice.ShopAll_Transportadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ShopAll.microservice.ShopAll_Transportadora.Repository.InfoRepository;
import br.com.ShopAll.microservice.ShopAll_Transportadora.model.InfoTransportadora;

@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRepository;
	
	public InfoTransportadora getInfoPorEstado(String estado) {
		return infoRepository.findByEstado(estado);
	}
	
	public List<InfoTransportadora> getInfoAll() {
		return infoRepository.findAll();
	}
}

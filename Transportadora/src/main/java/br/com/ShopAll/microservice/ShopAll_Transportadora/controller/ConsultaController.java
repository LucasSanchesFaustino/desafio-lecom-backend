package br.com.ShopAll.microservice.ShopAll_Transportadora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ShopAll.microservice.ShopAll_Transportadora.model.InfoTransportadora;
import br.com.ShopAll.microservice.ShopAll_Transportadora.service.InfoService;

@RestController
@RequestMapping("/info")
public class ConsultaController {

	@Autowired
	private InfoService infoService;
	
	@RequestMapping("/{estado}")
	public InfoTransportadora getInfoTransportadoraPorEstado(@PathVariable String estado) {
		return infoService.getInfoPorEstado(estado);
	}
	
	@RequestMapping("/listar")
	public List<InfoTransportadora> getInfoGeral() {
		return infoService.getInfoAll();
	}
}

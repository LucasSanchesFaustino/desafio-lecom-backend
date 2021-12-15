package br.com.ShopAll.microservice.ShopAll_Transportadora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ShopAll.microservice.ShopAll_Transportadora.model.Transporte;
import br.com.ShopAll.microservice.ShopAll_Transportadora.service.TransporteService;

@RestController
@RequestMapping("/transporte")
public class TransporteController {

	@Autowired
	private TransporteService transporteService;
	
	@RequestMapping("/listar")
	public List<Transporte> getTransporteAll() {
		return transporteService.getAllTransportes();
	}

	@RequestMapping("/{status}")
	public List<Transporte> getTransportePorStatus(@PathVariable String status) {
		return transporteService.getTranportePorStatus(status);
	}
	
	@PostMapping("/novo")
	public void setTransporte(@RequestBody Transporte transporte) {
		transporteService.novoTransporte(transporte);
	}
	
	@RequestMapping("/listar/{codigoPedido}")
	public Transporte getTransportePorCodigoPedido(@PathVariable Integer codigoPedido) {
		return transporteService.getTransportePorCodigoPedido(codigoPedido);
	}
	
	@PostMapping("/editar/novo")
	public void updateTransporte(@RequestBody Transporte transporte){
		transporteService.updateTransporte(transporte);
	}
	
}
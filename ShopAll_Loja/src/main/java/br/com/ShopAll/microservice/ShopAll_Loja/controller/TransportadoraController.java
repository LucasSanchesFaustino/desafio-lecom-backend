package br.com.ShopAll.microservice.ShopAll_Loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ShopAll.microservice.ShopAll_Loja.client.TransportadoraClient;
import br.com.ShopAll.microservice.ShopAll_Loja.dto.InfoFornecedorDTO;
import br.com.ShopAll.microservice.ShopAll_Loja.dto.TransporteDTO;

@Controller
@RequestMapping("/transporte")
public class TransportadoraController {

	@Autowired
	TransportadoraClient transportadoraClient;
	
	@GetMapping("/info")
 	public String getAll(Model model) {

		List<InfoFornecedorDTO> info = transportadoraClient.getInfoAll();
 		model.addAttribute("transportadora", info);
 		return "transporte/transportadora";
 	}
	
	@GetMapping("listar")
	public String getPedidosEmTransporte(Model model) {
		
		List<TransporteDTO> transportes = transportadoraClient.getTransporteAll();
		model.addAttribute("transportes", transportes);
		return "transporte/listarTransporte";
	}
	
	@GetMapping("/{status}")
	public String getPedidosEmTransportePorStatus(@PathVariable String status, Model model) {
		
		List<TransporteDTO> transportes = transportadoraClient.getTransportePorStatus(status);
		model.addAttribute("transportes", transportes);
		return "transporte/listarTransporte";
	}
	
	@GetMapping("/editar")
	public String editarPedidoEmTransporte(TransporteDTO transporte, Model model) {
		
		model.addAttribute(model);
		List<TransporteDTO> transportes = transportadoraClient.getTransportePorStatus("Preparando");
		transportes.addAll(transportadoraClient.getTransportePorStatus("Encaminhado"));
		
		model.addAttribute("transportes", transportes);
		model.addAttribute("transporteEditar", transporte);
		return "transporte/alteraTransporte";
	}
	
	@PostMapping("/editar/novo")
	public String requisitarEdicao(TransporteDTO transporte) {
		
		transportadoraClient.updateTransporte(transporte);
		return "redirect:/transporte/editar";
	}
	
}
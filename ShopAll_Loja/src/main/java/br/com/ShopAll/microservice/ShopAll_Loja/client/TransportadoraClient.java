package br.com.ShopAll.microservice.ShopAll_Loja.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ShopAll.microservice.ShopAll_Loja.dto.InfoFornecedorDTO;
import br.com.ShopAll.microservice.ShopAll_Loja.dto.TransporteDTO;

@FeignClient("Transportadora")
public interface TransportadoraClient { 

	@RequestMapping("/info/{estado}")
	InfoFornecedorDTO getInfoTransportadoraPorEstado(@PathVariable String estado);
	
	@RequestMapping("/info/listar")
	List<InfoFornecedorDTO> getInfoAll();
	
	@PostMapping("/transporte/novo")
	List<TransporteDTO> setTransporte(@RequestBody TransporteDTO transporte);
	
	@RequestMapping("/transporte/listar")
	List<TransporteDTO> getTransporteAll();
	
	@RequestMapping("/transporte/{status}")
	List<TransporteDTO> getTransportePorStatus(@PathVariable String status);

	@RequestMapping("/transporte/listar/{codigoPedido}")
	TransporteDTO getTransportePorCodigoPedido(@PathVariable String codigo);

	@PostMapping("/transporte/editar/novo")
	TransporteDTO updateTransporte(@RequestBody TransporteDTO transporte);
}

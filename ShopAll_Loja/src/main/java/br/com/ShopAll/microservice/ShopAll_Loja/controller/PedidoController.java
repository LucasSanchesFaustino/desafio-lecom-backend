package br.com.ShopAll.microservice.ShopAll_Loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.ShopAll.microservice.ShopAll_Loja.model.ItemPedido;
import br.com.ShopAll.microservice.ShopAll_Loja.model.Pedido;
import br.com.ShopAll.microservice.ShopAll_Loja.repository.ItemPedidoRepository;
import br.com.ShopAll.microservice.ShopAll_Loja.repository.PedidoRepository;
import br.com.ShopAll.microservice.ShopAll_Loja.service.PedidoService;

@Controller
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private ItemPedidoRepository itemRepository;
	
	@GetMapping("pedido/home")
	public String home() {
		return "pedido/home";
	}
	
	@GetMapping("pedido/novoPedido")
	public String formulario(ItemPedido itemDoPedido, Pedido novoPedido, Model model) {
		model.addAttribute("itemDoPedido", itemDoPedido);
		model.addAttribute("novoPedido", novoPedido);
		return "pedido/novoPedido";
	}
	
	@PostMapping("pedido/novo")
	public String novoPedido(ItemPedido itemDoPedido, Pedido novoPedido) {
		pedidoService.realizaPedido(novoPedido, itemDoPedido);
		return "redirect:/pedido/home";
	}
	
	@GetMapping("pedido/listar")
	public String listarPedidos(Model model) {
		List<Pedido> pedidos = pedidoRepository.findAll();
		List<ItemPedido> itens = itemRepository.findAll();
		
		model.addAttribute("pedidos", pedidos);
		model.addAttribute("itens", itens);
		return "pedido/listarPedidos";
	}
}
package br.com.ShopAll.microservice.ShopAll_Loja.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ShopAll.microservice.ShopAll_Loja.client.CatalogoClient;
import br.com.ShopAll.microservice.ShopAll_Loja.client.TransportadoraClient;
import br.com.ShopAll.microservice.ShopAll_Loja.dto.ProdutoDTO;
import br.com.ShopAll.microservice.ShopAll_Loja.dto.TransporteDTO;
import br.com.ShopAll.microservice.ShopAll_Loja.model.ItemPedido;
import br.com.ShopAll.microservice.ShopAll_Loja.model.Pedido;
import br.com.ShopAll.microservice.ShopAll_Loja.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private TransportadoraClient transportadoraClient;
	
	@Autowired
	private CatalogoClient catalogoClient; 

	@Autowired
	private PedidoRepository pedidoRepository;
	
	Random placeholder = new Random();
	
	public Pedido realizaPedido(Pedido novoPedido, ItemPedido itemDoPedido) {
		
		itemDoPedido.setNomeProduto(getNomeProduto(itemDoPedido.getCodigoDoProduto()));
		
		itemDoPedido.setValor(getValorPedido(itemDoPedido.getCodigoDoProduto(), itemDoPedido.getQuantidade()));
		
		List<ItemPedido> itensDoPedido = new ArrayList<ItemPedido>();
		
		itensDoPedido.add(itemDoPedido);
		
		novoPedido.setItensDoPedido(itensDoPedido);
		novoPedido.setCodigoPedido(placeholder.nextInt(1000)); //gera um número aleatório para ser o codigo do pedido.
		novoPedido.setStatusDoPedido("Separando");
		
		TransporteDTO novoTransporte = new TransporteDTO(novoPedido.getCodigoPedido(), placeholder.nextInt(10000, 99999), novoPedido.getStatusDoPedido(), novoPedido.getEnderecoDestino());
		
		transportadoraClient.setTransporte(novoTransporte);
		
		return pedidoRepository.save(novoPedido);
	}
	
	public String getNomeProduto(Integer codigo) {
		ProdutoDTO produto = catalogoClient.getProdutoPorCodigo(codigo);
		return produto.getNomeProduto();
	}
	
	public Double getValorPedido(Integer codigo, Integer quantidade) {
		ProdutoDTO produto = catalogoClient.getProdutoPorCodigo(codigo);
		Double soma = (produto.getValorProduto()) * quantidade;
		return soma;
	}
}

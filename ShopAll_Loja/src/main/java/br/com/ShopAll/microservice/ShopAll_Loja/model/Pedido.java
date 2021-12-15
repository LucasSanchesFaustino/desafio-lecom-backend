package br.com.ShopAll.microservice.ShopAll_Loja.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer codigoPedido;
	
	private String nomeCliente;
	
	private String enderecoDestino;
	
	private String statusDoPedido;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "pedidoId")
	private List<ItemPedido> itensDoPedido;

	public Pedido() {
		
	}

	public Pedido(List<ItemPedido> itensDoPedido) {
		super();
		this.itensDoPedido = itensDoPedido;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(Integer codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public String getStatusDoPedido() {
		return statusDoPedido;
	}

	public void setStatusDoPedido(String statusDoPedido) {
		this.statusDoPedido = statusDoPedido;
	}

	public List<ItemPedido> getItensDoPedido() {
		return itensDoPedido;
	}
	
	public void setItensDoPedido(List<ItemPedido> itensDoPedido) {
		this.itensDoPedido = itensDoPedido;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEnderecoDestino() {
		return enderecoDestino;
	}

	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}
}

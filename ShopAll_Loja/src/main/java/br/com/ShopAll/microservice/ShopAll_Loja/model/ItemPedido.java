package br.com.ShopAll.microservice.ShopAll_Loja.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemPedido {	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer quantidade;
	
	private Integer codigoDoProduto;
	
	private String nomeProduto;
	
	private String valor;
	
	public ItemPedido() {
		super();
	}

	public ItemPedido(Integer quantidade, String nomeDoProduto, String valor) {
		super();
		this.quantidade = quantidade;
		this.nomeProduto = nomeDoProduto;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Integer getCodigoDoProduto() {
		return codigoDoProduto;
	}

	public void setCodigoDoProduto(Integer codigoDoProduto) {
		this.codigoDoProduto = codigoDoProduto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
package br.com.ShopAll.microservice.ShopAll_Transportadora.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transporte")
public class Transporte {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer codigoPedido;
	
	private Integer codigoRastreio;
	
	private String statusDoPedido;
	
	private String enderecoDestino;

	public Integer getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(Integer codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public Integer getCodigoRastreio() {
		return codigoRastreio;
	}

	public void setCodigoRastreio(Integer codigoRastreio) {
		this.codigoRastreio = codigoRastreio;
	}

	public String getStatusDoPedido() {
		return statusDoPedido;
	}

	public void setStatusDoPedido(String statusDoPedido) {
		this.statusDoPedido = statusDoPedido;
	}

	public String getEnderecoDestino() {
		return enderecoDestino;
	}

	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}
}

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

	private String codigoPedido;
	
	private String codigoRastreio;
	
	private String statusDoPedido;
	
	private String enderecoDestino;

	public String getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(String codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public String getCodigoRastreio() {
		return codigoRastreio;
	}

	public void setCodigoRastreio(String codigoRastreio) {
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

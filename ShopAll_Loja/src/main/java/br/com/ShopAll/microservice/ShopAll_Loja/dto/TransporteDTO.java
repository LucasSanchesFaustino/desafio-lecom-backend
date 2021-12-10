package br.com.ShopAll.microservice.ShopAll_Loja.dto;

public class TransporteDTO {

	private String codigoPedido;
	
	private String codigoRastreio;
	
	private String statusDoPedido;
	
	private String enderecoDestino;

	public TransporteDTO() {
		super();
	}
	
	public TransporteDTO(String codigoPedido, String codigoRastreio, String statusDoPedido, String enderecoDestino) {
		super();
		this.codigoPedido = codigoPedido;
		this.codigoRastreio = codigoRastreio;
		this.statusDoPedido = statusDoPedido;
		this.enderecoDestino = enderecoDestino;
	}

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

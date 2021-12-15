package br.com.ShopAll.microservice.ShopAll_Loja.dto;

public class TransporteDTO {

	private Integer codigoPedido;
	
	private Integer codigoRastreio;
	
	private String statusDoPedido;
	
	private String enderecoDestino;

	public TransporteDTO() {
		super();
	}
	
	public TransporteDTO(Integer codigoPedido, Integer codigoRastreio, String statusDoPedido, String enderecoDestino) {
		super();
		this.codigoPedido = codigoPedido;
		this.codigoRastreio = codigoRastreio;
		this.statusDoPedido = statusDoPedido;
		this.enderecoDestino = enderecoDestino;
	}

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

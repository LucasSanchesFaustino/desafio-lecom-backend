package br.com.ShopAll.microservice.ShopAll_Loja.dto;

public class ProdutoDTO {

	private String nomeProduto;

	private String codigo;
	
	private String descricao;

	private String valorProduto;

	private String categoria;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(String valorProduto) {
		this.valorProduto = valorProduto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}

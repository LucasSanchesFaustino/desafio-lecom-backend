package br.com.ShopAll.microservice.ShopAll_Loja.dto;

public class InfoFornecedorDTO {

	private String endereco;
	
	private String nome;
	
	private String estado;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}

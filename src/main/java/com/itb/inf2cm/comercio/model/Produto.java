package com.itb.inf2cm.comercio.model;

public class Produto {

	private Long id;
	private String nome;
	private String codigoBarras;
	private double preco;
	private String descricao;
	//public acesso liberado para todas as classes
	//private: acesso liberado apenas para os membros da propia
	//         classe, ou seja, só é acessado dentro da página.
	
	// Método Setter's -> Utilizamos para atribuir valor ao atributo
	// Método Getter's -> Utilizamos para "arecuperar" o valor do atributo
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}


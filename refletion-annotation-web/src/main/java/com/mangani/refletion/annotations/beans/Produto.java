package com.mangani.refletion.annotations.beans;

public class Produto {
	
	private String nome;
	private String categoria;
	private double preco;
	private String descricao;
	
	public Produto(String nome, String categoria, double preco, String descricao) {
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
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

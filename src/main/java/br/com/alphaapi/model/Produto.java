package br.com.alphaapi.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Produto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3747930677506352739L;

	private Long id;
	
	private String nome;
	
	private String descricao;
	
	private BigDecimal preco;
	
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
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}
	
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

}
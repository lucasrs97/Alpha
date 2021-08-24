package br.com.alphaapi.model;

import java.io.Serializable;

public class ItemPedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3650618279715614267L;
	
	private Integer quantidade;
	
	private Produto produto;
	
	private String observacoes;
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public String getObservacoes() {
		return observacoes;
	}
	
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	

}

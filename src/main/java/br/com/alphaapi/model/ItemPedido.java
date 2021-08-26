package br.com.alphaapi.model;

import java.io.Serializable;

public class ItemPedido implements Serializable {

	private static final long serialVersionUID = -3650618279715614267L;
	
	private Integer id;
	
	private Integer quantidade;
	
	private String observacoes;
	
	private Produto produto;
	
	private Pedido pedido;
	
	public ItemPedido(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
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

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
}

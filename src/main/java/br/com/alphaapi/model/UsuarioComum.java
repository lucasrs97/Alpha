package br.com.alphaapi.model;

import java.io.Serializable;

public class UsuarioComum implements Serializable {

	private static final long serialVersionUID = 5817453734469546778L;
	
	private Integer id;
	
	private String nome;
	
	private String login;
	
	private String senha;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}

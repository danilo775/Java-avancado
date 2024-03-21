package com.danilosoft.Produto.controller.dto;

import java.util.ArrayList;


public class UsuarioDTO {
	private Long id;
	private String nome;
	private String email;
	
	public UsuarioDTO(Long id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}	
	
}
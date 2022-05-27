package com.fiap.falcon.scania.FalconScania.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ClienteDto {


	private Long id_cliente;

	@NotBlank
	@NotNull
	private String nome;

	@NotBlank
	@NotNull
	private String sobrenome;

	@NotBlank
	@NotNull
	private String email;

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

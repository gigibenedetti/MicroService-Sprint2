package com.fiap.falcon.scania.FalconScania.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cidade;

	@Column(nullable = false)
	private String nome_cidade;

	@Column(nullable = false)
	private String estado_uf;

	public Cidade() {
	}

	public Cidade(Long id_cidade, String nome_cidade, String estado_uf) {
		super();
		this.id_cidade = id_cidade;
		this.nome_cidade = nome_cidade;
		this.estado_uf = estado_uf;
	}

	public Long getId_cidade() {
		return id_cidade;
	}

	public void setId_cidade(Long id_cidade) {
		this.id_cidade = id_cidade;
	}

	public String getNome_cidade() {
		return nome_cidade;
	}

	public void setNome_cidade(String nome_cidade) {
		this.nome_cidade = nome_cidade;
	}

	public String getEstado_uf() {
		return estado_uf;
	}

	public void setEstado_uf(String estado_uf) {
		this.estado_uf = estado_uf;
	}

}

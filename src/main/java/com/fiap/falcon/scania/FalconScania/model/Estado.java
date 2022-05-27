package com.fiap.falcon.scania.FalconScania.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_estado;
	@Column(nullable = false)
	private String uf;
	@Column(nullable = false)
	private String nome_estado;

	public Estado() {
	}

	public Estado(String uf, String nome_estado) {
		super();
		this.uf = uf;
		this.nome_estado = nome_estado;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNome_estado() {
		return nome_estado;
	}

	public void setNome_estado(String nome_estado) {
		this.nome_estado = nome_estado;
	}

}

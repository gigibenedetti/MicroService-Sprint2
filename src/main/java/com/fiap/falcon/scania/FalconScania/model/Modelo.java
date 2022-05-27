package com.fiap.falcon.scania.FalconScania.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Modelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_modelo;

	@Column(nullable = false)
	private String nome_modelo;

	public Modelo() {
	}

	public Modelo(Long id_modelo, String nome_modelo) {
		super();
		this.id_modelo = id_modelo;
		this.nome_modelo = nome_modelo;
	}

	public Long getId_modelo() {
		return id_modelo;
	}

	public void setId_modelo(Long id_modelo) {
		this.id_modelo = id_modelo;
	}

	public String getNome_modelo() {
		return nome_modelo;
	}

	public void setNome_modelo(String nome_modelo) {
		this.nome_modelo = nome_modelo;
	}
	
	
}

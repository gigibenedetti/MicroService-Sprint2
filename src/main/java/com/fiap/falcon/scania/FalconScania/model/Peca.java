package com.fiap.falcon.scania.FalconScania.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Peca {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_peca;

	@Column(nullable = false)
	private String nome_peca;

	public Peca() {
	}

	public Peca(Long id_peca, String nome_peca) {
		super();
		this.id_peca = id_peca;
		this.nome_peca = nome_peca;
	}

	public Long getId_peca() {
		return id_peca;
	}

	public void setId_peca(Long id_peca) {
		this.id_peca = id_peca;
	}

	public String getNome_peca() {
		return nome_peca;
	}

	public void setNome_peca(String nome_peca) {
		this.nome_peca = nome_peca;
	}

}

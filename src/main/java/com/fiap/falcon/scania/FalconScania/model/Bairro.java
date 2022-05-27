package com.fiap.falcon.scania.FalconScania.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bairro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_bairro;

	@Column(nullable = false)
	private String nome_bairro;

	@Column(nullable = false)
	private Long id_cidade;

	@Column(nullable = false)
	private Long latitude;

	@Column(nullable = false)
	private Long longitude;

	public Bairro() {
	}
	
	

	public Bairro(Long id_bairro, String nome_bairro, Long id_cidade, Long latitude, Long longitude) {
		super();
		this.id_bairro = id_bairro;
		this.nome_bairro = nome_bairro;
		this.id_cidade = id_cidade;
		this.latitude = latitude;
		this.longitude = longitude;
	}



	public Long getId_bairro() {
		return id_bairro;
	}

	public void setId_bairro(Long id_bairro) {
		this.id_bairro = id_bairro;
	}

	public String getNome_bairro() {
		return nome_bairro;
	}

	public void setNome_bairro(String nome_bairro) {
		this.nome_bairro = nome_bairro;
	}

	public Long getId_cidade() {
		return id_cidade;
	}

	public void setId_cidade(Long id_cidade) {
		this.id_cidade = id_cidade;
	}

	public Long getLatitude() {
		return latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

}

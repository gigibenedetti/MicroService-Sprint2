package com.fiap.falcon.scania.FalconScania.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_veiculo;

	@Column(nullable = false)
	private String chassi;

	@Column(nullable = false)
	private Long id_modelo;

	@Column(nullable = false)
	private String apelido_veiculo;

	@Column(nullable = false)
	private String ano;

	@Column(nullable = false)
	private Long id_cliente;

	public Veiculo() {
	}

	public Veiculo(Long id_veiculo, String chassi, Long id_modelo, String apelido_veiculo, String ano,
			Long id_cliente) {
		super();
		this.id_veiculo = id_veiculo;
		this.chassi = chassi;
		this.id_modelo = id_modelo;
		this.apelido_veiculo = apelido_veiculo;
		this.ano = ano;
		this.id_cliente = id_cliente;
	}

	public Long getId_veiculo() {
		return id_veiculo;
	}

	public void setId_veiculo(Long id_veiculo) {
		this.id_veiculo = id_veiculo;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Long getId_modelo() {
		return id_modelo;
	}

	public void setId_modelo(Long id_modelo) {
		this.id_modelo = id_modelo;
	}

	public String getApelido_veiculo() {
		return apelido_veiculo;
	}

	public void setApelido_veiculo(String apelido_veiculo) {
		this.apelido_veiculo = apelido_veiculo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

}

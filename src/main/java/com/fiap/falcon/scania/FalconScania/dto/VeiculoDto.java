package com.fiap.falcon.scania.FalconScania.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fiap.falcon.scania.FalconScania.model.Veiculo;

public class VeiculoDto {

	
	private Long id_veiculo;

	@NotBlank
	@NotNull
	private String chassi;

	
	private Long id_modelo;

	@NotBlank
	@NotNull
	private String apelido_veiculo;

	@NotBlank
	@NotNull
	private String ano;

	
	private Long id_cliente;


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
	
	public void fromVeiculo(Veiculo veiculo) {
		this.ano = veiculo.getAno();
		this.apelido_veiculo = veiculo.getApelido_veiculo();
		this.chassi = veiculo.getChassi();
	}
}

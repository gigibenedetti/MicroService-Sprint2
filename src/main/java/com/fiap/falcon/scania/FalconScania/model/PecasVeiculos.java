package com.fiap.falcon.scania.FalconScania.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PecasVeiculos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_peca;

	@Column(nullable = false)
	private Long id_veiculo;

	@Column(nullable = false)
	private int quantidade;

	public PecasVeiculos() {
	}

	public PecasVeiculos(Long id_peca, Long id_veiculo, int quantidade) {
		super();
		this.id_peca = id_peca;
		this.id_veiculo = id_veiculo;
		this.quantidade = quantidade;
	}

	public Long getId_peca() {
		return id_peca;
	}

	public void setId_peca(Long id_peca) {
		this.id_peca = id_peca;
	}

	public Long getId_veiculo() {
		return id_veiculo;
	}

	public void setId_veiculo(Long id_veiculo) {
		this.id_veiculo = id_veiculo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}

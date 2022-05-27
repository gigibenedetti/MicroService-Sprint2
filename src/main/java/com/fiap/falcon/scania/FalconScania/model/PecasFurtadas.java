package com.fiap.falcon.scania.FalconScania.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PecasFurtadas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_notificacao_furto;

	@Column(nullable = false)
	private Long id_peca;

	@Column(nullable = false)
	private Long quantidade;

	public PecasFurtadas() {
	}

	public PecasFurtadas(Long id_notificacao_furto, Long id_peca, Long quantidade) {
		super();
		this.id_notificacao_furto = id_notificacao_furto;
		this.id_peca = id_peca;
		this.quantidade = quantidade;
	}

	public Long getId_notificacao_furto() {
		return id_notificacao_furto;
	}

	public void setId_notificacao_furto(Long id_notificacao_furto) {
		this.id_notificacao_furto = id_notificacao_furto;
	}

	public Long getId_peca() {
		return id_peca;
	}

	public void setId_peca(Long id_peca) {
		this.id_peca = id_peca;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

}

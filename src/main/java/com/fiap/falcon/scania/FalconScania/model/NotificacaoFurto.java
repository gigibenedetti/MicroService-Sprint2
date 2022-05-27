package com.fiap.falcon.scania.FalconScania.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NotificacaoFurto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_notificacao_furto;

	@Column(nullable = false)
	private Long id_bairro;

	@Column(nullable = false)
	private Long id_cliente;

	@Column(nullable = false)
	private Long id_veiculo;

	@Column(nullable = false)
	private Timestamp data_furto;

	public NotificacaoFurto() {
	}

	public NotificacaoFurto(Long id_notificacao_furto, Long id_bairro, Long id_cliente, Long id_veiculo,
			Timestamp data_furto) {
		super();
		this.id_notificacao_furto = id_notificacao_furto;
		this.id_bairro = id_bairro;
		this.id_cliente = id_cliente;
		this.id_veiculo = id_veiculo;
		this.data_furto = data_furto;
	}

	public Long getId_notificacao_furto() {
		return id_notificacao_furto;
	}

	public void setId_notificacao_furto(Long id_notificacao_furto) {
		this.id_notificacao_furto = id_notificacao_furto;
	}

	public Long getId_bairro() {
		return id_bairro;
	}

	public void setId_bairro(Long id_bairro) {
		this.id_bairro = id_bairro;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Long getId_veiculo() {
		return id_veiculo;
	}

	public void setId_veiculo(Long id_veiculo) {
		this.id_veiculo = id_veiculo;
	}

	public Timestamp getData_furto() {
		return data_furto;
	}

	public void setData_furto(Timestamp data_furto) {
		this.data_furto = data_furto;
	}

}

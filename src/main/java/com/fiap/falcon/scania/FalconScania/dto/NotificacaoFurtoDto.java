package com.fiap.falcon.scania.FalconScania.dto;

import java.sql.Timestamp;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fiap.falcon.scania.FalconScania.model.NotificacaoFurto;

public class NotificacaoFurtoDto {
	
	private Long id_notificacao_furto;

	
	private Long id_bairro;

	
	private Long id_cliente;

	
	private Long id_veiculo;

	@NotBlank
	@NotNull
	private Timestamp data_furto;

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
	
	public void fromNotificacaoFurto(NotificacaoFurto notificar) {
		this.id_notificacao_furto = notificar.getId_notificacao_furto();
		this.data_furto = notificar.getData_furto();

	}
}

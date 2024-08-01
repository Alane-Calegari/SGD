package com.system.day.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "DIA_ATIVIDADE")
public class DiaAtividade {
	
	@EmbeddedId
	private DiaAtividadeKey id;
	
	@MapsId("idDia")
	@ManyToOne
	@JoinColumn(name = "ID_DIA")
	private Dia idDia;
	
	@MapsId("idAtividade")
	@ManyToOne
	@JoinColumn(name = "ID_ATIVIDADE")
	private Atividade idAtividade;
	
	@ManyToOne
	@JoinColumn(name = "ID_HORARIO")
	private Horario idHorario;
	
	public DiaAtividade(DiaAtividadeKey id, Dia idDia, Atividade idAtividade, Horario idHorario) {
		this.id = id;
		this.idDia = idDia;
		this.idAtividade = idAtividade;
		this.idHorario = idHorario;
		
	}

	public DiaAtividadeKey getId() {
		return id;
	}

	public void setId(DiaAtividadeKey id) {
		this.id = id;
	}

	public Dia getIdDia() {
		return idDia;
	}

	public void setIdDia(Dia idDia) {
		this.idDia = idDia;
	}

	public Atividade getIdAtividade() {
		return idAtividade;
	}

	public void setIdAtividade(Atividade idAtividade) {
		this.idAtividade = idAtividade;
	}

	public Horario getHorario() {
		return idHorario;
	}

	public void setHorario(Horario idHorario) {
		this.idHorario = idHorario;
	}

}

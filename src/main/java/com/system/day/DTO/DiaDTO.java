package com.system.day.DTO;

import java.sql.Date;
import java.util.List;

import org.modelmapper.ModelMapper;

import com.system.day.entity.Alimento;
import com.system.day.entity.Atividade;
import com.system.day.entity.Dia;
import com.system.day.entity.Horario;
import com.system.day.entity.Status;

public class DiaDTO {
	
	private Long id;
	
	private Date dia;
	
	private double valorGasto;
	
	private Status way;
	
	private Status creatina;	
	
	private List<AtividadeHorario> atividades;
	
	private List<Long> alimentos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public double getValorGasto() {
		return valorGasto;
	}

	public void setValorGasto(double valorGasto) {
		this.valorGasto = valorGasto;
	}

	public Horario getHoras_sono() {
		return horas_sono;
	}

	public void setHoras_sono(Horario horas_sono) {
		this.horas_sono = horas_sono;
	}

	public List<Long> getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(List<Long> alimentos) {
		this.alimentos = alimentos;
	}

	public Status getWay() {
		return way;
	}

	public void setWay(Status way) {
		this.way = way;
	}

	public Status getCreatina() {
		return creatina;
	}

	public void setCreatina(Status creatina) {
		this.creatina = creatina;
	}

	public List<AtividadeHorario> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<AtividadeHorario> atividades) {
		this.atividades = atividades;
	}

	static ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
	public static DiaDTO convertToDTO(Dia entity) {
		return getModelMapper().map(entity, DiaDTO.class);		
	}

	
}

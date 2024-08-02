package com.system.day.DTO;

import java.sql.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import com.system.day.entity.Dia;
import com.system.day.entity.DiaAlimento;
import com.system.day.entity.Status;

public class DiaDTO {
	
	private Long id;
	
	private Date dia;
	
	private double valorGasto;
	
	private Status whey;
	
	private Status creatina;	
	
	private List<AtividadeHorario> atividades;
	
	private List<Long> postAlimentos;
	
	private List<DiaAlimentoDTO> alimentos;

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

	public Status getWay() {
		return whey;
	}

	public void setWay(Status way) {
		this.whey = way;
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

	public List<Long> getPostAlimentos() {
		return postAlimentos;
	}

	public void setPostAlimentos(List<Long> postAlimentos) {
		this.postAlimentos = postAlimentos;
	}

	public List<DiaAlimentoDTO> getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(List<DiaAlimentoDTO> alimentos) {
		this.alimentos = alimentos;
	}

	static ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
	public static DiaDTO convertToDTO(Dia entity) {
		return getModelMapper().map(entity, DiaDTO.class);		
	}

	
}

package com.system.day.DTO;

import java.sql.Date;
import java.util.List;
import org.modelmapper.ModelMapper;
import com.system.day.entity.Dia;
import com.system.day.entity.Status;

public class DiaDTO {
	
	private Long id;
	
	private Date dia;
	
	private double valorGasto;
	
	private Status way;
	
	private Status creatina;	
	
	private List<AtividadeHorario> atividades;
	
	private List<Long> alimentos;
	
	private List<DiaAlimentoDTO> diaAlimento;
	
	private List<DiaAtividadeDTO> diaAtividade;	

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
	
	public List<DiaAlimentoDTO> getDiaAlimento() {
		return diaAlimento;
	}

	public void setDiaAlimento(List<DiaAlimentoDTO> diaAlimento) {
		this.diaAlimento = diaAlimento;
	}

	public List<DiaAtividadeDTO> getDiaAtividade() {
		return diaAtividade;
	}

	public void setDiaAtividade(List<DiaAtividadeDTO> diaAtividade) {
		this.diaAtividade = diaAtividade;
	}

	static ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
	public static DiaDTO convertToDTO(Dia entity) {
		return getModelMapper().map(entity, DiaDTO.class);		
	}	
}

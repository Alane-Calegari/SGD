package com.system.day.DTO;

import org.modelmapper.ModelMapper;
import com.system.day.entity.Atividade;
import com.system.day.entity.Dia;
import com.system.day.entity.DiaAtividade;
import com.system.day.entity.Horario;

public class DiaAtividadeDTO {
	
	private Dia idDia;
	
	private Atividade idAtividade;
	 
	private Horario horario;

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
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	
	static ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
	public static DiaAtividadeDTO convertToDo(DiaAtividade entity) {
		return getModelMapper().map(entity, DiaAtividadeDTO.class);		
	}
}

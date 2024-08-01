package com.system.day.DTO;

import java.util.Date;
import org.modelmapper.ModelMapper;
import com.system.day.entity.Horario;

public class HorarioDTO {
	
	private Long id;
	
	private Date inicio;
	
	private Date termino;

	public Date getInicio() {
		return inicio;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getTermino() {
		return termino;
	}

	public void setTermino(Date termino) {
		this.termino = termino;
	}
	
	static ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
	public static HorarioDTO convertToDTO(Horario entity) {
		return getModelMapper().map(entity, HorarioDTO.class);		
	}

}

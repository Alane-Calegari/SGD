package com.system.day.DTO;

import com.system.day.entity.Alimento;
import com.system.day.entity.Dia;

public class DiaAlimentoDTO {
	
	private Dia idDia;
	
	private Alimento idAlimento;

	public Dia getIdDia() {
		return idDia;
	}

	public void setIdDia(Dia idDia) {
		this.idDia = idDia;
	}

	public Alimento getIdAlimento() {
		return idAlimento;
	}

	public void setIdAlimento(Alimento idAlimento) {
		this.idAlimento = idAlimento;
	}
	
}

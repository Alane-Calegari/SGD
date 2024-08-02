package com.system.day.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "DIA")
public class Dia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "DIA")
	private Date dia;	
		
	@Column(name = "VALOR_GASTO")
	private double valor_gasto;
	
	@ManyToOne
	@JoinColumn(name ="WHEY")
	private Status whey;	
	
	@ManyToOne
	@JoinColumn(name ="CREATINA")
	private Status creatina;
	
	
	@OneToMany(mappedBy = "idDia")
	private List<DiaAtividade> atividades;
	
	@OneToMany(mappedBy = "idDia")
	private List<DiaAlimento> alimentos;
		
	public Dia() {}
	
	public Dia(Long id) {
		this.id = id;		
	}

	
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

	public double getValor_gasto() {
		return valor_gasto;
	}

	public void setValor_gasto(double valor_gasto) {
		this.valor_gasto = valor_gasto;
	}

	public Status getWhey() {
		return whey;
	}

	public void setWhey(Status whey) {
		this.whey = whey;
	}

	public Status getCreatina() {
		return creatina;
	}

	public void setCreatina(Status creatina) {
		this.creatina = creatina;
	}
	
	public List<DiaAtividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<DiaAtividade> atividades) {
		this.atividades = atividades;
	}

	public List<DiaAlimento> getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(List<DiaAlimento> alimentos) {
		this.alimentos = alimentos;
	}

}

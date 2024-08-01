package com.system.day.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.day.DTO.DiaDTO;
import com.system.day.entity.Atividade;
import com.system.day.entity.Dia;
import com.system.day.entity.DiaAtividade;
import com.system.day.entity.DiaAtividadeKey;
import com.system.day.entity.Horario;
import com.system.day.repository.DiaAtividadeRepository;
import com.system.day.repository.DiaRepository;

import jakarta.persistence.EntityNotFoundException;
import utils.DiaMapper;

@Service
public class DiaService {
	
	@Autowired
	private DiaRepository diaRepository;
	
	@Autowired
	private DiaMapper diaMapper;
	
	@Autowired
	private DiaAtividadeRepository diaAtividadeRepository;
	
	public DiaDTO getById(Long id) {		
		Dia dia = getDiaRepository().findById(id).orElseThrow(				
				() -> new EntityNotFoundException("Não existe um dia com o id:" + id));
		return DiaDTO.convertToDTO(dia);		
	}
	
	public List<DiaDTO> getAll(){
		List<Dia> dias = getDiaRepository().findAll();
		List<DiaDTO> diasDTO = dias.stream().map(
				dia -> DiaDTO.convertToDTO(dia)).toList();
		return diasDTO;		
	}
	
	public void create(DiaDTO diaDTO) {
		Dia dia = getDiaMapper().convertToEntity(diaDTO);
		getDiaRepository().save(dia);		
		for (Long atividade: diaDTO.getAtividades()) {
			Dia idDia = new Dia(dia.getId());
			Atividade idAtividade = new Atividade(atividade);
			Horario idHorario = new Horario();
			DiaAtividadeKey diaAtividadeKey = new DiaAtividadeKey(dia.getId(), atividade);
			DiaAtividade diaAtividade = new DiaAtividade(diaAtividadeKey, idDia, idAtividade, idHorario);
			
			
			
		}
	}
	
	public void update(DiaDTO diaDTO) {
		Dia dia = getDiaRepository().findById(diaDTO.getId()).orElseThrow(				
				() -> new EntityNotFoundException("Não existe um dia com o id:" + diaDTO.getId()));
		dia.setId(diaDTO.getId());
		dia.setDia(diaDTO.getDia());
		dia.setAtividade(diaDTO.getAtividade());
		dia.setValor_gasto(diaDTO.getValorGasto());
		dia.setHoras_sono(diaDTO.getHoras_sono());
		dia.setAlimento(diaDTO.getAlimentos());
		dia.setWhey(diaDTO.getWay());
		dia.setCreatina(diaDTO.getCreatina());
		getDiaRepository().save(dia);				
	}
	
	public void delete(Long id) {
		getDiaRepository().findById(id).orElseThrow(				
				() -> new EntityNotFoundException("Não existe um dia com o id:" + id));
		getDiaRepository().deleteById(id);		
	}	
	
	public DiaRepository getDiaRepository() {
		return diaRepository;
	}
	
	public DiaAtividadeRepository getDiaAtividadeRepository() {
		return diaAtividadeRepository;
	}
	
	public DiaMapper getDiaMapper() {
		return diaMapper;
	}
}

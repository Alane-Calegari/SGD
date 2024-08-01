package utils;

import org.springframework.stereotype.Component;

import com.system.day.DTO.DiaDTO;
import com.system.day.entity.Dia;

@Component
public class DiaMapper {
	
	public Dia convertToEntity(DiaDTO diaDTO) {
		Dia dia = new Dia();
		
		dia.setId(diaDTO.getId());
		dia.setDia(diaDTO.getDia());
		dia.setAtividade(diaDTO.getAtividade());
		dia.setValor_gasto(diaDTO.getValorGasto());
		dia.setHoras_sono(diaDTO.getHoras_sono());
		dia.setAlimento(diaDTO.getAlimentos());
		dia.setWhey(diaDTO.getWay());
		dia.setCreatina(diaDTO.getCreatina());
		
		return dia;
	}

}

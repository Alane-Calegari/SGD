package utils;

import org.springframework.stereotype.Component;
import com.system.day.DTO.HorarioDTO;
import com.system.day.entity.Horario;

@Component
public class HorarioMapper {
	
	public Horario convertToEntity(HorarioDTO horarioDTO) {
		Horario horario = new Horario();
		
		horario.setId(horarioDTO.getId());
		horario.setInicio(horarioDTO.getInicio());
		horario.setTermino(horarioDTO.getTermino());
		
		return horario;
	}

}

package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.TrailerChassisDetailsDTO;
import org.epragati.rta.vo.TrailerChassisDetailsVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class TrailerChassisDetailsMapper extends BaseMapper<TrailerChassisDetailsDTO, TrailerChassisDetailsVO> {

	@Override
	public TrailerChassisDetailsVO convertEntity(TrailerChassisDetailsDTO dto) {
		TrailerChassisDetailsVO trailerChassisDetailsVO = new TrailerChassisDetailsVO();
		funPoint(dto.getGvw(), trailerChassisDetailsVO::setGvw);
		funPoint(dto.getChassisNo(), trailerChassisDetailsVO::setChassisNo);
		funPoint(dto.getGtw(), trailerChassisDetailsVO::setGtw);
		funPoint(dto.getUlw(), trailerChassisDetailsVO::setUlw);
		funPoint(dto.getMakerName(), trailerChassisDetailsVO::setMakerName);
		funPoint(dto.getColour(), trailerChassisDetailsVO::setColor);
		return trailerChassisDetailsVO;
	}

	@Override
	public List<TrailerChassisDetailsVO> convertEntity(List<TrailerChassisDetailsDTO> dtos) {
		return dtos.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}

	@Override
	public TrailerChassisDetailsDTO convertVO(TrailerChassisDetailsVO vo) {
		TrailerChassisDetailsDTO trailerChassisDetailsDTO = new TrailerChassisDetailsDTO();
		funPoint(vo.getGvw(), trailerChassisDetailsDTO::setGvw);
		funPoint(vo.getChassisNo(), trailerChassisDetailsDTO::setChassisNo);
		funPoint(vo.getGtw(), trailerChassisDetailsDTO::setGtw);
		funPoint(vo.getUlw(), trailerChassisDetailsDTO::setUlw);
		funPoint(vo.getMakerName(), trailerChassisDetailsDTO::setMakerName);
		funPoint(vo.getColor(), trailerChassisDetailsDTO::setColour);
		return trailerChassisDetailsDTO;
	}

	@Override
	public List<TrailerChassisDetailsDTO> convertVO(List<TrailerChassisDetailsVO> vos) {
		return vos.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}

}

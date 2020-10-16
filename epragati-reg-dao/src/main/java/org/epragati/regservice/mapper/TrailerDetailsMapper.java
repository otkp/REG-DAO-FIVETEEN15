package org.epragati.regservice.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.regservice.dto.TrailerDetailsDTO;
import org.epragati.regservice.vo.TrailerDetailsVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class TrailerDetailsMapper extends BaseMapper<TrailerDetailsDTO, TrailerDetailsVO> {

	@Override
	public TrailerDetailsVO convertEntity(TrailerDetailsDTO trailerDetailsDTO) {
		TrailerDetailsVO trailerDetailsVO = new TrailerDetailsVO();
		funPoint(trailerDetailsDTO.getChassisNo(), trailerDetailsVO::setChassisNo);
		funPoint(trailerDetailsDTO.getApplicationNo(), trailerDetailsVO::setApplicationNo);
		funPoint(trailerDetailsDTO.getCov(), trailerDetailsVO::setCov);
		funPoint(trailerDetailsDTO.getLoginId(), trailerDetailsVO::setLoginId);
		funPoint(trailerDetailsDTO.getrId(), trailerDetailsVO::setrId);
		funPoint(trailerDetailsDTO.getStatus(), trailerDetailsVO::setStatus);
		//funPoint(trailerDetailsDTO.getCreatedDate(), trailerDetailsVO::setCreatedDate);
		return trailerDetailsVO;
	}
	
	@Override
	public List<TrailerDetailsVO> convertEntity(List<TrailerDetailsDTO> trailerDetailsDTOList) {
		return trailerDetailsDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	
	@Override
	public TrailerDetailsDTO convertVO(TrailerDetailsVO trailerDetailsVO) {
		TrailerDetailsDTO trailerDetailsDTO = new TrailerDetailsDTO();
		funPoint(trailerDetailsVO.getChassisNo(), trailerDetailsDTO::setChassisNo);
		funPoint(trailerDetailsVO.getApplicationNo(), trailerDetailsDTO::setApplicationNo);
		funPoint(trailerDetailsVO.getCov(), trailerDetailsDTO::setCov);
		funPoint(trailerDetailsVO.getLoginId(), trailerDetailsDTO::setLoginId);
		funPoint(trailerDetailsVO.getrId(), trailerDetailsDTO::setrId);
		funPoint(trailerDetailsVO.getStatus(), trailerDetailsDTO::setStatus);
		//funPoint(trailerDetailsVO.getCreatedDate(), trailerDetailsDTO::setCreatedDate);
		return trailerDetailsDTO;
	}
	
	@Override
	public List<TrailerDetailsDTO> convertVO(List<TrailerDetailsVO> trailerDetailsVOList) {
		return trailerDetailsVOList.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}

}


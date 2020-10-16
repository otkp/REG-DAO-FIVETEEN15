package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.MasterFCQuestionsDTO;
import org.epragati.master.vo.MasterFcQuestionVO;
import org.springframework.stereotype.Component;

@Component
public class FcQuestionsMapper extends BaseMapper<MasterFCQuestionsDTO, MasterFcQuestionVO> {

	@Override
	public MasterFcQuestionVO convertEntity(MasterFCQuestionsDTO dto) {

		MasterFcQuestionVO fcDetailsVO = new MasterFcQuestionVO();

		funPoint(dto.getQuestion(), fcDetailsVO::setQuestion);
		funPoint(dto.getSerialNo(), fcDetailsVO::setSerialNo);
		funPoint(dto.isIscfrr(), fcDetailsVO::setIscfrr);
		funPoint(dto.isSelectedOption(), fcDetailsVO::setSelectedOption);
		

		return fcDetailsVO;
	}

	@Override
	public MasterFCQuestionsDTO convertVO(MasterFcQuestionVO fcDetailsVO) {

		MasterFCQuestionsDTO dto = new MasterFCQuestionsDTO();

		funPoint(fcDetailsVO.getQuestion(), dto::setQuestion);
		funPoint(fcDetailsVO.getSerialNo(), dto::setSerialNo);
		funPoint(fcDetailsVO.isIscfrr(), dto::setIscfrr);
		funPoint(fcDetailsVO.isSelectedOption(), dto::setSelectedOption);

		return dto;

	}
	@Override
	public List<MasterFcQuestionVO> convertEntity(List<MasterFCQuestionsDTO> list) {
		return list.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	
	@Override
	public List<MasterFCQuestionsDTO> convertVO(List<MasterFcQuestionVO> list) {
		return list.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}


}

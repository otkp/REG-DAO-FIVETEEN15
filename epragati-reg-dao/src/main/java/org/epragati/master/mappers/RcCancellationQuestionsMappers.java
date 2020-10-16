package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.MasterRcCancellationQuestionsDTO;
import org.epragati.master.vo.MasterRcCancellationQuestionsVO;
import org.springframework.stereotype.Component;

@Component
public class RcCancellationQuestionsMappers
		extends BaseMapper<MasterRcCancellationQuestionsDTO, MasterRcCancellationQuestionsVO> {

	@Override
	public MasterRcCancellationQuestionsVO convertEntity(MasterRcCancellationQuestionsDTO dto) {
		MasterRcCancellationQuestionsVO rcQuestionVO = new MasterRcCancellationQuestionsVO();
		funPoint(dto.getQuestion(), rcQuestionVO::setQuestion);
		funPoint(dto.getSerialNo(), rcQuestionVO::setSerialNo);
		funPoint(dto.isSelectedOption(), rcQuestionVO::setSelectedOption);
		return rcQuestionVO;
	}

	public List<MasterRcCancellationQuestionsVO> convertEntity(List<MasterRcCancellationQuestionsDTO> list) {
		return list.stream().map(e -> convertEntity(e)).collect(Collectors.toList());

	}
	
	public MasterRcCancellationQuestionsDTO convertEntity(MasterRcCancellationQuestionsVO vo) {
		MasterRcCancellationQuestionsDTO rcQuesDTO = new MasterRcCancellationQuestionsDTO();
		funPoint(vo.getQuestion(), rcQuesDTO::setQuestion);
		funPoint(vo.getSerialNo(),rcQuesDTO::setSerialNo);
		funPoint(vo.isSelectedOption(), rcQuesDTO::setSelectedOption);
		return rcQuesDTO;
		
	}
	
	public List<MasterRcCancellationQuestionsDTO> convertVo(List<MasterRcCancellationQuestionsVO> list) {
		return list.stream().map(e -> convertEntity(e)).collect(Collectors.toList());

	}

}

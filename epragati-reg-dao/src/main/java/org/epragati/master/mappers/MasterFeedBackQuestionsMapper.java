package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.MasterFeedBackQuestionsDTO;
import org.epragati.master.vo.MasterFeedBackQuestionsVO;
import org.springframework.stereotype.Component;

@Component
public class MasterFeedBackQuestionsMapper extends BaseMapper<MasterFeedBackQuestionsDTO, MasterFeedBackQuestionsVO>{

	@Override
	public MasterFeedBackQuestionsVO convertEntity(MasterFeedBackQuestionsDTO dto) {
		MasterFeedBackQuestionsVO vo = new MasterFeedBackQuestionsVO();

		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getSlNo(), vo::setSlNo);
		funPoint(dto.getQuestion(), vo::setQuestion);
		funPoint(dto.getType(), vo::setType);
		funPoint(dto.getOptions(), vo::setOptions);
		funPoint(dto.getAnswer(),vo::setAnswer);
		
		return vo;
	}

	@Override
	public MasterFeedBackQuestionsDTO convertVO(MasterFeedBackQuestionsVO vo) {
		MasterFeedBackQuestionsDTO dto = new MasterFeedBackQuestionsDTO();

		funPoint(vo.getId(), dto::setId);
		funPoint(vo.getSlNo(), dto::setSlNo);
		funPoint(vo.getQuestion(), dto::setQuestion);
		funPoint(vo.getType(), dto::setType);
		funPoint(vo.getOptions(), dto::setOptions);
		funPoint(vo.getAnswer(),dto::setAnswer);
		
		return dto;
	}
}

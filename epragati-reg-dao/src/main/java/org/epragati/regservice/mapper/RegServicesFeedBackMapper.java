package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.mappers.MasterFeedBackQuestionsMapper;
import org.epragati.regservice.dto.RegServicesFeedBack;
import org.epragati.regservice.vo.RegServicesFeedBackVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegServicesFeedBackMapper extends BaseMapper<RegServicesFeedBack, RegServicesFeedBackVO>{

	@Autowired
	private MasterFeedBackQuestionsMapper masterFeedBackQuestionsMapper;
	@Override
	public RegServicesFeedBackVO convertEntity(RegServicesFeedBack dto) {
		RegServicesFeedBackVO vo = new RegServicesFeedBackVO();
		
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getApplicationNo(), vo::setApplicationNo);
		if(dto.getQuestions() != null) {
			vo.setQuestions(masterFeedBackQuestionsMapper.convertEntity(dto.getQuestions()));
		}
		funPoint(dto.getServices(), vo::setServices);
		return vo;
	}

	@Override
	public RegServicesFeedBack convertVO(RegServicesFeedBackVO vo) {
		RegServicesFeedBack dto = new RegServicesFeedBack();
		
		funPoint(vo.getId(), dto::setId);
		funPoint(vo.getApplicationNo(), dto::setApplicationNo);
		if(vo.getQuestions() != null) {
			dto.setQuestions(masterFeedBackQuestionsMapper.convertVO(vo.getQuestions()));
		}
		funPoint(vo.getServices(), dto::setServices);
		return dto;
	}
}

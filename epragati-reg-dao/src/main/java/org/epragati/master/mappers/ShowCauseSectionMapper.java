package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.ShowCauseSectionDTO;
import org.epragati.payment.report.vo.ShowCauseSectionVO;
import org.springframework.stereotype.Component;

@Component
public class ShowCauseSectionMapper extends BaseMapper<ShowCauseSectionDTO, ShowCauseSectionVO> {

	@Override
	public ShowCauseSectionVO convertEntity(ShowCauseSectionDTO dto) {
		ShowCauseSectionVO showCauseSectionVO = new ShowCauseSectionVO();
		funPoint(dto.getSectionCode(), showCauseSectionVO::setSectionCode);
		funPoint(dto.getStatus(), showCauseSectionVO::setStatus);
		return showCauseSectionVO;
	}

	public ShowCauseSectionDTO convertVo(ShowCauseSectionVO vo) {
		ShowCauseSectionDTO showCauseSectionDTO = new ShowCauseSectionDTO();
		funPoint(vo.getSectionCode(), showCauseSectionDTO::setSectionCode);
		funPoint(vo.getStatus(), showCauseSectionDTO::setStatus);
		return showCauseSectionDTO;
	}

}

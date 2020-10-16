package org.epragati.vcrImage.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.vcr.vo.MasterOffenceSectionsVO;
import org.epragati.vcrImage.dto.MasterOffenceSectionsDTO;
import org.springframework.stereotype.Component;

@Component
public class MasterOffenceSectionsMapper extends BaseMapper<MasterOffenceSectionsDTO, MasterOffenceSectionsVO>{

	@Override
	public MasterOffenceSectionsVO convertEntity(MasterOffenceSectionsDTO dto) {
		MasterOffenceSectionsVO vo = new MasterOffenceSectionsVO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getSections(), vo::setSections);
		funPoint(dto.isStatus(), vo::setStatus);
		return vo;
	}

	@Override
	public MasterOffenceSectionsDTO convertVO(MasterOffenceSectionsVO dto) {
		MasterOffenceSectionsDTO vo = new MasterOffenceSectionsDTO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getSections(), vo::setSections);
		funPoint(dto.isStatus(), vo::setStatus);
		return vo;
	}
}

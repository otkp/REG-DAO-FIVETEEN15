package org.epragati.vcrImage.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.vcr.vo.MasterOffendingSectionsVO;
import org.epragati.vcrImage.dto.MasterOffendingSectionsDTO;
import org.springframework.stereotype.Component;

@Component
public class MasterOffendingSectionsMapper extends BaseMapper<MasterOffendingSectionsDTO, MasterOffendingSectionsVO>{

	@Override
	public MasterOffendingSectionsVO convertEntity(MasterOffendingSectionsDTO dto) {
		MasterOffendingSectionsVO vo = new MasterOffendingSectionsVO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getOffendingSection(), vo::setOffendingSection);
		funPoint(dto.isStatus(), vo::setStatus);
		return vo;
	}

	@Override
	public MasterOffendingSectionsDTO convertVO(MasterOffendingSectionsVO dto) {
		MasterOffendingSectionsDTO vo = new MasterOffendingSectionsDTO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getOffendingSection(), vo::setOffendingSection);
		funPoint(dto.isStatus(), vo::setStatus);
		return vo;
	}
}

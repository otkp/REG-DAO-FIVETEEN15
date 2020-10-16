package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.CovDTO;
import org.epragati.master.vo.CovVO;
import org.springframework.stereotype.Component;

@Component
public class CovMapper extends BaseMapper<CovDTO, CovVO> {

	@Override
	public CovVO convertEntity(CovDTO dto) {
		CovVO masterCovVO = new CovVO();
		funPoint(dto.getCovCategory(), masterCovVO::setCovCategory);
		funPoint(dto.getCovCode(), masterCovVO::setCovCode);
		funPoint(dto.getCovDescription(), masterCovVO::setCovDescription);
		funPoint(dto.getCovId(), masterCovVO::setCovId);
		funPoint(dto.getCovIdp(), masterCovVO::setCovIdp);
		funPoint(dto.getCovNicCode(), masterCovVO::setCovNicCode);
		funPoint(dto.getCovOnline(), masterCovVO::setCovOnline);
		funPoint(dto.getCovStatus(), masterCovVO::setCovStatus);
		funPoint(dto.getCreateDate(), masterCovVO::setCreateDate);
		funPoint(dto.getCreatedBy(), masterCovVO::setCreatedBy);
		funPoint(dto.getIsPH(), masterCovVO::setIsPH);
		funPoint(dto.getMinAge(), masterCovVO::setMinAge);
		funPoint(dto.getModifiedBy(), masterCovVO::setModifiedBy);
		funPoint(dto.getModifiedDate(), masterCovVO::setModifiedDate);

		return masterCovVO;
	}

	@Override
	public CovDTO convertVO(CovVO vo) {
		CovDTO dto = new CovDTO();
		funPoint(vo.getCovCategory(), dto::setCovCategory);
		funPoint(vo.getCovCode(), dto::setCovCode);
		funPoint(vo.getCovDescription(), dto::setCovDescription);
		funPoint(vo.getCovId(), dto::setCovId);
		funPoint(vo.getCovIdp(), dto::setCovIdp);
		funPoint(vo.getCovNicCode(), dto::setCovNicCode);
		funPoint(vo.getCovOnline(), dto::setCovOnline);
		funPoint(vo.getCovStatus(), dto::setCovStatus);
		funPoint(vo.getCreateDate(), dto::setCreateDate);
		funPoint(vo.getCreatedBy(), dto::setCreatedBy);
		funPoint(vo.getIsPH(), dto::setIsPH);
		funPoint(vo.getMinAge(), dto::setMinAge);
		funPoint(vo.getModifiedBy(), dto::setModifiedBy);
		funPoint(vo.getModifiedDate(), dto::setModifiedDate);
		return dto;
	}

}

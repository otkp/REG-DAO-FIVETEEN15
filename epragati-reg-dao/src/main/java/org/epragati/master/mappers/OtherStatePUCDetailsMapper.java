package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.OtherStatePUCDetailsDTO;
import org.epragati.master.vo.OtherStatePUCDetailsVO;
import org.springframework.stereotype.Component;

@Component
public class OtherStatePUCDetailsMapper extends BaseMapper<OtherStatePUCDetailsDTO, OtherStatePUCDetailsVO> {

	@Override
	public OtherStatePUCDetailsVO convertEntity(OtherStatePUCDetailsDTO dto) {
		OtherStatePUCDetailsVO otherStatePUCDetailsVO = new OtherStatePUCDetailsVO();
		funPoint(dto.getValidFrom(), otherStatePUCDetailsVO::setValidFrom);
		funPoint(dto.getValidTo(), otherStatePUCDetailsVO::setValidTo);
		return otherStatePUCDetailsVO;
	}

	@Override
	public OtherStatePUCDetailsDTO convertVO(OtherStatePUCDetailsVO vo) {
		OtherStatePUCDetailsDTO otherStatePUCDetailsDTO = new OtherStatePUCDetailsDTO();
		funPoint(vo.getValidFrom(), otherStatePUCDetailsDTO::setValidFrom);
		funPoint(vo.getValidTo(), otherStatePUCDetailsDTO::setValidTo);
		return otherStatePUCDetailsDTO;
	}

}

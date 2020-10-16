package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.OtherStateGreenTaxDetailsDTO;
import org.epragati.master.vo.OtherStateGreenTaxDetailsVO;
import org.springframework.stereotype.Component;

@Component
public class OtherStateGreenTaxDetailsMapper
		extends BaseMapper<OtherStateGreenTaxDetailsDTO, OtherStateGreenTaxDetailsVO> {

	@Override
	public OtherStateGreenTaxDetailsVO convertEntity(OtherStateGreenTaxDetailsDTO dto) {
		OtherStateGreenTaxDetailsVO otherStateGreenTaxDetailsVO = new OtherStateGreenTaxDetailsVO();
		funPoint(dto.getGreenTaxAmount(), otherStateGreenTaxDetailsVO::setGreenTaxAmount);
		funPoint(dto.getGreenTaxChallanNumber(), otherStateGreenTaxDetailsVO::setGreenTaxChallanNumber);
		funPoint(dto.getValidFrom(), otherStateGreenTaxDetailsVO::setValidFrom);
		funPoint(dto.getValidTo(), otherStateGreenTaxDetailsVO::setValidTo);
		return otherStateGreenTaxDetailsVO;
	}

	@Override
	public OtherStateGreenTaxDetailsDTO convertVO(OtherStateGreenTaxDetailsVO vo) {
		OtherStateGreenTaxDetailsDTO otherStateGreenTaxDetailsDTO = new OtherStateGreenTaxDetailsDTO();
		funPoint(vo.getGreenTaxAmount(), otherStateGreenTaxDetailsDTO::setGreenTaxAmount);
		funPoint(vo.getGreenTaxChallanNumber(), otherStateGreenTaxDetailsDTO::setGreenTaxChallanNumber);
		funPoint(vo.getValidFrom(), otherStateGreenTaxDetailsDTO::setValidFrom);
		funPoint(vo.getValidTo(), otherStateGreenTaxDetailsDTO::setValidTo);
		return otherStateGreenTaxDetailsDTO;
	}

}

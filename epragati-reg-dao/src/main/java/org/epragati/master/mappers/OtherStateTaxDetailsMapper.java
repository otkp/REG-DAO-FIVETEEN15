package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.OtherStateTaxDetailsDTO;
import org.epragati.master.vo.OtherStateTaxDetailsVO;
import org.springframework.stereotype.Component;

@Component
public class OtherStateTaxDetailsMapper extends BaseMapper<OtherStateTaxDetailsDTO, OtherStateTaxDetailsVO> {

	@Override
	public OtherStateTaxDetailsVO convertEntity(OtherStateTaxDetailsDTO dto) {
		OtherStateTaxDetailsVO otherStateTaxDetailsVO = new OtherStateTaxDetailsVO();
		funPoint(dto.getTaxAmount(), otherStateTaxDetailsVO::setTaxAmount);
		funPoint(dto.getTaxType(), otherStateTaxDetailsVO::setTaxType);
		funPoint(dto.getValidFrom(), otherStateTaxDetailsVO::setValidFrom);
		funPoint(dto.getValidTo(), otherStateTaxDetailsVO::setValidTo);
		return otherStateTaxDetailsVO;
	}

	@Override
	public OtherStateTaxDetailsDTO convertVO(OtherStateTaxDetailsVO vo) {
		OtherStateTaxDetailsDTO otherStateTaxDetailsDTO = new OtherStateTaxDetailsDTO();
		funPoint(vo.getTaxAmount(), otherStateTaxDetailsDTO::setTaxAmount);
		funPoint(vo.getTaxType(), otherStateTaxDetailsDTO::setTaxType);
		funPoint(vo.getValidFrom(), otherStateTaxDetailsDTO::setValidFrom);
		funPoint(vo.getValidTo(), otherStateTaxDetailsDTO::setValidTo);
		return otherStateTaxDetailsDTO;
	}

}

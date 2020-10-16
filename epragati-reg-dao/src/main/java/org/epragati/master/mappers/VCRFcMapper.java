package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.vcr.vo.ValidityDetailsVo;
import org.epragati.vcrImage.dto.VcrFinalServiceDTO;
import org.springframework.stereotype.Component;

@Component
public class VCRFcMapper extends BaseMapper<VcrFinalServiceDTO, ValidityDetailsVo>{

	@Override
	public ValidityDetailsVo convertEntity(VcrFinalServiceDTO dto) {
		// TODO Auto-generated method stub
		
		if(dto.getValidityDetails()!=null){
			ValidityDetailsVo vo = new ValidityDetailsVo();
			funPoint(dto.getValidityDetails().getFcFrom(),vo::setFcFrom);
			funPoint(dto.getValidityDetails().getFcNumber(),vo::setFcNumber);
			funPoint(dto.getValidityDetails().getFcTo(),vo::setFcTo);
			return vo;
		}
		return null;
	}

}

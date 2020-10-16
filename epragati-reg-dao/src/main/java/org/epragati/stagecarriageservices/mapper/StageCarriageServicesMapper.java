package org.epragati.stagecarriageservices.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.stagecarriages.dto.MasterStageCarriagesServicesDTO;
import org.epragati.stagecarriageservices.vo.MasterStageCarriageServicesVO;
import org.springframework.stereotype.Component;
@Component
public class StageCarriageServicesMapper extends BaseMapper<MasterStageCarriagesServicesDTO, MasterStageCarriageServicesVO>{

	@Override
	public MasterStageCarriageServicesVO convertEntity(MasterStageCarriagesServicesDTO dto) {
		MasterStageCarriageServicesVO vo = new MasterStageCarriageServicesVO();
		funPoint(dto.getServiceId(), vo::setServiceId);
		funPoint(dto.getServiceDescription(), vo::setServiceDescription);
		funPoint(dto.isAadhaarAuthenticationRequired(), vo::setAadhaarAuthenticationRequired);
		funPoint(dto.isSlotReqiured(), vo::setSlotReqiured);
		funPoint(dto.getValidation(), vo::setValidation);
		return vo;
	}

}

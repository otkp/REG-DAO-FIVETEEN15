package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.ServicesDTO;
import org.epragati.master.vo.ServicesVO;
import org.springframework.stereotype.Component;

/**
 * @author sairam.cheruku
 *
 */
@Component
public class ServicesMapper extends BaseMapper<ServicesDTO, ServicesVO> {

	@Override
	public ServicesVO convertEntity(ServicesDTO dto) {
		ServicesVO masterServicesVO = new ServicesVO();
		funPoint(dto.getServiceId(), masterServicesVO::setServiceId);
		funPoint(dto.getServiceDescription(), masterServicesVO::setServiceDescription);
		funPoint(dto.getServiceCode(), masterServicesVO::setServiceCode);
		funPoint(dto.getServiceModule(), masterServicesVO::setServiceModule);
		funPoint(dto.getStatus(), masterServicesVO::setStatus);
		funPoint(dto.getCreatedDate(), masterServicesVO::setCreatedDate);
		funPoint(dto.getCreatedby(), masterServicesVO::setCreatedby);
		funPoint(dto.getUpdatedby(), masterServicesVO::setUpdatedby);
		funPoint(dto.getCreatedDate(), masterServicesVO::setCreatedDate);
		funPoint(dto.getlUpdate(), masterServicesVO::setlUpdate);
		funPoint(dto.getAadharOtpStatus(), masterServicesVO::setAadharOtpStatus);
		return masterServicesVO;
	}

	@Override
	public ServicesDTO convertVO(ServicesVO vo) {
		ServicesDTO masterServicesDTO = new ServicesDTO();
		funPoint(vo.getServiceId(), masterServicesDTO::setServiceId);
		funPoint(vo.getServiceDescription(), masterServicesDTO::setServiceDescription);
		funPoint(vo.getStatus(), masterServicesDTO::setStatus);
		funPoint(vo.getServiceCode(), masterServicesDTO::setServiceCode);
		funPoint(vo.getServiceModule(), masterServicesDTO::setServiceModule);
		funPoint(vo.getlUpdate(), masterServicesDTO::setlUpdate);
		funPoint(vo.getCreatedby(), masterServicesDTO::setCreatedby);
		funPoint(vo.getUpdatedby(), masterServicesDTO::setUpdatedby);
		funPoint(vo.getCreatedDate(), masterServicesDTO::setCreatedDate);
		funPoint(vo.getlUpdate(), masterServicesDTO::setlUpdate);
		funPoint(vo.getAadharOtpStatus(), masterServicesDTO::setAadharOtpStatus);
		return masterServicesDTO;
	}

}

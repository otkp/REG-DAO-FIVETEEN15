package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.regservice.dto.CombinationServicesDTO;
import org.epragati.regservice.vo.ServicesCombinationsVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author krishnarjun.pampana
 *
 */

@Component
public class ServicesCombinationsMapper extends BaseMapper<CombinationServicesDTO, ServicesCombinationsVO> {

	@Override
	public ServicesCombinationsVO convertEntity(CombinationServicesDTO dto) {
		ServicesCombinationsVO scvo = new ServicesCombinationsVO();
		scvo.setServiceDescription(dto.getServiceDescription());
		scvo.setServiceId(dto.getServiceId());
		scvo.setCombinationServices(dto.getCombinationServices());
		scvo.setStatus(dto.isStatus());
		scvo.setOrderNo(dto.getOrderNo());
		scvo.setAadhaarAuthenticationRequired(dto.isAadhaarAuthenticationRequired());
		return scvo;
	}

}

package org.epragati.permits.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.permits.dto.PassengerDetailsDTO;
import org.epragati.permits.vo.PassengerDetailsVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author sairam.cheruku
 *
 */
@Component
public class PassengerDetailsMapper extends BaseMapper<PassengerDetailsDTO, PassengerDetailsVO> {

	@Override
	public PassengerDetailsVO convertEntity(PassengerDetailsDTO dto) {
		PassengerDetailsVO vo = new PassengerDetailsVO();
		funPoint(dto.getPassengerName(), vo::setPassengerName);
		funPoint(dto.getRepresentativeName(), vo::setRepresentativeName);
		funPoint(dto.getAge(), vo::setAge);
		funPoint(dto.getAddress(), vo::setAddress);
		funPoint(dto.getMobile(), vo::setMobile);
		funPoint(dto.getEmergencyContactName(), vo::setEmergencyContactName);
		funPoint(dto.getEmergencyContactNumber(), vo::setEmergencyContactNumber);
		funPoint(dto.getSeatNo(), vo::setSeatNo);
		return vo;
	}

	@Override
	public PassengerDetailsDTO convertVO(PassengerDetailsVO vo) {
		PassengerDetailsDTO dto = new PassengerDetailsDTO();
		funPoint(vo.getPassengerName(), dto::setPassengerName);
		funPoint(vo.getRepresentativeName(), dto::setRepresentativeName);
		funPoint(vo.getAge(), dto::setAge);
		funPoint(vo.getAddress(), dto::setAddress);
		funPoint(vo.getMobile(), dto::setMobile);
		funPoint(vo.getEmergencyContactName(), dto::setEmergencyContactName);
		funPoint(vo.getEmergencyContactNumber(), dto::setEmergencyContactNumber);
		funPoint(vo.getSeatNo(), dto::setSeatNo);
		return dto;
	}
}

package org.epragati.permits.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.permits.dto.TemporaryPermitPassengerDetailsDTO;
import org.epragati.permits.vo.TemporaryPermitPassengerDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author sairam.cheruku
 *
 */
@Component
public class TemporaryPermitPassengerDetailsMapper
		extends BaseMapper<TemporaryPermitPassengerDetailsDTO, TemporaryPermitPassengerDetailsVO> {

	@Autowired
	private PassengerDetailsMapper passengerDetailsMapper;

	@Autowired
	private PermitOtherServicesValidityDetailsMapper otherServicesValidityDetailsMapper;

	@Override
	public TemporaryPermitPassengerDetailsVO convertEntity(TemporaryPermitPassengerDetailsDTO dto) {
		TemporaryPermitPassengerDetailsVO vo = new TemporaryPermitPassengerDetailsVO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getPermitNo(), vo::setPermitNo);
		funPoint(dto.getPermitReferenceId(), vo::setPermitReferenceId);
		funPoint(dto.getStatus(), vo::setStatus);
		funPoint(dto.getNoOfPassengers(), vo::setNoOfpassengers);
		if (vo.getPassengerDetails() != null) {
			vo.setPassengerDetails(passengerDetailsMapper.convertEntity(dto.getPassengerDetails()));
		}
		funPoint(dto.getFromRoute(), vo::setFromRoute);
		funPoint(dto.getToRoute(), vo::setToRoute);
		funPoint(dto.getDlNumber(), vo::setDlNumber);
		funPoint(dto.getDriverName(), vo::setDriverName);
		funPoint(dto.getSecondryDriverName(), vo::setSecondryDriverName);
		funPoint(dto.getSecondryDriverDLNumber(), vo::setSecondryDriverDLNumber);
		funPoint(dto.getPrNo(), vo::setPrNo);
		funPoint(dto.getDateOfJourney(), vo::setDateOfJourney);
		funPoint(dto.getStartingTime(), vo::setStartingTime);
		return vo;
	}

	@Override
	public TemporaryPermitPassengerDetailsDTO convertVO(TemporaryPermitPassengerDetailsVO vo) {
		TemporaryPermitPassengerDetailsDTO dto = new TemporaryPermitPassengerDetailsDTO();
		funPoint(vo.getId(), dto::setId);
		funPoint(vo.getPermitNo(), dto::setPermitNo);
		funPoint(vo.getPermitReferenceId(), dto::setPermitReferenceId);
		funPoint(vo.getStatus(), dto::setStatus);
		if (vo.getPassengerDetails() != null) {
			dto.setPassengerDetails(passengerDetailsMapper.convertVO(vo.getPassengerDetails()));
		}

		funPoint(vo.getNoOfpassengers(), dto::setNoOfPassengers);
		funPoint(vo.getFromRoute(), dto::setFromRoute);
		funPoint(vo.getToRoute(), dto::setToRoute);
		funPoint(vo.getDriverName(), dto::setDriverName);
		funPoint(vo.getDlNumber(), dto::setDlNumber);
		funPoint(vo.getSecondryDriverDLNumber(), dto::setSecondryDriverDLNumber);
		funPoint(vo.getSecondryDriverName(), dto::setSecondryDriverName);
		funPoint(vo.getPrNo(), dto::setPrNo);
		if (vo.getSearchDetails() != null) {
			dto.setOtherServicesDetails(otherServicesValidityDetailsMapper.convertVO(vo.getSearchDetails()));
		}
		funPoint(vo.getDateOfJourney(), dto::setDateOfJourney);
		funPoint(vo.getStartingTime(), dto::setStartingTime);
		return dto;
	}

}

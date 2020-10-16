package org.epragati.regservice.mapper;

import java.util.ArrayList;
import java.util.List;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.TrailerChassisDetailsDTO;
import org.epragati.master.mappers.TrailerChassisDetailsMapper;
import org.epragati.regservice.dto.AlterationDTO;
import org.epragati.regservice.vo.AlterationVO;
import org.epragati.rta.vo.TrailerChassisDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlterationMapper extends BaseMapper<AlterationDTO, AlterationVO> {
	@Autowired
	private TrailerChassisDetailsMapper trailerChassisDetailsMapper;

	@Override
	public AlterationVO convertEntity(AlterationDTO dto) {

		AlterationVO vo = new AlterationVO();
		funPoint(dto.getAlterationService(), vo::setAlterationService);
		funPoint(dto.getCov(), vo::setCov);
		funPoint(dto.getFromCov(), vo::setFromCov);
		funPoint(dto.isSpecialNoRequired(), vo::setSpecialNoRequired);
		funPoint(dto.getFromFuel(), vo::setFromFuel);
		funPoint(dto.getFuel(), vo::setFuel);
		funPoint(dto.getGasKitNo(), vo::setGasKitNo);
		funPoint(dto.getAgencyDetails(), vo::setAgencyDetails);
		funPoint(dto.getFrombodyType(), vo::setFrombodyType);
		funPoint(dto.getBodyType(), vo::setBodyType);
		funPoint(dto.getFromSeatingCapacity(), vo::setFromSeatingCapacity);
		funPoint(dto.getSeating(), vo::setSeating);
		funPoint(dto.getVehicleTypeFrom(), vo::setVehicleTypeFrom);
		funPoint(dto.getVehicleTypeTo(), vo::setVehicleTypeTo);
		funPoint(dto.getPrNo(), vo::setPrNo);
		funPoint(dto.getPrGeneratedDate(), vo::setPrGeneratedDate);
		funPoint(dto.getRegistrationValidity(), vo::setRegistrationValidity);
		funPoint(dto.isNumberRequired(), vo::setNumberRequired);
		funPoint(dto.getHeight(), vo::setHeight);
		funPoint(dto.getWidth(), vo::setWidth);
		funPoint(dto.getLength(), vo::setLength);
		funPoint(dto.getDateOfCompletion(), vo::setDateOfCompletion);
		funPoint(dto.getColor(), vo::setColor);
		funPoint(dto.getUlw(), vo::setUlw);
		funPoint(dto.getApplicationNo(), vo::setApplicationNo);
		funPoint(dto.getGvw(), vo::setGvw);
		funPoint(dto.getTrailerChasisNo(), vo::setTrailerChasisNo);
		funPoint(dto.getCovDescription(), vo::setCovDescription);
		funPoint(dto.getAxleType(), vo::setAxleType);
		funPoint(dto.isMVIDone(), vo::setMVIDone);
		funPoint(dto.getGasKitValidity(), vo::setGasKitValidity);
		funPoint(dto.getOldPrNo(), vo::setOldPrNo);
		funPoint(dto.getFcType(), vo::setFcType);
		funPoint(dto.getMviEnterdColor(), vo::setMviEnterdColor);
		return vo;
	}

	@Override
	public AlterationDTO convertVO(AlterationVO vo) {
		List<TrailerChassisDetailsDTO> trailerList = new ArrayList<TrailerChassisDetailsDTO>();
		AlterationDTO dto = new AlterationDTO();
		funPoint(vo.getAlterationService(), dto::setAlterationService);
		funPoint(vo.getCov(), dto::setCov);
		funPoint(vo.getFromCov(), dto::setFromCov);
		funPoint(vo.isSpecialNoRequired(), dto::setSpecialNoRequired);
		funPoint(vo.getFromFuel(), dto::setFromFuel);
		funPoint(vo.getFuel(), dto::setFuel);
		funPoint(vo.getGasKitNo(), dto::setGasKitNo);
		funPoint(vo.getAgencyDetails(), dto::setAgencyDetails);
		funPoint(vo.getFrombodyType(), dto::setFrombodyType);
		funPoint(vo.getBodyType(), dto::setBodyType);
		funPoint(vo.getFromSeatingCapacity(), dto::setFromSeatingCapacity);
		funPoint(vo.getSeating(), dto::setSeating);
		funPoint(vo.getVehicleTypeFrom(), dto::setVehicleTypeFrom);
		funPoint(vo.getVehicleTypeTo(), dto::setVehicleTypeTo);
		funPoint(vo.getPrNo(), dto::setPrNo);
		funPoint(vo.getPrGeneratedDate(), dto::setPrGeneratedDate);
		funPoint(vo.getRegistrationValidity(), dto::setRegistrationValidity);
		funPoint(vo.isNumberRequired(), dto::setNumberRequired);
		funPoint(vo.getHeight(), dto::setHeight);
		funPoint(vo.getWidth(), dto::setWidth);
		funPoint(vo.getLength(), dto::setLength);
		funPoint(vo.getDateOfCompletion(), dto::setDateOfCompletion);
		funPoint(vo.getColor(), dto::setColor);
		funPoint(vo.getUlw(), dto::setUlw);
		funPoint(vo.getApplicationNo(), dto::setApplicationNo);
		funPoint(vo.getGvw(), dto::setGvw);
		funPoint(vo.getTrailerChasisNo(), dto::setTrailerChasisNo);
		funPoint(vo.getCovDescription(), dto::setCovDescription);
		funPoint(vo.getAxleType(), dto::setAxleType);
		funPoint(vo.isMVIDone(), dto::setMVIDone);
		funPoint(vo.getGasKitValidity(), dto::setGasKitValidity);
		funPoint(vo.getOldPrNo(), dto::setOldPrNo);
		funPoint(vo.getFcType(), dto::setFcType);
		funPoint(vo.getMviEnterdColor(), dto::setMviEnterdColor);
		/*
		 * if (vo.getTrailers() != null) { List<TrailerChassisDetailsDTO>
		 * trailerChasisDTO = trailerChassisDetailsMapper.convertVO(vo.getTrailers());
		 * dto.setTrailers(trailerChasisDTO); }
		 */
		if (vo.getTrailers() != null) {
			for (TrailerChassisDetailsVO trailerChasis : vo.getTrailers()) {
				TrailerChassisDetailsDTO trailerChasisDTO = new TrailerChassisDetailsDTO();
				trailerChasisDTO.setChassisNo(trailerChasis.getChassisNo());
				trailerChasisDTO.setGtw(trailerChasis.getGtw());
				trailerChasisDTO.setGvw(trailerChasis.getGvw());
				trailerChasisDTO.setUlw(trailerChasis.getUlw());
				trailerChasisDTO.setMakerName(trailerChasis.getMakerName());
				trailerChasisDTO.setColour(trailerChasis.getColor());
				trailerList.add(trailerChasisDTO);
			}

		}
		dto.setTrailers(trailerList);
		return dto;
	}
}

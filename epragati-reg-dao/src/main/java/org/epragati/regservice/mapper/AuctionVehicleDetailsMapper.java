package org.epragati.regservice.mapper;

import java.util.List;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.constants.EnclosureType;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.master.dto.AuctionVehicleDetailsDTO;
import org.epragati.regservice.vo.AuctionVehicleDetailsVO;
import org.epragati.service.enclosure.mapper.EnclosuresLogMapper;
import org.epragati.service.enclosure.vo.ImageVO;
import org.epragati.util.document.KeyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuctionVehicleDetailsMapper extends BaseMapper<AuctionVehicleDetailsDTO, AuctionVehicleDetailsVO>{

	@Autowired
	private EnclosuresLogMapper enclosuresLogMapper;
	
	@Override
	public AuctionVehicleDetailsVO convertEntity(AuctionVehicleDetailsDTO dto) {
		AuctionVehicleDetailsVO vo = new AuctionVehicleDetailsVO();
		funPoint(dto.getPrNo(), vo::setPrNo);
		funPoint(dto.getTrNo(), vo::setTrNo);
		funPoint(dto.getOfficeCode(), vo::setOfficeCode);
		funPoint(dto.getOfficeName(), vo::setOfficeName);
		funPoint(dto.getVehicleType(), vo::setVehicleType);
		funPoint(dto.getClassOfVehicle(), vo::setClassOfVehicle);
		funPoint(dto.getClassOfVehicleDesc(), vo::setClassOfVehicleDesc);
		funPoint(dto.getChassisNumber(), vo::setChassisNumber);
		funPoint(dto.getEngineNumber(), vo::setEngineNumber);
		funPoint(dto.getVehicleCondition(), vo::setVehicleCondition);
		funPoint(dto.getGenuiness(), vo::setGenuiness);
		funPoint(dto.getUpSetPrice(), vo::setUpSetPrice);
		funPoint(dto.getToken(), vo::setToken);
		funPoint(dto.getOtherState(), vo::setOtherState);
		funPoint(dto.getTowDone(), vo::setTowDone);
		funPoint(dto.getRcCanceled(), vo::setRcCanceled);
		if(dto.getEnclosures()!=null) {
			List<KeyValue<String, List<ImageEnclosureDTO>>> enclousersTo = dto.getEnclosures();
			List<KeyValue<EnclosureType, List<ImageVO>>> enclosuresInputList = enclosuresLogMapper
					.convertNewEnclosures(enclousersTo);
			vo.setEnclosures(enclosuresInputList);
		}
		
		return vo;
	}

	@Override
	public AuctionVehicleDetailsDTO convertVO(AuctionVehicleDetailsVO dto) {
		AuctionVehicleDetailsDTO vo = new AuctionVehicleDetailsDTO();
		funPoint(dto.getPrNo(), vo::setPrNo);
		funPoint(dto.getTrNo(), vo::setTrNo);
		funPoint(dto.getOfficeCode(), vo::setOfficeCode);
		funPoint(dto.getOfficeName(), vo::setOfficeName);
		funPoint(dto.getVehicleType(), vo::setVehicleType);
		funPoint(dto.getClassOfVehicle(), vo::setClassOfVehicle);
		funPoint(dto.getClassOfVehicleDesc(), vo::setClassOfVehicleDesc);
		funPoint(dto.getChassisNumber(), vo::setChassisNumber);
		funPoint(dto.getEngineNumber(), vo::setEngineNumber);
		funPoint(dto.getVehicleCondition(), vo::setVehicleCondition);
		funPoint(dto.getGenuiness(), vo::setGenuiness);
		funPoint(dto.getUpSetPrice(), vo::setUpSetPrice);
		funPoint(dto.getToken(), vo::setToken);
		funPoint(dto.getOtherState(), vo::setOtherState);
		funPoint(dto.getTowDone(), vo::setTowDone);
		funPoint(dto.getRcCanceled(), vo::setRcCanceled);
		
		return vo;
	}
}

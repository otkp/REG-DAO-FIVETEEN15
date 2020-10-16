package org.epragati.regservice.mapper;

import java.util.List;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.constants.EnclosureType;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.master.dto.AuctionDetailsDTO;
import org.epragati.regservice.vo.AuctionDetailsVO;
import org.epragati.service.enclosure.mapper.EnclosuresLogMapper;
import org.epragati.service.enclosure.vo.ImageVO;
import org.epragati.util.document.KeyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AuctionDetailsMapper extends BaseMapper<AuctionDetailsDTO, AuctionDetailsVO>{
	
	@Autowired
	private AuctionVehicleDetailsMapper auctionVehicleDetailsMapper;
	@Autowired
	private ActionDetailMapper actionDetailMapper;
	@Autowired
	private EnclosuresLogMapper enclosuresLogMapper;
	
	@Override
	public AuctionDetailsVO convertEntity(AuctionDetailsDTO dto) {
		AuctionDetailsVO vo = new AuctionDetailsVO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getNameOfRequester(), vo::setNameOfRequester);
		funPoint(dto.getDepartment(), vo::setDepartment);
		funPoint(dto.getMviName(), vo::setMviName);
		funPoint(dto.getMviOfficeCode(), vo::setMviOfficeCode);
		funPoint(dto.getMviUserId(), vo::setMviUserId);
		funPoint(dto.getDtcName(), vo::setDtcName);
		funPoint(dto.getNoOfVehicles(), vo::setNoOfVehicles);
		if(dto.getEnclosures()!=null) {
			List<KeyValue<String, List<ImageEnclosureDTO>>> enclousersTo = dto.getEnclosures();
			List<KeyValue<EnclosureType, List<ImageVO>>> enclosuresInputList = enclosuresLogMapper
					.convertNewEnclosures(enclousersTo);
			vo.setEnclosures(enclosuresInputList);
		}
		if(dto.getVehicleDetails() != null) {
			vo.setVehicleDetails(auctionVehicleDetailsMapper.convertEntity(dto.getVehicleDetails()));
		}
		funPoint(dto.isDtcCompleted(), vo::setDtcCompleted);
		if(dto.getActions() !=null) {
			vo.setActions(actionDetailMapper.convertEntity(dto.getActions()));
		}
		return vo;
	}
	

	@Override
	public AuctionDetailsDTO convertVO(AuctionDetailsVO dto) {
		
		AuctionDetailsDTO vo = new AuctionDetailsDTO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getNameOfRequester(), vo::setNameOfRequester);
		funPoint(dto.getDepartment(), vo::setDepartment);
		funPoint(dto.getMviName(), vo::setMviName);
		funPoint(dto.getMviOfficeCode(), vo::setMviOfficeCode);
		funPoint(dto.getMviUserId(), vo::setMviUserId);
		funPoint(dto.getDtcName(), vo::setDtcName);
		funPoint(dto.getNoOfVehicles(), vo::setNoOfVehicles);
		if(dto.getVehicleDetails() != null) {
			vo.setVehicleDetails(auctionVehicleDetailsMapper.convertVO(dto.getVehicleDetails()));
		}
		funPoint(dto.isDtcCompleted(), vo::setDtcCompleted);
		if(dto.getActions() !=null) {
			vo.setActions(actionDetailMapper.convertVO(dto.getActions()));
		}
		return vo;
		
	}
}

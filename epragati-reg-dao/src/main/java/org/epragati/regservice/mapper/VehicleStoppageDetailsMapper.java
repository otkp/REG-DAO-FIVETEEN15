package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.mappers.ApplicantAddressMapper;
import org.epragati.master.mappers.MasterStoppageQuationsMapper;
import org.epragati.master.mappers.MasterStoppageRevocationQuationsMapper;
import org.epragati.regservice.dto.VehicleStoppageDetailsDTO;
import org.epragati.regservice.vo.VehicleStoppageDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleStoppageDetailsMapper extends BaseMapper<VehicleStoppageDetailsDTO, VehicleStoppageDetailsVO>{

	@Autowired
	private ApplicantAddressMapper applicantAddressMapper;
	@Autowired
	private  MasterStoppageQuationsMapper masterStoppageQuationsMapper;
	@Autowired
	private MasterStoppageRevocationQuationsMapper masterStoppageRevocationQuationsMapper;
	@Autowired
	private ActionDetailMapper actionDetailMapper;
	@Autowired
	private VehicleStoppageMVIReportMapper mviReportMapper;
	@Override
	public VehicleStoppageDetailsVO convertEntity(VehicleStoppageDetailsDTO dto) {
		VehicleStoppageDetailsVO vo = new VehicleStoppageDetailsVO();
	if(dto.getVehicleAddressDetails() != null) {
		vo.setVehicleAddressDetails(applicantAddressMapper.convertEntity(dto.getVehicleAddressDetails()));
	}
		funPoint(dto.getStoppageDate(), vo::setStoppageDate);
		funPoint(dto.getReasonForStoppage(), vo::setReasonForStoppage);
		funPoint(dto.getStoppageRevpkationDate(), vo::setStoppageRevpkationDate);
		if(dto.getStoppageQuations() != null) {
			vo.setStoppageQuations(masterStoppageQuationsMapper.convertEntity(dto.getStoppageQuations()));
		}
		if(dto.getStoppageRevocationQuations()!= null) {
			vo.setStoppageRevocationQuations(masterStoppageRevocationQuationsMapper.convertEntity(dto.getStoppageRevocationQuations()));
		}
		funPoint(dto.getStoppageMapQuations(), vo::setStoppageMapQuations);
		if(dto.getActions()!= null && !dto.getActions().isEmpty()) {
			vo.setActions(actionDetailMapper.convertEntity(dto.getActions()));
		}
		funPoint(dto.getOfficeCode(), vo::setOfficeCode);
		funPoint(dto.getUserId(), vo::setUserId);
		funPoint(dto.getRtoUserId(), vo::setRtoUserId);
		funPoint(dto.getOtherState(), vo::setOtherState);
		if(dto.getMviReport()!= null && !dto.getMviReport().isEmpty()) {
			vo.setMviReport(mviReportMapper.convertEntity(dto.getMviReport()));
		}
		funPoint(dto.getInspectionUpto(), vo::setInspectionUpto);
		funPoint(dto.getTaxExemMonths(), vo::setTaxExemMonths);
		funPoint(dto.getMviNumber(), vo::setMviNumber);
		funPoint(dto.getDtcNumber(), vo::setDtcNumber);
		funPoint(dto.getRejectionComments(), vo::setRejectionComments);
		funPoint(dto.getStoppageApplicationNo(), vo::setStoppageApplicationNo);
		return vo;
	}

	@Override
	public VehicleStoppageDetailsDTO convertVO(VehicleStoppageDetailsVO vo) {
		
		VehicleStoppageDetailsDTO dto = new VehicleStoppageDetailsDTO();
		if(vo.getVehicleAddressDetails() != null) {
			dto.setVehicleAddressDetails(applicantAddressMapper.convertVO(vo.getVehicleAddressDetails()));
		}
		funPoint(vo.getStoppageDate(), dto::setStoppageDate);
		funPoint(vo.getReasonForStoppage(), dto::setReasonForStoppage);
		funPoint(vo.getStoppageRevpkationDate(), dto::setStoppageRevpkationDate);
		if(vo.getStoppageQuations() != null) {
			dto.setStoppageQuations(masterStoppageQuationsMapper.convertVO(vo.getStoppageQuations()));
		}
		if(vo.getStoppageRevocationQuations()!= null) {
			dto.setStoppageRevocationQuations(masterStoppageRevocationQuationsMapper.convertVO(vo.getStoppageRevocationQuations()));
		}
		funPoint(dto.getStoppageMapQuations(), vo::setStoppageMapQuations);
		if(vo.getActions()!= null && !dto.getActions().isEmpty()) {
			dto.setActions(actionDetailMapper.convertVO(vo.getActions()));
		}
		funPoint(vo.getOfficeCode(), dto::setOfficeCode);
		funPoint(vo.getUserId(), dto::setUserId);
		funPoint(vo.getRtoUserId(), dto::setRtoUserId);
		funPoint(vo.getOtherState(), dto::setOtherState);
		if(vo.getMviReport()!= null && !vo.getMviReport().isEmpty()) {
			dto.setMviReport(mviReportMapper.convertVO(vo.getMviReport()));
		}
		funPoint(vo.getInspectionUpto(), dto::setInspectionUpto);
		funPoint(vo.getTaxExemMonths(), dto::setTaxExemMonths);
		funPoint(vo.getMviNumber(), dto::setMviNumber);
		funPoint(vo.getDtcNumber(), dto::setDtcNumber);
		funPoint(vo.getRejectionComments(), dto::setRejectionComments);
		funPoint(vo.getStoppageApplicationNo(), dto::setStoppageApplicationNo);
		return dto;
	}
}

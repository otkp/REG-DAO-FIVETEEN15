package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.mappers.ApplicantAddressMapper;
import org.epragati.master.mappers.OfficeMapper;
import org.epragati.regservice.dto.RegServiceDTO;
import org.epragati.rta.vo.FreshRcReassignedMVIVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FreshRCReassignMapper extends BaseMapper<RegServiceDTO, FreshRcReassignedMVIVO> {
	@Autowired
	private ApplicantAddressMapper applicantAddressMapper;
	@Autowired
	private OfficeMapper officeMapper;
	@Autowired
	private LockedDetailsMapper lockedDetailsMapper;

	@Override
	public FreshRcReassignedMVIVO convertEntity(RegServiceDTO dto) {
		FreshRcReassignedMVIVO vo = new FreshRcReassignedMVIVO();
		if (dto != null) {
			funPoint(dto.getApplicationNo(), vo::setApplicationNo);
			funPoint(dto.getPrNo(), vo::setPrNo);

			funPoint(dto.getRegistrationDetails().getApplicantDetails().getDisplayName(), vo::setDisplayName);
			funPoint(dto.getRegistrationDetails().getApplicantDetails().getFirstName(), vo::setFirstName);
			funPoint(dto.getRegistrationDetails().getApplicantDetails().getMiddleName(), vo::setMiddleName);
			funPoint(dto.getRegistrationDetails().getApplicantDetails().getLastName(), vo::setLastName);
			funPoint(dto.getRegistrationDetails().getApplicantDetails().getFatherName(), vo::setFatherName);
			funPoint(dto.getRegistrationDetails().getApplicantDetails().getRepresentativeName(),
					vo::setRepresentativeName);
			funPoint(dto.getRegistrationDetails().getOwnerType(), vo::setOwnerType);
			funPoint(dto.getRegistrationDetails().getApplicantDetails().getEntityName(), vo::setEntityName);
			funPoint(dto.getApplicationStatus(), vo::setApplicationStatus);
			funPoint(dto.getRegistrationDetails().getClassOfVehicle(), vo::setClassOfVehicle);
			funPoint(dto.getRegistrationDetails().getClassOfVehicleDesc(), vo::setClassOfVehicleDesc);
			funPoint(dto.getFreshRcdetails().getYardLocation(), vo::setYardLocation);
			funPoint(dto.getFreshRcdetails().getFinancerUserId(), vo::setFinancerUserId);
			funPoint(dto.getFreshRcdetails().getYardName(), vo::setYardName);
			funPoint(dto.getRegistrationDetails().getFinanceDetails().getFinancerName(), vo::setFinancerName);
			funPoint(dto.getRegistrationDetails().getFinanceDetails().getSanctionedAmount(), vo::setSanctionedAmount);
			funPoint(dto.getRegistrationDetails().getVehicleType(), vo::setVehicleType);
			funPoint(dto.getServiceIds(), vo::setServiceIds);
			funPoint(dto.getRegistrationDetails().getVahanDetails().getChassisNumber(), vo::setChassisNumber);
			funPoint(dto.getRegistrationDetails().getVahanDetails().getEngineNumber(), vo::setEngineNumber);
			funPoint(dto.isMviDone(), vo::setMviDone);
			vo.setOfficeDetails(officeMapper.convertEntity(dto.getOfficeDetails()));
			vo.setMviOfficeDetails(officeMapper.convertEntity(dto.getMviOfficeDetails()));
			vo.setYardAddress(applicantAddressMapper.convertEntity(dto.getFreshRcdetails().getYardAddress()));
			vo.setLockedDetails(lockedDetailsMapper.convertEntity(dto.getLockedDetails()));
		}

		return vo;

	}

}

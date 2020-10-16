package org.epragati.master.mappers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.epragati.master.dto.StagingRegServiceDetailsAutoApprovalDTO;
import org.epragati.master.dto.StagingRegistrationDetailsDTO;
import org.epragati.master.vo.RegistrationDetailsVO;
import org.epragati.master.vo.StagingRegistrationDetailsVO;
import org.epragati.util.payment.ServiceEnum;
import org.springframework.stereotype.Component;

@Component
/*
 * public class StagingRegistrationDetailsMapper extends
 * RegistrationDetailsMapper<BaseRegistrationDetailsDTO> {
 * 
 * @Override public BaseRegistrationDetailsDTO getInstance() { return new
 * BaseRegistrationDetailsDTO(); }*
 * 
 * 
 * 
 * 
 */

public class StagingRegistrationDetailsMapper extends RegistrationDetailsMapper {

	@Override
	public StagingRegistrationDetailsDTO getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
/*@Override
	public StagingRegistrationDetailsVO convertEntity(StagingRegistrationDetailsDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}*/



	public RegistrationDetailsVO convertEntity(StagingRegistrationDetailsDTO dto) {
		RegistrationDetailsVO vo = super.convertEntity(dto);
		return vo;
	}
	public StagingRegistrationDetailsVO convertStageVO(StagingRegistrationDetailsDTO dto) {
		StagingRegistrationDetailsVO vo = super.convertStageVO(dto);
		return vo;
	}

	public StagingRegServiceDetailsAutoApprovalDTO convertStageAutoApprovalLog(StagingRegistrationDetailsDTO dto) {
		StagingRegServiceDetailsAutoApprovalDTO stagingLogdto = new StagingRegServiceDetailsAutoApprovalDTO();
		stagingLogdto.setAutoApprovalsDate(LocalDate.now());
		stagingLogdto.setStagingReg(dto);
		stagingLogdto.setAutoApprovalInitiatedDate(dto.getAutoApprovalInitiatedDate());
		if (dto.getApplicantDetails() != null && dto.getApplicantDetails().getPresentAddress() != null
				&& dto.getApplicantDetails().getPresentAddress().getDistrict() != null) {
			stagingLogdto.setDistrict(dto.getApplicantDetails().getPresentAddress().getDistrict());
			stagingLogdto.setDistrictId(dto.getApplicantDetails().getPresentAddress().getDistrict().getDistrictId());
			stagingLogdto
					.setDistrictName(dto.getApplicantDetails().getPresentAddress().getDistrict().getDistrictName());
		}
		if (dto.getOfficeDetails() != null && StringUtils.isNotEmpty(dto.getOfficeDetails().getOfficeCode())) {
			stagingLogdto.setOfficeCode(dto.getOfficeDetails().getOfficeCode());
		}
		stagingLogdto.setTrNo(dto.getTrNo());
		stagingLogdto.setApplicationNo(dto.getApplicationNo());
		stagingLogdto.setCreatedDate(LocalDateTime.now());
		stagingLogdto.setServiceName(Arrays.asList(ServiceEnum.NEWREG));
		if (dto.getFlowDetails().getFlowDetails().entrySet().stream().findFirst().isPresent() && dto.getFlowDetails() != null && null != dto.getFlowDetails().getFlowDetails() &&  dto.getFlowDetails().getFlowDetails().entrySet() != null) {
			stagingLogdto.setRoleType(dto.getFlowDetails().getFlowDetails().entrySet().stream().findFirst().get()
					.getValue().stream().map(ro -> ro.getRole()).collect(Collectors.toSet()));
		}
		return stagingLogdto;
	}
}
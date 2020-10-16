package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.regservice.dto.NOCDetailsDTO;
import org.epragati.regservice.vo.NOCDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NOCDetailsMapper extends BaseMapper<NOCDetailsDTO, NOCDetailsVO> {

	@Autowired
	private PoliceClearanceCertificateMapper policeClearanceCertificateMapper;
	
	@Autowired
	private IssuingAuthorityDetailsMapper issuingAuthorityDetailsMapper;
	
	@Override
	public NOCDetailsVO convertEntity(NOCDetailsDTO dto) {
		
		NOCDetailsVO vo = new NOCDetailsVO();
		
		funPoint(dto.getState(), vo::setState);
		funPoint(dto.getDistrict(), vo::setDistrict);
		funPoint(dto.getRtaOffice(), vo::setRtaOffice);
		funPoint(dto.getPeriodOfStay(), vo::setPeriodOfStay);
		if (dto.getPoliceClearanceDetails() != null) {
			vo.setPoliceClearanceDetails(policeClearanceCertificateMapper.convertEntity(dto.getPoliceClearanceDetails()));
		}
		if (dto.getIssueAuthorityDetails() != null) {
			vo.setIssueAuthorityDetails(issuingAuthorityDetailsMapper.convertEntity(dto.getIssueAuthorityDetails()));
		}
		funPoint(dto.getDateOfEntry(), vo::setDateOfEnter);
		funPoint(dto.getIssueDate(), vo::setIssueDate);
		funPoint(dto.getnOCIssuedRtaOffice(), vo::setnOCIssuedRtaOffice);
		funPoint(dto.isNocIssued(), vo::setNocIssued);
		funPoint(dto.getCancellationReason(), vo::setCancellationReason);
		return vo;
		
	}

	@Override
	public NOCDetailsDTO convertVO(NOCDetailsVO vo) {
		
		NOCDetailsDTO dto = new NOCDetailsDTO();
		funPoint(vo.getState(), dto::setState);
		funPoint(vo.getDistrict(), dto::setDistrict);
		funPoint(vo.getRtaOffice(), dto::setRtaOffice);
		funPoint(vo.getPeriodOfStay(), dto::setPeriodOfStay); 
		if (vo.getPoliceClearanceDetails() != null) {
			dto.setPoliceClearanceDetails(policeClearanceCertificateMapper.convertVO(vo.getPoliceClearanceDetails()));
		}
		if (vo.getIssueAuthorityDetails() != null) {
			dto.setIssueAuthorityDetails(issuingAuthorityDetailsMapper.convertVO(vo.getIssueAuthorityDetails()));
		}
		funPoint(vo.getDateOfEnter(), dto::setDateOfEntry);
		funPoint(vo.getIssueDate(), dto::setIssueDate);
		funPoint(vo.getnOCIssuedRtaOffice(), dto::setnOCIssuedRtaOffice);
		funPoint(vo.isNocIssued(), dto::setNocIssued);
		funPoint(vo.getCancellationReason(), dto::setCancellationReason);
		
		return dto;
	}
}

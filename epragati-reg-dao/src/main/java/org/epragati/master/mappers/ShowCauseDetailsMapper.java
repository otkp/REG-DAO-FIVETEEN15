package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.ShowCauseDetailsDTO;
import org.epragati.payment.report.vo.ShowCauseDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShowCauseDetailsMapper extends BaseMapper<ShowCauseDetailsDTO, ShowCauseDetailsVO> {

	@Autowired
	private RegistrationMapper registrationMapper;

	@Autowired
	private ShowCauseSectionMapper showCauseSectionMapper;

	@Override
	public ShowCauseDetailsVO convertEntity(ShowCauseDetailsDTO dto) {
		ShowCauseDetailsVO showCauseDetailsVO = new ShowCauseDetailsVO();
		funPoint(dto.getPrNo(), showCauseDetailsVO::setPrNo);
		funPoint(dto.getScNo(), showCauseDetailsVO::setScNo);
		funPoint(dto.getScIssuedDate(), showCauseDetailsVO::setScIssuedDate);
		funPoint(dto.getScPurpose(), showCauseDetailsVO::setScPurpose);
		funPoint(dto.getStatus(), showCauseDetailsVO::setStatus);
		funPoint(dto.getAckDate(), showCauseDetailsVO::setAckDate);
		funPoint(dto.getExpDate(), showCauseDetailsVO::setExpDate);
		funPoint(dto.getExpRemark(), showCauseDetailsVO::setExpRemark);
		funPoint(dto.getMviName(), showCauseDetailsVO::setMviName);
		funPoint(dto.getApprovedBy(), showCauseDetailsVO::setApprovedBy);
		funPoint(dto.getApprovedDate(), showCauseDetailsVO::setApprovedDate);
		funPoint(dto.getLastUpdatedDate(), showCauseDetailsVO::setLastUpdatedDate);
		funPoint(dto.getLastUpdatedUser(), showCauseDetailsVO::setLastUpdatedUser);
		funPoint(dto.getScStatus(), showCauseDetailsVO::setScStatus);
		funPoint(dto.getSatisfied(), showCauseDetailsVO::setSatisfied);
		funPoint(dto.getOfficeCode(), showCauseDetailsVO::setOfficeCode);
		if (dto.getScType() != null) {
			showCauseDetailsVO.setScType(showCauseSectionMapper.convertEntity(dto.getScType()));
		}
		funPoint(dto.getPrintDate(), showCauseDetailsVO::setPrintDate);
		funPoint(dto.getPrintCount(), showCauseDetailsVO::setPrintCount);
		funPoint(dto.getRePrintCount(), showCauseDetailsVO::setRePrintCount);
		funPoint(dto.getScPurpose(), showCauseDetailsVO::setScPurpose);
		

		return showCauseDetailsVO;
	}

	public ShowCauseDetailsDTO convertVo(ShowCauseDetailsVO vo) {
		ShowCauseDetailsDTO showCauseDetailsDTO = new ShowCauseDetailsDTO();
		funPoint(vo.getPrNo(), showCauseDetailsDTO::setPrNo);
		funPoint(vo.getScNo(), showCauseDetailsDTO::setScNo);
		funPoint(vo.getScIssuedDate(), showCauseDetailsDTO::setScIssuedDate);
		funPoint(vo.getScPurpose(), showCauseDetailsDTO::setScPurpose);
		funPoint(vo.getStatus(), showCauseDetailsDTO::setStatus);
		funPoint(vo.getAckDate(), showCauseDetailsDTO::setAckDate);
		funPoint(vo.getExpDate(), showCauseDetailsDTO::setExpDate);
		funPoint(vo.getExpRemark(), showCauseDetailsDTO::setExpRemark);
		funPoint(vo.getMviName(), showCauseDetailsDTO::setMviName);
		funPoint(vo.getApprovedBy(), showCauseDetailsDTO::setApprovedBy);
		funPoint(vo.getApprovedDate(), showCauseDetailsDTO::setApprovedDate);
		funPoint(vo.getLastUpdatedDate(), showCauseDetailsDTO::setLastUpdatedDate);
		funPoint(vo.getLastUpdatedUser(), showCauseDetailsDTO::setLastUpdatedUser);
		funPoint(vo.getScStatus(), showCauseDetailsDTO::setScStatus);
		funPoint(vo.getSatisfied(), showCauseDetailsDTO::setSatisfied);
		funPoint(vo.getOfficeCode(), showCauseDetailsDTO::setOfficeCode);
		if (vo.getScType() != null) {
			showCauseDetailsDTO.setScType(showCauseSectionMapper.convertVo(vo.getScType()));
		}
		funPoint(vo.getPrintDate(), showCauseDetailsDTO::setPrintDate);
		funPoint(vo.getPrintCount(), showCauseDetailsDTO::setPrintCount);
		funPoint(vo.getRePrintCount(), showCauseDetailsDTO::setRePrintCount);
		funPoint(vo.getScPurpose(), showCauseDetailsDTO::setScPurpose);

		return showCauseDetailsDTO;
	}
	
	public ShowCauseDetailsVO convertRequriedFileds(ShowCauseDetailsDTO scDto){
		ShowCauseDetailsVO showCauseDetailsVO = new ShowCauseDetailsVO();
		showCauseDetailsVO.setPrNo(scDto.getPrNo());
		showCauseDetailsVO.setCov(scDto.getCov());
		showCauseDetailsVO.setTaxValidity(scDto.getTaxValidity());
		showCauseDetailsVO.setOwnerName(scDto.getOwnerName());
		showCauseDetailsVO.setOwnerAddress(scDto.getOwnerAddress());
		showCauseDetailsVO.setFcValidity(scDto.getFcValidity());
		showCauseDetailsVO.setScNo(scDto.getScNo());
		showCauseDetailsVO.setScIssuedDate(scDto.getScIssuedDate());
		funPoint(scDto.getMobileNo(), showCauseDetailsVO::setMobileNo);
		funPoint(scDto.getFatherName(), showCauseDetailsVO::setFatherName);
		return showCauseDetailsVO;
	}
	
	public List<ShowCauseDetailsVO> convertSpecificFieldsList(List<ShowCauseDetailsDTO> scDto) {
		return scDto.stream().map(e -> convertRequriedFileds(e)).collect(Collectors.toList());
		}
}

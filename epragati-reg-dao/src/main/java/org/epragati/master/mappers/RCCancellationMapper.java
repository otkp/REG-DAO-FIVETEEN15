package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.RCCancellationDTO;
import org.epragati.payment.report.vo.RCCancellationVO;
import org.springframework.stereotype.Component;

@Component
public class RCCancellationMapper extends BaseMapper<RCCancellationDTO, RCCancellationVO> {


	@Override
	public RCCancellationVO convertEntity(RCCancellationDTO rcCancellationDTO) {

		RCCancellationVO rcCancellationVO = new RCCancellationVO();
		funPoint(rcCancellationDTO.getPrNo(), rcCancellationVO::setPrNo);
		funPoint(rcCancellationDTO.getCov(), rcCancellationVO::setCov);
		funPoint(rcCancellationDTO.getTaxValidity(), rcCancellationVO::setTaxValidity);
		funPoint(rcCancellationDTO.getOwnerName(), rcCancellationVO::setOwnerName);
		funPoint(rcCancellationDTO.getOwnerAddress(), rcCancellationVO::setOwnerAddress);
		funPoint(rcCancellationDTO.getMandalName(), rcCancellationVO::setMandalName);
		funPoint(rcCancellationDTO.getFinancerName(), rcCancellationVO::setFinancerName);
		funPoint(rcCancellationDTO.getFinancerAddress(), rcCancellationVO::setFinancerAddress);
		funPoint(rcCancellationDTO.getFcValidity(), rcCancellationVO::setFcValidity);
		funPoint(rcCancellationDTO.getPermitValidity(), rcCancellationVO::setPermitValidity);
		funPoint(rcCancellationDTO.getReasonForCancellation(), rcCancellationVO::setReasonForCancellation);
		funPoint(rcCancellationDTO.getIsVehicleCondemmed(), rcCancellationVO::setIsVehicleCondemmed);
		funPoint(rcCancellationDTO.getIsCancelledByCitizen(), rcCancellationVO::setIsCancelledByCitizen);
		funPoint(rcCancellationDTO.getNoOfTimesNoticeGiven(), rcCancellationVO::setNoOfTimesNoticeGiven);
		return rcCancellationVO;
	}

	@Override
	public List<RCCancellationVO> convertEntity(List<RCCancellationDTO> rcCancellationDTOList) {
		return rcCancellationDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());

	}

	@Override
	public RCCancellationDTO convertVO(RCCancellationVO rcCancellationVO) {
		RCCancellationDTO rcCancellationDTO = new RCCancellationDTO();
		funPoint(rcCancellationVO.getPrNo(), rcCancellationDTO::setPrNo);
		funPoint(rcCancellationVO.getCov(), rcCancellationDTO::setCov);
		funPoint(rcCancellationVO.getTaxValidity(), rcCancellationDTO::setTaxValidity);
		funPoint(rcCancellationVO.getOwnerName(), rcCancellationDTO::setOwnerName);
		funPoint(rcCancellationVO.getOwnerAddress(), rcCancellationDTO::setOwnerAddress);
		funPoint(rcCancellationVO.getMandalName(), rcCancellationDTO::setMandalName);
		funPoint(rcCancellationVO.getFinancerName(), rcCancellationDTO::setFinancerName);
		funPoint(rcCancellationVO.getFinancerAddress(), rcCancellationDTO::setFinancerAddress);
		funPoint(rcCancellationVO.getFcValidity(), rcCancellationDTO::setFcValidity);
		funPoint(rcCancellationVO.getPermitValidity(), rcCancellationDTO::setPermitValidity);
		funPoint(rcCancellationVO.getReasonForCancellation(), rcCancellationDTO::setReasonForCancellation);
		funPoint(rcCancellationVO.getIsVehicleCondemmed(), rcCancellationDTO::setIsVehicleCondemmed);
		funPoint(rcCancellationVO.getIsCancelledByCitizen(), rcCancellationDTO::setIsCancelledByCitizen);
		funPoint(rcCancellationVO.getNoOfTimesNoticeGiven(), rcCancellationDTO::setNoOfTimesNoticeGiven);
		return rcCancellationDTO;

	}

	@Override
	public List<RCCancellationDTO> convertVO(List<RCCancellationVO> rcCancellationVOList) {
		return rcCancellationVOList.stream().map(e -> convertVO(e)).collect(Collectors.toList());

	}
	
	public RCCancellationVO converEntityLimitedFields(RCCancellationDTO rcCancellationDTO) {
		RCCancellationVO rcCancellationVO = new RCCancellationVO();
		funPoint(rcCancellationDTO.getReasonForCancellation(), rcCancellationVO::setReasonForCancellation);
		funPoint(rcCancellationDTO.getAoRemarks(), rcCancellationVO::setAoRemarks);
		funPoint(rcCancellationDTO.getMviRemarks(), rcCancellationVO::setMviRemarks);
		return rcCancellationVO;
	}

}

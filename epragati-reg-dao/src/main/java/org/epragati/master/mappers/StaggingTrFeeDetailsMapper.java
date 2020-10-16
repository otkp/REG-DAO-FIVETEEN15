package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.StaggingTrFeeDetailsDTO;
import org.epragati.master.vo.StaggingTrFeeDetailsVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class StaggingTrFeeDetailsMapper extends BaseMapper<StaggingTrFeeDetailsDTO, StaggingTrFeeDetailsVO>{

	private StaggingTrFeeDetailsVO staggingTrFeeDetailsVO;
	private StaggingTrFeeDetailsDTO staggingTrFeeDetailsDTO;
	
	@Override
	public StaggingTrFeeDetailsVO convertEntity(StaggingTrFeeDetailsDTO staggingTrFeeDetailsDTO) {
		staggingTrFeeDetailsVO = new StaggingTrFeeDetailsVO();
		funPoint(staggingTrFeeDetailsDTO.getTfdId(), staggingTrFeeDetailsVO::setTfdId);
		funPoint(staggingTrFeeDetailsDTO.getTfdTdId(), staggingTrFeeDetailsVO::setTfdTdId);
		funPoint(staggingTrFeeDetailsDTO.getTfdTaxAmount(), staggingTrFeeDetailsVO::setTfdTaxAmount);
		funPoint(staggingTrFeeDetailsDTO.getTfdAppFee(), staggingTrFeeDetailsVO::setTfdAppFee);
		funPoint(staggingTrFeeDetailsDTO.getTfdHpaFee(), staggingTrFeeDetailsVO::setTfdHpaFee);
		funPoint(staggingTrFeeDetailsDTO.getTfdServiceFee(), staggingTrFeeDetailsVO::setTfdServiceFee);
		funPoint(staggingTrFeeDetailsDTO.getTfdPenality(), staggingTrFeeDetailsVO::setTfdPenality);
		funPoint(staggingTrFeeDetailsDTO.getTfdRegAppFee(), staggingTrFeeDetailsVO::setTfdRegAppFee);
		funPoint(staggingTrFeeDetailsDTO.getTfdRegServiceFee(), staggingTrFeeDetailsVO::setTfdRegServiceFee);
		funPoint(staggingTrFeeDetailsDTO.getTfdRegCardFee(), staggingTrFeeDetailsVO::setTfdRegCardFee);
		funPoint(staggingTrFeeDetailsDTO.getTfdRegPostalFee(), staggingTrFeeDetailsVO::setTfdRegPostalFee);
		funPoint(staggingTrFeeDetailsDTO.getTfdFcAppFee(), staggingTrFeeDetailsVO::setTfdFcAppFee);
		funPoint(staggingTrFeeDetailsDTO.getTfdFcServiceFee(), staggingTrFeeDetailsVO::setTfdFcServiceFee);
		funPoint(staggingTrFeeDetailsDTO.getTfdPermitAppFee(), staggingTrFeeDetailsVO::setTfdPermitAppFee);
		funPoint(staggingTrFeeDetailsDTO.getTfdPermitSerFee(), staggingTrFeeDetailsVO::setTfdPermitSerFee);
		funPoint(staggingTrFeeDetailsDTO.getTfdHsrpFee(), staggingTrFeeDetailsVO::setTfdHsrpFee);
		funPoint(staggingTrFeeDetailsDTO.getTfdCessFee(), staggingTrFeeDetailsVO::setTfdCessFee);
		funPoint(staggingTrFeeDetailsDTO.getTfdTotal(), staggingTrFeeDetailsVO::setTfdTotal);
		funPoint(staggingTrFeeDetailsDTO.getCreatedDate(), staggingTrFeeDetailsVO::setCreatedDate);
		funPoint(staggingTrFeeDetailsDTO.getlUpdate(), staggingTrFeeDetailsVO::setlUpdate);
		funPoint(staggingTrFeeDetailsDTO.getTfdStatus(), staggingTrFeeDetailsVO::setTfdStatus);
		funPoint(staggingTrFeeDetailsDTO.getTfdApplicationNo(), staggingTrFeeDetailsVO::setTfdApplicationNo);
		return staggingTrFeeDetailsVO;
	}
	
	@Override
	public List<StaggingTrFeeDetailsVO> convertEntity(List<StaggingTrFeeDetailsDTO> staggingTrFeeDetailsDTOList) {
		return staggingTrFeeDetailsDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	
	@Override
	public StaggingTrFeeDetailsDTO convertVO(StaggingTrFeeDetailsVO staggingTrFeeDetailsVO) {
		staggingTrFeeDetailsDTO = new StaggingTrFeeDetailsDTO();
		funPoint(staggingTrFeeDetailsVO.getTfdId(), staggingTrFeeDetailsDTO::setTfdId);
		funPoint(staggingTrFeeDetailsVO.getTfdTdId(), staggingTrFeeDetailsDTO::setTfdTdId);
		funPoint(staggingTrFeeDetailsVO.getTfdTaxAmount(), staggingTrFeeDetailsDTO::setTfdTaxAmount);
		funPoint(staggingTrFeeDetailsVO.getTfdAppFee(), staggingTrFeeDetailsDTO::setTfdAppFee);
		funPoint(staggingTrFeeDetailsVO.getTfdHpaFee(), staggingTrFeeDetailsDTO::setTfdHpaFee);
		funPoint(staggingTrFeeDetailsVO.getTfdServiceFee(), staggingTrFeeDetailsDTO::setTfdServiceFee);
		funPoint(staggingTrFeeDetailsVO.getTfdPenality(), staggingTrFeeDetailsDTO::setTfdPenality);
		funPoint(staggingTrFeeDetailsVO.getTfdRegAppFee(), staggingTrFeeDetailsDTO::setTfdRegAppFee);
		funPoint(staggingTrFeeDetailsVO.getTfdRegServiceFee(), staggingTrFeeDetailsDTO::setTfdRegServiceFee);
		funPoint(staggingTrFeeDetailsVO.getTfdRegCardFee(), staggingTrFeeDetailsDTO::setTfdRegCardFee);
		funPoint(staggingTrFeeDetailsVO.getTfdRegPostalFee(), staggingTrFeeDetailsDTO::setTfdRegPostalFee);
		funPoint(staggingTrFeeDetailsVO.getTfdFcAppFee(), staggingTrFeeDetailsDTO::setTfdFcAppFee);
		funPoint(staggingTrFeeDetailsVO.getTfdFcServiceFee(), staggingTrFeeDetailsDTO::setTfdFcServiceFee);
		funPoint(staggingTrFeeDetailsVO.getTfdPermitAppFee(), staggingTrFeeDetailsDTO::setTfdPermitAppFee);
		funPoint(staggingTrFeeDetailsVO.getTfdPermitSerFee(), staggingTrFeeDetailsDTO::setTfdPermitSerFee);
		funPoint(staggingTrFeeDetailsVO.getTfdHsrpFee(), staggingTrFeeDetailsDTO::setTfdHsrpFee);
		funPoint(staggingTrFeeDetailsVO.getTfdCessFee(), staggingTrFeeDetailsDTO::setTfdCessFee);
		funPoint(staggingTrFeeDetailsVO.getTfdTotal(), staggingTrFeeDetailsDTO::setTfdTotal);
		funPoint(staggingTrFeeDetailsVO.getCreatedDate(), staggingTrFeeDetailsDTO::setCreatedDate);
		funPoint(staggingTrFeeDetailsVO.getlUpdate(), staggingTrFeeDetailsDTO::setlUpdate);
		funPoint(staggingTrFeeDetailsVO.getTfdStatus(), staggingTrFeeDetailsDTO::setTfdStatus);
		funPoint(staggingTrFeeDetailsVO.getTfdApplicationNo(), staggingTrFeeDetailsDTO::setTfdApplicationNo);
		return staggingTrFeeDetailsDTO;
	}
	
	@Override
	public List<StaggingTrFeeDetailsDTO> convertVO(List<StaggingTrFeeDetailsVO> staggingTrFeeDetailsVOList) {
		return staggingTrFeeDetailsVOList.stream().map(v -> convertVO(v)).collect(Collectors.toList());
	}

}

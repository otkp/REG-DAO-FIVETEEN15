package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.StaggingTrDetailsDTO;
import org.epragati.master.vo.StaggingTrDetailsVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class StaggingTrDetailsMapper extends BaseMapper<StaggingTrDetailsDTO, StaggingTrDetailsVO>{

	private StaggingTrDetailsVO staggingTrDetailsVO;
	private StaggingTrDetailsDTO staggingTrDetailsDTO;
	
	@Override
	public StaggingTrDetailsVO convertEntity(StaggingTrDetailsDTO staggingTrDetailsDTO) {
		staggingTrDetailsVO =  new StaggingTrDetailsVO();
		funPoint(staggingTrDetailsDTO.getTdid(), staggingTrDetailsVO::setTdid);
		funPoint(staggingTrDetailsDTO.getRid(), staggingTrDetailsVO::setRid);
		funPoint(staggingTrDetailsDTO.getChassisNo(), staggingTrDetailsVO::setChassisNo);
		funPoint(staggingTrDetailsDTO.getEngineNo(), staggingTrDetailsVO::setEngineNo);
		funPoint(staggingTrDetailsDTO.getCode(), staggingTrDetailsVO::setCode);
		funPoint(staggingTrDetailsDTO.getVmid(), staggingTrDetailsVO::setVmid);
		funPoint(staggingTrDetailsDTO.getMmid(), staggingTrDetailsVO::setMmid);
		funPoint(staggingTrDetailsDTO.getVahanId(), staggingTrDetailsVO::setVahanId);
		funPoint(staggingTrDetailsDTO.getAadharNo(), staggingTrDetailsVO::setAadharNo);
		funPoint(staggingTrDetailsDTO.getApplicantFname(), staggingTrDetailsVO::setApplicantFname);
		funPoint(staggingTrDetailsDTO.getApplicantLastName(), staggingTrDetailsVO::setApplicantLastName);
		funPoint(staggingTrDetailsDTO.getApplicantFhName(), staggingTrDetailsVO::setApplicantFhName);
		funPoint(staggingTrDetailsDTO.isSameAsAddar(), staggingTrDetailsVO::setSameAsAddar);
		funPoint(staggingTrDetailsDTO.getTempDoorNo(), staggingTrDetailsVO::setTempDoorNo);
		funPoint(staggingTrDetailsDTO.getTempStreet(), staggingTrDetailsVO::setTempStreet);
		funPoint(staggingTrDetailsDTO.getTempManalId(), staggingTrDetailsVO::setTempManalId);
		funPoint(staggingTrDetailsDTO.getTempDistId(), staggingTrDetailsVO::setTempDistId);
		funPoint(staggingTrDetailsDTO.getTempVillageId(), staggingTrDetailsVO::setTempVillageId);
		funPoint(staggingTrDetailsDTO.getTempCity(), staggingTrDetailsVO::setTempCity);
		funPoint(staggingTrDetailsDTO.getTempPin(), staggingTrDetailsVO::setTempPin);
		funPoint(staggingTrDetailsDTO.getTempState(), staggingTrDetailsVO::setTempState);
		funPoint(staggingTrDetailsDTO.getTempCountry(), staggingTrDetailsVO::setTempCountry);
		funPoint(staggingTrDetailsDTO.getTempDoorNo(), staggingTrDetailsVO::setTempDoorNo);
		funPoint(staggingTrDetailsDTO.getPerStreet(), staggingTrDetailsVO::setPerStreet);
		funPoint(staggingTrDetailsDTO.getPerManalId(), staggingTrDetailsVO::setPerManalId);
		funPoint(staggingTrDetailsDTO.getPerDistId(), staggingTrDetailsVO::setPerDistId);
		funPoint(staggingTrDetailsDTO.getPerCity(), staggingTrDetailsVO::setPerCity);
		funPoint(staggingTrDetailsDTO.getPerCountry(), staggingTrDetailsVO::setPerCountry);
		funPoint(staggingTrDetailsDTO.getPerPin(), staggingTrDetailsVO::setPerPin);
		funPoint(staggingTrDetailsDTO.getInsurnaceName(), staggingTrDetailsVO::setInsurnaceName);
		funPoint(staggingTrDetailsDTO.getInsuranceType(), staggingTrDetailsVO::setInsuranceType);
		funPoint(staggingTrDetailsDTO.getInsuranceValidFrom(), staggingTrDetailsVO::setInsuranceValidFrom);
		funPoint(staggingTrDetailsDTO.getInsureanceValidTo(), staggingTrDetailsVO::setInsureanceValidTo);
		funPoint(staggingTrDetailsDTO.isDisabled(), staggingTrDetailsVO::setDisabled);
		funPoint(staggingTrDetailsDTO.getGender(), staggingTrDetailsVO::setGender);
		funPoint(staggingTrDetailsDTO.getMobile(), staggingTrDetailsVO::setMobile);
		funPoint(staggingTrDetailsDTO.getAltMobile(), staggingTrDetailsVO::setAltMobile);
		funPoint(staggingTrDetailsDTO.getEmailId(), staggingTrDetailsVO::setEmailId);
		funPoint(staggingTrDetailsDTO.getAlteMailId(), staggingTrDetailsVO::setAlteMailId);
		funPoint(staggingTrDetailsDTO.getFinId(), staggingTrDetailsVO::setFinId);
		funPoint(staggingTrDetailsDTO.getProcessId(), staggingTrDetailsVO::setProcessId);
		funPoint(staggingTrDetailsDTO.getProcesStatus(), staggingTrDetailsVO::setProcesStatus);
		funPoint(staggingTrDetailsDTO.getCreatedDate(), staggingTrDetailsVO::setCreatedDate);
		funPoint(staggingTrDetailsDTO.getlUpdate(), staggingTrDetailsVO::setlUpdate);
		return staggingTrDetailsVO;
	}
	@Override
	public List<StaggingTrDetailsVO> convertEntity(List<StaggingTrDetailsDTO> staggingTrDetailsDTOList) {
		return staggingTrDetailsDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	
	@Override
	public StaggingTrDetailsDTO convertVO(StaggingTrDetailsVO staggingTrDetailsVO) {
		staggingTrDetailsDTO =  new StaggingTrDetailsDTO();
		funPoint(staggingTrDetailsVO.getTdid(),staggingTrDetailsDTO::setTdid);
		funPoint(staggingTrDetailsVO.getRid(), staggingTrDetailsDTO::setRid);
		funPoint(staggingTrDetailsVO.getChassisNo(), staggingTrDetailsDTO::setChassisNo);
		funPoint(staggingTrDetailsVO.getEngineNo(), staggingTrDetailsDTO::setEngineNo);
		funPoint(staggingTrDetailsVO.getCode(), staggingTrDetailsDTO::setCode);
		funPoint(staggingTrDetailsVO.getVmid(), staggingTrDetailsDTO::setVmid);
		funPoint(staggingTrDetailsVO.getMmid(), staggingTrDetailsDTO::setMmid);
		funPoint(staggingTrDetailsVO.getVahanId(), staggingTrDetailsDTO::setVahanId);
		funPoint(staggingTrDetailsVO.getAadharNo(), staggingTrDetailsDTO::setAadharNo);
		funPoint(staggingTrDetailsVO.getApplicantFname(), staggingTrDetailsDTO::setApplicantFname);
		funPoint(staggingTrDetailsVO.getApplicantLastName(), staggingTrDetailsDTO::setApplicantLastName);
		funPoint(staggingTrDetailsVO.getApplicantFhName(), staggingTrDetailsDTO::setApplicantFhName);
		funPoint(staggingTrDetailsVO.isSameAsAddar(), staggingTrDetailsDTO::setSameAsAddar);
		funPoint(staggingTrDetailsVO.getTempDoorNo(), staggingTrDetailsDTO::setTempDoorNo);
		funPoint(staggingTrDetailsVO.getTempStreet(), staggingTrDetailsDTO::setTempStreet);
		funPoint(staggingTrDetailsVO.getTempManalId(), staggingTrDetailsDTO::setTempManalId);
		funPoint(staggingTrDetailsVO.getTempDistId(), staggingTrDetailsDTO::setTempDistId);
		funPoint(staggingTrDetailsVO.getTempVillageId(), staggingTrDetailsDTO::setTempVillageId);
		funPoint(staggingTrDetailsVO.getTempCity(), staggingTrDetailsDTO::setTempCity);
		funPoint(staggingTrDetailsVO.getTempPin(), staggingTrDetailsDTO::setTempPin);
		funPoint(staggingTrDetailsVO.getTempState(), staggingTrDetailsDTO::setTempState);
		funPoint(staggingTrDetailsVO.getTempCountry(), staggingTrDetailsDTO::setTempCountry);
		funPoint(staggingTrDetailsVO.getTempDoorNo(), staggingTrDetailsDTO::setTempDoorNo);
		funPoint(staggingTrDetailsVO.getPerStreet(), staggingTrDetailsDTO::setPerStreet);
		funPoint(staggingTrDetailsVO.getPerManalId(), staggingTrDetailsDTO::setPerManalId);
		funPoint(staggingTrDetailsVO.getPerDistId(), staggingTrDetailsDTO::setPerDistId);
		funPoint(staggingTrDetailsVO.getPerCity(), staggingTrDetailsDTO::setPerCity);
		funPoint(staggingTrDetailsVO.getPerCountry(), staggingTrDetailsDTO::setPerCountry);
		funPoint(staggingTrDetailsVO.getPerPin(), staggingTrDetailsDTO::setPerPin);
		funPoint(staggingTrDetailsVO.getInsurnaceName(), staggingTrDetailsDTO::setInsurnaceName);
		funPoint(staggingTrDetailsVO.getInsuranceType(), staggingTrDetailsDTO::setInsuranceType);
		funPoint(staggingTrDetailsVO.getInsuranceValidFrom(), staggingTrDetailsDTO::setInsuranceValidFrom);
		funPoint(staggingTrDetailsVO.getInsureanceValidTo(), staggingTrDetailsDTO::setInsureanceValidTo);
		funPoint(staggingTrDetailsVO.isDisabled(), staggingTrDetailsDTO::setDisabled);
		funPoint(staggingTrDetailsVO.getGender(), staggingTrDetailsDTO::setGender);
		funPoint(staggingTrDetailsVO.getMobile(), staggingTrDetailsDTO::setMobile);
		funPoint(staggingTrDetailsVO.getAltMobile(), staggingTrDetailsDTO::setAltMobile);
		funPoint(staggingTrDetailsVO.getEmailId(), staggingTrDetailsDTO::setEmailId);
		funPoint(staggingTrDetailsVO.getAlteMailId(), staggingTrDetailsDTO::setAlteMailId);
		funPoint(staggingTrDetailsVO.getFinId(), staggingTrDetailsDTO::setFinId);
		funPoint(staggingTrDetailsVO.getProcessId(), staggingTrDetailsDTO::setProcessId);
		funPoint(staggingTrDetailsVO.getProcesStatus(), staggingTrDetailsDTO::setProcesStatus);
		funPoint(staggingTrDetailsVO.getCreatedDate(), staggingTrDetailsDTO::setCreatedDate);
		funPoint(staggingTrDetailsVO.getlUpdate(), staggingTrDetailsDTO::setlUpdate);
		return staggingTrDetailsDTO;
	}
	
	@Override
	public List<StaggingTrDetailsDTO> convertVO(List<StaggingTrDetailsVO> staggingTrDetailsVOList) {
		return staggingTrDetailsVOList.stream().map(v -> convertVO(v)).collect(Collectors.toList());
	}

}

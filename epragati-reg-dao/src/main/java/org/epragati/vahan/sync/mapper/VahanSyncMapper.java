package org.epragati.vahan.sync.mapper;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.vahan.port.vo.RegVahanPortVO;
import org.epragati.vahan.sync.dto.RegVahanPortDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
@Component
public class VahanSyncMapper extends BaseMapper<RegVahanPortDTO,RegVahanPortVO>{


	@Override
	public List<RegVahanPortVO> convertEntity(List<RegVahanPortDTO> regVahanPortDTOList){
		return regVahanPortDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
		
	}

	@Override
	public RegVahanPortVO convertEntity(RegVahanPortDTO regVahanPortDTO) {
		RegVahanPortVO regVahanPortVO=new RegVahanPortVO();
		BeanUtils.copyProperties(regVahanPortDTO, regVahanPortVO);
		return regVahanPortVO;
	}
	
	@Override
	public List<RegVahanPortDTO> convertVO(List<RegVahanPortVO> regVahanPortVOList){
		return regVahanPortVOList.stream().map(e -> convertVO(e)).collect(Collectors.toList());
		
	}
	
	@Override
	public RegVahanPortDTO convertVO(RegVahanPortVO regVahanPortVO) {
		RegVahanPortDTO regVahanPortDTO=new RegVahanPortDTO();
		BeanUtils.copyProperties(regVahanPortVO, regVahanPortDTO);
		regVahanPortDTO.setCreatedDate(LocalDateTime.now());
		regVahanPortDTO.setlUpdate(LocalDateTime.now());
		return regVahanPortDTO;
	}
	

	public RegVahanPortVO convertLimitedFileds(RegVahanPortDTO regVahanPortDTO) {
		RegVahanPortVO regVahanPortVO = new RegVahanPortVO();
		funPoint(regVahanPortDTO.getPrNo(), regVahanPortVO::setPrNo);
		String chassisNumber = regVahanPortDTO.getChassisNumber();
		chassisNumber = chassisNumber.length() >= 5 ? chassisNumber.substring(0, chassisNumber.length() - 5) + "*****"
				: chassisNumber.replaceAll(chassisNumber, "****");
		String engineNumber = regVahanPortDTO.getEngineNumber();
		engineNumber = engineNumber.length() >= 5 ? engineNumber.substring(0, engineNumber.length() - 5) + "*****"
				: engineNumber.replaceAll(engineNumber, "****");
		regVahanPortVO.setChassisNumber(chassisNumber);
		regVahanPortVO.setEngineNumber(engineNumber);
		funPoint(regVahanPortDTO.getNameOfOwner(), regVahanPortVO::setNameOfOwner);
		funPoint(regVahanPortDTO.getFatherName(), regVahanPortVO::setFatherName);
		funPoint(regVahanPortDTO.getColor(), regVahanPortVO::setColor);
		funPoint(regVahanPortDTO.getPresentAddress1(), regVahanPortVO::setPresentAddress1);
		funPoint(regVahanPortDTO.getPresentAddress2(), regVahanPortVO::setPresentAddress2);
		funPoint(regVahanPortDTO.getPresentAddress3(), regVahanPortVO::setPresentAddress3);
		funPoint(regVahanPortDTO.getMakersModel(), regVahanPortVO::setMakersModel);
		funPoint(regVahanPortDTO.getGvw(), regVahanPortVO::setGvw);
		funPoint(regVahanPortDTO.getUlw(), regVahanPortVO::setUlw);
		funPoint(regVahanPortDTO.getNocState(), regVahanPortVO::setNocState);
		funPoint(regVahanPortDTO.getNocRtaOfficeCode(), regVahanPortVO::setNocRtaOfficeCode);
		funPoint(regVahanPortDTO.getNocRtaIssueDate(), regVahanPortVO::setNocRtaIssueDate);
		funPoint(regVahanPortDTO.getNocRtaOfficeName(), regVahanPortVO::setNocRtaOfficeName);
		funPoint(regVahanPortDTO.getNocApplicatioNo(), regVahanPortVO::setNocApplicatioNo);
		funPoint(regVahanPortDTO.getlUpdate(), regVahanPortVO::setlUpdate);
		funPoint(regVahanPortDTO.getOfficeCode(), regVahanPortVO::setOfficeCode);
		if (regVahanPortDTO.getIsvahanSync() != null && regVahanPortDTO.getIsvahanSync()
				&& regVahanPortDTO.getIsErroFound() != null && !regVahanPortDTO.getIsErroFound()
				&& regVahanPortDTO.getIsPartially() != null && !regVahanPortDTO.getIsPartially()) {
			funPoint(regVahanPortDTO.getIsvahanSync(), regVahanPortVO::setIsvahanSync);
		} else if (regVahanPortDTO.getIsvahanSync() != null && regVahanPortDTO.getIsvahanSync()
				&& regVahanPortDTO.getIsErroFound() != null && regVahanPortDTO.getIsErroFound()) {
			regVahanPortVO.setIsvahanSync(false);
		} else if (regVahanPortDTO.getIsvahanSync() != null && regVahanPortDTO.getIsvahanSync()
				&& regVahanPortDTO.getIsPartially() != null && regVahanPortDTO.getIsPartially()) {
			regVahanPortVO.setIsvahanSync(false);
		} else if (regVahanPortDTO.getIsvahanSync() != null && !regVahanPortDTO.getIsvahanSync()) {
			regVahanPortVO.setIsvahanSync(false);
		}
		return regVahanPortVO;
	}
	
	
	
	public List<RegVahanPortVO> convertEntityLitmit(List<RegVahanPortDTO> regVahanPortDTOList){
		return regVahanPortDTOList.stream().map(e -> convertEntityFiled(e)).collect(Collectors.toList());
		
	}

	
	public RegVahanPortVO convertEntityFiled(RegVahanPortDTO regVahanPortDTO) {
		RegVahanPortVO regVahanPortVO=convertEntity(regVahanPortDTO);
		regVahanPortVO.setCreatedDate(null);
		regVahanPortVO.setlUpdate(null);
		return regVahanPortVO;
	}
}

package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.InsuranceTypeDTO;
import org.epragati.master.vo.InsuranceTypeVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class InsuranceTypeMapper extends BaseMapper<InsuranceTypeDTO, InsuranceTypeVO>{
	
	public InsuranceTypeVO insuranceTypeVO;
	public InsuranceTypeDTO insuranceTypeDTO;
	
	@Override
	public InsuranceTypeVO convertEntity(InsuranceTypeDTO insuranceTypeDTO) {
		insuranceTypeVO=new InsuranceTypeVO();
		funPoint(insuranceTypeDTO.getInsId(), insuranceTypeVO::setInsId);
		funPoint(insuranceTypeDTO.getInsDescription(), insuranceTypeVO::setInsDescription);
		funPoint(insuranceTypeDTO.getStatus(), insuranceTypeVO::setStatus);
		funPoint(insuranceTypeDTO.getTenure(),insuranceTypeVO::setTenure);
		return insuranceTypeVO;
	}
	
	@Override
	public List<InsuranceTypeVO> convertEntity(List<InsuranceTypeDTO> insuranceTypeDTOList) {
		return insuranceTypeDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	
	@Override
	public InsuranceTypeDTO convertVO(InsuranceTypeVO insuranceTypeVO) {
		insuranceTypeDTO=new InsuranceTypeDTO();
		funPoint(insuranceTypeVO.getInsId(), insuranceTypeDTO::setInsId);
		funPoint(insuranceTypeVO.getInsDescription(), insuranceTypeDTO::setInsDescription);
		funPoint(insuranceTypeVO.getStatus(), insuranceTypeDTO::setStatus);
		funPoint(insuranceTypeVO.getTenure(),insuranceTypeDTO::setTenure);
		return insuranceTypeDTO;
	}
	
	@Override
	public List<InsuranceTypeDTO> convertVO(List<InsuranceTypeVO> insuranceTypeVOList) {
		return insuranceTypeVOList.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}

}

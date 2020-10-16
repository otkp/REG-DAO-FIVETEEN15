package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.InsuranceCompanyDTO;
import org.epragati.master.vo.InsuranceCompanyVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class InsuranceCompanyMapper extends BaseMapper<InsuranceCompanyDTO, InsuranceCompanyVO>{

	public InsuranceCompanyVO insuranceCompanyVO;
	public InsuranceCompanyDTO insuranceCompanyDTO;
	
	@Override
	public InsuranceCompanyVO convertEntity(InsuranceCompanyDTO insuranceCompanyDTO) {
		insuranceCompanyVO=new InsuranceCompanyVO();
		funPoint(insuranceCompanyDTO.getInsCompId(), insuranceCompanyVO::setInsCompId);
		funPoint(insuranceCompanyDTO.getInsCompidDescription(), insuranceCompanyVO::setInsCompidDescription);
		funPoint(insuranceCompanyDTO.getStatus(), insuranceCompanyVO::setStatus);
		funPoint(insuranceCompanyDTO.getCreatedBy(), insuranceCompanyVO::setCreatedBy);
		funPoint(insuranceCompanyDTO.getUpdatedBy(), insuranceCompanyVO::setUpdatedBy);
		funPoint(insuranceCompanyDTO.getCreatedDate(), insuranceCompanyVO::setCreatedDate);
		funPoint(insuranceCompanyDTO.getlUpdate(), insuranceCompanyVO::setlUpdate);
		return insuranceCompanyVO;
	}
	@Override
	public InsuranceCompanyDTO convertVO(InsuranceCompanyVO insuranceCompanyVO) {
		insuranceCompanyDTO=new InsuranceCompanyDTO();
		funPoint(insuranceCompanyVO.getInsCompId(), insuranceCompanyDTO::setInsCompId);
		funPoint(insuranceCompanyVO.getInsCompidDescription(), insuranceCompanyDTO::setInsCompidDescription);
		funPoint(insuranceCompanyVO.getStatus(), insuranceCompanyDTO::setStatus);
		funPoint(insuranceCompanyVO.getCreatedBy(), insuranceCompanyDTO::setCreatedBy);
		funPoint(insuranceCompanyVO.getUpdatedBy(), insuranceCompanyDTO::setUpdatedBy);
		funPoint(insuranceCompanyVO.getCreatedDate(), insuranceCompanyDTO::setCreatedDate);
		funPoint(insuranceCompanyVO.getlUpdate(), insuranceCompanyDTO::setlUpdate);
		return insuranceCompanyDTO;
	}
	public InsuranceCompanyVO convertRequired(InsuranceCompanyDTO insuranceCompanyDTO) {
		insuranceCompanyVO=new InsuranceCompanyVO();
		funPoint(insuranceCompanyDTO.getInsCompId(), insuranceCompanyVO::setInsCompId);
		funPoint(insuranceCompanyDTO.getInsCompidDescription(), insuranceCompanyVO::setInsCompidDescription);
		
		return insuranceCompanyVO;
	}
	public List<InsuranceCompanyVO> convertDTOs(List<InsuranceCompanyDTO> dtos) {
		return dtos.stream().map(e -> convertRequired(e)).collect(Collectors.toList());
	}
}

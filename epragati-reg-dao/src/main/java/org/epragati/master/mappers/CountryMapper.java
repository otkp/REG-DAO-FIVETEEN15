package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.CountryDTO;
import org.epragati.master.vo.CountryVO;
import org.springframework.stereotype.Component;

/**
 * @author saroj.sahoo
 *
 */
@Component
public class CountryMapper extends BaseMapper<CountryDTO, CountryVO>{

	public CountryVO countryVO;
	public CountryDTO countryDTO;
	
	@Override
	public CountryVO convertEntity(CountryDTO countryDTO) {
		countryVO=new CountryVO();
		funPoint(countryDTO.getCountryCode(), countryVO::setCountryCode);
		funPoint(countryDTO.getCountryId(), countryVO::setCountryId);
		funPoint(countryDTO.getCountryName(), countryVO::setCountryName);
		funPoint(countryDTO.getCountryStatus(), countryVO::setCountryStatus);
		funPoint(countryDTO.getCreatedBy(), countryVO::setCreatedBy);
		funPoint(countryDTO.getCreatedDate(), countryVO::setCreatedDate);
		funPoint(countryDTO.getModifiedBy(), countryVO::setModifiedBy);
		funPoint(countryDTO.getModifiedDate(), countryVO::setModifiedDate);
		return countryVO;
	}
	
	@Override
	public CountryDTO convertVO(CountryVO countryVO) {
		countryDTO=new CountryDTO();
		funPoint(countryVO.getCountryCode(), countryDTO::setCountryCode);
		funPoint(countryVO.getCountryId(), countryDTO::setCountryId);
		funPoint(countryVO.getCountryName(), countryDTO::setCountryName);
		funPoint(countryVO.getCountryStatus(), countryDTO::setCountryStatus);
		funPoint(countryVO.getCreatedBy(), countryDTO::setCreatedBy);
		funPoint(countryVO.getCreatedDate(), countryDTO::setCreatedDate);
		funPoint(countryVO.getModifiedBy(), countryDTO::setModifiedBy);
		funPoint(countryVO.getModifiedDate(), countryDTO::setModifiedDate);
		return countryDTO;
	}
	
	public CountryVO convertRequired(CountryDTO countryDTO) {
		countryVO=new CountryVO();
		funPoint(countryDTO.getCountryCode(), countryVO::setCountryCode);
		funPoint(countryDTO.getCountryId(), countryVO::setCountryId);
		funPoint(countryDTO.getCountryName(), countryVO::setCountryName);
		return countryVO;
	}
	public List<CountryVO> convertDTOs(List<CountryDTO> dtos) {
		return dtos.stream().map(e -> convertRequired(e)).collect(Collectors.toList());
	}
}

/**
 * 
 */
package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.MandalDTO;
import org.epragati.master.vo.MandalVO;
import org.springframework.stereotype.Component;

/**
 * @author saroj.sahoo
 *
 */
@Component
public class MandalMapper extends BaseMapper<MandalDTO, MandalVO> {

	public MandalVO mandalVO;
	public MandalDTO mandalDTO;

	@Override
	public MandalVO convertEntity(MandalDTO mandalDTO) {
		mandalVO = new MandalVO();
		funPoint(mandalDTO.getMandalCode(), mandalVO::setMandalCode);
		funPoint(mandalDTO.getMandalId(), mandalVO::setMandalId);
		funPoint(mandalDTO.getMandalName(), mandalVO::setMandalName);
		funPoint(mandalDTO.getDistrictId(), mandalVO::setDistrictId);
		funPoint(mandalDTO.getMandalCode(), mandalVO::setMandalCode);
		funPoint(mandalDTO.getOfficeCode(), mandalVO::setOfficeCode);
		funPoint(mandalDTO.getNonTransportOffice(), mandalVO::setNonTransportOffice);
		funPoint(mandalDTO.getTransportOfice(), mandalVO::setTransportOfice);
		funPoint(mandalDTO.getHsrpoffice(), mandalVO::setHsrpoffice);
		funPoint(mandalDTO.getStatus(), mandalVO::setStatus);
		funPoint(mandalDTO.getCreatedBy(), mandalVO::setCreatedBy);
		funPoint(mandalDTO.getCreatedDate(), mandalVO::setCreatedDate);
		funPoint(mandalDTO.getMviAddressOfficeCode(), mandalVO::setMviAddressOfficeCode);
		funPoint(mandalDTO.getMandalName(), mandalVO::setName);
		return mandalVO;
	}

	public MandalVO mandalLimitedFields(MandalDTO mandalDTO) {
		mandalVO = new MandalVO();
		funPoint(mandalDTO.getMandalCode(), mandalVO::setMandalCode);
		funPoint(mandalDTO.getMandalId(), mandalVO::setMandalId);
		funPoint(mandalDTO.getMandalName(), mandalVO::setMandalName);
		return mandalVO;
	}
	
	@Override
	public List<MandalVO> convertEntity(List<MandalDTO> mandalDTOList) {
		return mandalDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}

	@Override
	public MandalDTO convertVO(MandalVO mandalVO) {
		mandalDTO = new MandalDTO();
		funPoint(mandalVO.getName(), mandalDTO::setMandalName);
		funPoint(mandalVO.getMandalCode(), mandalDTO::setMandalCode);
		funPoint(mandalVO.getMandalId(), mandalDTO::setMandalId);
		funPoint(mandalVO.getMandalName(), mandalDTO::setMandalName);
		funPoint(mandalVO.getDistrictId(), mandalDTO::setDistrictId);
		funPoint(mandalVO.getMandalCode(), mandalDTO::setMandalCode);
		funPoint(mandalVO.getOfficeCode(), mandalDTO::setOfficeCode);
		funPoint(mandalVO.getNonTransportOffice(), mandalDTO::setNonTransportOffice);
		funPoint(mandalVO.getTransportOfice(), mandalDTO::setTransportOfice);
		funPoint(mandalVO.getHsrpoffice(), mandalDTO::setHsrpoffice);
		funPoint(mandalVO.getStatus(), mandalDTO::setStatus);
		funPoint(mandalVO.getCreatedBy(), mandalDTO::setCreatedBy);
		funPoint(mandalVO.getCreatedDate(), mandalDTO::setCreatedDate);
		funPoint(mandalVO.getMviAddressOfficeCode(), mandalDTO::setMviAddressOfficeCode);
		
		return mandalDTO;
	}

	@Override
	public List<MandalDTO> convertVO(List<MandalVO> mandalVOList) {
		return mandalVOList.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}

}

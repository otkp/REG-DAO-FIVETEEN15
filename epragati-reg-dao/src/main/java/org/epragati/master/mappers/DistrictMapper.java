package org.epragati.master.mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.DistrictDTO;
import org.epragati.master.vo.DistrictVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class DistrictMapper extends BaseMapper<DistrictDTO, DistrictVO> {

	public DistrictVO districtVO;
	public DistrictDTO districtDTO;

	@Override
	public DistrictVO convertEntity(DistrictDTO districtDTO) {
		districtVO = new DistrictVO();
		funPoint(districtDTO.getDistricCode(), districtVO::setDistricCode);
		funPoint(districtDTO.getDistrictId(), districtVO::setDistrictId);
		funPoint(districtDTO.getDistrictName(), districtVO::setDistrictName);
		funPoint(districtDTO.getStateId(), districtVO::setStateId);
		funPoint(districtDTO.getStatus(), districtVO::setStatus);
		funPoint(districtDTO.getZonecode(), districtVO::setZonecode);
		funPoint(districtDTO.getCreatedBy(), districtVO::setCreatedBy);
		funPoint(districtDTO.getCreatedDate(), districtVO::setCreatedDate);
		funPoint(districtDTO.getModifiedBy(), districtVO::setModifiedBy);
		funPoint(districtDTO.getModifiedDate(), districtVO::setModifiedDate);
		funPoint(districtDTO.getDistrictName(), districtVO::setName);
		return districtVO;
	}

	public DistrictVO districtLimitedFields(DistrictDTO districtDTO) {
		districtVO = new DistrictVO();
		funPoint(districtDTO.getDistricCode(), districtVO::setDistricCode);
		funPoint(districtDTO.getDistrictId(), districtVO::setDistrictId);
		funPoint(districtDTO.getDistrictName(), districtVO::setDistrictName);
		return districtVO;
	}

	@Override
	public List<DistrictVO> convertEntity(List<DistrictDTO> districtDTOList) {
		return districtDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}

	@Override
	public DistrictDTO convertVO(DistrictVO districtVO) {
		districtDTO = new DistrictDTO();
		funPoint(districtVO.getName(), districtDTO::setDistrictName);
		funPoint(districtVO.getDistricCode(), districtDTO::setDistricCode);
		funPoint(districtVO.getDistrictId(), districtDTO::setDistrictId);
		funPoint(districtVO.getDistrictName(), districtDTO::setDistrictName);
		funPoint(districtVO.getStateId(), districtDTO::setStateId);
		funPoint(districtVO.getStatus(), districtDTO::setStatus);
		funPoint(districtVO.getZonecode(), districtDTO::setZonecode);
		funPoint(districtVO.getCreatedBy(), districtDTO::setCreatedBy);
		funPoint(districtVO.getCreatedDate(), districtDTO::setCreatedDate);
		funPoint(districtVO.getModifiedBy(), districtDTO::setModifiedBy);
		funPoint(districtVO.getModifiedDate(), districtDTO::setModifiedDate);

		return districtDTO;
	}

	@Override
	public List<DistrictDTO> convertVO(List<DistrictVO> districtVOList) {
		return districtVOList.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}

	/**
	 * for VCR IMPL. use
	 */
	public List<DistrictVO> convertVoToDTO(List<DistrictDTO> dto) {
		List<DistrictVO> listOfDistrict = new ArrayList<>();
		dto.forEach(dt -> {
			DistrictVO vo = new DistrictVO();
			vo.setDistrictId(dt.getDistrictId());
			vo.setDistrictName(dt.getDistrictName());
			vo.setStateId(dt.getStateId());
			vo.setStatus(dt.getStatus());
			listOfDistrict.add(vo);
		});
		return listOfDistrict;
	}
}

package org.epragati.regservice.mapper;

import java.time.LocalDateTime;

import org.apache.commons.lang3.StringUtils;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.OtherStateVahanResponseDTO;
import org.epragati.regservice.vo.OtherStateVahanVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class OtherStateVahanResponseMapper extends BaseMapper<OtherStateVahanResponseDTO, OtherStateVahanVO> {

	@Autowired
	private OtherStateVahanRegMapper otherStateVahanRegMapper;
	
	@Autowired
	private OtherStateVahanCovMakerMapper otherStateVahanCovMakerMapper;
	
	@Override
	public OtherStateVahanVO convertEntity(OtherStateVahanResponseDTO dto) {
		OtherStateVahanVO vo = new OtherStateVahanVO();
		if(dto.getOtherStateVahanRegDto()!=null){
			vo.setOtherStateRegVO(otherStateVahanRegMapper.convertEntity(dto.getOtherStateVahanRegDto()));
		}
		if(dto.getOtherStateVahanCovMakerDto()!=null){
			vo.setOtherStateCovVO(otherStateVahanCovMakerMapper.convertEntity(dto.getOtherStateVahanCovMakerDto()));
		}
		return vo;
	}

	@Override
	public OtherStateVahanResponseDTO convertVO(OtherStateVahanVO vo) {
		OtherStateVahanResponseDTO dto = new OtherStateVahanResponseDTO();
		if (vo.getOtherStateRegVO() != null) {
			dto.setOtherStateVahanRegDto(otherStateVahanRegMapper.convertVO(vo.getOtherStateRegVO()));
		}
		if (vo.getOtherStateCovVO() != null) {
			dto.setOtherStateVahanCovMakerDto(otherStateVahanCovMakerMapper.convertVO(vo.getOtherStateCovVO()));
		}
		dto.setCreatedDate(LocalDateTime.now());
		dto.setlUpdate(LocalDateTime.now());
		if (vo.getOtherStateRegVO() != null && StringUtils.isNotEmpty(vo.getOtherStateRegVO().getPrNo())) {
			dto.setPrNo(vo.getOtherStateRegVO().getPrNo());
		}
		return dto;
	}
}


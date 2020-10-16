package org.epragati.master.mappers;

import java.util.ArrayList;
import java.util.List;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.OffenceDTO;
import org.epragati.master.vo.OffenceVO;
import org.epragati.vcrImage.mapper.OverLoadMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OffenceMapper extends BaseMapper<OffenceDTO, OffenceVO> {
	@Autowired
	private OffenceCategoryMapper categeoryMapper;
	@Autowired
	private OverLoadMapper overLoadMapper;

	@Override
	public OffenceVO convertEntity(OffenceDTO dto) {
		OffenceVO vo = new OffenceVO();
		BeanUtils.copyProperties(dto, vo);
		if(dto.getOverLoadDesc() != null) {
			vo.setOverLoadDesc(overLoadMapper.changeDTOToVO(dto.getOverLoadDesc()));
			
		}
		return vo;
	}

	public List<OffenceVO> convertLimied(List<OffenceDTO> dtoList) {
		List<OffenceVO> officeList = new ArrayList<>();
		dtoList.stream().forEach(dto -> {
			OffenceVO vo = new OffenceVO();
			vo.setOffenceDescription(dto.getOffenceDescription());
			officeList.add(vo);
		});

		return officeList;
	}

	@Override
	public OffenceDTO convertVO(OffenceVO vo) {
		OffenceDTO dto = new OffenceDTO();
		BeanUtils.copyProperties(vo, dto);
		if(vo.getOverLoadDesc() != null) {
			dto.setOverLoadDesc(overLoadMapper.changeVoToDTO(vo.getOverLoadDesc()));
			
		}
		return dto;
	}

}

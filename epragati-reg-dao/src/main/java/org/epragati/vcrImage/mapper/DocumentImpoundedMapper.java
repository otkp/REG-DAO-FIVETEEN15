package org.epragati.vcrImage.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.vcr.vo.DocumentImpoundedVO;
import org.epragati.vcrImage.dto.DocumentImpoundedDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class DocumentImpoundedMapper extends BaseMapper<DocumentImpoundedDTO, DocumentImpoundedVO> {

	@Override
	public DocumentImpoundedVO convertEntity(DocumentImpoundedDTO dto) {
		DocumentImpoundedVO vo = new DocumentImpoundedVO();
		BeanUtils.copyProperties(dto, vo);

		return vo;
	}

	@Override
	public DocumentImpoundedDTO convertVO(DocumentImpoundedVO vo) {
		DocumentImpoundedDTO dto = new DocumentImpoundedDTO();
		BeanUtils.copyProperties(vo, dto);
		return dto;
	}

}

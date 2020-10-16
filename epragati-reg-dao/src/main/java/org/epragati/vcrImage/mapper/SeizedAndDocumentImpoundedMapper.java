package org.epragati.vcrImage.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.vcr.vo.SeizedAndDocumentImpoundedVO;
import org.epragati.vcrImage.dto.SeizedAndDocumentImpoundedDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeizedAndDocumentImpoundedMapper
		extends BaseMapper<SeizedAndDocumentImpoundedDTO, SeizedAndDocumentImpoundedVO> {

	@Autowired
	private VehicleSeizedMapper seizedMapper;
	@Autowired
	private DocumentImpoundedMapper documentImpoundedMapper;
	private static final Logger logger = LoggerFactory.getLogger(SeizedAndDocumentImpoundedMapper.class);

	@Override
	public SeizedAndDocumentImpoundedVO convertEntity(SeizedAndDocumentImpoundedDTO dto) {
		SeizedAndDocumentImpoundedVO vo = new SeizedAndDocumentImpoundedVO();
		if (dto.getVehicleSeizedDTO() != null)
			vo.setVehicleSeizedVO(seizedMapper.convertEntity(dto.getVehicleSeizedDTO()));
		else {
			vo.setDocumentImpoundedVO(documentImpoundedMapper.convertEntity(dto.getDocumentImpoundedDTO()));
		}
		return vo;
	}

	@Override
	public SeizedAndDocumentImpoundedDTO convertVO(SeizedAndDocumentImpoundedVO vo) {
		SeizedAndDocumentImpoundedDTO dto = new SeizedAndDocumentImpoundedDTO();
		logger.warn("enter into SeizedAndDocumentImpoundedMapper to convert VO to DTO");
		if (vo.getVehicleSeizedVO() != null)
			dto.setVehicleSeizedDTO(seizedMapper.convertVO(vo.getVehicleSeizedVO()));
		else
			dto.setDocumentImpoundedDTO(documentImpoundedMapper.convertVO(vo.getDocumentImpoundedVO()));
		return dto;
	}

	public SeizedAndDocumentImpoundedVO siezedMapper(SeizedAndDocumentImpoundedDTO dto) {
		SeizedAndDocumentImpoundedVO vo = new SeizedAndDocumentImpoundedVO();
		if (dto.getVehicleSeizedDTO() != null) {
			vo.setVehicleSeizedVO(seizedMapper.convertEntity(dto.getVehicleSeizedDTO()));
		}
		if (dto.getDocumentImpoundedDTO() != null) {
			vo.setDocumentImpoundedVO(documentImpoundedMapper.convertEntity(dto.getDocumentImpoundedDTO()));
		}
		return vo;
	}

}

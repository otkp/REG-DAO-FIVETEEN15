package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.QualificationDTO;
import org.epragati.master.vo.QualificationVO;
import org.springframework.stereotype.Component;

@Component
public class QualificationMapper extends BaseMapper<QualificationDTO, QualificationVO> {

	@Override
	public QualificationVO convertEntity(QualificationDTO dto) {
		QualificationVO masterQualificationVO = new QualificationVO();
		funPoint(dto.getCode(), masterQualificationVO::setCode);
		funPoint(dto.getCreateDate(), masterQualificationVO::setCreateDate);
		funPoint(dto.getCreatedBy(), masterQualificationVO::setCreatedBy);
		funPoint(dto.getDescription(), masterQualificationVO::setDescription);
		funPoint(dto.getModifiedBy(), masterQualificationVO::setModifiedBy);
		funPoint(dto.getModifiedDate(), masterQualificationVO::setModifiedDate);
		funPoint(dto.getSlNo(), masterQualificationVO::setSlNo);
		funPoint(dto.getStatus(), masterQualificationVO::setStatus);
		return masterQualificationVO;
	}

	@Override
	public QualificationDTO convertVO(QualificationVO vo) {
		QualificationDTO masterQualificationDTO = new QualificationDTO();

		funPoint(vo.getCode(), masterQualificationDTO::setCode);
		funPoint(vo.getCreateDate(), masterQualificationDTO::setCreateDate);
		funPoint(vo.getCreatedBy(), masterQualificationDTO::setCreatedBy);
		funPoint(vo.getDescription(), masterQualificationDTO::setDescription);
		funPoint(vo.getModifiedBy(), masterQualificationDTO::setModifiedBy);
		funPoint(vo.getModifiedDate(), masterQualificationDTO::setModifiedDate);
		funPoint(vo.getSlNo(), masterQualificationDTO::setSlNo);
		funPoint(vo.getStatus(), masterQualificationDTO::setStatus);

		return masterQualificationDTO;

	}
	public QualificationVO convertRequired(QualificationDTO dto){
		QualificationVO masterQualificationVO = new QualificationVO();
		funPoint(dto.getCode(), masterQualificationVO::setCode);
		funPoint(dto.getDescription(), masterQualificationVO::setDescription);
		funPoint(dto.getDescription(), masterQualificationVO::setName);
		return masterQualificationVO;
	}
	public List<QualificationVO> convertDTOs(List<QualificationDTO> dtos) {
		return dtos.stream().map(e -> convertRequired(e)).collect(Collectors.toList());
	}
}

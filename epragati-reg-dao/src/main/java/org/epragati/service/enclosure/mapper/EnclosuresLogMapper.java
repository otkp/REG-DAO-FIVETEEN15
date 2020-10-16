package org.epragati.service.enclosure.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.constants.EnclosureType;
import org.epragati.dto.enclosure.EnclosuresDtoLog;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.service.enclosure.vo.EnclosuresVOLog;
import org.epragati.service.enclosure.vo.ImageVO;
import org.epragati.util.document.KeyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EnclosuresLogMapper extends BaseMapper<EnclosuresDtoLog, EnclosuresVOLog> {

	@Autowired
	private EnclosureImageMapper enclosureMapper;

	@Override
	public EnclosuresVOLog convertEntity(EnclosuresDtoLog dto) {

		EnclosuresVOLog vo = new EnclosuresVOLog();

		vo.setCreateDate(dto.getCreateDate());
		vo.setReason(dto.getReason());
		vo.setEnclosures(convertEnclosures(dto.getEnclosures()));

		return vo;
	}

	public List<KeyValue<EnclosureType, List<ImageVO>>> convertEnclosures(
			List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures) {

		return enclosures.stream().map(kv -> new KeyValue<>(EnclosureType.getEnclosureType(kv.getKey()),
				enclosureMapper.convertEntity(kv.getValue()))).collect(Collectors.toList());

	}
	public List<KeyValue<EnclosureType, List<ImageVO>>> convertNewEnclosures(
			List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures) {

		return enclosures.stream().map(kv -> new KeyValue<>(EnclosureType.getEnclosureType(kv.getKey()),
				enclosureMapper.convertNewEntity(kv.getValue()))).collect(Collectors.toList());

	}

}

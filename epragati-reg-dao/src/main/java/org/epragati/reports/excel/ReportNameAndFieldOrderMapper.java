package org.epragati.reports.excel;

import java.util.Optional;

import org.epragati.common.mappers.BaseMapper;
import org.springframework.stereotype.Component;

@Component
public class ReportNameAndFieldOrderMapper extends BaseMapper<ReportNameAndFieldOrderDTO, ReportNameAndFieldOrderVO> {

	@Override
	public ReportNameAndFieldOrderVO convertEntity(ReportNameAndFieldOrderDTO dto) {
		ReportNameAndFieldOrderVO vo = new ReportNameAndFieldOrderVO();

		vo.setReportName(dto.getReportName());
		vo.setColumnOrderAndName(dto.getColumnOrderAndName());
		return vo;
	}

	@Override
	public ReportNameAndFieldOrderDTO convertVO(ReportNameAndFieldOrderVO vo) {

		ReportNameAndFieldOrderDTO dto = new ReportNameAndFieldOrderDTO();

		dto.setReportName(vo.getReportName());
		dto.setColumnOrderAndName(vo.getColumnOrderAndName());
		return dto;
	}

	@Override
	public Optional<ReportNameAndFieldOrderVO> convertEntity(Optional<ReportNameAndFieldOrderDTO> optionalDto) {
		if (!optionalDto.isPresent())
			return Optional.empty();
		ReportNameAndFieldOrderVO vo = new ReportNameAndFieldOrderVO();
		vo.setReportName(optionalDto.get().getReportName());
		vo.setColumnOrderAndName(optionalDto.get().getColumnOrderAndName());
		return Optional.of(vo);
	}
}

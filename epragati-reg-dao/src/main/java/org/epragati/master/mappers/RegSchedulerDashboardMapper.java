package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.RegSchedulerDashboardDTO;
import org.epragati.master.vo.RegSchedulerDashboardVO;
import org.springframework.stereotype.Component;

@Component
public class RegSchedulerDashboardMapper extends BaseMapper<RegSchedulerDashboardDTO, RegSchedulerDashboardVO>{

	@Override
	public RegSchedulerDashboardVO convertEntity(RegSchedulerDashboardDTO dto) {
		RegSchedulerDashboardVO vo = new RegSchedulerDashboardVO();
		funPoint(dto.getButtonName(), vo::setButtonName);
		funPoint(dto.getDescription(), vo::setDescription);
		funPoint(dto.getUrl(), vo::setUrl);
		return vo;
	}

	@Override
	public List<RegSchedulerDashboardVO> convertEntity(List<RegSchedulerDashboardDTO> dtoList){
		return dtoList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
		
	}
}

package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.RTADashboardDTO;
import org.epragati.master.vo.RTADashboardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Component
public class RTADashboardMapper extends BaseMapper<RTADashboardDTO, RTADashboardVO>{

	@Autowired
	private RTADashBoardLinksMapper rdblMapper;

	@Autowired
	private RTAOSTitlesMapper rostMapper;

	@Override
	public RTADashboardVO convertEntity(RTADashboardDTO dto) {
		RTADashboardVO vo = new RTADashboardVO();
		funPoint(dto.getDashBoardTitle(), vo::setDashBoardTitle);
		funPoint(dto.getOtherServicesTitle(), vo::setOtherServicesTitle);
		if(!dto.getOtherServicesList().isEmpty()){
			vo.setOtherServicesList(rostMapper.convertEntity(dto.getOtherServicesList()));
		}
		if(!dto.getRegistartionServices().isEmpty()){
			vo.setRegistartionServices(rdblMapper.convertEntity(dto.getRegistartionServices()));
		}
		if(dto.getDlServices() !=null &&!dto.getDlServices().isEmpty()){
			vo.setDlServices(rdblMapper.convertEntity(dto.getDlServices()));
		}
		return vo;
	}

}

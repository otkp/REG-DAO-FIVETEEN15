package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.RTADashBoardLinksDTO;
import org.epragati.master.vo.RTADashBoardLinksVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Component
public class RTADashBoardLinksMapper extends BaseMapper<RTADashBoardLinksDTO, RTADashBoardLinksVO> {
	
	@Autowired
	private RTADBSNMapper rtadbsnmapper;

	@Override
	public RTADashBoardLinksVO convertEntity(RTADashBoardLinksDTO dto) {
		RTADashBoardLinksVO vo = new RTADashBoardLinksVO();
		funPoint(dto.getModuleImage(), vo::setModuleImage);
		funPoint(dto.getModuleTitle(), vo::setModuleTitle);
		if(!dto.getServiceNames().isEmpty()){
			vo.setServiceNames(rtadbsnmapper.convertEntity(dto.getServiceNames()));
		}
		return vo;
	}

}

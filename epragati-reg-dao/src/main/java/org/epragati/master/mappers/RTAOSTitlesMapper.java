package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.RTAOtherServicesTitles;
import org.epragati.master.vo.RTAOtherServicesTitlesVO;
import org.springframework.stereotype.Component;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Component
public class RTAOSTitlesMapper extends BaseMapper<RTAOtherServicesTitles, RTAOtherServicesTitlesVO> {

	@Override
	public RTAOtherServicesTitlesVO convertEntity(RTAOtherServicesTitles dto) {
		
		RTAOtherServicesTitlesVO vo = new RTAOtherServicesTitlesVO();
		funPoint(dto.getMenuCode(), vo::setMenuCode);
		funPoint(dto.getMenuCss(), vo::setMenuCss);
		funPoint(dto.getParam(), vo::setParam);
		funPoint(dto.getServiceImage(), vo::setServiceImage);
		funPoint(dto.getServiceName(), vo::setServiceName);
		return vo;
	}

}

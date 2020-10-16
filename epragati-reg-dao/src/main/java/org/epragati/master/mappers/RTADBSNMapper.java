package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.RTADashBoardServiceNames;
import org.epragati.master.vo.RTADashBoardServiceNamesVO;
import org.springframework.stereotype.Component;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Component
public class RTADBSNMapper extends BaseMapper<RTADashBoardServiceNames, RTADashBoardServiceNamesVO> {

	@Override
	public RTADashBoardServiceNamesVO convertEntity(RTADashBoardServiceNames dto) {
		RTADashBoardServiceNamesVO vo = new RTADashBoardServiceNamesVO();
		funPoint(dto.getMenuCode(), vo::setMenuCode);
		funPoint(dto.getCountValue(), vo::setCountValue);
		funPoint(dto.getMenuCss(), vo::setMenuCss);
		funPoint(dto.getServiceName(), vo::setServiceName);
		funPoint(dto.getParam(), vo::setParam);
		return vo;
	}

}

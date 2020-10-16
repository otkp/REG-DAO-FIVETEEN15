package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.permits.dto.PermitValidationsDTO;
import org.epragati.permits.vo.PermitValidationsVO;
import org.springframework.stereotype.Component;

@Component
public class PermitValidationsMapper extends BaseMapper<PermitValidationsDTO, PermitValidationsVO> {

	@Override
	public PermitValidationsVO convertEntity(PermitValidationsDTO dto) {
		PermitValidationsVO vo = new PermitValidationsVO();
		return vo;
	}

	@Override
	public PermitValidationsDTO convertVO(PermitValidationsVO vo) {
		PermitValidationsDTO dto = new PermitValidationsDTO();

		return dto;
	}

	public PermitValidationsVO variationTypeMapper(PermitValidationsDTO dto) {
		PermitValidationsVO vo = new PermitValidationsVO();
		funPoint(dto.getCovList(), vo::setCovList);
		funPoint(dto.isBodyTypeBasedGoodsDetails(), vo::setBodyTypeBasedGoodsDetails);
		return vo;
	}

}

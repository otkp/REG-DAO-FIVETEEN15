package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.VcrGoodsDTO;
import org.epragati.master.vo.VcrGoodsVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Jyoti Bhushan
 *
 */
@Component
public class VcrGoodsMapper extends BaseMapper<VcrGoodsDTO, VcrGoodsVO> {

	@Override
	public VcrGoodsVO convertEntity(VcrGoodsDTO dto) {
		VcrGoodsVO vcrGoodsVO = new VcrGoodsVO();
		funPoint(dto.getId(), vcrGoodsVO::setId);
		funPoint(dto.getGoodsDesc(), vcrGoodsVO::setGoodsDesc);
		return vcrGoodsVO;
	}

	@Override
	public VcrGoodsDTO convertVO(VcrGoodsVO vo) {
		VcrGoodsDTO vcrGoodsDTO = new VcrGoodsDTO();
		funPoint(vo.getId(), vo::setId);
		funPoint(vo.getGoodsDesc(), vcrGoodsDTO::setGoodsDesc);
		return vcrGoodsDTO;
	}

}

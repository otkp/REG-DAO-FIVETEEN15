package org.epragati.gstn.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.gstn.dto.GSTNEntityAddressDTO;
import org.epragati.gstn.vo.GSTNEntityAddressVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class GSTNEntityAddressMapper extends BaseMapper<GSTNEntityAddressDTO, GSTNEntityAddressVO>{
	
	@Autowired
	private EntityAddressMapper addressMapper;

	@Override
	public GSTNEntityAddressVO convertEntity(GSTNEntityAddressDTO dto) {
		GSTNEntityAddressVO vo = new GSTNEntityAddressVO();
		if (null != dto.getAddr()) {
			vo.setAddr(addressMapper.convertEntity(dto.getAddr()));
		}
		if (null != dto.getNtr()) {
			vo.setNtr(dto.getNtr());
		}
		return vo;
	}
	
	@Override
	public GSTNEntityAddressDTO convertVO(GSTNEntityAddressVO vo) {
		GSTNEntityAddressDTO dto = new GSTNEntityAddressDTO();
		if (null != vo.getAddr()) {
			dto.setAddr(addressMapper.convertVO(vo.getAddr()));
		}
		if (null != vo.getNtr()) {
			dto.setNtr(vo.getNtr());
		}
		return dto;
	}

}

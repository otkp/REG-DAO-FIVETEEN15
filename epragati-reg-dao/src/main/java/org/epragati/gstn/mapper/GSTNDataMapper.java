package org.epragati.gstn.mapper;

import java.time.LocalDate;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.gstn.dto.GSTNDataDTO;
import org.epragati.gstn.vo.GSTNDataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class GSTNDataMapper extends BaseMapper<GSTNDataDTO, GSTNDataVO> {


	@Autowired
	private GSTNEntityAddressMapper prAddressMapper;
	
	@Override
	public GSTNDataVO convertEntity(GSTNDataDTO dto) {
		GSTNDataVO vo = new GSTNDataVO();
		funPoint(dto.getStjCode(), vo::setStjCd);
		funPoint(dto.getEntityName(), vo::setLgnm);
		funPoint(dto.getGstinNo(), vo::setGstin);
		funPoint(dto.getGstnlUpdateDate(), vo::setLstupdt);
		funPoint(dto.getGstnRegDate(), vo::setRgdt);
		if(null !=dto.getPrimaryAddress()){
			vo.setPradr(prAddressMapper.convertEntity(dto.getPrimaryAddress()));
		}
		funPoint(dto.getStatus(), vo::setSts);
		funPoint(dto.getTradeName(), vo::setTradeNam);
		return vo;
	}
	
	@Override
	public GSTNDataDTO convertVO(GSTNDataVO vo) {
		GSTNDataDTO dto = new GSTNDataDTO();
		funPoint(vo.getStjCd(), dto::setStjCode);
		funPoint(vo.getLgnm(), dto::setEntityName);
		funPoint(vo.getGstin(), dto::setGstinNo);
		funPoint(vo.getLstupdt(), dto::setGstnlUpdateDate);
		funPoint(vo.getRgdt(), dto::setGstnRegDate);
		if(null != vo.getPradr()){
			dto.setPrimaryAddress(prAddressMapper.convertVO(vo.getPradr()));
		}
		funPoint(vo.getSts(), dto::setStatus);
		funPoint(vo.getTradeNam(), dto::setTradeName);
		dto.setCreatedDate(LocalDate.now());
		dto.setLastUpdatedDate(LocalDate.now());
		return dto;
	}

}

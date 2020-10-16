package org.epragati.master.mappers;

import org.epragati.cfstSync.vo.CfstSyncResponceVO;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.CfstSyncResponceDTO;
import org.springframework.stereotype.Component;

@Component
public class CfstSyncResponceMapper extends BaseMapper<CfstSyncResponceDTO, CfstSyncResponceVO>{

	@Override
	public CfstSyncResponceVO convertEntity(CfstSyncResponceDTO dto) {
		CfstSyncResponceVO vo = new CfstSyncResponceVO();
		funPoint(dto.getPrNo(), vo::setPrNo);
		funPoint(dto.getErrors(), vo::setErrors);
		funPoint(dto.getStatus(), vo::setStatus);
		funPoint(dto.getFirstName(), vo::setFirstName);
		return vo;
	}
	
	@Override
	public CfstSyncResponceDTO convertVO(CfstSyncResponceVO vo) {
		CfstSyncResponceDTO dto = new CfstSyncResponceDTO();
		funPoint(vo.getPrNo(), dto::setPrNo);
		funPoint(vo.getErrors(), dto::setErrors);
		funPoint(vo.getStatus(), dto::setStatus);
		funPoint(vo.getFirstName(), dto::setFirstName);
		return dto;
	}

}

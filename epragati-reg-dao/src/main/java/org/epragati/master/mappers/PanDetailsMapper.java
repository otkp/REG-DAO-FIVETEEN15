package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.PanDetailsDTO;
import org.epragati.master.vo.PanDetailsVO;
import org.springframework.stereotype.Component;

@Component
public class PanDetailsMapper extends BaseMapper<PanDetailsDTO, PanDetailsVO> {

	@Override
	public PanDetailsVO convertEntity(PanDetailsDTO dto) {
		PanDetailsVO panDetailsVO = new PanDetailsVO();
		funPoint(dto.getPanNo(), panDetailsVO::setPanNo);
		funPoint(dto.isPanVerifiedInOnlne(), panDetailsVO::setPanVerifiedInOnlne);
		return panDetailsVO;
	}

	@Override
	public PanDetailsDTO convertVO(PanDetailsVO vo) {
		PanDetailsDTO panDetailsDTO = new PanDetailsDTO();
		funPoint(vo.getPanNo(), panDetailsDTO::setPanNo);
		funPoint(vo.isPanVerifiedInOnlne(), panDetailsDTO::setPanVerifiedInOnlne);
		return panDetailsDTO;
	}

}

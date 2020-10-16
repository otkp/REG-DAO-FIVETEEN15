package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.OtherStateNOCDetailsDTO;
import org.epragati.master.vo.OtherStateNOCDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtherStateNOCDetailsMapper extends BaseMapper<OtherStateNOCDetailsDTO, OtherStateNOCDetailsVO> {
	
	@Autowired
	private StateMapper stateMapper;

	@Override
	public OtherStateNOCDetailsVO convertEntity(OtherStateNOCDetailsDTO dto) {
		OtherStateNOCDetailsVO otherStateNOCDetailsVO = new OtherStateNOCDetailsVO();
		funPoint(dto.getAuthority(), otherStateNOCDetailsVO::setAuthority);
		funPoint(dto.getIssueDate(), otherStateNOCDetailsVO::setIssueDate);
		funPoint(dto.getNocIssuedTo(), otherStateNOCDetailsVO::setNocIssuedTo);
		funPoint(dto.getPeriodOfStayMonths(), otherStateNOCDetailsVO::setPeriodOfStayMonths);
		funPoint(dto.getPeriodOfStayYears(), otherStateNOCDetailsVO::setPeriodOfStayYears);
		funPoint(dto.getDateOfEnterIntoState(), otherStateNOCDetailsVO::setDateOfEnterIntoState);
		if (dto.getState() != null) {
			otherStateNOCDetailsVO.setState(stateMapper.convertEntity(dto.getState()));
		}
		return otherStateNOCDetailsVO;
	}
	
	@Override
	public OtherStateNOCDetailsDTO convertVO(OtherStateNOCDetailsVO vo) {
		OtherStateNOCDetailsDTO otherStateNOCDetailsDTO = new OtherStateNOCDetailsDTO();
		funPoint(vo.getAuthority(), otherStateNOCDetailsDTO::setAuthority);
		funPoint(vo.getIssueDate(), otherStateNOCDetailsDTO::setIssueDate);
		funPoint(vo.getNocIssuedTo(), otherStateNOCDetailsDTO::setNocIssuedTo);
		funPoint(vo.getPeriodOfStayMonths(), otherStateNOCDetailsDTO::setPeriodOfStayMonths);
		funPoint(vo.getPeriodOfStayYears(), otherStateNOCDetailsDTO::setPeriodOfStayYears);
		funPoint(vo.getDateOfEnterIntoState(), otherStateNOCDetailsDTO::setDateOfEnterIntoState);
		if (vo.getState() != null) {
			otherStateNOCDetailsDTO.setState(stateMapper.convertVO(vo.getState()));
		}
		return otherStateNOCDetailsDTO;
	}

}

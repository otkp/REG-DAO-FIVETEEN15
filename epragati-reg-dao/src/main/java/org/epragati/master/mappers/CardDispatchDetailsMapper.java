package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.CardDispatchDetailsDTO;
import org.epragati.rta.vo.CardDispatchDetailsVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class CardDispatchDetailsMapper extends BaseMapper<CardDispatchDetailsDTO, CardDispatchDetailsVO> {

	public CardDispatchDetailsDTO cardDispatchDetailsDTO;
	
	public CardDispatchDetailsVO cardDispatchDetailsVO;

	@Override
	public CardDispatchDetailsVO convertEntity(CardDispatchDetailsDTO cardDispatchDetailsDTO) {
		cardDispatchDetailsVO = new CardDispatchDetailsVO();
		funPoint(cardDispatchDetailsDTO.getApplicationNo(), cardDispatchDetailsVO::setApplicationNo);
		funPoint(cardDispatchDetailsDTO.getPrNo(), cardDispatchDetailsVO::setPrNo);
		funPoint(cardDispatchDetailsDTO.getOfficeCode(), cardDispatchDetailsVO::setOfficeCode);
		funPoint(cardDispatchDetailsDTO.getPrintedBy(), cardDispatchDetailsVO::setPrintedBy);
		funPoint(cardDispatchDetailsDTO.getRemarks(), cardDispatchDetailsVO::setRemarks);
		funPoint(cardDispatchDetailsDTO.getPrintedDateTime(), cardDispatchDetailsVO::setPrintedDateTime);
		funPoint(cardDispatchDetailsDTO.isFlagChangedByRTO(), cardDispatchDetailsVO::setFlagChangedByRTO);
		return cardDispatchDetailsVO;
	}
	@Override
	public CardDispatchDetailsDTO convertVO(CardDispatchDetailsVO cardDispatchDetailsVO) {
		cardDispatchDetailsDTO = new CardDispatchDetailsDTO();
		funPoint(cardDispatchDetailsVO.getApplicationNo(), cardDispatchDetailsDTO::setApplicationNo);
		funPoint(cardDispatchDetailsVO.getPrNo(), cardDispatchDetailsDTO::setPrNo);
		funPoint(cardDispatchDetailsVO.getOfficeCode(), cardDispatchDetailsDTO::setOfficeCode);
		funPoint(cardDispatchDetailsVO.getPrintedBy(), cardDispatchDetailsDTO::setPrintedBy);
		funPoint(cardDispatchDetailsVO.getRemarks(), cardDispatchDetailsDTO::setRemarks);
		funPoint(cardDispatchDetailsVO.getPrintedDateTime(), cardDispatchDetailsDTO::setPrintedDateTime);
		funPoint(cardDispatchDetailsVO.isFlagChangedByRTO(), cardDispatchDetailsDTO::setFlagChangedByRTO);
		return cardDispatchDetailsDTO;
	}
	
}

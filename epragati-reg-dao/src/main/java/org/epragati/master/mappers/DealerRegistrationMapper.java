/**
 * @author krishnarjun.pampana
 */
package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.DealerRegistrationDTO;
import org.epragati.master.vo.DealerRegistrationVO;
import org.springframework.stereotype.Component;


@Component
public  class DealerRegistrationMapper extends BaseMapper<DealerRegistrationDTO, DealerRegistrationVO> {

	@Override
	public DealerRegistrationVO convertEntity(DealerRegistrationDTO dto) {
		
		DealerRegistrationVO dealerRegistrationVO = new DealerRegistrationVO();
		// TODO Auto-generated method stub
		funPoint(dto.getrId(),dealerRegistrationVO::setrId);
		funPoint(dto.getUserId(),dealerRegistrationVO::setUserId);
		funPoint(dto.getStatus(),dealerRegistrationVO::setStatus);
		return dealerRegistrationVO;
	}

	@Override
	public DealerRegistrationDTO convertVO(DealerRegistrationVO vo) {
		// TODO Auto-generated method stub
		DealerRegistrationDTO dealerRegistrationDTO = new DealerRegistrationDTO();
		funPoint(vo.getrId(),dealerRegistrationDTO::setrId);
		funPoint(vo.getUserId(),dealerRegistrationDTO::setUserId);
		funPoint(vo.getStatus(),dealerRegistrationDTO::setStatus);
		return dealerRegistrationDTO;
	}

}

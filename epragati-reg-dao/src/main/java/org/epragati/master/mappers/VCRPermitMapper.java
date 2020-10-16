package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.permits.vo.PermitDetailsVO;
import org.epragati.permits.vo.PermitValidityDetailsVO;
import org.epragati.vcrImage.dto.ValidityDetailsDTO;
import org.epragati.vcrImage.dto.VcrFinalServiceDTO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Component
public class VCRPermitMapper extends BaseMapper<VcrFinalServiceDTO, PermitDetailsVO> {

	@Override
	public PermitDetailsVO convertEntity(VcrFinalServiceDTO dto) {
		// TODO Auto-generated method stub
		if(dto.getValidityDetails()!=null){
			PermitDetailsVO vo = new PermitDetailsVO();
			ValidityDetailsDTO validityDTO = dto.getValidityDetails();
			if(validityDTO.getPermitFrom()!=null || validityDTO.getPermitTO()!=null){
				PermitValidityDetailsVO permitVo = new PermitValidityDetailsVO();
				funPoint(validityDTO.getPermitFrom(),permitVo::setPermitValidFrom);	
				funPoint(validityDTO.getPermitTO(),permitVo::setPermitValidTo);	
				vo.setPermitValidityDetailsVO(permitVo);
			}
			funPoint(validityDTO.getPermitNumber(),vo::setPermitNo);	
			return vo;
		}
		return null;
	}

}

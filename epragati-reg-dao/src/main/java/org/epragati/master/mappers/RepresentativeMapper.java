package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.vo.RepresentativeVO;
import org.epragati.regservice.dto.RepresentativeDTO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author bhargav.gottimukkula
 *
 */

@Component
public class RepresentativeMapper extends BaseMapper<RepresentativeDTO, RepresentativeVO>{

	@Override
	public RepresentativeVO convertEntity(RepresentativeDTO repDTO) {
		
		RepresentativeVO representativeVO = new RepresentativeVO();
		funPoint(repDTO.getUidToken(), representativeVO::setUidToken);
		funPoint(repDTO.getUserType(),representativeVO::setUserType);
		funPoint(repDTO.getApplicantId(),representativeVO::setApplicantId);
		funPoint(repDTO.getParentId(),representativeVO::setParentId);
		funPoint(repDTO.getParentApplicantId(),representativeVO::setParentApplicantId);
	/*	if(repDTO.getUserToken()!=null){
			funPoint(repDTO.getUserToken(),representativeVO::setUserToken);
		}
		*/
		return representativeVO;
	}
	
	@Override
	public RepresentativeDTO convertVO(RepresentativeVO representativeVO) {
		RepresentativeDTO representativeDTO=new RepresentativeDTO();
		funPoint(representativeVO.getUidToken(),representativeDTO::setUidToken);
		funPoint(representativeVO.getUserType(),representativeDTO::setUserType);
		funPoint(representativeVO.getApplicantId(),representativeDTO::setApplicantId);
		funPoint(representativeVO.getParentId(),representativeDTO::setParentId);
		funPoint(representativeVO.getParentApplicantId(),representativeDTO::setParentApplicantId);
		return representativeDTO;
	}
	

	 
}
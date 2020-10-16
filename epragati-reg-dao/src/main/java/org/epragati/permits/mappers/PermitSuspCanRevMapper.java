package org.epragati.permits.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.mappers.PermitDetailsMapper;
import org.epragati.master.mappers.RegistrationDetailsMapper;
import org.epragati.permits.dto.PermitSuspCanRevDTO;
import org.epragati.permits.vo.PermitSuspCanRevVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PermitSuspCanRevMapper extends BaseMapper<PermitSuspCanRevDTO, PermitSuspCanRevVO> {

	private static final Logger logger = LoggerFactory.getLogger(PermitSuspCanRevMapper.class);

	@Autowired
	private PermitActionMapper permitActionMapper;

	@Autowired
	private PermitDetailsMapper permitDetailsMapper;

	@Autowired
	private RegistrationDetailsMapper registrationDetailsMapper;

	@Override
	public PermitSuspCanRevVO convertEntity(PermitSuspCanRevDTO permitSuspCanRevdto) {

		logger.info("Before mapping of permit suspension,cancellation and revocation");

		PermitSuspCanRevVO permitSuspCanRevVO = new PermitSuspCanRevVO();

		funPoint(permitSuspCanRevdto.getActionStatus(), permitSuspCanRevVO::setActionStatus);
		funPoint(permitSuspCanRevdto.getPrNo(), permitSuspCanRevVO::setPrNo);
		funPoint(permitSuspCanRevdto.getOfficeCode(), permitSuspCanRevVO::setOfficeCode);
		funPoint(permitSuspCanRevdto.getPermitNums(), permitSuspCanRevVO::setPermitNums);
		funPoint(permitSuspCanRevdto.getAppliedCov(), permitSuspCanRevVO::setAppliedCov);
		

		if (permitSuspCanRevdto.getRcDetails() != null) {
			permitSuspCanRevVO
					.setRcDetailsVO(registrationDetailsMapper.convertEntity(permitSuspCanRevdto.getRcDetails()));
		}
		if (permitSuspCanRevdto.getPermitActions() != null) {
			permitSuspCanRevVO
					.setPermitActionVO(permitActionMapper.convertEntity(permitSuspCanRevdto.getPermitActions()));
		}

		if (permitSuspCanRevdto.getPermitDetailsDTO() != null) {
			permitSuspCanRevVO
					.setPermitDetailsVO(permitDetailsMapper.convertEntity(permitSuspCanRevdto.getPermitDetailsDTO()));
		}

		return permitSuspCanRevVO;
	}

	@Override
	public PermitSuspCanRevDTO convertVO(PermitSuspCanRevVO permitSuspCanRevVO) {

		PermitSuspCanRevDTO suspensionDTO = new PermitSuspCanRevDTO();

		funPoint(permitSuspCanRevVO.getActionStatus(), suspensionDTO::setActionStatus);
		funPoint(permitSuspCanRevVO.getPrNo(), suspensionDTO::setPrNo);
		funPoint(permitSuspCanRevVO.getOfficeCode(), suspensionDTO::setOfficeCode);
		funPoint(permitSuspCanRevVO.getPermitNums(), suspensionDTO::setPermitNums);
		funPoint(permitSuspCanRevVO.getAppliedCov(), suspensionDTO::setAppliedCov);

		if (permitSuspCanRevVO.getPermitActionVO() != null) {
			suspensionDTO.setPermitActions(permitActionMapper.convertVO(permitSuspCanRevVO.getPermitActionVO()));
		}

		if (permitSuspCanRevVO.getRcDetailsVO() != null) {
			suspensionDTO.setRcDetails(registrationDetailsMapper.convertVO(permitSuspCanRevVO.getRcDetailsVO()));
		}

		if (permitSuspCanRevVO.getPermitDetailsVO() != null) {
			suspensionDTO.setPermitDetailsDTO(permitDetailsMapper.convertVO(permitSuspCanRevVO.getPermitDetailsVO()));
		}

		return suspensionDTO;

	}
	
	@Override
	public PermitSuspCanRevDTO convertVO(PermitSuspCanRevDTO suspensionDTO,PermitSuspCanRevVO suspensionVO) {

		funPoint(suspensionVO.getActionStatus(), suspensionDTO::setActionStatus);
		funPoint(suspensionVO.getPrNo(), suspensionDTO::setPrNo);
		
		//funPoint(suspensionVO.getIsExistInDl(), suspensionDTO::setIsExistingInDl);

		if (suspensionVO.getPermitActionVO() != null) {
			suspensionDTO.setPermitActions(permitActionMapper.convertVO(suspensionVO.getPermitActionVO()));

			if(suspensionVO.getPermitDetailsVO()!=null){
				//suspensionDTO.setRcDetails(registrationDetailsMapper.convertVO(suspensionVO.getDlDetailsVO()));
			}
			//funPoint(suspensionVO.getDlDetailsVO().getOfficeCode(), suspensionDTO::setOfficeCode);

		}

		return suspensionDTO;
	}

}

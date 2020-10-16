package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.FeeCorrectionDTO;
import org.epragati.payment.mapper.FeeDetailsMapper;
import org.epragati.regservice.vo.FeeCorrectionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FeeCorrectionMapper extends BaseMapper<FeeCorrectionDTO, FeeCorrectionVO>{

	@Autowired
	private FeeDetailsMapper feeDetailsMapper;
	@Autowired
	private LockedDetailsMapper lockedDetailsMapper;
	@Override
	public FeeCorrectionVO convertEntity(FeeCorrectionDTO dto) {
		
		FeeCorrectionVO vo = new FeeCorrectionVO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getApplicationNo(), vo::setApplicationNo);
		funPoint(dto.getTrNo(), vo::setTrNo);
		funPoint(dto.getPrNo(), vo::setPrNo);
		funPoint(dto.getChassisNo(), vo::setChassisNo);
		funPoint(dto.getOfficeCode(), vo::setOfficeCode);
		funPoint(dto.getApplicationType(), vo::setApplicationType);
		funPoint(dto.isStatus(), vo::setStatus);
		if(dto.getFeeDetails() != null && !dto.getFeeDetails().isEmpty()) {
			vo.setFeeDetails(feeDetailsMapper.convertEntity(dto.getFeeDetails()));
		}
		if(dto.getLockedDetails() != null) {
			vo.setLockedDetails(lockedDetailsMapper.convertEntity(dto.getLockedDetails()));
		}
		funPoint(dto.getCurrentRoles(), vo::setCurrentRoles);
		funPoint(dto.isApproved(), vo::setApproved);
		return vo;
	}
	
	@Override
	public FeeCorrectionDTO convertVO(FeeCorrectionVO dto) {
		FeeCorrectionDTO vo = new FeeCorrectionDTO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getApplicationNo(), vo::setApplicationNo);
		funPoint(dto.getTrNo(), vo::setTrNo);
		funPoint(dto.getPrNo(), vo::setPrNo);
		funPoint(dto.getChassisNo(), vo::setChassisNo);
		funPoint(dto.getOfficeCode(), vo::setOfficeCode);
	    funPoint(dto.getRole(), vo::setRole);
		funPoint(dto.isStatus(), vo::setStatus);
		funPoint(dto.getApplicationType(), vo::setApplicationType);
		if(dto.getFeeDetails() != null && !dto.getFeeDetails().isEmpty()) {
			vo.setFeeDetails(feeDetailsMapper.convertVO(dto.getFeeDetails()));
		}
		if(dto.getLockedDetails() != null) {
			vo.setLockedDetails(lockedDetailsMapper.convertVO(dto.getLockedDetails()));
		}
		funPoint(dto.getCurrentRoles(), vo::setCurrentRoles);
		funPoint(dto.isApproved(), vo::setApproved);
		return vo;
	}
}

package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.FinanceSeedDetailsDTO;
import org.epragati.master.vo.FinanceSeedDetailsVO;
import org.epragati.master.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FinanceSeedDetailsMapper extends BaseMapper<FinanceSeedDetailsDTO, FinanceSeedDetailsVO>{
	
	@Autowired
	private FinanceDetailsMapper financeMapper;
	
	@Autowired
	private UserMapper userMaper;
	
	@Autowired
	private ActionDetailsMapper actionDetailsMapper;

	@Override
	public FinanceSeedDetailsVO convertEntity(FinanceSeedDetailsDTO dto) {
		FinanceSeedDetailsVO vo = new FinanceSeedDetailsVO();
		funPoint(dto.getUserName(), vo::setUserName);
		funPoint(dto.getChassisNo(), vo::setChassisNo);
		funPoint(dto.getClassOfVehicleDesc(), vo::setClassOfVehicleDesc);
		funPoint(dto.getCreatedBy(), vo::setCreatedBy);
		funPoint(dto.getFatherName(), vo::setFatherName);
		funPoint(dto.getMakersModel(), vo::setMakersModel);
		funPoint(dto.getOfficeCode(), vo::setOfficeCode);
		funPoint(dto.getPrNo(), vo::setPrNo); 
		funPoint(dto.getStatus(), vo::setStatus);
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getComments(), vo::setComments);
		if (dto.getOfflineFinanceDetails()!=null) {
			vo.setOfflineFinanceDetails(financeMapper.convertEntity(dto.getOfflineFinanceDetails()));
		}
		/*
		 * if (dto.getOnlineFinanceDetails()!=null) {
		 * vo.setOnlineFinanceDetails(userMaper.convertFields(dto.
		 * getOnlineFinanceDetails())); }
		 */
        if (dto.getActionDetails()!=null) {
        	vo.setActionDetails(actionDetailsMapper.convertEntity(dto.getActionDetails()));
        }
		return vo;
	}
	
	@Override
	public FinanceSeedDetailsDTO convertVO(FinanceSeedDetailsVO vo) {
		FinanceSeedDetailsDTO dto = new FinanceSeedDetailsDTO();
		funPoint(vo.getUserName(), dto::setUserName);
		funPoint(vo.getChassisNo(), dto::setChassisNo);
		funPoint(vo.getClassOfVehicleDesc(), dto::setClassOfVehicleDesc);
		funPoint(vo.getCreatedBy(), dto::setCreatedBy);
		funPoint(vo.getFatherName(), dto::setFatherName);
		funPoint(vo.getMakersModel(), dto::setMakersModel);
		funPoint(vo.getOfficeCode(), dto::setOfficeCode);
		funPoint(vo.getPrNo(), vo::setPrNo); 
		funPoint(vo.getStatus(), vo::setStatus);
		funPoint(vo.getId(), dto::setId);
		funPoint(vo.getComments(), vo::setComments);
		
		if (vo.getOfflineFinanceDetails()!=null) {
			dto.setOfflineFinanceDetails(financeMapper.convertVO(vo.getOfflineFinanceDetails()));
		}
		
	    if (vo.getOnlineFinanceDetails()!=null) {
		  dto.setOnlineFinanceDetails(userMaper.convertVO(vo.getOnlineFinanceDetails()));
		  }
		 
		return dto;
	}
	
	public List<FinanceSeedDetailsVO> convertEntity(List<FinanceSeedDetailsDTO> dtos) {
		return dtos.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	
	
}

package org.epragati.vcrImage.mapper;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.hsrp.mapper.ActionsDetailsMapper;
import org.epragati.master.dto.StagingRegServiceDetailsAutoApprovalDTO;
import org.epragati.master.mappers.FlowMapper;
import org.epragati.regservice.vo.StagingRegServiceAutoApprovalsVO;
import org.epragati.util.payment.ServiceEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class StagingRegServiceAutoApprovalsMapper extends BaseMapper<StagingRegServiceDetailsAutoApprovalDTO, StagingRegServiceAutoApprovalsVO> {
	@Autowired
	private FlowMapper flowMapper;
	@Autowired
	private ActionsDetailsMapper actionsDetailsMapper;
	@Override
	public StagingRegServiceAutoApprovalsVO convertEntity(StagingRegServiceDetailsAutoApprovalDTO dto) {
		StagingRegServiceAutoApprovalsVO regDetailsAutoApprovalsVO = new StagingRegServiceAutoApprovalsVO();
		funPoint(dto.getPrNo(), regDetailsAutoApprovalsVO::setPrNo);
		funPoint(dto.getApplicationNo(), regDetailsAutoApprovalsVO::setApplicationNo);
		funPoint(dto.getOfficeCode(), regDetailsAutoApprovalsVO::setOfficeCode);
		funPoint(dto.getAutoApprovalsDate(), regDetailsAutoApprovalsVO::setAutoApprovalsDate);
		funPoint(dto.getDistrictId(), regDetailsAutoApprovalsVO::setDistrictId);
		funPoint(dto.getDistrictName(), regDetailsAutoApprovalsVO::setDistrictName);
		funPoint(dto.getRoleType(), regDetailsAutoApprovalsVO::setRoleType);
		funPoint(dto.getAutoApprovalsDate(), regDetailsAutoApprovalsVO::setAutoApprovalsDate);
		funPoint(dto.getTrNo(), regDetailsAutoApprovalsVO::setTrNo);
		funPoint(dto.getAutoApprovalInitiatedDate(), regDetailsAutoApprovalsVO::setAutoApprovalInitiatedDate);
		if(dto.getCreatedDate() !=null) {
			regDetailsAutoApprovalsVO.setCreatedDate(dto.getCreatedDate().toLocalDate());
		}
		if(!dto.getServiceName().isEmpty()) {
		   funPoint(dto.getServiceName(), regDetailsAutoApprovalsVO::setServiceName);
		}
		if (dto.getServiceName() != null && !dto.getServiceName().isEmpty()) {
			 Set<String> serviceDetails=	new HashSet<String>();
				if (dto.getServiceName().size() == 1) {
					for (ServiceEnum serviceType : dto.getServiceName()) {
						serviceDetails.add(serviceType.getDesc());
					}
				} else {
					for (ServiceEnum serviceType : dto.getServiceName()) {
						serviceDetails.add(serviceType.getDesc());
					}
					
				}
				regDetailsAutoApprovalsVO.setServiceNameDesc(serviceDetails);
			}
		
		if (dto.getStagingReg() !=null && dto.getStagingReg().getFlowDetailsLog() !=null && !dto.getStagingReg().getFlowDetailsLog().isEmpty()) {
			regDetailsAutoApprovalsVO.setApplicationStatus(dto.getStagingReg().getApplicationStatus());
			regDetailsAutoApprovalsVO.setFlowDetailsLog(flowMapper.convertEntity(dto.getStagingReg().getFlowDetailsLog()));
		}
		if (dto.getRegService() !=null && dto.getRegService().getActionDetails()!=null && !dto.getRegService().getActionDetails().isEmpty()) {
			if(dto.getRegService().getApplicationStatus() !=null)
			regDetailsAutoApprovalsVO.setApplicationStatus(dto.getRegService().getApplicationStatus().toString());
			regDetailsAutoApprovalsVO.setActionDetails(actionsDetailsMapper.convertEntity(dto.getRegService().getActionDetails()));
		}
		
		return regDetailsAutoApprovalsVO;
	}

	@Override
	public List<StagingRegServiceAutoApprovalsVO> convertEntity(List<StagingRegServiceDetailsAutoApprovalDTO> dtos) {
		// TODO Auto-generated method stub
		return dtos.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}	
	
	
}

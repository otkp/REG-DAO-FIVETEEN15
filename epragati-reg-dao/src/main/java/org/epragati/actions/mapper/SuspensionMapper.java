package org.epragati.actions.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.epragati.actions.dto.RCActionsDTO;
import org.epragati.actions.dto.RCActionsDetailsDTO;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dao.RegistrationDetailDAO;
import org.epragati.master.dto.RegistrationDetailsDTO;
import org.epragati.master.mappers.RegistrationDetailsMapper;
import org.epragati.rcactions.RCActionsDetailsVO;
import org.epragati.rcactions.RCActionsVO;
import org.epragati.util.Status.RCActionStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SuspensionMapper extends BaseMapper<RCActionsDTO, RCActionsVO> {

	private static final Logger logger = LoggerFactory.getLogger(SuspensionMapper.class);

	@Autowired
	private SuspensionDetailsMapper suspensionDetailsMapper;

	@Autowired
	private RegistrationDetailsMapper registrationDetailsMapper;
	
	@Autowired
	private RegistrationDetailDAO registrationDetailDAO;

	@Override
	public RCActionsVO convertEntity(RCActionsDTO rcActionDTO) {

		logger.info("Before mapping of SuspensionDTO to SuspensionVO");

		RCActionsVO suspensionVO = new RCActionsVO();

		// funPoint(dlActionDTO.getSuspensionActionID(),
		// suspensionVO::setSuspensionActionID);
		// funPoint(dlActionDTO.getIsExistingInDl(), suspensionVO::setIsExistInDl);
		funPoint(rcActionDTO.getActionStatus(), suspensionVO::setActionStatus);
		funPoint(rcActionDTO.getPrNo(), suspensionVO::setPrNo);
		funPoint(rcActionDTO.getOfficeCode(), suspensionVO::setOfficeCode);

		if (rcActionDTO.getRcDetails() != null) {
			suspensionVO.setRcDetailsVO(registrationDetailsMapper.convertEntity(rcActionDTO.getRcDetails()));
		}

		if (rcActionDTO.getRcActionsDetails() != null) {
			suspensionVO
					.setSuspensionDetailsVO(suspensionDetailsMapper.convertEntity(rcActionDTO.getRcActionsDetails()));
		}

		return suspensionVO;
	}

	
	
	public List<RCActionsVO> convertLimited(List<RCActionsDTO> dtoLists) {
		List<RCActionsVO> voList = new ArrayList<>();
		dtoLists.forEach(dto -> {
			Optional<RegistrationDetailsDTO> regDTO = null;
			RCActionsVO vo = new RCActionsVO();
			funPoint(dto.getActionStatus(), vo::setActionStatus);
			funPoint(dto.getPrNo(), vo::setPrNo);
			try {
				regDTO = registrationDetailDAO.findByPrNo(dto.getPrNo());
				if (regDTO.isPresent() && Objects.isNull(dto.getRcDetails())) {
					dto.setRcDetails(regDTO.get());
				}
			} catch (Exception e) {
				logger.info(e.getMessage());
			}
			
			if (dto.getRcActionsDetails() != null) {
				vo.setSuspensionDetailsVO(
						this.convertLimit(dto.getRcActionsDetails(), dto.getRcDetails(), dto.getActionStatus()));
			}

			voList.add(vo);

		});
		return voList;
	}

	private RCActionsDetailsVO convertLimit(RCActionsDetailsDTO actionDTO, RegistrationDetailsDTO regDTO,
			RCActionStatus status) {
		RCActionsDetailsVO vo = new RCActionsDetailsVO();

		funPoint(actionDTO.getFromDate(), vo::setFromDate);
		funPoint(actionDTO.getToDate(), vo::setToDate);
		funPoint(actionDTO.getActionBy(), vo::setSuspendedBy);
		funPoint(actionDTO.getRevocationDate(), vo::setRevocationDate);
		funPoint(actionDTO.getActionBy(), vo::setRevokedBy);
		funPoint(actionDTO.getReferenceDate(), vo::setReferenceDate);
		funPoint(actionDTO.getOfficeMemoNumber(), vo::setOfficeMemoNumber);
		funPoint(actionDTO.getReferenceNumber(), vo::setReferenceNumber);
		funPoint(actionDTO.getReason(), vo::setReason);
		if (regDTO != null) {
			if (regDTO.getApplicantDetails() != null && regDTO.getApplicantDetails().getDisplayName() != null) {
				funPoint(regDTO.getApplicantDetails().getDisplayName(), vo::setOwnerName);
			}
			funPoint(regDTO.getClassOfVehicleDesc(), vo::setClassOfVehicle);
			if (regDTO.getRegistrationValidity() != null
					&& regDTO.getRegistrationValidity().getRegistrationValidity() != null) {
				funPoint(regDTO.getRegistrationValidity().getRegistrationValidity(), vo::setRegValidity);
			}
		}
		return vo;

	}

	@Override
	public RCActionsDTO convertVO(RCActionsVO suspensionVO) {

		RCActionsDTO suspensionDTO = new RCActionsDTO();
		funPoint(suspensionVO.getActionStatus(), suspensionDTO::setActionStatus);
		funPoint(suspensionVO.getPrNo(), suspensionDTO::setPrNo);
		funPoint(suspensionVO.getOfficeCode(), suspensionDTO::setOfficeCode);
		if (suspensionVO.getSuspensionDetailsVO() != null) {
			suspensionDTO.setRcActionsDetails(suspensionDetailsMapper.convertVO(suspensionVO.getSuspensionDetailsVO()));

			if (suspensionVO.getRcDetailsVO() != null) {
				suspensionDTO.setRcDetails(registrationDetailsMapper.convertVO(suspensionVO.getRcDetailsVO()));
			}

		}

		return suspensionDTO;
	}

	@Override
	public RCActionsDTO convertVO(RCActionsDTO suspensionDTO, RCActionsVO suspensionVO) {

		funPoint(suspensionVO.getActionStatus(), suspensionDTO::setActionStatus);
		funPoint(suspensionVO.getPrNo(), suspensionDTO::setPrNo);

		// funPoint(suspensionVO.getIsExistInDl(), suspensionDTO::setIsExistingInDl);

		if (suspensionVO.getSuspensionDetailsVO() != null) {
			suspensionDTO.setRcActionsDetails(suspensionDetailsMapper.convertVO(suspensionVO.getSuspensionDetailsVO()));

			if (suspensionVO.getRcDetailsVO() != null) {
				// suspensionDTO.setRcDetails(registrationDetailsMapper.convertVO(suspensionVO.getDlDetailsVO()));
			}
			// funPoint(suspensionVO.getDlDetailsVO().getOfficeCode(),
			// suspensionDTO::setOfficeCode);

		}

		return suspensionDTO;
	}
}

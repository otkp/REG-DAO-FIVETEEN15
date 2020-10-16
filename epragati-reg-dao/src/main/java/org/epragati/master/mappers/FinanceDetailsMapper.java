package org.epragati.master.mappers;

import org.apache.commons.lang3.StringUtils;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.DistrictDTO;
import org.epragati.master.dto.FinanceDetailsDTO;
import org.epragati.master.dto.MandalDTO;
import org.epragati.master.dto.StateDTO;
import org.epragati.master.dto.UserDTO;
import org.epragati.master.vo.FinanceDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FinanceDetailsMapper extends BaseMapper<FinanceDetailsDTO, FinanceDetailsVO> {

	@Autowired
	private AadhaarDetailsResponseMapper aadhaarDetailsResponseMapper;

	@Autowired
	private MasterFinanceTypeMapper masterFinanceTypeMapper;

	@Autowired
	private MandalMapper mandalMapper;

	@Autowired
	private DistrictMapper districtMapper;

	@Autowired
	private StateMapper stateMapper;

	@Override
	public FinanceDetailsVO convertEntity(FinanceDetailsDTO dto) {
		FinanceDetailsVO financeDetailsVO = new FinanceDetailsVO();
		funPoint(dto.getFinancerName(), financeDetailsVO::setFinancerName);
		funPoint(dto.getIntrest(), financeDetailsVO::setIntrest);
		funPoint(dto.getSanctionedAmount(), financeDetailsVO::setSanctionedAmount);
		funPoint(dto.getStatus(), financeDetailsVO::setStatus);
		funPoint(dto.getLastUpdated(), financeDetailsVO::setLastUpdated);
		funPoint(dto.getToken(), financeDetailsVO::setToken);
		funPoint(dto.getTokenGeneratedTime(), financeDetailsVO::setTokenGeneratedTime);
		funPoint(dto.getApplicationNo(), financeDetailsVO::setApplicationNo);
		funPoint(dto.getUserId(), financeDetailsVO::setUserId);
		funPoint(dto.getQuotationValue(), financeDetailsVO::setQuotationValue);
		funPoint(dto.getCreatedDate(), financeDetailsVO::setCreatedDate);
		funPoint(dto.getAgreementDate(), financeDetailsVO::setAgreementDate);
		funPoint(dto.getAgreementDateForOther(), financeDetailsVO::setAgreementDateForOther);

		if (dto.getAadharResponse() != null) {
			aadhaarDetailsResponseMapper.convertEntity(dto.getAadharResponse());
		}

		if (dto.getFinanceType() != null) {
			financeDetailsVO.setMasterFinanceTypeVO(masterFinanceTypeMapper.convertEntity(dto.getFinanceType()));
		}

		funPoint(financeDetailsVO.getCity(), dto::setCity);
		funPoint(financeDetailsVO.getStreetName(), dto::setStreetName);

		if (dto.getMandal() != null) {
			financeDetailsVO.setMandal(mandalMapper.convertEntity(dto.getMandal()));
		}

		if (dto.getDistrict() != null) {
			financeDetailsVO.setDistrict(districtMapper.convertEntity(dto.getDistrict()));
		}

		if (dto.getState() != null) {
			financeDetailsVO.setState(stateMapper.convertEntity(dto.getState()));
		}

		return financeDetailsVO;
	}

	public FinanceDetailsVO limitedFields(FinanceDetailsDTO dto) {
		FinanceDetailsVO financeDetailsVO = new FinanceDetailsVO();
		funPoint(dto.getFinancerName(), financeDetailsVO::setFinancerName);
		funPoint(dto.getSanctionedAmount(), financeDetailsVO::setSanctionedAmount);
		funPoint(dto.getQuotationValue(), financeDetailsVO::setQuotationValue);
		funPoint(dto.getStatus(), financeDetailsVO::setStatus);
		return financeDetailsVO;

	}

	@Override
	public FinanceDetailsDTO convertVO(FinanceDetailsVO vo) {
		FinanceDetailsDTO financeDetailsDTO = new FinanceDetailsDTO();
		funPoint(vo.getFinancerName(), financeDetailsDTO::setFinancerName);
		funPoint(vo.getIntrest(), financeDetailsDTO::setIntrest);
		funPoint(vo.getSanctionedAmount(), financeDetailsDTO::setSanctionedAmount);
		funPoint(vo.getStatus(), financeDetailsDTO::setStatus);
		funPoint(vo.getLastUpdated(), financeDetailsDTO::setLastUpdated);
		funPoint(vo.getToken(), financeDetailsDTO::setToken);
		funPoint(vo.getTokenGeneratedTime(), financeDetailsDTO::setTokenGeneratedTime);
		funPoint(vo.getApplicationNo(), financeDetailsDTO::setApplicationNo);
		funPoint(vo.getUserId(), financeDetailsDTO::setUserId);
		funPoint(vo.getQuotationValue(), financeDetailsDTO::setQuotationValue);
		funPoint(vo.getCreatedDate(), financeDetailsDTO::setCreatedDate);
		funPoint(vo.getAgreementDate(), financeDetailsDTO::setAgreementDate);

		funPoint(vo.getCity(), financeDetailsDTO::setCity);
		funPoint(vo.getStreetName(), financeDetailsDTO::setStreetName);

		if (financeDetailsDTO.getMandal() != null) {
			financeDetailsDTO.setMandal(mandalMapper.convertVO(vo.getMandal()));
		}

		if (financeDetailsDTO.getDistrict() != null) {
			financeDetailsDTO.setDistrict(districtMapper.convertVO(vo.getDistrict()));
		}

		if (financeDetailsDTO.getState() != null) {
			financeDetailsDTO.setState(stateMapper.convertVO(vo.getState()));
		}

		if (StringUtils.isNoneBlank(vo.getOtherStateMandal())) {
			MandalDTO mandal = new MandalDTO();
			mandal.setMandalName(vo.getOtherStateMandal());
			financeDetailsDTO.setMandal(mandal);
			;
		}
		if (StringUtils.isNoneBlank(vo.getOtherStateDistrict())) {
			DistrictDTO dist = new DistrictDTO();
			dist.setDistrictName(vo.getOtherStateDistrict());
			financeDetailsDTO.setDistrict(dist);
			;
		}
		if (StringUtils.isNoneBlank(vo.getOtherStateState())) {
			StateDTO state = new StateDTO();
			state.setStateName(vo.getOtherStateState());
			financeDetailsDTO.setState(state);
		}

		if (financeDetailsDTO.getAadharResponse() != null) {
			aadhaarDetailsResponseMapper.convertVO(vo.getAadharResponse());
		}
		if (vo.getMasterFinanceTypeVO() != null) {
			financeDetailsDTO.setFinanceType(masterFinanceTypeMapper.convertVO(vo.getMasterFinanceTypeVO()));
		}
		funPoint(vo.getAgreementDateForOther(), financeDetailsDTO::setAgreementDateForOther);
		return financeDetailsDTO;
	}

	public FinanceDetailsVO converSpecificFields(UserDTO dto, FinanceDetailsVO vo) {
		funPoint(dto.getCity(), vo::setCity);
		funPoint(dto.getStreetName(), vo::setStreetName);

		if (dto.getMandal() != null) {
			vo.setMandal(mandalMapper.convertEntity(dto.getMandal()));
		}

		if (dto.getDistrict() != null) {
			vo.setDistrict(districtMapper.convertEntity(dto.getDistrict()));
		}

		if (dto.getState() != null) {
			vo.setState(stateMapper.convertEntity(dto.getState()));
		}
		return vo;
	}

}

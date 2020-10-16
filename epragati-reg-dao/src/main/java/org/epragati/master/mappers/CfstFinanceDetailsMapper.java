package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.FinanceDetailsDTO;
import org.epragati.master.vo.CfstFinanceDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CfstFinanceDetailsMapper extends BaseMapper<FinanceDetailsDTO, CfstFinanceDetailsVO> {

	@Autowired
	private AadhaarDetailsResponseMapper aadhaarDetailsResponseMapper;

	@Autowired
	private MasterFinanceTypeMapper masterFinanceTypeMapper;

	@Override
	public CfstFinanceDetailsVO convertEntity(FinanceDetailsDTO dto) {
		CfstFinanceDetailsVO financeDetailsVO = new CfstFinanceDetailsVO();
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

		return financeDetailsVO;
	}

}

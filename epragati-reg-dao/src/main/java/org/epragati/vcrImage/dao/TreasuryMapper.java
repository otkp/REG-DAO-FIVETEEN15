package org.epragati.vcrImage.dao;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.vcr.vo.TreasuryVO;
import org.epragati.vcrImage.dto.TreasuryDTO;
import org.springframework.stereotype.Component;

@Component
public class TreasuryMapper extends BaseMapper<TreasuryDTO, TreasuryVO> {

	@Override
	public TreasuryVO convertEntity(TreasuryDTO dto) {
		TreasuryVO treasuryVO = new TreasuryVO();
		funPoint(dto.getBankCode(), treasuryVO::setBankCode);
		funPoint(dto.getBankSubTresury(), treasuryVO::setBankSubTresury);
		funPoint(dto.getCreatedUser(), treasuryVO::setCreatedUser);
		funPoint(dto.getOfficeCode(), treasuryVO::setOfficeCode);
		return treasuryVO;
	}

	@Override
	public TreasuryDTO convertVO(TreasuryVO vo) {
		TreasuryDTO treasuryDTO = new TreasuryDTO();
		funPoint(vo.getBankCode(), treasuryDTO::setBankCode);
		funPoint(vo.getBankSubTresury(), treasuryDTO::setBankSubTresury);
		funPoint(vo.getCreatedUser(), treasuryDTO::setCreatedUser);
		funPoint(vo.getOfficeCode(), treasuryDTO::setOfficeCode);
		return treasuryDTO;
	}

}

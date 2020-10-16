package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.BankDetailsDTO;
import org.epragati.master.vo.BankDetailsVO;
import org.springframework.stereotype.Component;

@Component
public class BankDetailsMapper extends BaseMapper<BankDetailsDTO, BankDetailsVO> {

	@Override
	public BankDetailsVO convertEntity(BankDetailsDTO dto) {
		BankDetailsVO vo = new BankDetailsVO();
		funPoint(dto.getAccountNo(), vo::setAccountNo);
		funPoint(dto.getBranch(), vo::setBranch);
		funPoint(dto.getIfscCode(), vo::setIfscCode);

		return vo;
	}

	@Override
	public BankDetailsDTO convertVO(BankDetailsVO vo) {
		BankDetailsDTO dto = new BankDetailsDTO();
		funPoint(vo.getAccountNo(), dto::setAccountNo);
		funPoint(vo.getBranch(), dto::setBranch);
		funPoint(vo.getIfscCode(), dto::setIfscCode);
		return dto;
	}
}

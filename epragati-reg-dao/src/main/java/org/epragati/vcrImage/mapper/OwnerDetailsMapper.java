package org.epragati.vcrImage.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.payment.report.vo.VCRNonPaymentDetailsVO;
import org.epragati.vcr.vo.OwnerDetailsVo;
import org.epragati.vcrImage.dto.OwnerDetailsDto;
import org.springframework.stereotype.Component;

@Component
public class OwnerDetailsMapper extends BaseMapper<OwnerDetailsDto, OwnerDetailsVo> {

	@Override
	public OwnerDetailsVo convertEntity(OwnerDetailsDto dto) {
		OwnerDetailsVo vo = new OwnerDetailsVo();
		funPoint(dto.getFullName(), vo::setFullName);
		funPoint(dto.getAddress(), vo::setAddress);
		funPoint(dto.getMobileNo(), vo::setMobileNo);
		return vo;
	}

	@Override
	public OwnerDetailsDto convertVO(OwnerDetailsVo vo) {
		OwnerDetailsDto dto = new OwnerDetailsDto();
		funPoint(vo.getFullName(), dto::setFullName);
		funPoint(vo.getAddress(), dto::setAddress);
		funPoint(vo.getMobileNo(), dto::setMobileNo);

		return dto;
	}

	
	public VCRNonPaymentDetailsVO convertVcrNonPaymentOwner(VCRNonPaymentDetailsVO vCRNonPaymentDetailsVO,
			OwnerDetailsDto ownerDetailsDto) {
		funPoint(ownerDetailsDto.getFullName(), vCRNonPaymentDetailsVO::setOwnerName);
		funPoint(ownerDetailsDto.getAddress().replace(",", " ").replace("\n", ""), vCRNonPaymentDetailsVO::setOwnerAddress);
		return vCRNonPaymentDetailsVO;
	}
}

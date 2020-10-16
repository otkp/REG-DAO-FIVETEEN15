package org.epragati.vcrImage.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.payment.report.vo.VCRNonPaymentDetailsVO;
import org.epragati.vcr.vo.VcrVo;
import org.epragati.vcrImage.dto.Vcr;
import org.springframework.stereotype.Component;

@Component
public class VcrMapper extends BaseMapper<Vcr, VcrVo> {

	@Override
	public VcrVo convertEntity(Vcr dto) {
		VcrVo vcrVo = new VcrVo();
		funPoint(dto.getPlace(), vcrVo::setPlace);
		funPoint(dto.getPlaceOfCheck(), vcrVo::setPlaceOfCheck);
		funPoint(dto.getVcrNumber(), vcrVo::setVcrNumber);
		vcrVo.setDateOfCheck(dto.getDateOfCheck());
		vcrVo.setLatitude(dto.getLatitude());
		vcrVo.setLongitude(dto.getLongitude());
		return vcrVo;
	}

	@Override
	public Vcr convertVO(VcrVo vo) {
		Vcr vcrDto = new Vcr();
		vcrDto.setDateOfCheck(vo.getDateOfCheck());
		funPoint(vo.getPlace(), vcrDto::setPlace);
		funPoint(vo.getVcrNumber(), vcrDto::setVcrNumber);
		funPoint(vo.getPlaceOfCheck(), vcrDto::setPlaceOfCheck);
		funPoint(vo.getLatitude(), vcrDto::setLatitude);
		funPoint(vo.getLongitude(), vcrDto::setLongitude);
		return vcrDto;
	}

	public VCRNonPaymentDetailsVO convertVcrNonPayment(VCRNonPaymentDetailsVO vCRNonPaymentDetailsVO, Vcr dto) {
		funPoint(dto.getPlaceOfCheck(), vCRNonPaymentDetailsVO::setPlaceOfCheck);
		funPoint(dto.getVcrNumber(), vCRNonPaymentDetailsVO::setVcrNo);
		funPoint(dto.getDateOfCheck(), vCRNonPaymentDetailsVO::setDateOfCheck);
		return vCRNonPaymentDetailsVO;
	}

}

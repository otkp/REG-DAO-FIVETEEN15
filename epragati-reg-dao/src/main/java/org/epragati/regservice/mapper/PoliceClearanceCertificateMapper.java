package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.regservice.dto.PoliceClearanceCertificateDTO;
import org.epragati.regservice.vo.PoliceClearanceCertificateVO;
import org.springframework.stereotype.Component;

@Component
public class PoliceClearanceCertificateMapper extends BaseMapper<PoliceClearanceCertificateDTO, PoliceClearanceCertificateVO>{

	@Override
	public PoliceClearanceCertificateVO convertEntity(PoliceClearanceCertificateDTO dto) {
		PoliceClearanceCertificateVO vo = new PoliceClearanceCertificateVO();
		funPoint(dto.getCertificatSlNo(), vo::setCertificatSlNo);
		funPoint(dto.getIssuedDate(), vo::setIssuedDate);
		funPoint(dto.getPoliceStationAddress(), vo::setPoliceStationAddress);
		return vo;
	}
	
	@Override
	public PoliceClearanceCertificateDTO convertVO(PoliceClearanceCertificateVO vo) {
		PoliceClearanceCertificateDTO dto = new PoliceClearanceCertificateDTO();
		funPoint(vo.getCertificatSlNo(), dto::setCertificatSlNo);
		funPoint(vo.getIssuedDate(), dto::setIssuedDate);
		funPoint(vo.getPoliceStationAddress(), dto::setPoliceStationAddress);
		return dto;
	}

}

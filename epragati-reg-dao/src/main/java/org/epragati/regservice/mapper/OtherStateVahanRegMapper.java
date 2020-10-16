package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.OtherStateVahanRegDTO;
import org.epragati.master.dto.StagingRegistrationDetailsDTO;
import org.epragati.master.mappers.FinanceDetailsMapper;
import org.epragati.master.mappers.RegistrationDetailsMapper;
import org.epragati.regservice.vo.OtherStateRegVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class OtherStateVahanRegMapper extends BaseMapper<OtherStateVahanRegDTO, OtherStateRegVO>{

	@Autowired
	private RegistrationDetailsMapper<StagingRegistrationDetailsDTO> registrationDetailsMapper;
	
	@Autowired
	private NOCDetailsMapper nOCDetailsMapper;

	@Autowired
	private PUCDetailsMapper pucDetailsMapper;
	
	@Autowired
	private FinanceDetailsMapper financeDetailsMapper;
	
	
	@Override
	public OtherStateRegVO convertEntity(OtherStateVahanRegDTO dto) {
		OtherStateRegVO vo = new OtherStateRegVO();
		funPoint(dto.getPrNo(), vo::setPrNo);
		if (null != dto.getRegistrationDetails()) {
			vo.setRegistrationDetails(registrationDetailsMapper.convertEntity(dto.getRegistrationDetails()));
		}
		if (null != dto.getnOCDetails()) {
			vo.setnOCDetails(nOCDetailsMapper.convertEntity(dto.getnOCDetails()));
		}
		if (null != dto.getPucDetails()) {
			vo.setPucDetails(pucDetailsMapper.convertEntity(dto.getPucDetails()));
		}
		return vo;
	}

	@Override
	public OtherStateVahanRegDTO convertVO(OtherStateRegVO vo) {
		OtherStateVahanRegDTO dto = new OtherStateVahanRegDTO();
		funPoint(vo.getPrNo(), dto::setPrNo);
		if (null != vo.getRegistrationDetails()) {
			dto.setRegistrationDetails(registrationDetailsMapper.convertVO(vo.getRegistrationDetails()));
		}
		if (null != vo.getnOCDetails()) {
			dto.setnOCDetails(nOCDetailsMapper.convertVO(vo.getnOCDetails()));
		}
		if (null != vo.getPucDetails()) {
			dto.setPucDetails(pucDetailsMapper.convertVO(vo.getPucDetails()));
		}
		return dto;
	}
}

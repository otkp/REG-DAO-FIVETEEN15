package org.epragati.vahan.sync.mapper;

import java.time.LocalDateTime;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.vahan.port.vo.RtaToVahanVO;
import org.epragati.vahan.sync.dto.RtaToVahanDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class VahanSyncFailedMapper extends BaseMapper<RtaToVahanDTO, RtaToVahanVO>{

	@Override
	public RtaToVahanVO convertEntity(RtaToVahanDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public RtaToVahanDTO convertVO(RtaToVahanVO RtaToVahanVO) {
		RtaToVahanDTO rtaToVahanDTO=new RtaToVahanDTO();
		BeanUtils.copyProperties(RtaToVahanVO, rtaToVahanDTO);
		rtaToVahanDTO.setCreatedDate(LocalDateTime.now());
		rtaToVahanDTO.setlUpdate(LocalDateTime.now());
		return rtaToVahanDTO;
	}

}

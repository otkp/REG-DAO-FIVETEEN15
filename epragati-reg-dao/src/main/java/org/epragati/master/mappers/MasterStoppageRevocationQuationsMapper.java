package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.MasterStoppageRevocationQuationsDTO;
import org.epragati.master.vo.MasterStoppageRevocationQuationsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MasterStoppageRevocationQuationsMapper extends BaseMapper<MasterStoppageRevocationQuationsDTO,MasterStoppageRevocationQuationsVO>{

	@Autowired
	private StoppageQuationsSubOptionsMapper stoppageQuationsSubOptionsMapper;
	
	@Override
	public MasterStoppageRevocationQuationsVO convertEntity(MasterStoppageRevocationQuationsDTO dto) {
		MasterStoppageRevocationQuationsVO vo = new MasterStoppageRevocationQuationsVO();
		funPoint(dto.getQuestion(), vo::setQuestion);
		funPoint(dto.isRadioButton(), vo::setRadioButton);
		funPoint(dto.getFirstRadioButton(), vo::setFirstRadioButton);
		funPoint(dto.isEnableTextFieldForFirstButton(), vo::setEnableTextFieldForFirstButton);
		funPoint(dto.getSecondRadioButton(), vo::setSecondRadioButton);
		funPoint(dto.isEnableTextFieldForSecondButton(), vo::setEnableTextFieldForSecondButton);
		funPoint(dto.isTextField(), vo::setTextField);
		funPoint(dto.getComments(), vo::setComments);
		funPoint(dto.getSlNo(), vo::setSlNo);
		
		if(dto.getOptions() != null ) {
			vo.setOptions(stoppageQuationsSubOptionsMapper.convertEntity(dto.getOptions()));
		}
		return vo;
	}

	@Override
	public MasterStoppageRevocationQuationsDTO convertVO(MasterStoppageRevocationQuationsVO vo) {
		
		MasterStoppageRevocationQuationsDTO dto = new MasterStoppageRevocationQuationsDTO();
		funPoint(vo.getQuestion(), dto::setQuestion);
		funPoint(vo.isRadioButton(), dto::setRadioButton);
		funPoint(vo.getFirstRadioButton(), dto::setFirstRadioButton);
		funPoint(vo.isEnableTextFieldForFirstButton(), dto::setEnableTextFieldForFirstButton);
		funPoint(vo.getSecondRadioButton(), dto::setSecondRadioButton);
		funPoint(vo.isEnableTextFieldForSecondButton(), dto::setEnableTextFieldForSecondButton);
		funPoint(vo.isTextField(), dto::setTextField);
		funPoint(vo.getComments(), dto::setComments);
		funPoint(vo.getSlNo(), dto::setSlNo);
		if(vo.getOptions() != null ) {
			dto.setOptions(stoppageQuationsSubOptionsMapper.convertVO(vo.getOptions()));
		}
		return dto;
	}
}

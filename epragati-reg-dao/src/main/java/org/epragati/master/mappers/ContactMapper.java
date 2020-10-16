package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.ContactDTO;
import org.epragati.master.vo.ContactVO;
import org.epragati.master.vo.VahanVehicleDetailsVO;
import org.springframework.stereotype.Component;
@Component
public class ContactMapper extends BaseMapper<ContactDTO, ContactVO> {

	@Override
	public ContactVO convertEntity(ContactDTO dto) {
		ContactVO contactVO = new ContactVO();
		funPoint(dto.getAlternateMobile(), contactVO::setAlternateMobile);
		funPoint(dto.getEmail(), contactVO::setEmail);
		funPoint(dto.getMobile(), contactVO::setMobile);
		funPoint(dto.getPhone(), contactVO::setPhone);
		return contactVO;
	}

	@Override
	public ContactDTO convertVO(ContactVO vo) {
		ContactDTO contactDTO = new ContactDTO();
		funPoint(vo.getAlternateMobile(), contactDTO::setAlternateMobile);
		funPoint(vo.getEmail(), contactDTO::setEmail);
		funPoint(vo.getMobile(), contactDTO::setMobile);
		funPoint(vo.getPhone(), contactDTO::setPhone);
		return contactDTO;
	}
	
	public ContactVO convertVahanfildes(VahanVehicleDetailsVO vo) {
		ContactVO contactVO = new ContactVO();
		funPoint(vo.getEmailId(), contactVO::setEmail);
		funPoint(vo.getMobileNumber(), contactVO::setMobile);
		return contactVO;
	}
}

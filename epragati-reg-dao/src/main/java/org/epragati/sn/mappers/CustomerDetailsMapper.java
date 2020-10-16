package org.epragati.sn.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.sn.dto.CustomerDetails;
import org.epragati.sn.vo.CustomerDetailsVo;
import org.springframework.stereotype.Component;

@Component
public class CustomerDetailsMapper extends BaseMapper<CustomerDetails, CustomerDetailsVo> {

	@Override
	public CustomerDetailsVo convertEntity(CustomerDetails dto) {
		
		CustomerDetailsVo customerDetailsVo =new CustomerDetailsVo();
		
		funPoint(dto.getFirstName(), customerDetailsVo::setFirstName);
		funPoint(dto.getLastName(), customerDetailsVo::setLastName);
		funPoint(dto.getEmailId(), customerDetailsVo::setEmailId);
		funPoint(dto.getMobileNo(), customerDetailsVo::setMobileNo);
		
		return customerDetailsVo;
	}

}

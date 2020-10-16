package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.DealerDetailsDTO;
import org.epragati.master.vo.DealerDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author saroj.sahoo
 *
 */
@Component
public class DealerDetailsMapper extends BaseMapper<DealerDetailsDTO, DealerDetailsVO> {

	@Autowired
	private DealerVehicalDetailsMapper dealerVehicalDetailsMapper;

	@Autowired
	private BankDetailsMapper bankDetailsMapper;

	@Autowired
	private ContactMapper contactMapper;

	@Autowired
	private ApplicantAddressMapper addressMapper;

	public DealerDetailsVO dealerDetailsVO;
	public DealerDetailsDTO dealerDetailsDTO;

	@Override
	public DealerDetailsVO convertEntity(DealerDetailsDTO dealerDetailsDTO) {
		dealerDetailsVO = new DealerDetailsVO();
		funPoint(dealerDetailsDTO.getDealerId(), dealerDetailsVO::setDealerId);
		funPoint(dealerDetailsDTO.getDealerName(), dealerDetailsVO::setDealerName);
		funPoint(dealerDetailsDTO.getRegisteredWith(), dealerDetailsVO::setRegisteredWith);
		funPoint(dealerDetailsDTO.getRepresentedBy(), dealerDetailsVO::setRepresentedBy);
		funPoint(dealerDetailsDTO.getPremisesDetail(), dealerDetailsVO::setPremisesDetail);
		funPoint(dealerDetailsDTO.getMakersName(), dealerDetailsVO::setMakersName);
		funPoint(dealerDetailsDTO.getMakerClass(), dealerDetailsVO::setMakerClass);
		funPoint(dealerDetailsDTO.getDealerSelectedMakerClass(), dealerDetailsVO::setDealerSelectedMakerClass);
		funPoint(dealerDetailsDTO.getDealerSelectedMakerName(), dealerDetailsVO::setDealerSelectedMakerName);
		if (dealerDetailsDTO.getVehicalDetails() != null) {
			funPoint(dealerVehicalDetailsMapper.convertEntity(dealerDetailsDTO.getVehicalDetails()),
					dealerDetailsVO::setVehicalDetails);
		}
		if (dealerDetailsDTO.getBankDetails() != null) {
			funPoint(bankDetailsMapper.convertEntity(dealerDetailsDTO.getBankDetails()),
					dealerDetailsVO::setBankDetails);
		}
		if (dealerDetailsDTO.getContact() != null) {
			funPoint(contactMapper.convertEntity(dealerDetailsDTO.getContact()), dealerDetailsVO::setContact);
		}
		if (dealerDetailsDTO.getAddress() != null) {
			funPoint(addressMapper.convertEntity(dealerDetailsDTO.getAddress()), dealerDetailsVO::setAddress);
		}
		return dealerDetailsVO;
	}

	@Override
	public DealerDetailsDTO convertVO(DealerDetailsVO dealerDetailsVO) {
		dealerDetailsDTO = new DealerDetailsDTO();
		funPoint(dealerDetailsVO.getDealerId(), dealerDetailsDTO::setDealerId);
		funPoint(dealerDetailsVO.getDealerName(), dealerDetailsDTO::setDealerName);
		funPoint(dealerDetailsVO.getMakersName(), dealerDetailsDTO::setMakersName);
		funPoint(dealerDetailsVO.getMakerClass(), dealerDetailsDTO::setMakerClass);
		funPoint(dealerDetailsVO.getDealerSelectedMakerClass(), dealerDetailsDTO::setDealerSelectedMakerClass);
		funPoint(dealerDetailsVO.getDealerSelectedMakerName(), dealerDetailsDTO::setDealerSelectedMakerName);
		funPoint(dealerDetailsVO.getRegisteredWith(), dealerDetailsDTO::setRegisteredWith);
		funPoint(dealerDetailsVO.getRepresentedBy(), dealerDetailsDTO::setRepresentedBy);
		funPoint(dealerDetailsVO.getPremisesDetail(), dealerDetailsDTO::setPremisesDetail);

		if (dealerDetailsVO.getVehicalDetails() != null) {
			funPoint(dealerVehicalDetailsMapper.convertVO(dealerDetailsVO.getVehicalDetails()),
					dealerDetailsDTO::setVehicalDetails);
		}
		if (dealerDetailsVO.getBankDetails() != null) {
			funPoint(bankDetailsMapper.convertVO(dealerDetailsVO.getBankDetails()), dealerDetailsDTO::setBankDetails);
		}
		if (dealerDetailsVO.getContact() != null) {
			funPoint(contactMapper.convertVO(dealerDetailsVO.getContact()), dealerDetailsDTO::setContact);
		}
		if (dealerDetailsVO.getAddress() != null) {
			funPoint(addressMapper.convertVO(dealerDetailsVO.getAddress()), dealerDetailsDTO::setAddress);
		}
		if(dealerDetailsVO.getBankDetails() != null) {
			funPoint(bankDetailsMapper.convertVO(dealerDetailsVO.getBankDetails()),dealerDetailsDTO::setBankDetails);	
		}
		
		if(dealerDetailsVO.getContact() != null) {
			funPoint(contactMapper.convertVO(dealerDetailsVO.getContact()),dealerDetailsDTO::setContact);
		}
		
		if(dealerDetailsVO.getAddress() != null) {
			funPoint(addressMapper.convertVO(dealerDetailsVO.getAddress()),dealerDetailsDTO::setAddress);
		}
		
		
		return dealerDetailsDTO;
	}

}

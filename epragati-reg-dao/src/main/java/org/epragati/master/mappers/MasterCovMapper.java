package org.epragati.master.mappers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dao.RegistrationDetailDAO;
import org.epragati.master.dto.MasterCovDTO;
import org.epragati.master.dto.RegistrationDetailsDTO;
import org.epragati.master.vo.MasterCovVO;
import org.epragati.payment.report.vo.VCRNonPaymentDetailsVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author krishnarjun.pampana
 *
 */


@Component
public class MasterCovMapper extends BaseMapper<MasterCovDTO, MasterCovVO> {

	
@Autowired
private RegistrationDetailDAO registrationDetailDAO;
	
	@Override
	public MasterCovVO convertEntity(MasterCovDTO dto) {
		MasterCovVO masterCovVO = new MasterCovVO();

		funPoint(dto.getCid(), masterCovVO::setCid);
		funPoint(dto.getCovcode(), masterCovVO::setCovcode);
		
		funPoint(dto.getCovdescription(), masterCovVO::setCovdescription);
		
	

		funPoint(dto.getPanrequired(), masterCovVO::setPanrequired);
		funPoint(dto.getCategory(), masterCovVO::setCategory);
		funPoint(dto.getInvalidCov(), masterCovVO::setInvalidCov);
		if (dto.getIsSecondVehicle() != null) {
			funPoint(dto.getIsSecondVehicle(), masterCovVO::setIsSecondVehicle);
		}
		funPoint(dto.isConstructionVehicle(), masterCovVO::setConstructionVehicle);
		funPoint(dto.getCovcode(), masterCovVO::setCovCode);
		return masterCovVO;
	}

	public MasterCovVO convertRequiredFields(MasterCovDTO dto) {

		MasterCovVO masterCovVO = new MasterCovVO();
		funPoint(dto.getCovdescription(), masterCovVO::setCovdescription);
		funPoint(dto.getCovcode(), masterCovVO::setCovcode);
		funPoint(dto.getCovcode(), masterCovVO::setCovCode);
		return masterCovVO;
	}

	public List<MasterCovVO> convertDTOs(List<MasterCovDTO> dtos) {
		return dtos.stream().map(e -> convertRequiredFields(e)).collect(Collectors.toList());
	}

	@Override
	public MasterCovDTO convertVO(MasterCovVO vo) {
		MasterCovDTO dto=new MasterCovDTO();
		BeanUtils.copyProperties(vo, dto);
		return dto;
	}

	public VCRNonPaymentDetailsVO convertVcrCov(VCRNonPaymentDetailsVO vCRNonPaymentDetailsVO, MasterCovDTO dto) {
		funPoint(dto.getCovcode(), vCRNonPaymentDetailsVO::setCov);
		return vCRNonPaymentDetailsVO;
	}
	public MasterCovDTO convertRequiredFieldsForDriver(MasterCovVO vo) {

		MasterCovDTO dto = new MasterCovDTO();
		funPoint(vo.getDescription(), dto::setCovdescription);
		funPoint(vo.getCode(), dto::setCovcode);
		funPoint(vo.getCategory(), dto::setCategory);
		return dto;
	}

	public List<MasterCovDTO> convertDTOsForDriver(List<MasterCovVO> vo) {
		return vo.stream().map(e -> convertRequiredFieldsForDriver(e)).collect(Collectors.toList());
	}
}

package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.payment.dto.FeesDTO;
import org.epragati.payments.vo.FeesVO;
import org.springframework.stereotype.Component;

@Component
public class FeeMapper extends BaseMapper<FeesDTO, FeesVO> {

	/**
	 * DTO to VO conversion
	 */
	@Override
	public FeesVO convertEntity(FeesDTO dto) {
		FeesVO feeVo = new FeesVO();
		funPoint(dto.getId(), feeVo::setId);
		funPoint(dto.getServiceId(), feeVo::setServiceId);
		funPoint(dto.getCovCode(), feeVo::setCovCode);
		funPoint(dto.getModuleCode(), feeVo::setModuleCode);
		funPoint(dto.getServicedescription(), feeVo::setServicedescription);
		funPoint(dto.getFeesType(), feeVo::setFeesType);
		funPoint(dto.getWeighttype(), feeVo::setWeighttype);
		funPoint(dto.getAmount(), feeVo::setAmount);
		funPoint(dto.getHOA(), feeVo::setHOA);
		funPoint(dto.getHOADESCRIPTION(), feeVo::setHOADESCRIPTION);
		funPoint(dto.getServiceWise(), feeVo::setServiceWise);
		return feeVo;
	}

	/**
	 * VO to DTO conversion
	 */
	@Override
	public FeesDTO convertVO(FeesVO vo) {
		FeesDTO feeDTO = new FeesDTO();
		funPoint(vo.getId(), feeDTO::setId);
		funPoint(vo.getServiceId(), feeDTO::setServiceId);
		funPoint(vo.getCovCode(), feeDTO::setCovCode);
		funPoint(vo.getModuleCode(), feeDTO::setModuleCode);
		funPoint(vo.getServicedescription(), feeDTO::setServicedescription);
		funPoint(vo.getFeesType(), feeDTO::setFeesType);
		funPoint(vo.getWeighttype(), feeDTO::setWeighttype);
		funPoint(vo.getAmount(), feeDTO::setAmount);
		funPoint(vo.getHOA(), feeDTO::setHOA);
		funPoint(vo.getHOADESCRIPTION(), feeDTO::setHOADESCRIPTION);
		funPoint(vo.getServiceWise(), feeDTO::setServiceWise);
		return feeDTO;
	}

	// dtos.stream().map(e -> convertEntity(e)).collect(Collectors.toList());

	public List<FeesVO> convertListToVO(List<FeesDTO> dto) {

		return dto.stream().map(e -> convertEntityLimit(e)).collect(Collectors.toList());
	}

	public FeesVO convertEntityLimit(FeesDTO dto) {
		FeesVO feeVo = new FeesVO();
		funPoint(dto.getServiceId(), feeVo::setServiceId);
		funPoint(dto.getCovCode(), feeVo::setCovCode);
		funPoint(dto.getModuleCode(), feeVo::setModuleCode);
		funPoint(dto.getServicedescription(), feeVo::setServicedescription);
		funPoint(dto.getFeesType(), feeVo::setFeesType);
		funPoint(dto.getWeighttype(), feeVo::setWeighttype);
		funPoint(dto.getAmount(), feeVo::setAmount);
		funPoint(dto.getServiceWise(), feeVo::setServiceWise);
		return feeVo;
	}

}

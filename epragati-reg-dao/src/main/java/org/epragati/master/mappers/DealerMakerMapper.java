package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.DealerMakerDTO;
import org.epragati.master.vo.DealerMakerVO;
import org.springframework.stereotype.Component;

/**
 * 
 * 
 * @author saikiran.kola
 *
 */
@Component
public class DealerMakerMapper extends BaseMapper<DealerMakerDTO, DealerMakerVO> {

	/**
	 * dto to vo conversion
	 */

	@Override
	public DealerMakerVO convertEntity(DealerMakerDTO dealerMakerDTO) {
		DealerMakerVO dealerMakerVo = new DealerMakerVO();
		funPoint(dealerMakerDTO.getApplicationNo(), dealerMakerVo::setApplicationNo);
		funPoint(dealerMakerDTO.getDmId(), dealerMakerVo::setDmId);
		funPoint(dealerMakerDTO.getMmId(), dealerMakerVo::setMmId);
		funPoint(dealerMakerDTO.getrId(), dealerMakerVo::setrId);
		funPoint(dealerMakerDTO.getStatus(), dealerMakerVo::setStatus);
		// TODO Auto-generated method stub
		return dealerMakerVo;
	}

	/**
	 * vo to dto conversion
	 * 
	 */

	@Override
	public DealerMakerDTO convertVO(DealerMakerVO dealerMakerVo) {
		DealerMakerDTO dealerMakerDTO = new DealerMakerDTO();
		funPoint(dealerMakerVo.getApplicationNo(), dealerMakerDTO::setApplicationNo);
		funPoint(dealerMakerVo.getDmId(), dealerMakerDTO::setDmId);
		funPoint(dealerMakerVo.getMmId(), dealerMakerDTO::setMmId);
		funPoint(dealerMakerVo.getrId(), dealerMakerDTO::setrId);
		funPoint(dealerMakerVo.getStatus(), dealerMakerDTO::setStatus);
		return dealerMakerDTO;

	}

	/**
	 * dto list to vo list conversion
	 */

	@Override
	public List<DealerMakerVO> convertEntity(List<DealerMakerDTO> dtos) {
		return dtos.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}

	/**
	 * vo list to dto list conversion
	 * 
	 */

	@Override
	public List<DealerMakerDTO> convertVO(List<DealerMakerVO> vos) {
		return vos.stream().map(v -> convertVO(v)).collect(Collectors.toList());

	}
}

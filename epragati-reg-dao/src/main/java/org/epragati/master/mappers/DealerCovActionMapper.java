package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.DealerCovActionDTO;
import org.epragati.master.vo.DealerCovActionVO;
import org.springframework.stereotype.Component;

/**
 * 
 * 
 * @author saikiran.kola
 *
 */
@Component
public class DealerCovActionMapper extends BaseMapper<DealerCovActionDTO, DealerCovActionVO> {

	/**
	 * dto to vo conversion
	 */

	@Override
	public DealerCovActionVO convertEntity(DealerCovActionDTO dto) {
		DealerCovActionVO DealerCovActionVo = new DealerCovActionVO();
		funPoint(dto.getAction(), DealerCovActionVo::setAction);
		funPoint(dto.getActionBy(), DealerCovActionVo::setActionBy);
		funPoint(dto.getActionDate(), DealerCovActionVo::setActionDate);
		funPoint(dto.getDcaId(), DealerCovActionVo::setDcaId);
		funPoint(dto.getDcId(), DealerCovActionVo::setDcId);
		funPoint(dto.getRemarks(), DealerCovActionVo::setRemarks);
		funPoint(dto.getRole(), DealerCovActionVo::setRole);

		// TODO Auto-generated method stub
		return DealerCovActionVo;
	}

	/**
	 * vo to dto conversion
	 * 
	 * @param vo
	 * @return
	 */
	@Override
	public DealerCovActionDTO convertVO(DealerCovActionVO vo) {
		DealerCovActionDTO dealerCovActionDTO = new DealerCovActionDTO();
		funPoint(vo.getAction(), dealerCovActionDTO::setAction);
		funPoint(vo.getActionBy(), dealerCovActionDTO::setActionBy);
		funPoint(vo.getActionDate(), dealerCovActionDTO::setActionDate);
		funPoint(vo.getDcaId(), dealerCovActionDTO::setDcaId);
		funPoint(vo.getDcId(), dealerCovActionDTO::setDcId);
		funPoint(vo.getRemarks(), dealerCovActionDTO::setRemarks);
		funPoint(vo.getRole(), dealerCovActionDTO::setRole);
		return dealerCovActionDTO;
	}

	/**
	 * dto list to vo list conversion
	 * 
	 */
	@Override
	public List<DealerCovActionVO> convertEntity(List<DealerCovActionDTO> dtos) {

		return dtos.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}

	/**
	 * vo list to dto list conversion
	 * 
	 */

	@Override
	public List<DealerCovActionDTO> convertVO(List<DealerCovActionVO> vos) {

		return vos.stream().map(v -> convertVO(v)).collect(Collectors.toList());
	}

}
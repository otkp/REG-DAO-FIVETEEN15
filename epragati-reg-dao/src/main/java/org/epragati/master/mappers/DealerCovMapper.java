package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.DealerCovDTO;
import org.epragati.master.vo.DealerCovVO;
import org.springframework.stereotype.Component;

/**
 * 
 * 
 * @author saikiran.kola
 *
 */
@Component
public class DealerCovMapper extends BaseMapper<DealerCovDTO, DealerCovVO> {

	/**
	 * dto to vo conversion
	 */

	@Override
	public DealerCovVO convertEntity(DealerCovDTO dto) {
		DealerCovVO dealerCovVo = new DealerCovVO();
		// TODO Auto-generated method stub

		funPoint(dto.getCovId(), dealerCovVo::setCovId);
		funPoint(dto.getCreatedDate(), dealerCovVo::setCreatedDate);
		funPoint(dto.getDcId(), dealerCovVo::setDcId);
		funPoint(dto.getlUpdate(), dealerCovVo::setlUpdate);
		funPoint(dto.getRefNo(), dealerCovVo::setRefNo);
		funPoint(dto.getrId(), dealerCovVo::setrId);
		funPoint(dto.getStatus(), dealerCovVo::setStatus);
		return dealerCovVo;
	}

	/**
	 * dto to vo list conversion
	 */
	@Override
	public List<DealerCovVO> convertEntity(List<DealerCovDTO> dtos) {
		return dtos.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}

	/**
	 * vo to dto conversion
	 */

	@Override
	public DealerCovDTO convertVO(DealerCovVO vo) {
		DealerCovDTO dealerCovDTO = new DealerCovDTO();
		funPoint(vo.getCovId(), dealerCovDTO::setCovId);
		funPoint(vo.getCreatedDate(), dealerCovDTO::setCreatedDate);
		funPoint(vo.getDcId(), dealerCovDTO::setDcId);
		funPoint(vo.getlUpdate(), dealerCovDTO::setlUpdate);
		funPoint(vo.getRefNo(), dealerCovDTO::setRefNo);
		funPoint(vo.getrId(), dealerCovDTO::setrId);
		funPoint(vo.getStatus(), dealerCovDTO::setStatus);
		return dealerCovDTO;
	}

	/**
	 * vo list to dto list conversion
	 */

	public List<DealerCovDTO> convertVO(List<DealerCovVO> vos) {
		return vos.stream().map(v -> convertVO(v)).collect(Collectors.toList());
	}
	
	public DealerCovVO convertRequired(DealerCovDTO dto) {
		DealerCovVO dealerCovVo = new DealerCovVO();
		funPoint(dto.getCovId(), dealerCovVo::setCovId);
		funPoint(dto.getrId(), dealerCovVo::setrId);
		return dealerCovVo;
	}

	/**
	 * dto to vo list conversion
	 */
	public List<DealerCovVO> convertDTOs(List<DealerCovDTO> dtos) {
		return dtos.stream().map(e -> convertRequired(e)).collect(Collectors.toList());
	}

}

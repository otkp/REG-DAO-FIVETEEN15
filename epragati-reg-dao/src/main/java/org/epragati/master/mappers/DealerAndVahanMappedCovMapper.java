package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.DealerAndVahanMappedCovDTO;
import org.epragati.master.vo.DealerAndVahanMappedCovVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class DealerAndVahanMappedCovMapper extends BaseMapper<DealerAndVahanMappedCovDTO, DealerAndVahanMappedCovVO>{

	DealerAndVahanMappedCovVO dealerAndVahanMappedCovVO;
	DealerAndVahanMappedCovDTO dealerAndVahanMappedCovDTO;
	@Override
	public DealerAndVahanMappedCovVO convertEntity(DealerAndVahanMappedCovDTO dealerAndVahanMappedCovDTO) {
		dealerAndVahanMappedCovVO = new DealerAndVahanMappedCovVO();
		funPoint(dealerAndVahanMappedCovDTO.getVahanCovType(), dealerAndVahanMappedCovVO::setVahanCovType);
		funPoint(dealerAndVahanMappedCovDTO.getDealerCovType(), dealerAndVahanMappedCovVO::setDealerCovType);
		funPoint(dealerAndVahanMappedCovDTO.isStatus(), dealerAndVahanMappedCovVO::setStatus);
		funPoint(dealerAndVahanMappedCovDTO.getCategory(), dealerAndVahanMappedCovVO::setCategory);
		return dealerAndVahanMappedCovVO;
	}
	@Override
	public DealerAndVahanMappedCovDTO convertVO(DealerAndVahanMappedCovVO dealerAndVahanMappedCovVO) {
		dealerAndVahanMappedCovDTO = new DealerAndVahanMappedCovDTO();
		funPoint(dealerAndVahanMappedCovVO.getVahanCovType(), dealerAndVahanMappedCovDTO::setVahanCovType);
		funPoint(dealerAndVahanMappedCovVO.getDealerCovType(), dealerAndVahanMappedCovDTO::setDealerCovType);
		funPoint(dealerAndVahanMappedCovVO.isStatus(), dealerAndVahanMappedCovDTO::setStatus);
		funPoint(dealerAndVahanMappedCovVO.getCategory(), dealerAndVahanMappedCovDTO::setCategory);
		return dealerAndVahanMappedCovDTO;
	}

}

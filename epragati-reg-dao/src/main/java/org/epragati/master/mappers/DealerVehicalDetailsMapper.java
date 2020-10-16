package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.DealerVehicalDetailsDTO;
import org.epragati.master.vo.DealerVehicalDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DealerVehicalDetailsMapper extends BaseMapper<DealerVehicalDetailsDTO, DealerVehicalDetailsVO> {

	@Autowired
	private MasterCovMapper masterCovMapper;

	@Autowired
	private MakersMapper makersMapper;

	@Override
	public DealerVehicalDetailsVO convertEntity(DealerVehicalDetailsDTO dto) {
		// TODO Auto-generated method stub
		DealerVehicalDetailsVO dealerVehicalDetailsVO = new DealerVehicalDetailsVO();

		if (dto.getMakerNames() != null) {
			funPoint(makersMapper.convertEntity(dto.getMakerNames()), dealerVehicalDetailsVO::setMakerNames);
		}
		if (dto.getClassOfVehicals() != null) {
			funPoint(masterCovMapper.convertEntity(dto.getClassOfVehicals()),
					dealerVehicalDetailsVO::setClassOfVehicals);
		}
		return dealerVehicalDetailsVO;
	}

	@Override
	public DealerVehicalDetailsDTO convertVO(DealerVehicalDetailsVO vo) {
		DealerVehicalDetailsDTO dealerVehicalDetailsDTO = new DealerVehicalDetailsDTO();
		if (vo.getMakerNames() != null) {
			funPoint(makersMapper.convertVO(vo.getMakerNames()), dealerVehicalDetailsDTO::setMakerNames);
		}
		if (vo.getClassOfVehicals() != null) {
			funPoint(masterCovMapper.convertVO(vo.getClassOfVehicals()), dealerVehicalDetailsDTO::setClassOfVehicals);
		}
		return dealerVehicalDetailsDTO;
	}

}

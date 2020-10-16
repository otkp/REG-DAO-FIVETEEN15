package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.MasterFinanceTypeDTO;
import org.epragati.master.vo.MasterFinanceTypeVO;
import org.springframework.stereotype.Component;

@Component
public class MasterFinanceTypeMapper extends BaseMapper<MasterFinanceTypeDTO, MasterFinanceTypeVO> {

	@Override
	public MasterFinanceTypeVO convertEntity(MasterFinanceTypeDTO dto) {
		MasterFinanceTypeVO masterFinanceTypeVO = new MasterFinanceTypeVO();
		funPoint(dto.getFinId(), masterFinanceTypeVO::setFinId);
		funPoint(dto.getFinanceType(), masterFinanceTypeVO::setFinanceType);
		funPoint(dto.getStatus(), masterFinanceTypeVO::setStatus);
		return masterFinanceTypeVO;
	}
	
	@Override
	public MasterFinanceTypeDTO convertVO(MasterFinanceTypeVO dto) {
		MasterFinanceTypeDTO masterFinanceTypeDTO = new MasterFinanceTypeDTO();
		funPoint(dto.getFinId(), masterFinanceTypeDTO::setFinId);
		funPoint(dto.getFinanceType(), masterFinanceTypeDTO::setFinanceType);
		funPoint(dto.getStatus(), masterFinanceTypeDTO::setStatus);
		return masterFinanceTypeDTO;
	}

}

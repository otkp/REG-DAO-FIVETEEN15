package org.epragati.vcrImage.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.vcr.vo.MasterPenalSectionsVO;
import org.epragati.vcrImage.dto.MasterPenalSectionsDTO;
import org.springframework.stereotype.Component;

@Component
public class MasterPenalSectionsMapper extends BaseMapper<MasterPenalSectionsDTO, MasterPenalSectionsVO>{


	@Override
	public MasterPenalSectionsVO convertEntity(MasterPenalSectionsDTO dto) {
		MasterPenalSectionsVO vo = new MasterPenalSectionsVO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getPenalSections(), vo::setPenalSections);
		funPoint(dto.isStatus(), vo::setStatus);
		return vo;
	}

	@Override
	public MasterPenalSectionsDTO convertVO(MasterPenalSectionsVO dto) {
		MasterPenalSectionsDTO vo = new MasterPenalSectionsDTO();
		funPoint(dto.getId(), vo::setId);
		funPoint(dto.getPenalSections(), vo::setPenalSections);
		funPoint(dto.isStatus(), vo::setStatus);
		return vo;
	}
}

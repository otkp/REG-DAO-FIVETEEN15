package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.StaggingTrAttachmentDetailsDTO;
import org.epragati.master.vo.StaggingTrAttachmentDetailsVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class StaggingTrAttachmentDetailsMapper extends BaseMapper<StaggingTrAttachmentDetailsDTO, StaggingTrAttachmentDetailsVO> {

	private StaggingTrAttachmentDetailsVO staggingTrAttachmentDetailsVO;
	private StaggingTrAttachmentDetailsDTO staggingTrAttachmentDetailsDTO;
	
	@Override
	public StaggingTrAttachmentDetailsVO convertEntity(StaggingTrAttachmentDetailsDTO staggingTrAttachmentDetailsDTO) {
		staggingTrAttachmentDetailsVO = new StaggingTrAttachmentDetailsVO();
		funPoint(staggingTrAttachmentDetailsDTO.getTadid(), staggingTrAttachmentDetailsVO::setTadid);
		funPoint(staggingTrAttachmentDetailsDTO.getTdid(), staggingTrAttachmentDetailsVO::setTdid);
		funPoint(staggingTrAttachmentDetailsDTO.getTadEnclid(), staggingTrAttachmentDetailsVO::setTadEnclid);
		funPoint(staggingTrAttachmentDetailsDTO.getTadPath(), staggingTrAttachmentDetailsVO::setTadPath);
		funPoint(staggingTrAttachmentDetailsDTO.getTadStats(), staggingTrAttachmentDetailsVO::setTadStats);
		funPoint(staggingTrAttachmentDetailsDTO.getCreatedDate(), staggingTrAttachmentDetailsVO::setCreatedDate);
		funPoint(staggingTrAttachmentDetailsDTO.getlUpdate(), staggingTrAttachmentDetailsVO::setlUpdate);
		return staggingTrAttachmentDetailsVO;
	}
	
	@Override
	public List<StaggingTrAttachmentDetailsVO> convertEntity(List<StaggingTrAttachmentDetailsDTO> staggingTrAttachmentDetailsDTOList) {
		return staggingTrAttachmentDetailsDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	
	@Override
	public StaggingTrAttachmentDetailsDTO convertVO(StaggingTrAttachmentDetailsVO staggingTrAttachmentDetailsVO) {
		staggingTrAttachmentDetailsDTO = new StaggingTrAttachmentDetailsDTO();
		funPoint(staggingTrAttachmentDetailsVO.getTadid(), staggingTrAttachmentDetailsDTO::setTadid);
		funPoint(staggingTrAttachmentDetailsVO.getTdid(), staggingTrAttachmentDetailsDTO::setTdid);
		funPoint(staggingTrAttachmentDetailsVO.getTadEnclid(), staggingTrAttachmentDetailsDTO::setTadEnclid);
		funPoint(staggingTrAttachmentDetailsVO.getTadPath(), staggingTrAttachmentDetailsDTO::setTadPath);
		funPoint(staggingTrAttachmentDetailsVO.getTadStats(), staggingTrAttachmentDetailsDTO::setTadStats);
		funPoint(staggingTrAttachmentDetailsVO.getCreatedDate(), staggingTrAttachmentDetailsDTO::setCreatedDate);
		funPoint(staggingTrAttachmentDetailsVO.getlUpdate(), staggingTrAttachmentDetailsDTO::setlUpdate);
		return staggingTrAttachmentDetailsDTO;
	}
	
	@Override
	public List<StaggingTrAttachmentDetailsDTO> convertVO(List<StaggingTrAttachmentDetailsVO> staggingTrAttachmentDetailsVOList) {
		return staggingTrAttachmentDetailsVOList.stream().map(v -> convertVO(v)).collect(Collectors.toList());
	}

}

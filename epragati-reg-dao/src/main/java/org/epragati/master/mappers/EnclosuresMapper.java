package org.epragati.master.mappers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.images.vo.ImageInput;
import org.epragati.images.vo.InputVO;
import org.epragati.master.dto.EnclosuresDTO;
import org.epragati.master.vo.EnclosuresVO;
import org.epragati.service.enclosure.vo.EnclosureRejectedVO;
import org.epragati.util.payment.ClassOfVehicleEnum;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class EnclosuresMapper extends BaseMapper<EnclosuresDTO, EnclosuresVO> {

	public EnclosuresVO enclosureVO;
	public EnclosuresDTO enclosureDTO;

	@Override
	public EnclosuresVO convertEntity(EnclosuresDTO enclosureDTO) {
		enclosureVO = new EnclosuresVO();
		funPoint(enclosureDTO.getDetails(), enclosureVO::setDetails);
		funPoint(enclosureDTO.getStatus(), enclosureVO::setStatus);
		funPoint(enclosureDTO.getEnclosureId(), enclosureVO::setEnclosureId);
		funPoint(enclosureDTO.getNoOfAttachments(), enclosureVO::setNoOfAttachments);
		funPoint(enclosureDTO.getProof(), enclosureVO::setProof);
		funPoint(enclosureDTO.getServiceID(), enclosureVO::setServiceID);
		funPoint(enclosureDTO.getStatus(), enclosureVO::setStatus);
		funPoint(enclosureDTO.isRequired(), enclosureVO::setRequired);
		funPoint(enclosureDTO.getCreatedBy(), enclosureVO::setCreatedBy);
		funPoint(enclosureDTO.getCreatedDate(), enclosureVO::setCreatedDate);
		funPoint(enclosureDTO.getModifiedBy(), enclosureVO::setModifiedBy);
		funPoint(enclosureDTO.getModifiedDate(), enclosureVO::setModifiedDate);
		funPoint(enclosureDTO.getBasedOnRole(), enclosureVO::setBasedOnRole);

		return enclosureVO;
	}

	@Override
	public List<EnclosuresVO> convertEntity(List<EnclosuresDTO> enclosureDTOList) {
		return enclosureDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}

	@Override
	public EnclosuresDTO convertVO(EnclosuresVO enclosuresVO) {
		enclosureDTO = new EnclosuresDTO();
		funPoint(enclosuresVO.getDetails(), enclosureDTO::setDetails);
		funPoint(enclosuresVO.getStatus(), enclosureDTO::setStatus);
		funPoint(enclosuresVO.getEnclosureId(), enclosureDTO::setEnclosureId);
		funPoint(enclosuresVO.getNoOfAttachments(), enclosureDTO::setNoOfAttachments);
		funPoint(enclosuresVO.getProof(), enclosureDTO::setProof);
		funPoint(enclosuresVO.getServiceID(), enclosureDTO::setServiceID);
		funPoint(enclosuresVO.getStatus(), enclosureDTO::setStatus);
		funPoint(enclosuresVO.isRequired(), enclosureDTO::setRequired);
		funPoint(enclosuresVO.getCreatedBy(), enclosureDTO::setCreatedBy);
		funPoint(enclosuresVO.getCreatedDate(), enclosureDTO::setCreatedDate);
		funPoint(enclosuresVO.getModifiedBy(), enclosureDTO::setModifiedBy);
		funPoint(enclosuresVO.getModifiedDate(), enclosureDTO::setModifiedDate);
		funPoint(enclosuresVO.getBasedOnRole(), enclosureDTO::setBasedOnRole);
		return enclosureDTO;
	}

	@Override
	public List<EnclosuresDTO> convertVO(List<EnclosuresVO> enclosureVOList) {
		return enclosureVOList.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}

	public EnclosureRejectedVO convertEnclosureToRejectedEncolsures(EnclosuresDTO enclosureDTO) {
		EnclosureRejectedVO enclosurevo = new EnclosureRejectedVO();
		funPoint(enclosureDTO.getDetails(), enclosureVO::setDetails);
		funPoint(enclosureDTO.getStatus(), enclosureVO::setStatus);
		funPoint(enclosureDTO.getEnclosureId(), enclosureVO::setEnclosureId);
		funPoint(enclosureDTO.getNoOfAttachments(), enclosureVO::setNoOfAttachments);
		funPoint(enclosureDTO.getProof(), enclosureVO::setProof);
		funPoint(enclosureDTO.getServiceID(), enclosureVO::setServiceID);
		funPoint(enclosureDTO.getStatus(), enclosureVO::setStatus);
		funPoint(enclosureDTO.isRequired(), enclosureVO::setRequired);
		funPoint(enclosureDTO.getCreatedBy(), enclosureVO::setCreatedBy);
		funPoint(enclosureDTO.getCreatedDate(), enclosureVO::setCreatedDate);
		funPoint(enclosureDTO.getModifiedBy(), enclosureVO::setModifiedBy);
		funPoint(enclosureDTO.getModifiedDate(), enclosureVO::setModifiedDate);
		funPoint(enclosureDTO.getBasedOnRole(), enclosureVO::setBasedOnRole);

		return enclosurevo;
	}

	public InputVO convertEnclosureDTOtoInputVO(String cov, List<EnclosuresDTO> enclosureList) {
		InputVO vo = new InputVO();
		List<ImageInput> imageInputList = new ArrayList<ImageInput>();
		for (EnclosuresDTO enclosure : enclosureList) {
			ImageInput imageInput = new ImageInput();
			funPoint(enclosure.getProof(), imageInput::setType);
			funPoint(enclosure.getSlNo(), imageInput::setFileOrder);
			funPoint(enclosure.getNoOfAttachments(), imageInput::setPageNo);
			funPoint(enclosure.getDetails(), imageInput::setEnclosureName);
			if (cov.equals(ClassOfVehicleEnum.ARVT.getCovCode())) {
				funPoint(enclosure.getEnclosureId(), imageInput::setFileOrder);
			}
			imageInputList.add(imageInput);
		}
		vo.setImageInput(imageInputList);
		return vo;
	}
	
	public InputVO convertEnclosureDTOtoInputVO( List<EnclosuresDTO> enclosureList) {
		InputVO vo = new InputVO();
		List<ImageInput> imageInputList = new ArrayList<ImageInput>();
		for (EnclosuresDTO enclosure : enclosureList) {
			ImageInput imageInput = new ImageInput();
			funPoint(enclosure.getProof(), imageInput::setType);
			funPoint(enclosure.getSlNo(), imageInput::setFileOrder);
			funPoint(enclosure.getNoOfAttachments(), imageInput::setPageNo);
			funPoint(enclosure.getDetails(), imageInput::setEnclosureName);
				funPoint(enclosure.getEnclosureId(), imageInput::setFileOrder);
			imageInputList.add(imageInput);
		}
		vo.setImageInput(imageInputList);
		return vo;
	}
	/**
	 * master data for engine number image (temporary purpose)
	 * @return
	 */
	public EnclosuresDTO getEnclouser() {
		EnclosuresDTO enclousers =  new EnclosuresDTO();
		funPoint("Engine Number", enclousers::setDetails);
		funPoint("Y", enclousers::setStatus);
		funPoint(42, enclousers::setEnclosureId);
		funPoint(1, enclousers::setNoOfAttachments);
		funPoint("EngineNumber", enclousers::setProof);
		funPoint(43, enclousers::setServiceID);
		funPoint(Boolean.TRUE, enclousers::setRequired);
		funPoint("ADMIN", enclousers::setCreatedBy);
		funPoint(LocalDateTime.now(), enclousers::setCreatedDate);
		funPoint("ADMIN", enclousers::setModifiedBy);
		funPoint(LocalDateTime.now(), enclousers::setModifiedDate);
		funPoint(Arrays.asList("MVI","RTO") , enclousers::setBasedOnRole);
		return enclousers;
	}
	
}

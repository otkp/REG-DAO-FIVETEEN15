package org.epragati.service.enclosure.mapper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.constants.EnclosureType;
import org.epragati.dto.enclosure.ImageActionsDTO;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.images.vo.ImageInput;
import org.epragati.images.vo.InputVO;
import org.epragati.master.dto.EnclosuresDTO;
import org.epragati.master.vo.ActionDetailsVO;
import org.epragati.rta.reports.vo.CitizenEnclosuresVO;
import org.epragati.service.enclosure.vo.EnclosureRejectedVO;
import org.epragati.service.enclosure.vo.ImageActionsVO;
import org.epragati.service.enclosure.vo.ImageVO;
import org.epragati.util.RoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class EnclosureImageMapper extends BaseMapper<ImageEnclosureDTO, ImageVO> {

	// @Value("${llr.service.images.pre.url:}")
	@Value("${reg.service.images.new.url:}")
	private String imagePreUrl;

	@Value("${reg.service.images.new.url:}")
	private String imageNewUrl;
	
	@Value("${reg.service.pdf.new.url:}")
	private String pdfNewUrl;

	@Autowired
	private ImageActionsMapper imageMapper;

	@Override
	public ImageVO convertEntity(ImageEnclosureDTO dto) {
		ImageVO vo = new ImageVO();

		vo.setAppImageDocId(dto.getImageId());
		vo.setApplicantId(dto.getReferenceId());
		vo.setImageType(dto.getImageType());
		vo.setImageUrl(mappingUrl(dto.getImageId()));
		vo.setServiceId(dto.getServiceId());
		vo.setImageComment(dto.getReason());
		vo.setImageStaus(dto.getImageStaus());
		vo.setImageDetails(dto.getImageDetails());
		vo.setImageComment(dto.getImageComment());
		vo.setEnclosureName(dto.getEnclosureName());
		vo.setDifferentlyAbled(dto.isDifferentlyAbled());
		vo.setRequired(dto.isRequired());
		vo.setSlNo(dto.getSlNo());
		return vo;
	}

	@Override
	public ImageEnclosureDTO convertVO(ImageVO vo) {
		ImageEnclosureDTO dto = new ImageEnclosureDTO();

		dto.setImageId(vo.getAppImageDocId());
		dto.setReferenceId(vo.getApplicantId());
		dto.setImageType(vo.getImageType());
		dto.setImageId(mappingUrl(vo.getImageUrl()));
		dto.setServiceId(vo.getServiceId());
		dto.setReason(vo.getImageComment());
		dto.setImageStaus(vo.getImageStaus());
		dto.setImageDetails(vo.getImageDetails());
		dto.setImageComment(vo.getImageComment());
		dto.setEnclosureName(vo.getEnclosureName());
		dto.setDifferentlyAbled(vo.isDifferentlyAbled());
		dto.setRequired(vo.isRequired());
		dto.setSlNo(vo.getSlNo());
		return dto;
	}

	public String mappingUrl(String imageId) {
		return imagePreUrl + "?llrAppImageDocId=" + imageId;
	}

	public List<ImageVO> convertNewEntity(List<ImageEnclosureDTO> dtoList) {
		ImageVO vo = null;
		List<ImageActionsDTO> imageActionsList = new ArrayList<ImageActionsDTO>();
		List<ImageVO> imageVo = new ArrayList<>();
		for (ImageEnclosureDTO dto : dtoList) {
			vo = new ImageVO();
			vo.setAppImageDocId(dto.getImageId());
			vo.setApplicantId(dto.getReferenceId());
			vo.setImageType(dto.getImageType());
			vo.setImageUrl(mappingNewUrl(dto.getImageId()));
			vo.setServiceId(dto.getServiceId());
			vo.setImageComment(dto.getReason());
			vo.setImageStaus(dto.getImageStaus());
			vo.setImageDetails(dto.getImageDetails());
			vo.setImageComment(dto.getImageComment());
			vo.setEnclosureName(dto.getEnclosureName());
			vo.setBasedOnRole(dto.getBasedOnRole());
			vo.setDifferentlyAbled(dto.isDifferentlyAbled());
			vo.setRequired(dto.isRequired());
			vo.setSlNo(dto.getSlNo());
			imageActionsList = dto.getImageActions();
			List<ImageActionsVO> actionVo = new ArrayList<>();
			if (imageActionsList != null) {
				for (ImageActionsDTO imageActionsDTO : imageActionsList) {
					ImageActionsVO imageActionsVO = new ImageActionsVO();
					imageActionsVO.setAction(imageActionsDTO.getAction());
					imageActionsVO.setRole(imageActionsDTO.getRole());
					imageActionsVO.setComments(imageActionsDTO.getComments());
					actionVo.add(imageActionsVO);
				}
				vo.setImageActions(actionVo);
			}
			if(dto.getImageType().equals(EnclosureType.Loan.getValue())){
				vo.setPdfUrl(mappingPdfUrl(dto.getImageId()));
			}
			imageVo.add(vo);
		}
		return imageVo;
	}

	public ImageEnclosureDTO imageVOtoEnclosureDTO(String role, ImageEnclosureDTO enclosureDTO,
			ImageVO imageEnclosureVO) {
		List<ImageActionsDTO> imageActionsList = new ArrayList<ImageActionsDTO>();
		 if(role.equalsIgnoreCase(RoleEnum.MVI.getName()) && imageEnclosureVO.getImageStaus().equalsIgnoreCase("APPROVED") && 
	        		(imageEnclosureVO.getImageType().equalsIgnoreCase(EnclosureType.ChassisNumber.toString()) || imageEnclosureVO.getImageType().equalsIgnoreCase(EnclosureType.EngineNumber.toString()))) {
	        	enclosureDTO.setImageStaus(imageEnclosureVO.getImageStaus());
	        }
		if (role.equalsIgnoreCase(RoleEnum.RTO.getName())) {
			enclosureDTO.setImageStaus(imageEnclosureVO.getImageStaus());
		}
		if (role.equalsIgnoreCase(RoleEnum.DTC.getName())) {
			enclosureDTO.setImageStaus(imageEnclosureVO.getImageStaus());
		}
		enclosureDTO.setImageComment(imageEnclosureVO.getImageComment());
		enclosureDTO.setEnclosureName(imageEnclosureVO.getEnclosureName());
		enclosureDTO.setApplicantId(imageEnclosureVO.getApplicantId());
		enclosureDTO.setImagCheckSum(imageEnclosureVO.getImagCheckSum());
		enclosureDTO.setServiceId(imageEnclosureVO.getServiceId());
		enclosureDTO.setImageDetails(imageEnclosureVO.getImageDetails());
		// enclosureDTO.setImageUrl(imageEnclosureDTO.getImageUrl());
		enclosureDTO.setBasedOnRole(imageEnclosureVO.getBasedOnRole());
		enclosureDTO.setDifferentlyAbled(imageEnclosureVO.isDifferentlyAbled());
		enclosureDTO.setRequired(imageEnclosureVO.isRequired());
		enclosureDTO.setActive(imageEnclosureVO.isActive());
		enclosureDTO.setImageType(imageEnclosureVO.getImageType());
		enclosureDTO.setSlNo(imageEnclosureVO.getSlNo());
		ImageActionsDTO imageActions = new ImageActionsDTO();
		imageActions.setAction(imageEnclosureVO.getImageStaus());
		imageActions.setComments(imageEnclosureVO.getImageComment());
		imageActions.setRole(role);
		imageActions.setActionDatetime(LocalDateTime.now());
		if (!CollectionUtils.isEmpty(imageEnclosureVO.getActionLog()) && imageEnclosureVO.getActionLog().size() >0) {
			for (ActionDetailsVO ActionDetailsVO : imageEnclosureVO.getActionLog()) {
				if (role.equalsIgnoreCase(imageActions.getRole())) {
					imageActions.setName(ActionDetailsVO.getActionBy());
					imageActions.setActionDatetime(ActionDetailsVO.getActionDatetime());
				}
			}
		}
		List<ImageActionsDTO> list = new ArrayList<ImageActionsDTO>();

		imageActionsList = enclosureDTO.getImageActions();

		if (imageActionsList == null || imageActionsList.isEmpty()) {
			list.add(imageActions);
			enclosureDTO.setImageActions(list);
		} else {
			imageActionsList.add(imageActions);
			enclosureDTO.setImageActions(imageActionsList);
		}

		return enclosureDTO;
	}

	public String mappingNewUrl(String imageId) {
		return imageNewUrl + "?appImageDocId=" + imageId;
	}

	public List<ImageEnclosureDTO> convertNewEntity(EnclosuresDTO dto) {
		ImageEnclosureDTO imageEnclosuredto = new ImageEnclosureDTO();
		List<ImageEnclosureDTO> list = new ArrayList<>();

		imageEnclosuredto.setDifferentlyAbled(dto.getIsDifferentlyAbled());
		imageEnclosuredto.setImageType(dto.getProof());

		imageEnclosuredto.setServiceId(dto.getServiceID().toString());
		imageEnclosuredto.setRequired(dto.isRequired());

		imageEnclosuredto.setEnclosureName(dto.getDetails());
		imageEnclosuredto.setBasedOnRole(dto.getBasedOnRole());
		imageEnclosuredto.setSlNo(dto.getSlNo());
		list.add(imageEnclosuredto);
		return list;
	}

	public List<ImageVO> convertdtoToVo(EnclosuresDTO dto) {
		ImageVO imagevo = new ImageVO();
		List<ImageVO> list = new ArrayList<>();
		if (dto.getIsDifferentlyAbled() != null) {
			imagevo.setDifferentlyAbled(dto.getIsDifferentlyAbled());
		}

		imagevo.setImageType(dto.getProof());

		imagevo.setServiceId(dto.getServiceID().toString());

		imagevo.setRequired(dto.isRequired());

		imagevo.setEnclosureName(dto.getDetails());
		imagevo.setBasedOnRole(dto.getBasedOnRole());
		imagevo.setSlNo(dto.getSlNo());
		imagevo.setVehicletype(dto.getVehicletype());
		imagevo.setVehicletypecategory(dto.getVehicletypecategory());

		list.add(imagevo);
		return list;
	}

	public List<ImageInput> convertInputToImageVO(List<ImageVO> imageVO) {
		List<ImageInput> imageList = new ArrayList<ImageInput>();
		int index = 0;
		for (ImageVO image : imageVO) {
			ImageInput imageInput = new ImageInput();
			imageInput.setEnclosureName(image.getEnclosureName());
			imageInput.setFileOrder(index);
			imageInput.setPageNo(index);
			imageInput.setType(image.getImageType());

			imageList.add(imageInput);
			index = index + 1;
		}
		return imageList;

	}

	public InputVO rejectedToInputVO(List<EnclosureRejectedVO> rejectedVO) {
		InputVO inputVO = new InputVO();
		List<ImageInput> imageInput = new ArrayList<ImageInput>();
		int index = 0;
		for (EnclosureRejectedVO rejectedEnc : rejectedVO) {
			ImageInput image = new ImageInput();
			image.setType(rejectedEnc.getType());
			image.setEnclosureName(rejectedEnc.getDescription());
			image.setFileOrder(index);
			imageInput.add(image);
			index = index + 1;

		}
		inputVO.setImageInput(imageInput);
		return inputVO;

	}

	public ImageEnclosureDTO imageVOToImageEnclosureDTOToUpdateComments(String role,
			ImageEnclosureDTO imageEnclosureDTO, ImageVO imageVO) {
		imageEnclosureDTO.setImageComment(imageVO.getImageComment());
		return imageEnclosureDTO;
	}

	public List<ImageEnclosureDTO> imageVOInToImageEnclosureDTOIn(List<ImageVO> imageVOList) {
		List<ImageEnclosureDTO> imageEnclosureList = new ArrayList<ImageEnclosureDTO>();
		for (ImageVO image : imageVOList) {
			ImageEnclosureDTO imageEnclosureDTO = new ImageEnclosureDTO();
			imageEnclosureDTO.setReferenceId(image.getApplicantId());
			imageEnclosureDTO.setImageType(image.getImageType());
			imageEnclosureDTO.setImageDetails(image.getImageDetails());
			imageEnclosureDTO.setImageStaus(image.getImageStaus());
			imageEnclosureDTO.setPageNo(image.getSlNo());
			imageEnclosureDTO.setEnclosureName(image.getEnclosureName());
			imageEnclosureDTO.setApplicantId(image.getApplicantId());
			imageEnclosureDTO.setRequired(image.isRequired());
			imageEnclosureDTO.setDifferentlyAbled(image.isDifferentlyAbled());
			imageEnclosureDTO.setImageId(image.getAppImageDocId());
			imageEnclosureDTO.setImageComment(image.getImageComment());
			imageEnclosureList.add(imageEnclosureDTO);
		}
		return imageEnclosureList;
	}

	/*
	 * public List<ImageVO> convertNewEntity(List<ImageEnclosureDTO> dtoList , ) {
	 * ImageVO vo = null; List<ImageVO> imageVo = new ArrayList<>(); for
	 * (ImageEnclosureDTO dto : dtoList) { vo = new ImageVO();
	 * vo.setAppImageDocId(dto.getImageId());
	 * vo.setApplicantId(dto.getReferenceId()); vo.setImageType(dto.getImageType());
	 * vo.setImageUrl(mappingNewUrl(dto.getImageId()));
	 * vo.setServiceId(dto.getServiceId()); vo.setImageComment(dto.getReason());
	 * vo.setImageStaus(dto.getImageStaus());
	 * vo.setImageDetails(dto.getImageDetails());
	 * vo.setImageComment(dto.getImageComment());
	 * vo.setEnclosureName(dto.getEnclosureName());
	 * vo.setBasedOnRole(dto.getBasedOnRole());
	 * vo.setDifferentlyAbled(dto.isDifferentlyAbled());
	 * vo.setRequired(dto.isRequired()); imageVo.add(vo); } return imageVo; }
	 */
	
	public String mappingPdfUrl(String imageId) {
		return pdfNewUrl + "?appImageDocId=" + imageId;
		
	}

	public List<CitizenEnclosuresVO> convertImages(List<ImageEnclosureDTO> value) {
		CitizenEnclosuresVO vo = null;
		List<CitizenEnclosuresVO> imageVo = new ArrayList<>();
		for (ImageEnclosureDTO dto : value) {
			vo = new CitizenEnclosuresVO();
			vo.setEnclosure(dto.getImageId());
			vo.setEnclosureUrl(imagePreUrl + "?appImageDocId=" + dto.getImageId());
			vo.setEnclosureName(dto.getEnclosureName());
			
			imageVo.add(vo);
		}
		return imageVo;
	}
}

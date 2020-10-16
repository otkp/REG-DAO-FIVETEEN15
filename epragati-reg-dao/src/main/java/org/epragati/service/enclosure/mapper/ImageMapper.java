package org.epragati.service.enclosure.mapper;

import java.util.List;
import java.util.Optional;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.constants.EnclosureType;
import org.epragati.dto.enclosure.ImageEnclosureDTO;
import org.epragati.service.enclosure.vo.ImageInput;
import org.epragati.service.enclosure.vo.ImageVO;
import org.epragati.util.ImageCheckSumUtil;
import org.epragati.util.document.KeyValue;
import org.epragati.util.payment.ServiceEnum;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public abstract class ImageMapper<T extends ImageEnclosureDTO> extends BaseMapper<T, ImageVO> {

	@Override
	public ImageVO convertEntity(T entry) {

		ImageVO imageVoObj = new ImageVO();
		funPoint(entry.getImageId(), imageVoObj::setAppImageDocId);
		funPoint(entry.getReferenceId(), imageVoObj::setApplicantId);
		funPoint(entry.getImagCheckSum(), imageVoObj::setImagCheckSum);
		funPoint(entry.getImageDetails(), imageVoObj::setImageDetails);
		funPoint(entry.getImageStaus(), imageVoObj::setImageStaus);
		funPoint(entry.getImageType(), imageVoObj::setImageType);
		funPoint(entry.getServiceId(), imageVoObj::setServiceId);
		funPoint(entry.getReason(), imageVoObj::setImageComment);

		return imageVoObj;
	}

	@Override
	public T convertVO(ImageVO entry) {
		T imageDtoObj = getInstance();
		imageDtoObj.setImageId(entry.getAppImageDocId());
		imageDtoObj.setImagCheckSum(entry.getImagCheckSum());
		imageDtoObj.setImageDetails(entry.getImageDetails());
		imageDtoObj.setImageStaus(entry.getImageStaus());
		imageDtoObj.setImageType(entry.getImageType());
		imageDtoObj.setServiceId(entry.getServiceId());
		imageDtoObj.setReason(entry.getImageComment());
		return imageDtoObj;
	}

	public T convertFromInput(String applicationNo, ImageInput imageInput, MultipartFile file, ServiceEnum service) {

		T imageDto = getInstance();

		imageDto.setReferenceId(applicationNo);
		imageDto.setImageType(imageInput.getImageType());
		imageDto.setImageDetails(ImageCheckSumUtil.encoder(file));
		imageDto.setImagCheckSum(ImageCheckSumUtil.generateSHA1(file));
		imageDto.setServiceId(service.getId().toString());
		imageDto.setPageNo(imageInput.getPageNo());
		imageDto.setEnclosureName(imageInput.getEnclosureName());

		return imageDto;
	}

	public Optional<ImageEnclosureDTO> updateImage(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures,
			ImageInput imageInput, MultipartFile file) {

		EnclosureType type = EnclosureType.getEnclosureType(imageInput.getImageType());

		if (type.equals(EnclosureType.NONE)) {
			return Optional.empty();
		}

		Optional<KeyValue<String, List<ImageEnclosureDTO>>> imgOptional = enclosures.stream()
				.filter(e -> type.getValue().equals(e.getKey())).findFirst();

		if (!imgOptional.isPresent()) {
			return Optional.empty();
		}

		List<ImageEnclosureDTO> pages = imgOptional.get().getValue();

		if (pages != null && imageInput.getPageNo() < pages.size()) {

			ImageEnclosureDTO imageDto = pages.get(imageInput.getPageNo());

			imageDto.setImageDetails(ImageCheckSumUtil.encoder(file));
			imageDto.setImagCheckSum(ImageCheckSumUtil.generateSHA1(file));
			//imageDto.setImageStaus(LLRFRESH.REUPLOAD.getStatus());

			return Optional.of(imageDto);
		}

		return Optional.empty();

	}

	public Optional<ImageEnclosureDTO> updateImage(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures,
			ImageInput imageInput) {

		EnclosureType type = EnclosureType.getEnclosureType(imageInput.getImageType());

		if (type.equals(EnclosureType.NONE)) {
			return Optional.empty();
		}

		Optional<KeyValue<String, List<ImageEnclosureDTO>>> imgOptional = enclosures.stream()
				.filter(e -> type.getValue().equals(e.getKey())).findFirst();

		if (!imgOptional.isPresent()) {
			return Optional.empty();
		}

		List<ImageEnclosureDTO> pages = imgOptional.get().getValue();

		if (pages != null && imageInput.getPageNo() < pages.size()) {

			ImageEnclosureDTO imageDto = pages.get(imageInput.getPageNo());

			return Optional.of(imageDto);
		}

		return Optional.empty();
	}

	public Optional<KeyValue<String, List<ImageEnclosureDTO>>> getImages(
			List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures, ImageInput imageInput) {

		EnclosureType type = EnclosureType.getEnclosureType(imageInput.getImageType());

		if (type.equals(EnclosureType.NONE)) {
			return Optional.empty();
		}

		return enclosures.stream().filter(e -> type.getValue().equals(e.getKey())).findFirst();
	}

	public abstract T getInstance();
	
	public List<KeyValue<String, List<ImageEnclosureDTO>>> updateImageInApplicantDetails(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures,
			KeyValue<String, List<ImageEnclosureDTO>> imageInput, KeyValue<String, List<ImageEnclosureDTO>> imageOutput) {

		EnclosureType type = EnclosureType.getEnclosureType(imageInput.getKey());

		if (type.equals(EnclosureType.NONE)) {
			return enclosures;
		}

		Optional<KeyValue<String, List<ImageEnclosureDTO>>> imgOptional = enclosures.stream()
				.filter(e -> type.getValue().equals(e.getKey())).findFirst();

		if (!imgOptional.isPresent()) {
			enclosures.add(imageInput);
			return enclosures;
		}else{
			imageOutput.setKey(imgOptional.get().getKey());
			imageOutput.setValue(imgOptional.get().getValue());
			imgOptional.get().setValue(imageInput.getValue());
		}

		return enclosures;
	}
	public boolean checkImage(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures,
			ImageEnclosureDTO imageInput) {
		for (KeyValue<String, List<ImageEnclosureDTO>> keyValue : enclosures) {
			for (ImageEnclosureDTO imageEnclosureDTO : keyValue.getValue()) {
				if (imageEnclosureDTO.getImageId().equals(imageInput.getImageId())) {
					return true;
				}
			}
		}
		return false;
	}

}

package org.epragati.master.mappers;

import org.apache.commons.lang3.StringUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.RegistrationDetailsDTO;
import org.epragati.master.dto.StagingRegistrationDetailsDTO;
import org.epragati.master.dto.VehicleDetailsDTO;
import org.epragati.master.vo.VehicleDetailsVO;
import org.springframework.stereotype.Component;

@Component
public class RegVehicleDetailsMapper extends BaseMapper<VehicleDetailsDTO, VehicleDetailsVO> {

	@Override
	public VehicleDetailsVO convertEntity(VehicleDetailsDTO dto) {
		VehicleDetailsVO vo = new VehicleDetailsVO();
		funPoint(dto.getChassisNumber(), vo::setChassisNumber);
		funPoint(dto.getEngineNumber(), vo::setEngineNumber);
		funPoint(dto.getMakersModel(), vo::setMakersModel);
		funPoint(dto.getMakersDesc(), vo::setMakersDesc);
		funPoint(dto.getVehicleClass(), vo::setVehicleClass);
		funPoint(dto.getManufacturedMonthYear(), vo::setManufacturedMonthYear);
		funPoint(dto.getColor(), vo::setColor);
		funPoint(dto.getBodyTypeDesc(), vo::setBodyTypeDesc);
		funPoint(dto.getSeatingCapacity(), vo::setSeatingCapacity);
		funPoint(dto.getRlw(), vo::setRlw);
		funPoint(dto.getUlw(), vo::setUlw);
		funPoint(dto.getFuelDesc(), vo::setFuelDesc);
		funPoint(dto.getClassOfVehicle(), vo::setClassOfVehicle);
		funPoint(dto.getClassOfVehicleDesc(), vo::setClassOfVehicleDesc);
		funPoint(dto.getVehicleStatus(), vo::setVehicleStatus);
		funPoint(dto.getGasKitNo(), vo::setGasKitNo);
		funPoint(dto.getAgencyDetails(), vo::setAgencyDetails);
		funPoint(dto.getOldGvw(), vo::setOldGvw);
		funPoint(dto.getRlw(), vo::setGvw);
		return vo;
	}

	@Override
	public VehicleDetailsDTO convertVO(VehicleDetailsVO vo) {

		VehicleDetailsDTO dto = new VehicleDetailsDTO();
		funPoint(vo.getChassisNumber(), dto::setChassisNumber);
		funPoint(vo.getEngineNumber(), dto::setEngineNumber);
		funPoint(vo.getMakersModel(), dto::setMakersModel);
		funPoint(vo.getMakersDesc(), dto::setMakersDesc);
		funPoint(vo.getVehicleClass(), dto::setVehicleClass);
		funPoint(vo.getManufacturedMonthYear(), dto::setManufacturedMonthYear);
		funPoint(vo.getColor(), dto::setColor);
		funPoint(vo.getBodyTypeDesc(), dto::setBodyTypeDesc);
		funPoint(vo.getSeatingCapacity(), dto::setSeatingCapacity);
		funPoint(vo.getRlw(), dto::setRlw);
		funPoint(vo.getUlw(), dto::setUlw);
		funPoint(vo.getFuelDesc(), dto::setFuelDesc);
		funPoint(vo.getClassOfVehicle(), dto::setClassOfVehicle);
		funPoint(vo.getClassOfVehicleDesc(), dto::setClassOfVehicleDesc);
		funPoint(vo.getVehicleStatus(), dto::setVehicleStatus);
		funPoint(vo.getGasKitNo(), dto::setGasKitNo);
		funPoint(vo.getAgencyDetails(), dto::setAgencyDetails);
		funPoint(vo.getOldGvw(), dto::setOldGvw);
		funPoint(vo.getRlw(), dto::setGvw);
		return dto;
	}

	public VehicleDetailsDTO convetVehicleDetailsFromVahan(StagingRegistrationDetailsDTO staginDto) {
		VehicleDetailsDTO dto = new VehicleDetailsDTO();

		if (staginDto.getVahanDetails() != null) {
			if (staginDto.getVahanDetails().getChassisNumber() != null) {
				dto.setChassisNumber(staginDto.getVahanDetails().getChassisNumber());
			}
			if (staginDto.getVahanDetails().getEngineNumber() != null) {
				dto.setEngineNumber(staginDto.getVahanDetails().getEngineNumber());
			}
			if (staginDto.getVahanDetails().getMakersModel() != null) {
				dto.setMakersModel(staginDto.getVahanDetails().getMakersModel());
			}
			if (staginDto.getVahanDetails().getMakersDesc() != null) {
				dto.setMakersDesc(staginDto.getVahanDetails().getMakersDesc());
			}
			if (staginDto.getVahanDetails().getVehicleClass() != null) {
				dto.setVehicleClass(staginDto.getVahanDetails().getVehicleClass());
			}
			if (staginDto.getVahanDetails().getManufacturedMonthYear() != null) {
				dto.setManufacturedMonthYear(staginDto.getVahanDetails().getManufacturedMonthYear());
			}
			if (staginDto.getVahanDetails().getColor() != null) {
				dto.setColor(staginDto.getVahanDetails().getColor());
			}
			if (staginDto.getVahanDetails().getBodyTypeDesc() != null) {
				dto.setBodyTypeDesc(staginDto.getVahanDetails().getBodyTypeDesc());
			}
			if (staginDto.getVahanDetails().getSeatingCapacity() != null) {
				dto.setSeatingCapacity(staginDto.getVahanDetails().getSeatingCapacity());
			}
			if (staginDto.getVahanDetails().getGvw() != null) {
				dto.setRlw(staginDto.getVahanDetails().getGvw());
			}
			if (staginDto.getVahanDetails().getUnladenWeight() != null) {
				dto.setUlw(staginDto.getVahanDetails().getUnladenWeight());
			}
			if (staginDto.getVahanDetails().getFuelDesc() != null) {
				dto.setFuelDesc(staginDto.getVahanDetails().getFuelDesc());
			}
			if (staginDto.getClassOfVehicle() != null) {
				dto.setClassOfVehicle(staginDto.getClassOfVehicle());
			}
			if (staginDto.getClassOfVehicleDesc() != null) {
				dto.setClassOfVehicleDesc(staginDto.getClassOfVehicleDesc());
			}

			if (staginDto.getVahanDetails().getTrailerChassisDetailsDTO() != null
					&& !staginDto.getVahanDetails().getTrailerChassisDetailsDTO().isEmpty()) {
				dto.setTrailers(staginDto.getVahanDetails().getTrailerChassisDetailsDTO());
			}
			if (staginDto.getVahanDetails().getAxleType() != null
					&& StringUtils.isNoneBlank(staginDto.getVahanDetails().getAxleType())) {
				dto.setAxleType(staginDto.getVahanDetails().getAxleType());
			}

		}
		return dto;
	}

	public VehicleDetailsDTO convetVehicleDetailsFromVahanForOther(RegistrationDetailsDTO staginDto) {
		VehicleDetailsDTO dto = new VehicleDetailsDTO();

		if (staginDto.getVahanDetails() != null) {
			if (staginDto.getVahanDetails().getChassisNumber() != null) {
				dto.setChassisNumber(staginDto.getVahanDetails().getChassisNumber());
			}
			if (staginDto.getVahanDetails().getEngineNumber() != null) {
				dto.setEngineNumber(staginDto.getVahanDetails().getEngineNumber());
			}
			if (staginDto.getVahanDetails().getMakersModel() != null) {
				dto.setMakersModel(staginDto.getVahanDetails().getMakersModel());
			}
			if (staginDto.getVahanDetails().getMakersDesc() != null) {
				dto.setMakersDesc(staginDto.getVahanDetails().getMakersDesc());
			}
			if (staginDto.getVahanDetails().getVehicleClass() != null) {
				dto.setVehicleClass(staginDto.getVahanDetails().getVehicleClass());
			}
			if (staginDto.getVahanDetails().getManufacturedMonthYear() != null) {
				dto.setManufacturedMonthYear(staginDto.getVahanDetails().getManufacturedMonthYear());
			}
			if (staginDto.getVahanDetails().getColor() != null) {
				dto.setColor(staginDto.getVahanDetails().getColor());
			}
			if (staginDto.getVahanDetails().getBodyTypeDesc() != null) {
				dto.setBodyTypeDesc(staginDto.getVahanDetails().getBodyTypeDesc());
			}
			if (staginDto.getVahanDetails().getSeatingCapacity() != null) {
				dto.setSeatingCapacity(staginDto.getVahanDetails().getSeatingCapacity());
			}
			if (staginDto.getVahanDetails().getRearAxleWeight() != null) {
				dto.setRlw(staginDto.getVahanDetails().getRearAxleWeight());
			}
			if (staginDto.getVahanDetails().getUnladenWeight() != null) {
				dto.setUlw(staginDto.getVahanDetails().getUnladenWeight());
			}
			if (staginDto.getVahanDetails().getFuelDesc() != null) {
				dto.setFuelDesc(staginDto.getVahanDetails().getFuelDesc());
			}
			if (staginDto.getClassOfVehicle() != null) {
				dto.setClassOfVehicle(staginDto.getClassOfVehicle());
			}
			if (staginDto.getClassOfVehicleDesc() != null) {
				dto.setClassOfVehicleDesc(staginDto.getClassOfVehicleDesc());
			}

		}
		return dto;
	}

	public VehicleDetailsVO modifiedVehicleData(VehicleDetailsDTO dto) {
		VehicleDetailsVO vo = new VehicleDetailsVO();
		vo = this.convertEntity(dto);
		String encodeChassisNumber = Base64.encodeBase64String(dto.getChassisNumber().getBytes());
		String encodeEngineNumber = Base64.encodeBase64String(dto.getEngineNumber().getBytes());
		funPoint(encodeChassisNumber, vo::setChassisNumber);
		funPoint(encodeEngineNumber, vo::setEngineNumber);
		String chassisNumber = dto.getChassisNumber();
		String engineNumber = dto.getEngineNumber();
		vo.setModfiedChassisNumber(chassisNumber != null
				? chassisNumber.length() >= 5 ? chassisNumber.substring(0, chassisNumber.length() - 5) + "*****"
						: chassisNumber.replaceAll(chassisNumber, "****")
				: null);
		vo.setModfiedEngineNumber(engineNumber != null
				? engineNumber.length() >= 5 ? engineNumber.substring(0, engineNumber.length() - 5) + "*****"
						: engineNumber.replaceAll(engineNumber, "****")
				: null);
		return vo;
	}

	public VehicleDetailsDTO decodingVehicleData(VehicleDetailsVO vo) {
		VehicleDetailsDTO dto = new VehicleDetailsDTO();
		dto = this.convertVO(vo);
		  String decodeChassisNum=new String(Base64.decodeBase64(vo.getChassisNumber()));
		  String decodeEngineNum= new String(Base64.decodeBase64(vo.getEngineNumber()));
		funPoint(decodeChassisNum, dto::setChassisNumber);
		funPoint(decodeEngineNum, dto::setEngineNumber);
		return dto;
        
	}

}

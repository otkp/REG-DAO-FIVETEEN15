package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.VahanDetailsDTO;
import org.epragati.master.vo.VahanDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VahanDetailsMapper extends BaseMapper<VahanDetailsDTO, VahanDetailsVO> {

	@Autowired
	private TrailerChassisDetailsMapper trailerChassisDetailsMapper;
	
	@Autowired
	private HarvestersDetailsMapper harvestersDetailsMapper;

	@Override
	public VahanDetailsVO convertEntity(VahanDetailsDTO dto) {
		VahanDetailsVO vahanDetailsVO = new VahanDetailsVO();
		funPoint(dto.getBodyTypeDesc(), vahanDetailsVO::setBodyTypeDesc);
		funPoint(dto.getChassisNumber(), vahanDetailsVO::setChassisNumber);
		funPoint(dto.getColor(), vahanDetailsVO::setColor);
		funPoint(dto.getCubicCapacity(), vahanDetailsVO::setCubicCapacity);
		funPoint(dto.getEngineNumber(), vahanDetailsVO::setEngineNumber);
		funPoint(dto.getFinancer(), vahanDetailsVO::setFinancer);
		funPoint(dto.getFirstName(), vahanDetailsVO::setFirstName);
		funPoint(dto.getFitUpto(), vahanDetailsVO::setFitUpto);
		funPoint(dto.getFuelDesc(), vahanDetailsVO::setFuelDesc);
		funPoint(dto.getInsuranceCompany(), vahanDetailsVO::setInsuranceCompany);
		funPoint(dto.getInsurancePolicyNumber(), vahanDetailsVO::setInsurancePolicyNumber);
		funPoint(dto.getInsuranceUpto(), vahanDetailsVO::setInsuranceUpto);
		funPoint(dto.getMakersModel(), vahanDetailsVO::setMakersModel);
		if(StringUtils.isNotBlank(dto.getMakersDesc())){
			funPoint(dto.getMakersDesc().toUpperCase(), vahanDetailsVO::setMakersDesc);
		}
		funPoint(dto.getManufacturedMonthYear(), vahanDetailsVO::setManufacturedMonthYear);
		funPoint(dto.getModel(), vahanDetailsVO::setModel);
		funPoint(dto.getName(), vahanDetailsVO::setName);
		funPoint(dto.getNoCyl(), vahanDetailsVO::setNoCyl);
		funPoint(dto.getOwnerName(), vahanDetailsVO::setOwnerName);
		funPoint(dto.getOwnerSr(), vahanDetailsVO::setOwnerSr);
		// funPoint(dto.getPermanentAddress(), vahanDetailsVO::setPermanentAddress);
		funPoint(dto.getPresentAddress(), vahanDetailsVO::setPresentAddress);
		funPoint(dto.getRegisteredAt(), vahanDetailsVO::setRegisteredAt);
		funPoint(dto.getRegistrationDate(), vahanDetailsVO::setRegistrationDate);
		funPoint(dto.getRegistrationNumber(), vahanDetailsVO::setRegistrationNumber);
		funPoint(dto.getGvw(), vahanDetailsVO::setGvw);
		funPoint(dto.getSeatingCapacity(), vahanDetailsVO::setSeatingCapacity);
		funPoint(dto.getSleeperCapacity(), vahanDetailsVO::setSleeperCapacity);
		funPoint(dto.getStandCapacity(), vahanDetailsVO::setStandCapacity);
		funPoint(dto.getStatusAsOn(), vahanDetailsVO::setStatusAsOn);
		funPoint(dto.getStatusMessage(), vahanDetailsVO::setStatusMessage);
		funPoint(dto.getTaxUpto(), vahanDetailsVO::setTaxUpto);
		funPoint(dto.getUnladenWeight(), vahanDetailsVO::setUnladenWeight);
		funPoint(dto.getVehicleClass(), vahanDetailsVO::setVehicleClass);
		funPoint(dto.getWheelbase(), vahanDetailsVO::setWheelbase);
		funPoint(dto.isUsed(), vahanDetailsVO::setUsed);

		/** newly added **/
		funPoint(dto.getWheelbase(), vahanDetailsVO::setWheelbase);
		funPoint(dto.getEnginePower(), vahanDetailsVO::setEnginePower);
		funPoint(dto.getFrontAxleDesc(), vahanDetailsVO::setFrontAxleDesc);
		funPoint(dto.getFrontAxleWeight(), vahanDetailsVO::setFrontAxleWeight);
		funPoint(dto.getGvw(), vahanDetailsVO::setGvw);
		funPoint(dto.getHeight(), vahanDetailsVO::setHeight);
		funPoint(dto.getLength(), vahanDetailsVO::setLength);
		funPoint(dto.getFuelDesc(), vahanDetailsVO::setFuelDesc);
		
		funPoint(dto.getPollutionNormsDesc(), vahanDetailsVO::setPollutionNormsDesc);
		funPoint(dto.getO1AxleDesc(), vahanDetailsVO::setO1AxleDesc);
		funPoint(dto.getO1AxleWeight(), vahanDetailsVO::setO1AxleWeight);
		funPoint(dto.getO2AxleDesc(), vahanDetailsVO::setO2AxleDesc);
		funPoint(dto.getO2AxleWeight(), vahanDetailsVO::setO2AxleWeight);
		funPoint(dto.getO3AxleDesc(), vahanDetailsVO::setO3AxleDesc);
		funPoint(dto.getO3AxleWeight(), vahanDetailsVO::setO3AxleWeight);
		funPoint(dto.getO4AxleDesc(), vahanDetailsVO::setO4AxleDesc);
		funPoint(dto.getO4AxleWeight(), vahanDetailsVO::setO4AxleWeight);
		funPoint(dto.getO5AxleDesc(), vahanDetailsVO::setO5AxleDesc);
		funPoint(dto.getO5AxleWeight(), vahanDetailsVO::setO5AxleWeight);
		funPoint(dto.getO5AxleDesc(), vahanDetailsVO::setO5AxleDesc);
		funPoint(dto.getO5AxleWeight(), vahanDetailsVO::setO5AxleWeight);
		funPoint(dto.getRearAxleDesc(), vahanDetailsVO::setRearAxleDesc);
		funPoint(dto.getRearAxleWeight(), vahanDetailsVO::setRearAxleWeight);
		funPoint(dto.getUnladenWeight(), vahanDetailsVO::setUnladenWeight);
		funPoint(dto.getWidth(), vahanDetailsVO::setWidth);
		funPoint(dto.getTandemAxelDescp(), vahanDetailsVO::setTandemAxelDescp);
		funPoint(dto.getTandemAxelWeight(), vahanDetailsVO::setTandemAxelWeight);
		funPoint(dto.getDealerSelectedMakerName(), vahanDetailsVO::setDealerSelectedMakerName);
		funPoint(dto.getDealerSelectedMakerClass(), vahanDetailsVO::setDealerSelectedMakerClass);
		funPoint(dto.getDealerSelectedBodyType(), vahanDetailsVO::setDealerSelectedBodyType);

		funPoint(dto.getMakersName(), vahanDetailsVO::setMakersName);
		funPoint(dto.getDealerCovType(), vahanDetailsVO::setDealerCovType);
		funPoint(dto.getExShowroomPrice(), vahanDetailsVO::setExShowroomPrice);
		if (dto.getTrailerChassisDetailsDTO() != null) {
			vahanDetailsVO.setTrailerChassisDetailsVO(
					trailerChassisDetailsMapper.convertEntity(dto.getTrailerChassisDetailsDTO()));
		}
		if (dto.getHarvestersDetails() != null) {
			vahanDetailsVO.setHarvestersDetails(
					harvestersDetailsMapper.convertEntity(dto.getHarvestersDetails()));
		}
		funPoint(dto.getOldGvw(), vahanDetailsVO::setOldGvw);
		return vahanDetailsVO;
	}

	public VahanDetailsVO dashBoardLimitedFields(VahanDetailsDTO dto) {
		VahanDetailsVO vahanDetailsVO = new VahanDetailsVO();
		funPoint(dto.getMakersModel(), vahanDetailsVO::setMakersModel);
		funPoint(dto.getMakersDesc(), vahanDetailsVO::setMakersDesc);
		return vahanDetailsVO;

	}

	@Override
	public List<VahanDetailsVO> convertEntity(List<VahanDetailsDTO> dtos) {
		return dtos.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}

	@Override
	public VahanDetailsDTO convertVO(VahanDetailsVO vo) {
		VahanDetailsDTO vahanDetailsDTO = new VahanDetailsDTO();

		funPoint(vo.getBodyTypeDesc(), vahanDetailsDTO::setBodyTypeDesc);
		funPoint(vo.getChassisNumber(), vahanDetailsDTO::setChassisNumber);
		funPoint(vo.getColor(), vahanDetailsDTO::setColor);
		funPoint(vo.getCubicCapacity(), vahanDetailsDTO::setCubicCapacity);
		funPoint(vo.getEngineNumber(), vahanDetailsDTO::setEngineNumber);
		funPoint(vo.getFinancer(), vahanDetailsDTO::setFinancer);
		funPoint(vo.getFirstName(), vahanDetailsDTO::setFirstName);
		funPoint(vo.getFitUpto(), vahanDetailsDTO::setFitUpto);
		// funPoint(vo.getFuelDesc(), vahanDetailsDTO::setFuelDesc);
		funPoint(vo.getInsuranceCompany(), vahanDetailsDTO::setInsuranceCompany);
		funPoint(vo.getInsurancePolicyNumber(), vahanDetailsDTO::setInsurancePolicyNumber);
		funPoint(vo.getInsuranceUpto(), vahanDetailsDTO::setInsuranceUpto);
		funPoint(vo.getMakersModel(), vahanDetailsDTO::setMakersModel);
		// funPoint(vo.getMakersDesc(), vahanDetailsDTO::setMakersDesc);
		funPoint(vo.getManufacturedMonthYear(), vahanDetailsDTO::setManufacturedMonthYear);
		funPoint(vo.getModel(), vahanDetailsDTO::setModel);
		funPoint(vo.getName(), vahanDetailsDTO::setName);
		funPoint(vo.getNoCyl(), vahanDetailsDTO::setNoCyl);
		funPoint(vo.getOwnerName(), vahanDetailsDTO::setOwnerName);
		funPoint(vo.getOwnerSr(), vahanDetailsDTO::setOwnerSr);
		// funPoint(vo.getPermanentAddress(), vahanDetailsDTO::setPermanentAddress);
		funPoint(vo.getPresentAddress(), vahanDetailsDTO::setPresentAddress);
		funPoint(vo.getRegisteredAt(), vahanDetailsDTO::setRegisteredAt);
		funPoint(vo.getRegistrationDate(), vahanDetailsDTO::setRegistrationDate);
		funPoint(vo.getRegistrationNumber(), vahanDetailsDTO::setRegistrationNumber);
		// funPoint(vo.getGvw(), vahanDetailsDTO::setGvw);
		funPoint(vo.getSeatingCapacity(), vahanDetailsDTO::setSeatingCapacity);
		funPoint(vo.getSleeperCapacity(), vahanDetailsDTO::setSleeperCapacity);
		funPoint(vo.getStandCapacity(), vahanDetailsDTO::setStandCapacity);
		funPoint(vo.getStatusAsOn(), vahanDetailsDTO::setStatusAsOn);
		funPoint(vo.getStatusMessage(), vahanDetailsDTO::setStatusMessage);
		funPoint(vo.getTaxUpto(), vahanDetailsDTO::setTaxUpto);
		// funPoint(vo.getUnladenWeight(), vahanDetailsDTO::setUnladenWeight);
		funPoint(vo.getVehicleClass(), vahanDetailsDTO::setVehicleClass);
		// funPoint(vo.getWheelBase(), vahanDetailsDTO::setWheelBase);
		funPoint(vo.getExShowroomPrice(), vahanDetailsDTO::setExShowroomPrice);
		funPoint(vo.isUsed(), vahanDetailsDTO::setUsed);
		funPoint(vo.getWheelbase(), vahanDetailsDTO::setWheelbase);
		funPoint(vo.getEnginePower(), vahanDetailsDTO::setEnginePower);
		funPoint(vo.getFrontAxleDesc(), vahanDetailsDTO::setFrontAxleDesc);
		funPoint(vo.getFrontAxleWeight(), vahanDetailsDTO::setFrontAxleWeight);
		funPoint(vo.getGvw(), vahanDetailsDTO::setGvw);
		funPoint(vo.getHeight(), vahanDetailsDTO::setHeight);
		funPoint(vo.getLength(), vahanDetailsDTO::setLength);
		funPoint(vo.getFuelDesc(), vahanDetailsDTO::setFuelDesc);
		funPoint(vo.getMakersDesc(), vahanDetailsDTO::setMakersDesc);
		funPoint(vo.getPollutionNormsDesc(), vahanDetailsDTO::setPollutionNormsDesc);
		funPoint(vo.getO1AxleDesc(), vahanDetailsDTO::setO1AxleDesc);
		funPoint(vo.getO1AxleWeight(), vahanDetailsDTO::setO1AxleWeight);
		funPoint(vo.getO2AxleDesc(), vahanDetailsDTO::setO2AxleDesc);
		funPoint(vo.getO2AxleWeight(), vahanDetailsDTO::setO2AxleWeight);
		funPoint(vo.getO3AxleDesc(), vahanDetailsDTO::setO3AxleDesc);
		funPoint(vo.getO3AxleWeight(), vahanDetailsDTO::setO3AxleWeight);
		funPoint(vo.getO4AxleDesc(), vahanDetailsDTO::setO4AxleDesc);
		funPoint(vo.getO4AxleWeight(), vahanDetailsDTO::setO4AxleWeight);
		funPoint(vo.getO5AxleDesc(), vahanDetailsDTO::setO5AxleDesc);
		funPoint(vo.getO5AxleWeight(), vahanDetailsDTO::setO5AxleWeight);
		funPoint(vo.getO5AxleDesc(), vahanDetailsDTO::setO5AxleDesc);
		funPoint(vo.getO5AxleWeight(), vahanDetailsDTO::setO5AxleWeight);
		funPoint(vo.getRearAxleDesc(), vahanDetailsDTO::setRearAxleDesc);
		funPoint(vo.getRearAxleWeight(), vahanDetailsDTO::setRearAxleWeight);
		funPoint(vo.getUnladenWeight(), vahanDetailsDTO::setUnladenWeight);
		funPoint(vo.getWidth(), vahanDetailsDTO::setWidth);
		funPoint(vo.getTandemAxelDescp(), vahanDetailsDTO::setTandemAxelDescp);
		funPoint(vo.getTandemAxelWeight(), vahanDetailsDTO::setTandemAxelWeight);
		funPoint(vo.getMakersName(), vahanDetailsDTO::setMakersName);
		funPoint(vo.getDealerSelectedMakerName(), vahanDetailsDTO::setDealerSelectedMakerName);
		funPoint(vo.getDealerSelectedMakerClass(), vahanDetailsDTO::setDealerSelectedMakerClass);
		funPoint(vo.getDealerSelectedBodyType(), vahanDetailsDTO::setDealerSelectedBodyType);
		funPoint(vo.getDealerCovType(), vahanDetailsDTO::setDealerCovType);
		if (vo.getTrailerChassisDetailsVO() != null) {
			vahanDetailsDTO.setTrailerChassisDetailsDTO(
					trailerChassisDetailsMapper.convertVO(vo.getTrailerChassisDetailsVO()));
		}
		if (vo.getHarvestersDetails() != null) {
			vahanDetailsDTO.setHarvestersDetails(
					harvestersDetailsMapper.convertVO(vo.getHarvestersDetails()));
		}
		funPoint(vo.getOldGvw(), vahanDetailsDTO::setOldGvw);
		return vahanDetailsDTO;
	}

	@Override
	public List<VahanDetailsDTO> convertVO(List<VahanDetailsVO> vos) {
		return vos.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}

	public VahanDetailsDTO limitedFieldsVOtoDto(VahanDetailsDTO dto, VahanDetailsVO vo) {
		funPoint(vo.getVehicleClass(), dto::setVehicleClass);
		funPoint(vo.getDealerSelectedBodyType(), dto::setDealerSelectedBodyType);
		funPoint(vo.getMakersName(), dto::setMakersName);
		funPoint(vo.getColor(), dto::setColor);
		funPoint(vo.getUnladenWeight(), dto::setUnladenWeight);
		funPoint(vo.getGvw(), dto::setGvw);
		funPoint(vo.getManufacturedMonthYear(), dto::setManufacturedMonthYear);
		funPoint(vo.getBodyTypeDesc(), dto::setBodyTypeDesc);
		funPoint(vo.getMakersDesc(), dto::setMakersDesc);
		funPoint(vo.getMakersModel(), dto::setMakersModel);
		dto.setExShowroomPrice(0);
		return dto;

	}

	public VahanDetailsVO convertRequiredEntity(VahanDetailsDTO vahanDetails) {
		VahanDetailsVO vahanDetailsVO = new VahanDetailsVO();
		funPoint(vahanDetails.getMakersModel(), vahanDetailsVO::setMakersModel);
		funPoint(vahanDetails.getVehicleClass(), vahanDetailsVO::setVehicleClass);
		funPoint(vahanDetails.getColor(), vahanDetailsVO::setColor);
		funPoint(vahanDetails.getCubicCapacity(), vahanDetailsVO::setCubicCapacity);
		funPoint(vahanDetails.getFuelDesc(), vahanDetailsVO::setFuelDesc);

		return vahanDetailsVO;
	}
}
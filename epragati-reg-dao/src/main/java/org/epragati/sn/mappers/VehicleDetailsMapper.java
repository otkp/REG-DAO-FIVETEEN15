package org.epragati.sn.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.mappers.MasterCovMapper;
import org.epragati.master.mappers.OfficeMapper;
import org.epragati.sn.dto.VehicleDetails;
import org.epragati.sn.vo.VehicleDetailsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleDetailsMapper extends BaseMapper<VehicleDetails, VehicleDetailsVo> {

	@Autowired
	private MasterCovMapper covMapper;

	@Autowired
	private OfficeMapper officeMapper;

	@Override
	public VehicleDetailsVo convertEntity(VehicleDetails dto) {
		VehicleDetailsVo vehicleDetailsVo = new VehicleDetailsVo();

		if (dto.getClassOfVehicle() != null) {
			vehicleDetailsVo.setClassOfVehicle(covMapper.convertEntity(dto.getClassOfVehicle()));
		}
		if (dto.getRtaOffice() != null) {
			vehicleDetailsVo.setRtaOffice(officeMapper.convertEntity(dto.getRtaOffice()));
		}

		funPoint(dto.getPrNumber(), vehicleDetailsVo::setPrNumber);
		funPoint(dto.getTrNumber(), vehicleDetailsVo::setTrNumber);
		funPoint(dto.getApplicationNumber(), vehicleDetailsVo::setApplicationNumber);
		funPoint(dto.getVehicleType(), vehicleDetailsVo::setVehicleType);
		return vehicleDetailsVo;
	}

}

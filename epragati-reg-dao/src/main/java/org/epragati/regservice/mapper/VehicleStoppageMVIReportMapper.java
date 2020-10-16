package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.mappers.MasterStoppageQuationsMapper;
import org.epragati.regservice.dto.VehicleStoppageMVIReportDTO;
import org.epragati.regservice.vo.VehicleStoppageMVIReportVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleStoppageMVIReportMapper extends BaseMapper< VehicleStoppageMVIReportDTO,  VehicleStoppageMVIReportVO>{

	@Autowired
	private MasterStoppageQuationsMapper masterStoppageQuationsMapper ;
	@Override
	public VehicleStoppageMVIReportVO convertEntity(VehicleStoppageMVIReportDTO dto) {
		VehicleStoppageMVIReportVO vo = new VehicleStoppageMVIReportVO();
		funPoint(dto.getQuarterStartDate(), vo::setQuarterStartDate);
		funPoint(dto.getQuarterEndDate(), vo::setQuarterEndDate);
		funPoint(dto.getQuarterNumber(), vo::setQuarterNumber);
		funPoint(dto.getUserId(), vo::setUserId);
		funPoint(dto.getRemarks(), vo::setRemarks);
		funPoint(dto.getOtherStateMVIname(), vo::setOtherStateMVIname);
		funPoint(dto.getOtherStateMVIRemarks(), vo::setOtherStateMVIRemarks);
		funPoint(dto.getOtherStateMviWorkingPlace(), vo::setOtherStateMviWorkingPlace);
		funPoint(dto.getOtherStateDesignation(), vo::setOtherStateDesignation);
		funPoint(dto.getApprovedDate(), vo::setApprovedDate);
		funPoint(dto.isAutoApproved(), vo::setAutoApproved);
		if(dto.getStoppageQuations()!= null) {
			vo.setStoppageQuations(masterStoppageQuationsMapper.convertEntity(dto.getStoppageQuations()));
		}
		return vo;
	}

	@Override
	public VehicleStoppageMVIReportDTO convertVO(VehicleStoppageMVIReportVO dto) {
		VehicleStoppageMVIReportDTO vo = new VehicleStoppageMVIReportDTO();
		funPoint(dto.getQuarterStartDate(), vo::setQuarterStartDate);
		funPoint(dto.getQuarterEndDate(), vo::setQuarterEndDate);
		funPoint(dto.getQuarterNumber(), vo::setQuarterNumber);
		funPoint(dto.getUserId(), vo::setUserId);
		funPoint(dto.getRemarks(), vo::setRemarks);
		funPoint(dto.getOtherStateMVIname(), vo::setOtherStateMVIname);
		funPoint(dto.getOtherStateMVIRemarks(), vo::setOtherStateMVIRemarks);
		funPoint(dto.getOtherStateMviWorkingPlace(), vo::setOtherStateMviWorkingPlace);
		funPoint(dto.getOtherStateDesignation(), vo::setOtherStateDesignation);
		funPoint(dto.getApprovedDate(), vo::setApprovedDate);
		funPoint(dto.isAutoApproved(), vo::setAutoApproved);
		if(dto.getStoppageQuations()!= null) {
			vo.setStoppageQuations(masterStoppageQuationsMapper.convertVO(dto.getStoppageQuations()));
		}
		return vo;
	}
}

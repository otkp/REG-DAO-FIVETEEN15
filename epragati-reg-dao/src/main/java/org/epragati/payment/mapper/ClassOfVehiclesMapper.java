package org.epragati.payment.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.MasterCovDTO;
import org.epragati.payment.dto.ClassOfVehiclesDTO;
import org.epragati.payments.vo.ClassOfVehiclesVO;
import org.springframework.stereotype.Component;

@Component
public class ClassOfVehiclesMapper extends BaseMapper<ClassOfVehiclesDTO, ClassOfVehiclesVO> {

	@Override
	public ClassOfVehiclesVO convertEntity(ClassOfVehiclesDTO entry) {
		ClassOfVehiclesVO classOfVehiclesVO = new ClassOfVehiclesVO();
		funPoint(entry.getCid(), classOfVehiclesVO::setCid);
		funPoint(entry.getCovcode(), classOfVehiclesVO::setCovCode);
		funPoint(entry.getCovdescription(), classOfVehiclesVO::setCovdescription);
		funPoint(entry.getCategory(), classOfVehiclesVO::setCategory);
		/*funPoint(entry.getCreatedate(), classOfVehiclesVO::setCreatedate);
		funPoint(entry.getLupdate(), classOfVehiclesVO::setLupdate);*/
		funPoint(entry.get_id(), classOfVehiclesVO::set_id);
		entry.setPanrequired(false);
		funPoint(entry.isConstructionVehicle(), classOfVehiclesVO::setConstructionVehicle);
		return classOfVehiclesVO;
	}

	@Override
	public ClassOfVehiclesDTO convertVO(ClassOfVehiclesVO entry) {
		ClassOfVehiclesDTO classOfVehiclesVO = new ClassOfVehiclesDTO();
		funPoint(entry.getCid(), classOfVehiclesVO::setCid);
		funPoint(entry.getCovCode(), classOfVehiclesVO::setCovcode);
		funPoint(entry.getCovdescription(), classOfVehiclesVO::setCovdescription);
		funPoint(entry.getCategory(), classOfVehiclesVO::setCategory);
		/*funPoint(entry.getCreatedate(), classOfVehiclesVO::setCreatedate);
		funPoint(entry.getLupdate(), classOfVehiclesVO::setLupdate);*/
		funPoint(entry.get_id(), classOfVehiclesVO::set_id);
		entry.setPanrequired(false);
		funPoint(entry.isConstructionVehicle(), classOfVehiclesVO::setConstructionVehicle);
		return classOfVehiclesVO;
	}
	
	
	/*** convert vahan required fields to other state class of vehilce dto to vo  */
	public ClassOfVehiclesVO convertOtherStateVahanVO(MasterCovDTO dto) {
		ClassOfVehiclesVO vo = new ClassOfVehiclesVO();
		funPoint(dto.getCovcode(), vo::setCovCode);
		funPoint(dto.getCovdescription(), vo::setCovdescription);
		funPoint(dto.getCategory(), vo::setCategory);
		return vo;
	}

	public List<ClassOfVehiclesVO> convertOtherStateVOList(List<MasterCovDTO> dtos) {
		return dtos.stream().map(e -> convertOtherStateVahanVO(e)).collect(Collectors.toList());
	}
	
	/*** convert vahan required fields to other state class of vehilce  vo to dto */
	public MasterCovDTO convertVoOtherStateVahan(ClassOfVehiclesVO vo) {
		MasterCovDTO dto = new MasterCovDTO();
		funPoint(vo.getCovCode(), dto::setCovcode);
		funPoint(vo.getCovdescription(), dto::setCovdescription);
		funPoint(vo.getCategory(), dto::setCategory);
		return dto;
	}

	public List<MasterCovDTO> convertOtherStateDtoList(List<ClassOfVehiclesVO> vos) {
		return vos.stream().map(e -> convertVoOtherStateVahan(e)).collect(Collectors.toList());
	}

}

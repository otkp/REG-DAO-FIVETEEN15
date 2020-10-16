package org.epragati.regservice.mapper;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.OtherStateVahanCovMakerDTO;
import org.epragati.master.mappers.InsuranceCompanyMapper;
import org.epragati.master.mappers.InsuranceTypeMapper;
import org.epragati.master.mappers.MakersMapper;
import org.epragati.master.mappers.MasterVaraintMapper;
import org.epragati.master.mappers.OwnershipMapper;
import org.epragati.master.mappers.StateMapper;
import org.epragati.payment.mapper.ClassOfVehiclesMapper;
import org.epragati.regservice.vo.OtherStateCovVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class OtherStateVahanCovMakerMapper extends BaseMapper<OtherStateVahanCovMakerDTO, OtherStateCovVO>{

	@Autowired
	private ClassOfVehiclesMapper classOfVehiclesMapper;
	
	@Autowired
	private MakersMapper makersMapper;
	
	@Autowired
	private MasterVaraintMapper masterVaraintMapper;
	
	@Autowired
	private StateMapper stateMapper;
	
	@Autowired
	private InsuranceTypeMapper insuranceTypeMapper;
	
	@Autowired
	private InsuranceCompanyMapper insuranceCompanyMapper;
	
	@Autowired
	private OwnershipMapper ownershipMapper;
	
	@Override
	public OtherStateCovVO convertEntity(OtherStateVahanCovMakerDTO dto) {
		OtherStateCovVO vo = new OtherStateCovVO();
		if(dto.getClassOfVehicle()!=null&&!dto.getClassOfVehicle().isEmpty()){
			vo.setClassOfVehicle(classOfVehiclesMapper.convertOtherStateVOList(dto.getClassOfVehicle()));
		}if(dto.getOperator()!=null){
			vo.setOperator(makersMapper.convertEntity(dto.getOperator()));
		}
		if(dto.getMakerClass()!=null){
			vo.setMakerClass(masterVaraintMapper.convertEntity(dto.getMakerClass()));
		}
		if(dto.getNocState()!=null){
			vo.setNocState(stateMapper.convertEntity(dto.getNocState()));
		}
		if(dto.getPolicyType()!=null){
			vo.setPolicyType(insuranceTypeMapper.convertEntity(dto.getPolicyType()));
		}
		if(dto.getCompany()!=null){
			vo.setCompany(insuranceCompanyMapper.convertRequired(dto.getCompany()));
		}if(dto.getOwnerType()!=null){
			vo.setOwnerType(ownershipMapper.convertRequired(dto.getOwnerType()));
		}
		return vo;
	}
	
	@Override
	public OtherStateVahanCovMakerDTO convertVO(OtherStateCovVO vo) {
		OtherStateVahanCovMakerDTO dto = new OtherStateVahanCovMakerDTO();
		if(vo.getClassOfVehicle()!=null&&!vo.getClassOfVehicle().isEmpty()){
			dto.setClassOfVehicle(classOfVehiclesMapper.convertOtherStateDtoList(vo.getClassOfVehicle()));
		}if(vo.getOperator()!=null){
			dto.setOperator(makersMapper.convertVoVahanOS(vo.getOperator()));
		}
		if(vo.getMakerClass()!=null){
			dto.setMakerClass(masterVaraintMapper.convertVO(vo.getMakerClass()));
		}
		if(vo.getNocState()!=null){
			dto.setNocState(stateMapper.convertVO(vo.getNocState()));
		}
		if(vo.getPolicyType()!=null){
			dto.setPolicyType(insuranceTypeMapper.convertVO(vo.getPolicyType()));
		}
		if(vo.getCompany()!=null){
			dto.setCompany(insuranceCompanyMapper.convertVO(vo.getCompany()));
		}
		if(vo.getOwnerType()!=null){
			dto.setOwnerType(ownershipMapper.convertVO(vo.getOwnerType()));
		}
		return dto;
	}

}

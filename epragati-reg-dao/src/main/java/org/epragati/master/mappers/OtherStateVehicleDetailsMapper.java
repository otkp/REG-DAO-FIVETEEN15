package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.OtherStateVehicleDetailsDTO;
import org.epragati.master.vo.OtherStateVehicleDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtherStateVehicleDetailsMapper extends BaseMapper<OtherStateVehicleDetailsDTO, OtherStateVehicleDetailsVO>{

	@Autowired
	private InsuranceDetailsMapper insuranceDetailsMapper;
	
	@Autowired
	private FinanceDetailsMapper financeDetailsMapper;
	
	@Autowired
	private OtherStateGreenTaxDetailsMapper otherStateGreenTaxDetailsMapper;
	
	@Autowired
	private OtherStateNOCDetailsMapper otherStateNOCDetailsMapper;
	
	@Autowired
	private OtherStatePUCDetailsMapper otherStatePUCDetailsMapper;
	
	@Autowired
	private OtherStateTaxDetailsMapper otherStateTaxDetailsMapper;
	
	
	@Override
	public OtherStateVehicleDetailsVO convertEntity(OtherStateVehicleDetailsDTO dto) {
		OtherStateVehicleDetailsVO otherStateVehicleDetailsVO = new OtherStateVehicleDetailsVO();
		if(dto.getFinancierDetails() != null){
			otherStateVehicleDetailsVO.setFinancierDetails(financeDetailsMapper.convertEntity(dto.getFinancierDetails()));
		}
		if(dto.getInsuranceDetails() != null){
			otherStateVehicleDetailsVO.setOtherStateInsuranceDetails(insuranceDetailsMapper.convertEntity(dto.getInsuranceDetails()));
		}
		if(dto.getNocDetails() != null){
			otherStateVehicleDetailsVO.setNocDetails(otherStateNOCDetailsMapper.convertEntity(dto.getNocDetails()));
		}
		if(dto.getPucDetails() != null){
			otherStateVehicleDetailsVO.setPucDetails(otherStatePUCDetailsMapper.convertEntity(dto.getPucDetails()));
		}
		if(dto.getOtherStateTaxDetails() != null){
			otherStateVehicleDetailsVO.setOtherStateTaxDetailsDTO(otherStateTaxDetailsMapper.convertEntity(dto.getOtherStateTaxDetails()));
		}
		if(dto.getOtherStateGreenTaxDetails() != null){
			otherStateVehicleDetailsVO.setOtherStateGreenTaxDetailsDTO(otherStateGreenTaxDetailsMapper.convertEntity(dto.getOtherStateGreenTaxDetails()));
		}
		return otherStateVehicleDetailsVO;
	}
	
	@Override
	public OtherStateVehicleDetailsDTO convertVO(OtherStateVehicleDetailsVO vo) {
		OtherStateVehicleDetailsDTO otherStateVehicleDetailsDTO = new OtherStateVehicleDetailsDTO();
		if(vo.getFinancierDetails() != null){
			otherStateVehicleDetailsDTO.setFinancierDetails(financeDetailsMapper.convertVO(vo.getFinancierDetails()));
		}
		if(vo.getOtherStateInsuranceDetails() != null){
			otherStateVehicleDetailsDTO.setInsuranceDetails(insuranceDetailsMapper.convertVO(vo.getOtherStateInsuranceDetails()));
		}
		if(vo.getNocDetails() != null){
			otherStateVehicleDetailsDTO.setNocDetails(otherStateNOCDetailsMapper.convertVO(vo.getNocDetails()));
		}
		if(vo.getPucDetails() != null){
			otherStateVehicleDetailsDTO.setPucDetails(otherStatePUCDetailsMapper.convertVO(vo.getPucDetails()));
		}
		if(vo.getOtherStateTaxDetailsDTO() != null){
			otherStateVehicleDetailsDTO.setOtherStateTaxDetails(otherStateTaxDetailsMapper.convertVO(vo.getOtherStateTaxDetailsDTO()));
		}
		if(vo.getOtherStateGreenTaxDetailsDTO() != null){
			otherStateVehicleDetailsDTO.setOtherStateGreenTaxDetails(otherStateGreenTaxDetailsMapper.convertVO(vo.getOtherStateGreenTaxDetailsDTO()));
		}
		return otherStateVehicleDetailsDTO;
	}

}

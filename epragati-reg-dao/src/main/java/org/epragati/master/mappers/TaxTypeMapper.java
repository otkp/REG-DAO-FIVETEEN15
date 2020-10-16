package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.TaxTypeDTO;
import org.epragati.master.vo.TaxTypeVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class TaxTypeMapper extends BaseMapper<TaxTypeDTO, TaxTypeVO>{

	public TaxTypeVO taxTypeVO;
	public TaxTypeDTO taxTypeDTO;
	
	@Override
	public TaxTypeVO convertEntity(TaxTypeDTO taxTypeDTO) {
		taxTypeVO=new TaxTypeVO();
		funPoint(taxTypeDTO.getTaxId(), taxTypeVO::setTaxId);
		funPoint(taxTypeDTO.getTaxDescription(), taxTypeVO::setTaxDescription);
		funPoint(taxTypeDTO.getTaxCode(), taxTypeVO::setTaxCode);
		funPoint(taxTypeDTO.getStatus(), taxTypeVO::setStatus);
		funPoint(taxTypeDTO.getCreatedBy(), taxTypeVO::setCreatedBy);
		funPoint(taxTypeDTO.getCreatedDate(), taxTypeVO::setCreatedDate);
		funPoint(taxTypeDTO.getUpdatedBy(), taxTypeVO::setUpdatedBy);
		funPoint(taxTypeDTO.getlUpdate(), taxTypeVO::setlUpdate);
		return taxTypeVO;
	}
	@Override
	public List<TaxTypeVO> convertEntity(List<TaxTypeDTO> taxTypeDTOList) {
		return taxTypeDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	
	@Override
	public TaxTypeDTO convertVO(TaxTypeVO taxTypeVO) {
		taxTypeDTO=new TaxTypeDTO();
		funPoint(taxTypeVO.getTaxId(), taxTypeDTO::setTaxId);
		funPoint(taxTypeVO.getTaxDescription(), taxTypeDTO::setTaxDescription);
		funPoint(taxTypeVO.getTaxCode(), taxTypeDTO::setTaxCode);
		funPoint(taxTypeVO.getStatus(), taxTypeDTO::setStatus);
		funPoint(taxTypeVO.getCreatedBy(), taxTypeDTO::setCreatedBy);
		funPoint(taxTypeVO.getCreatedDate(), taxTypeDTO::setCreatedDate);
		funPoint(taxTypeVO.getUpdatedBy(), taxTypeDTO::setUpdatedBy);
		funPoint(taxTypeVO.getlUpdate(), taxTypeDTO::setlUpdate);
		return taxTypeDTO;
	}
	
	@Override
	public List<TaxTypeDTO> convertVO(List<TaxTypeVO> taxTypeVOList) {
		return taxTypeVOList.stream().map(e -> convertVO(e)).collect(Collectors.toList());
	}
	
	public TaxTypeVO convertRequired(TaxTypeDTO dto){
		taxTypeVO=new TaxTypeVO();
		funPoint(dto.getTaxId(), taxTypeVO::setTaxId);
		funPoint(dto.getTaxDescription(), taxTypeVO::setTaxDescription);
		funPoint(dto.getTaxCode(), taxTypeVO::setTaxCode);
		return taxTypeVO;
	}
	public List<TaxTypeVO> convertDTOs(List<TaxTypeDTO> dtos) {
		return dtos.stream().map(e -> convertRequired(e)).collect(Collectors.toList());
	}
}

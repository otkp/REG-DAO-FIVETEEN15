package org.epragati.regservice.mapper;


import java.util.List;
import java.util.stream.Collectors;

import org.epragati.aadhaarseeding.vo.AadhaarSeedVO;
/**
 * @author krishnarjun.pampana
 */
import org.epragati.common.dto.aadhaar.seed.AadhaarSeedDTO;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.mappers.ActionDetailsMapper;
import org.epragati.service.enclosure.mapper.EnclosuresLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AadhaarSeedMapper extends BaseMapper<AadhaarSeedDTO, AadhaarSeedVO> {
	@Autowired
	ActionDetailsMapper actionDetailsMapper;
	
	@Autowired
	EnclosuresLogMapper enclosuresLogMapper;

	@Override
	public AadhaarSeedVO convertEntity(AadhaarSeedDTO dto) {
		
		AadhaarSeedVO aadhaarSeedVO = new AadhaarSeedVO();
		
		funPoint(dto.getId(),aadhaarSeedVO::setId);
		funPoint(dto.getIssuedOfficeCode(),aadhaarSeedVO::setIssuedOfficeCode);
		funPoint(dto.getStatus(),aadhaarSeedVO::setStatus);
		
		funPoint(dto.getDob(),aadhaarSeedVO::setDob);
		funPoint(dto.getMobileNo(),aadhaarSeedVO::setMobileNo);
		funPoint(dto.getEmail(),aadhaarSeedVO::setEmail);
		funPoint(dto.getAadharNo(),aadhaarSeedVO::setAadharNo);
		if(dto.getActionDetails()!=null && dto.getActionDetails().size()>0)
		{
			aadhaarSeedVO.setActionDetails(actionDetailsMapper.convertEntity(dto.getActionDetails()));
				dto.getActionDetails().sort((o1, o2) -> o2.getActionDatetime().compareTo(o1.getActionDatetime()));
				aadhaarSeedVO.setComment(dto.getActionDetails().get(0).getReason());
				if(dto.getActionDetails().get(0) !=null)
				aadhaarSeedVO.setAadharApprovedDate(dto.getActionDetails().get(0).getActionDatetime());
			
			
		}
		if(dto.getLockedDetailsLog()!=null)
		{
			aadhaarSeedVO.setLockedDetailsLog(actionDetailsMapper.convertEntity(dto.getLockedDetailsLog()));
		}
		if(dto.getLockedDetails()!=null)
		{
		aadhaarSeedVO.setLockedDetails(actionDetailsMapper.convertEntity(dto.getLockedDetails()));
		}
		if(dto.getAadharResponse()!=null)
		{
			aadhaarSeedVO.setAadharResponse(dto.getAadharResponse());
		}
		if(dto.getEnclosures()!= null)
		{
			aadhaarSeedVO.setEnclosures(enclosuresLogMapper.convertNewEnclosures(dto.getEnclosures()));//(List<KeyValue<String, List<ImageVO>>> list --output
		}
		if(dto.getActionDetails()!=null && dto.getActionDetails().size()>0) {
			dto.getActionDetails().sort((o1, o2) -> o2.getActionDatetime().compareTo(o1.getActionDatetime()));
			aadhaarSeedVO.setComment(dto.getActionDetails().get(0).getReason());
		}
		funPoint(dto.getApprovalStage(),aadhaarSeedVO::setApprovalStage);
		funPoint(dto.getMatchCode(),aadhaarSeedVO::setMatchCode);
		funPoint(dto.getCreatedDate(),aadhaarSeedVO::setCreatedDate);
		funPoint(dto.getPrNo(),aadhaarSeedVO::setPrNo);
		if(dto.getOwnerShipType()!=null){
			funPoint(dto.getOwnerShipType(),aadhaarSeedVO::setOwnerShipType);
		}
		return aadhaarSeedVO;
		
	}
	
	
	@Override
	public AadhaarSeedDTO convertVO(AadhaarSeedVO vo) {
		 
		AadhaarSeedDTO aadhaarSeedDTO = new AadhaarSeedDTO();
		
		funPoint(vo.getId(),aadhaarSeedDTO::setId);
		funPoint(vo.getIssuedOfficeCode(),aadhaarSeedDTO::setIssuedOfficeCode);
		funPoint(vo.getStatus(),aadhaarSeedDTO::setStatus);
		funPoint(vo.getDob(),aadhaarSeedDTO::setDob);
		funPoint(vo.getMobileNo(),aadhaarSeedDTO::setMobileNo);
		funPoint(vo.getEmail(),aadhaarSeedDTO::setEmail);
		funPoint(vo.getAadharNo(),aadhaarSeedDTO::setAadharNo);
		/*if(vo.getActionDetails()!=null)
		{
			aadhaarSeedDTO.setActionDetails(actionMapper.convertVO(vo.getActionDetails()));
		}
		if(vo.getLockedDetailsLog()!=null)
		{
			aadhaarSeedDTO.setLockedDetailsLog(actionMapper.convertVO(vo.getLockedDetailsLog()));
		}
		if(vo.getLockedDetails()!=null)
		{
		aadhaarSeedDTO.setLockedDetails(actionMapper.convertVO(vo.getLockedDetails()));
		}*/
		funPoint(vo.getAadharNoAO(),aadhaarSeedDTO::setAadharNoAO);
		funPoint(vo.getAadharNoRTO(),aadhaarSeedDTO::setAadharNoRTO);
		if(vo.getAadharResponseRTO() !=null) {
			aadhaarSeedDTO.setAadharResponseRTO(vo.getAadharResponseRTO());
		}
		if(vo.getAadharResponseAO() !=null) {
			aadhaarSeedDTO.setAadharResponseAO(vo.getAadharResponseAO());
		}
		if(vo.getAadharResponse()!=null)
		{
			aadhaarSeedDTO.setAadharResponse(vo.getAadharResponse());
		}
		funPoint(vo.getApprovalStage(),aadhaarSeedDTO::setApprovalStage);
		funPoint(vo.getMatchCode(),aadhaarSeedDTO::setMatchCode);
        funPoint(vo.getCreatedDate(),aadhaarSeedDTO::setCreatedDate);
		
		return aadhaarSeedDTO;
		
	}
	
	@Override
	public List<AadhaarSeedVO> convertEntity(List<AadhaarSeedDTO> AadhaarSeedDTOList){
		return AadhaarSeedDTOList.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
		
	}
	
	@Override
	public List<AadhaarSeedDTO> convertVO(List<AadhaarSeedVO> sarathisyncVoList){
		return sarathisyncVoList.stream().map(e -> convertVO(e)).collect(Collectors.toList());
		
	}
	
	public AadhaarSeedVO convertRequiredEnclousersEntity(AadhaarSeedDTO dto) {
		AadhaarSeedVO aadhaarSeedVO = new AadhaarSeedVO();
		if(dto.getEnclosures()!= null)
		{
			aadhaarSeedVO.setEnclosures(enclosuresLogMapper.convertNewEnclosures(dto.getEnclosures()));//(List<KeyValue<String, List<ImageVO>>> list --output
		}
		return aadhaarSeedVO;
	}

}

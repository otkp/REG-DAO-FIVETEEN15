package org.epragati.payment.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.payment.dto.ChalanaDetailsDTO;
import org.epragati.payments.vo.ChalanaDetailsVO;
import org.springframework.stereotype.Component;

@Component
public class ChalanDetailsMapper extends BaseMapper<ChalanaDetailsDTO, ChalanaDetailsVO> {

	@Override
	public ChalanaDetailsVO convertEntity(ChalanaDetailsDTO dto) {
		ChalanaDetailsVO chalanaDetailsVO = new ChalanaDetailsVO();
		funPoint(dto.getApplicationNo(), chalanaDetailsVO::setApplicationNo);
		funPoint(dto.getGateWayType(), chalanaDetailsVO::setGateWayType);
		funPoint(dto.getChalanaNo(), chalanaDetailsVO::setChalanaNo);
		funPoint(dto.getModule(), chalanaDetailsVO::setModule);
		return chalanaDetailsVO;
	}

	@Override
	public ChalanaDetailsDTO convertVO(ChalanaDetailsVO vo) {
		ChalanaDetailsDTO dto = new ChalanaDetailsDTO();
		funPoint(vo.getApplicationNo(), dto::setApplicationNo);
		funPoint(vo.getGateWayType(), dto::setGateWayType);
		funPoint(vo.getChalanaNo(), dto::setChalanaNo);
		funPoint(vo.getModule(), dto::setModule);
		return dto;
	}

	public ChalanaDetailsDTO reconcilationMaper(ChalanaDetailsVO vo) {
		ChalanaDetailsDTO dto = new ChalanaDetailsDTO();
		funPoint(vo.getApplicationNo(), dto::setApplicationNo);
		funPoint(vo.getGateWayType(), dto::setGateWayType);
		funPoint(vo.getChalanaNo(), dto::setChalanaNo);
		funPoint(vo.getModule(), dto::setModule);
		funPoint(vo.getAmount(), dto::setAmount);
		funPoint(vo.getChallanDate(), dto::setChallanDate);
		funPoint(vo.getChallanNo(), dto::setChallanNo);
		funPoint(vo.getTresuryName(), dto::setTresuryName);
		funPoint(vo.getType(), dto::setType);

		return dto;
	}

	public List<ChalanaDetailsDTO> reconcilationMap(List<ChalanaDetailsVO> dtoList) {
		return dtoList.stream().map(val -> reconcilationMaper(val)).collect(Collectors.toList());

	}

}

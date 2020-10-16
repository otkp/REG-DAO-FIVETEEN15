package org.epragati.payment.mapper;

import java.util.List;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.payment.dto.ChalanaDetailsDTO;
import org.epragati.payment.dto.ReconcilationDTO;
import org.epragati.payments.vo.ReconcilationVO;
import org.epragati.vcrImage.dto.ConsolidateChallanDTO;
import org.epragati.vcrImage.mapper.ConsolidateChallanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReconcilationMapper extends BaseMapper<ReconcilationDTO, ReconcilationVO> {

	@Autowired
	private ChalanDetailsMapper ChalanDetailsMapper;

	@Autowired
	private ConsolidateChallanMapper consolidateChallanMapper;

	@Override
	public ReconcilationVO convertEntity(ReconcilationDTO dto) {

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReconcilationDTO convertVO(ReconcilationVO vo) {
		ReconcilationDTO reconcilationDTO = new ReconcilationDTO();
		List<ChalanaDetailsDTO> challanDTO = ChalanDetailsMapper.reconcilationMap(vo.getChallanDetails());
		reconcilationDTO.setChallanDetails(challanDTO);
		reconcilationDTO.setMviName(vo.getMviName());
		reconcilationDTO.setVcrBookedDate(vo.getVcrBookedDate());
		List<ConsolidateChallanDTO> consolidateDTO = consolidateChallanMapper.convertVO(vo.getConsolidatedDetails());
		// reconcilationDTO.setVcrDetails(vcFinalServiceMapper.limitedFields(vo.getVcrDetails()));
		reconcilationDTO.setConsolidateDetails(consolidateDTO);
		return reconcilationDTO;
	}

}

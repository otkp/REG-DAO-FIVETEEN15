package org.epragati.master.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.dealer.vo.TrIssuedVO;
import org.epragati.master.dto.TrGeneratedReportDTO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Krishnarjun Pampana
 *
 */
@Component
public class TrIssuedReportMapper extends BaseMapper<TrGeneratedReportDTO, TrIssuedVO> {

	@Override
	public List<TrIssuedVO> convertEntity(List<TrGeneratedReportDTO> dtos) {
		// TODO Auto-generated method stub
		List<TrIssuedVO> listOfVO = new ArrayList<>();
		for(TrGeneratedReportDTO dto : dtos) {
		TrIssuedVO vo = new TrIssuedVO();
		if(dto.getTrGeneratedDate()!=null) {
			funPoint(dto.getTrGeneratedDate().toLocalDate(), vo::setTrDate);
		}
		funPoint(dto.getTrNo(), vo::setTrNumber);
		funPoint(dto.getApplicantDisplayName(), vo::setApplicantName);
		funPoint(dto.getClassOfVehicleDesc(), vo::setClassOfVehicle);
		funPoint(dto.getMakersModel(), vo::setModelDesc);
		funPoint(dto.getChassisNumber(), vo::setChassisNumber);
		funPoint(dto.getEngineNumber(), vo::setEngineNumber);
		funPoint(dto.getManufacturedMonthYear(), vo::setMonthYear);
		
		if(dto.getInvoiceDate()!=null) {
			funPoint(dto.getInvoiceDate(), vo::setInvoiceDate);
		}
		funPoint(dto.getInvoiceNo(), vo::setInvoiceNumber);
		funPoint(dto.getInvoiceValue(), vo::setInvoiceValue);
		funPoint(dto.getTaxType(), vo::setTaxType);
		funPoint(dto.getTaxAmount(), vo::setTaxValue);
		funPoint(dto.getOfficeName(), vo::setRegistredOffice);
		if(StringUtils.isNotBlank(dto.getDealerId())) {
			funPoint(dto.getDealerId(),vo::setDealerName);
		}
		listOfVO.add(vo);
		}
        return listOfVO;
	}

	@Override
	public TrIssuedVO convertEntity(TrGeneratedReportDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}

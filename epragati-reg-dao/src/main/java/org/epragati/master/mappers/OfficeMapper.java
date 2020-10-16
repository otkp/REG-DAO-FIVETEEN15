package org.epragati.master.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.OfficeDTO;
import org.epragati.master.vo.OfficeVO;
import org.epragati.payment.report.vo.VCRNonPaymentDetailsVO;
import org.epragati.vcrImage.dto.VcrFinalServiceDTO;
import org.springframework.stereotype.Component;

/**
 * @author sairam.cheruku
 *
 */
@Component
public class OfficeMapper extends BaseMapper<OfficeDTO, OfficeVO> {

	@Override
	public OfficeVO convertEntity(OfficeDTO dto) {
		OfficeVO masterOfficeVO = new OfficeVO();
		funPoint(dto.getOfficeId(), masterOfficeVO::setOfficeId);
		funPoint(dto.getOfficeCode(), masterOfficeVO::setOfficeCode);
		funPoint(dto.getOfficeName(), masterOfficeVO::setOfficeName);
		funPoint(dto.getOfficeAddress1(), masterOfficeVO::setOfficeAddress1);
		funPoint(dto.getOfficeAddress2(), masterOfficeVO::setOfficeAddress2);
		funPoint(dto.getOfficeCity(), masterOfficeVO::setOfficeCity);
		funPoint(dto.getOfficeVillage(), masterOfficeVO::setOfficeVillage);
		funPoint(dto.getOfficeMandal(), masterOfficeVO::setOfficeMandal);
		funPoint(dto.getOfficeDist(), masterOfficeVO::setOfficeDist);
		funPoint(dto.getType(), masterOfficeVO::setOfficeType);
		funPoint(dto.getOffice(), masterOfficeVO::setOffice);
		funPoint(dto.getDdoCode(), masterOfficeVO::setOfficeDdo);
		funPoint(dto.getOfficeCode(), masterOfficeVO::setOfficeCode);
		funPoint(dto.getLongitude(), masterOfficeVO::setLongitude);
		funPoint(dto.getLatitude(), masterOfficeVO::setLatitude);
		funPoint(dto.getStatus(), masterOfficeVO::setStatus);
		// funPoint(dto.getCreatedDate(), masterOfficeVO::setCreatedDate);
		funPoint(dto.getLupdate(), masterOfficeVO::setLupdate);
		funPoint(dto.getHsrpOffice(), masterOfficeVO::setHsrpOffice);
		funPoint(dto.getOfficeNumberSeries(), masterOfficeVO::setOfficeNumberSeries);
		funPoint(dto.getPoliceNumberSeries(), masterOfficeVO::setPoliceNumberSeries);
		funPoint(dto.getDistrict(), masterOfficeVO::setDistrict);
		funPoint(dto.getReportingoffice(),masterOfficeVO::setReportingoffice);
		return masterOfficeVO;
	}

	public OfficeVO dashBoardLimitedFileds(OfficeDTO dto) {
		OfficeVO masterOfficeVO = new OfficeVO();
		funPoint(dto.getOfficeCode(), masterOfficeVO::setOfficeCode);
		funPoint(dto.getOfficeName(), masterOfficeVO::setOfficeName);
		return masterOfficeVO;

	}

	@Override
	public OfficeDTO convertVO(OfficeVO vo) {
		OfficeDTO masterOfficeDTO = new OfficeDTO();
		funPoint(vo.getOfficeId(), masterOfficeDTO::setOfficeId);
		funPoint(vo.getOfficeCode(), masterOfficeDTO::setOfficeCode);
		funPoint(vo.getOfficeName(), masterOfficeDTO::setOfficeName);
		funPoint(vo.getOfficeAddress1(), masterOfficeDTO::setOfficeAddress1);
		funPoint(vo.getOfficeAddress2(), masterOfficeDTO::setOfficeAddress2);
		funPoint(vo.getOfficeCity(), masterOfficeDTO::setOfficeCity);
		funPoint(vo.getOfficeVillage(), masterOfficeDTO::setOfficeVillage);
		funPoint(vo.getOfficeMandal(), masterOfficeDTO::setOfficeMandal);
		funPoint(vo.getOfficeDist(), masterOfficeDTO::setOfficeDist);
		funPoint(vo.getOfficeType(), masterOfficeDTO::setType);
		funPoint(vo.getOffice(), masterOfficeDTO::setOffice);
		funPoint(vo.getOfficeDdo(), masterOfficeDTO::setDdoCode);
		funPoint(vo.getOfficeCode(), masterOfficeDTO::setOfficeCode);
		funPoint(vo.getLongitude(), masterOfficeDTO::setLongitude);
		funPoint(vo.getLatitude(), masterOfficeDTO::setLatitude);
		funPoint(vo.getStatus(), masterOfficeDTO::setStatus);
		// funPoint(vo.getCreatedDate(), masterOfficeDTO::setCreatedDate);
		funPoint(vo.getLupdate(), masterOfficeDTO::setLupdate);
		funPoint(vo.getHsrpOffice(), masterOfficeDTO::setHsrpOffice);
		funPoint(vo.getOfficeNumberSeries(), masterOfficeDTO::setOfficeNumberSeries);
		funPoint(vo.getPoliceNumberSeries(), masterOfficeDTO::setPoliceNumberSeries);
		funPoint(vo.getReportingoffice(),masterOfficeDTO::setReportingoffice);
		return masterOfficeDTO;
	}

	
	public List<OfficeVO> dashBoardLimitedFiledsList(List<OfficeDTO> dtoList){
		  return dtoList.stream().map(e -> dashBoardLimitedFileds(e)).collect(Collectors.toList());
		}
}

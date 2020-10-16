package org.epragati.hsrp.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.epragati.common.dto.HsrpPayConfirmationDTO;
import org.epragati.common.mappers.BaseMapper;
import org.epragati.hsrp.vo.HSRPRTARequestModel;
import org.epragati.hsrp.vo.HsrpPayConfirmationVO;
import org.springframework.stereotype.Component;

@Component
public class HsrpPayConfirmationMapper extends BaseMapper<HsrpPayConfirmationDTO, HsrpPayConfirmationVO> {

	@Override
	public HsrpPayConfirmationVO convertEntity(HsrpPayConfirmationDTO dto) {
		// TODO--date needs use dateutils
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// convert String to LocalDate
		return null;
	}

	public HsrpPayConfirmationDTO convertVO(HSRPRTARequestModel vo) {
		// TODO--date needs use dateutils
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// convert String to LocalDate
		LocalDate paymentReceivedDate = LocalDate.parse(vo.getPaymentReceivedDate(), formatter);
		LocalDate orderDate = LocalDate.parse(vo.getOrderDate(), formatter);
		HsrpPayConfirmationDTO hsrpPayConfirmationDTO = new HsrpPayConfirmationDTO();
		funPoint(vo.getOrderNo(), hsrpPayConfirmationDTO::setOrderNumber);
		funPoint(orderDate, hsrpPayConfirmationDTO::setOrderDate);
		funPoint(paymentReceivedDate, hsrpPayConfirmationDTO::setPaymentReceivedDate);
		funPoint(vo.getTransactionStatus(), hsrpPayConfirmationDTO::setTransactionStatus);
		funPoint(String.valueOf(vo.getAmount()),hsrpPayConfirmationDTO::setHsrpfee);
		return hsrpPayConfirmationDTO;
	}

}

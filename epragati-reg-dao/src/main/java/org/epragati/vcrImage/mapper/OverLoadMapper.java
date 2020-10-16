package org.epragati.vcrImage.mapper;

import java.util.ArrayList;
import java.util.List;

import org.epragati.vcr.vo.InvoiceArrayVO;
import org.epragati.vcr.vo.InvoiceVO;
import org.epragati.vcr.vo.OverLoadVO;
import org.epragati.vcr.vo.PassengersVO;
import org.epragati.vcr.vo.WeighmentVO;
import org.epragati.vcrImage.dto.InvoiceArrayDTO;
import org.epragati.vcrImage.dto.InvoiceDTO;
import org.epragati.vcrImage.dto.OverLoadDTO;
import org.epragati.vcrImage.dto.PassengersDTO;
import org.epragati.vcrImage.dto.WeighmentDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OverLoadMapper {

	public OverLoadDTO changeVoToDTO(OverLoadVO vo) {
		OverLoadDTO overLoadDTO = new OverLoadDTO();

		if (vo.getWeighmentVO() != null) {
			WeighmentDTO weighmentDto = new WeighmentDTO();
			BeanUtils.copyProperties(vo.getWeighmentVO(), weighmentDto);
			overLoadDTO.setWeighmentDTO(weighmentDto);

		}
		if (vo.getInvoiceVO() != null) {
			InvoiceDTO invoiceDTO = new InvoiceDTO();
			List<InvoiceArrayDTO> listOfInvoice = new ArrayList<>();
			BeanUtils.copyProperties(vo.getInvoiceVO(), invoiceDTO);

			vo.getInvoiceVO().getInvoiceArray().forEach(invoice -> {
				InvoiceArrayDTO invoiceArrayDTO = new InvoiceArrayDTO();
				invoiceArrayDTO.setInvoiceDate(invoice.getInvoiceDate());
				invoiceArrayDTO.setCompanyName(invoice.getCompanyName());
				invoiceArrayDTO.setInvoiceNo(invoice.getInvoiceNo());
				invoiceArrayDTO.setInvoiceWeight(invoice.getInvoiceWeight());
				listOfInvoice.add(invoiceArrayDTO);
			});
			invoiceDTO.setInvoiceArray(listOfInvoice);
			overLoadDTO.setInvoiceDTO(invoiceDTO);
		}
		if (vo.getPassengersVO() != null) {
			PassengersDTO passengersDTO = new PassengersDTO();
			BeanUtils.copyProperties(vo.getPassengersVO(), passengersDTO);
			overLoadDTO.setPassengersDTO(passengersDTO);
		}

		return overLoadDTO;

	}
	
	public OverLoadVO changeDTOToVO(OverLoadDTO vo) {
		OverLoadVO overLoadDTO = new OverLoadVO();

		if (vo.getWeighmentDTO() != null) {
			WeighmentVO weighmentDto = new WeighmentVO();
			BeanUtils.copyProperties(vo.getWeighmentDTO(), weighmentDto);
			overLoadDTO.setWeighmentVO(weighmentDto);

		}
		if (vo.getInvoiceDTO() != null) {
			InvoiceVO invoiceDTO = new InvoiceVO();
			List<InvoiceArrayVO> listOfInvoice = new ArrayList<>();
			BeanUtils.copyProperties(vo.getInvoiceDTO(), invoiceDTO);

			vo.getInvoiceDTO().getInvoiceArray().forEach(invoice -> {
				InvoiceArrayVO invoiceArrayDTO = new InvoiceArrayVO();
				invoiceArrayDTO.setInvoiceDate(invoice.getInvoiceDate());
				invoiceArrayDTO.setCompanyName(invoice.getCompanyName());
				invoiceArrayDTO.setInvoiceNo(invoice.getInvoiceNo());
				invoiceArrayDTO.setInvoiceWeight(invoice.getInvoiceWeight());
				listOfInvoice.add(invoiceArrayDTO);
			});
			invoiceDTO.setInvoiceArray(listOfInvoice);
			overLoadDTO.setInvoiceVO(invoiceDTO);
		}
		if (vo.getPassengersDTO() != null) {
			PassengersVO passengersDTO = new PassengersVO();
			BeanUtils.copyProperties(vo.getPassengersDTO(), passengersDTO);
			overLoadDTO.setPassengersVO(passengersDTO);
		}

		return overLoadDTO;

	}

}

package org.epragati.master.mappers;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.InvoiceDetailsDTO;
import org.epragati.master.vo.InvoiceDetailsVO;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class InvoiceDetailsMapper extends BaseMapper<InvoiceDetailsDTO, InvoiceDetailsVO> {

	public InvoiceDetailsVO invoiceDetailsVO;
	public InvoiceDetailsDTO invoiceDetailsDTO;

	@Override
	public InvoiceDetailsVO convertEntity(InvoiceDetailsDTO invoiceDetailsDTO) {
		invoiceDetailsVO = new InvoiceDetailsVO();
		funPoint(invoiceDetailsDTO.getInvoiceNo(), invoiceDetailsVO::setInvoiceNo);
		funPoint(invoiceDetailsDTO.getInvoiceDate(), invoiceDetailsVO::setInvoiceDate);
		funPoint(invoiceDetailsDTO.getInvoiceValue(), invoiceDetailsVO::setInvoiceValue);
		funPoint(invoiceDetailsDTO.getInvoiceDateForOther(), invoiceDetailsVO::setInvoiceDateForOther);
		funPoint(invoiceDetailsDTO.getPurchaseDateForOther(), invoiceDetailsVO::setPurchaseDateForOther);
		funPoint(invoiceDetailsDTO.getInvoiceDateForOther(), invoiceDetailsVO::setInvoiceDate);
		return invoiceDetailsVO;
	}

	public InvoiceDetailsVO dashBoardLimitedFields(InvoiceDetailsDTO invoiceDetailsDTO) {
		invoiceDetailsVO = new InvoiceDetailsVO();
		funPoint(invoiceDetailsDTO.getInvoiceNo(), invoiceDetailsVO::setInvoiceNo);
		funPoint(invoiceDetailsDTO.getInvoiceValue(), invoiceDetailsVO::setInvoiceValue);
		return invoiceDetailsVO;
	}

	@Override
	public InvoiceDetailsDTO convertVO(InvoiceDetailsVO invoiceDetailsVO) {
		invoiceDetailsDTO = new InvoiceDetailsDTO();
		funPoint(invoiceDetailsVO.getInvoiceNo(), invoiceDetailsDTO::setInvoiceNo);
		funPoint(invoiceDetailsVO.getInvoiceDate(), invoiceDetailsDTO::setInvoiceDate);
		funPoint(invoiceDetailsVO.getInvoiceValue(), invoiceDetailsDTO::setInvoiceValue);
		funPoint(invoiceDetailsVO.getInvoiceDateForOther(), invoiceDetailsDTO::setInvoiceDateForOther);
		funPoint(invoiceDetailsVO.getPurchaseDateForOther(), invoiceDetailsDTO::setPurchaseDateForOther);
		return invoiceDetailsDTO;
	}

}

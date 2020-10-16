package org.epragati.vcrImage.dto;

import java.io.Serializable;

public class OverLoadDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private WeighmentDTO weighmentDTO;
	private InvoiceDTO invoiceDTO;
	private PassengersDTO passengersDTO;
	public WeighmentDTO getWeighmentDTO() {
		return weighmentDTO;
	}
	public void setWeighmentDTO(WeighmentDTO weighmentDTO) {
		this.weighmentDTO = weighmentDTO;
	}
	public InvoiceDTO getInvoiceDTO() {
		return invoiceDTO;
	}
	public void setInvoiceDTO(InvoiceDTO invoiceDTO) {
		this.invoiceDTO = invoiceDTO;
	}
	public PassengersDTO getPassengersDTO() {
		return passengersDTO;
	}
	public void setPassengersDTO(PassengersDTO passengersDTO) {
		this.passengersDTO = passengersDTO;
	}
	
	
	

}

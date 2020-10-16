package org.epragati.vcrImage.dto;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.payment.dto.ChalanaDetailsDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vcr_challan_logs")
public class VcrChallanLogsDTO extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String regNo;
	private String vcrNumber;
	private List<ChalanaDetailsDTO> challanDetails;
	private String recieptNo;
	private Integer offencetotal;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getVcrNumber() {
		return vcrNumber;
	}
	public void setVcrNumber(String vcrNumber) {
		this.vcrNumber = vcrNumber;
	}
	public List<ChalanaDetailsDTO> getChallanDetails() {
		return challanDetails;
	}
	public void setChallanDetails(List<ChalanaDetailsDTO> challanDetails) {
		this.challanDetails = challanDetails;
	}
	public String getRecieptNo() {
		return recieptNo;
	}
	public void setRecieptNo(String recieptNo) {
		this.recieptNo = recieptNo;
	}
	public Integer getOffencetotal() {
		return offencetotal;
	}
	public void setOffencetotal(Integer offencetotal) {
		this.offencetotal = offencetotal;
	}
	

}

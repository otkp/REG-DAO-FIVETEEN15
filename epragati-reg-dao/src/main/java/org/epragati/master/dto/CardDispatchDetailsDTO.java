package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Map;

import org.epragati.util.KeyValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection="registration_card_print_details")
public class CardDispatchDetailsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String prNo;
	
	private KeyValue<String, Map<String, String>> applicationNo;
	
	private String officeCode;
	
	private Map<String, String> printedBy;
	
	private String remarks;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Map<String, LocalDateTime> printedDateTime;
	
	private boolean isFlagChangedByRTO;

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public KeyValue<String, Map<String, String>> getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(KeyValue<String, Map<String, String>> applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public Map<String, String> getPrintedBy() {
		return printedBy;
	}

	public void setPrintedBy(Map<String, String> printedBy) {
		this.printedBy = printedBy;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Map<String, LocalDateTime> getPrintedDateTime() {
		return printedDateTime;
	}

	public void setPrintedDateTime(Map<String, LocalDateTime> printedDateTime) {
		this.printedDateTime = printedDateTime;
	}

	public boolean isFlagChangedByRTO() {
		return isFlagChangedByRTO;
	}

	public void setFlagChangedByRTO(boolean isFlagChangedByRTO) {
		this.isFlagChangedByRTO = isFlagChangedByRTO;
	}
	
}

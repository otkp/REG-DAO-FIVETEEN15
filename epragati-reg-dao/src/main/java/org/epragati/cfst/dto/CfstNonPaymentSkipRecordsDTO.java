package org.epragati.cfst.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "cfst_records")
public class CfstNonPaymentSkipRecordsDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6144863741133004564L;
	@Id
	private String prNo;
	
	private Boolean isCancelledthree; 
    
    private  Boolean isCancelled;
    
    private Boolean  isNoc;
    
    private Boolean  isStop;
    
    private Boolean  isScrtStu;

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public Boolean getIsCancelledthree() {
		return isCancelledthree;
	}

	public void setIsCancelledthree(Boolean isCancelledthree) {
		this.isCancelledthree = isCancelledthree;
	}

	public Boolean getIsCancelled() {
		return isCancelled;
	}

	public void setIsCancelled(Boolean isCancelled) {
		this.isCancelled = isCancelled;
	}

	public Boolean getIsNoc() {
		return isNoc;
	}

	public void setIsNoc(Boolean isNoc) {
		this.isNoc = isNoc;
	}

	public Boolean getIsStop() {
		return isStop;
	}

	public void setIsStop(Boolean isStop) {
		this.isStop = isStop;
	}

	public Boolean getIsScrtStu() {
		return isScrtStu;
	}

	public void setIsScrtStu(Boolean isScrtStu) {
		this.isScrtStu = isScrtStu;
	}
    
    
}

package org.epragati.master.dto;

import java.time.LocalDateTime;

import org.epragati.permits.dto.PermitDetailsDTO;
import org.epragati.util.CorrectionEnum;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Document(collection = "rto_corrections")
public class RTOCorrections {
	
	private String prNo;
	
	private TaxDetailsDTO oldTaxDetails;
	
	private TaxDetailsDTO updatedTaxDetails;
	
	private FcDetailsDTO oldFcDetails;
	
	private FcDetailsDTO updatedFcDetails;
	
	private PermitDetailsDTO oldPermitDetails;
	
	private PermitDetailsDTO updatedPermitDetails;
	
	private RegistrationDetailsDTO oldRegistrationDetails;
	
	private RegistrationDetailsDTO updatedRegistrationDetails;
	
	private CorrectionEnum correctModule;
	
	private String correctedBy;
	 
	private LocalDateTime correctedDate;

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	public TaxDetailsDTO getOldTaxDetails() {
		return oldTaxDetails;
	}

	public void setOldTaxDetails(TaxDetailsDTO oldTaxDetails) {
		this.oldTaxDetails = oldTaxDetails;
	}

	public TaxDetailsDTO getUpdatedTaxDetails() {
		return updatedTaxDetails;
	}

	public void setUpdatedTaxDetails(TaxDetailsDTO updatedTaxDetails) {
		this.updatedTaxDetails = updatedTaxDetails;
	}

	public FcDetailsDTO getOldFcDetails() {
		return oldFcDetails;
	}

	public void setOldFcDetails(FcDetailsDTO oldFcDetails) {
		this.oldFcDetails = oldFcDetails;
	}

	public FcDetailsDTO getUpdatedFcDetails() {
		return updatedFcDetails;
	}

	public void setUpdatedFcDetails(FcDetailsDTO updatedFcDetails) {
		this.updatedFcDetails = updatedFcDetails;
	}

	public PermitDetailsDTO getOldPermitDetails() {
		return oldPermitDetails;
	}

	public void setOldPermitDetails(PermitDetailsDTO oldPermitDetails) {
		this.oldPermitDetails = oldPermitDetails;
	}

	public PermitDetailsDTO getUpdatedPermitDetails() {
		return updatedPermitDetails;
	}

	public void setUpdatedPermitDetails(PermitDetailsDTO updatedPermitDetails) {
		this.updatedPermitDetails = updatedPermitDetails;
	}

	public RegistrationDetailsDTO getOldRegistrationDetails() {
		return oldRegistrationDetails;
	}

	public void setOldRegistrationDetails(RegistrationDetailsDTO oldRegistrationDetails) {
		this.oldRegistrationDetails = oldRegistrationDetails;
	}

	public RegistrationDetailsDTO getUpdatedRegistrationDetails() {
		return updatedRegistrationDetails;
	}

	public void setUpdatedRegistrationDetails(RegistrationDetailsDTO updatedRegistrationDetails) {
		this.updatedRegistrationDetails = updatedRegistrationDetails;
	}

	public CorrectionEnum getCorrectModule() {
		return correctModule;
	}

	public void setCorrectModule(CorrectionEnum correctModule) {
		this.correctModule = correctModule;
	}

	public String getCorrectedBy() {
		return correctedBy;
	}

	public void setCorrectedBy(String correctedBy) {
		this.correctedBy = correctedBy;
	}

	public LocalDateTime getCorrectedDate() {
		return correctedDate;
	}

	public void setCorrectedDate(LocalDateTime correctedDate) {
		this.correctedDate = correctedDate;
	}

}

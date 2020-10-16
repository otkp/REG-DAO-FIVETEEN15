package org.epragati.master.dto;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Document(collection = "master_automation")
public class AutomationDTO {
	
	private Boolean isOwnerTypeEnabled;
	
	private String ownerType;
	
	private AutomationCovsDTO nonTransportcovs;
	
	private AutomationCovsDTO transportCovs;
	
	private Double invoiceAmount;

	public Double getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(Double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public Boolean getIsOwnerTypeEnabled() {
		return isOwnerTypeEnabled;
	}

	public void setIsOwnerTypeEnabled(Boolean isOwnerTypeEnabled) {
		this.isOwnerTypeEnabled = isOwnerTypeEnabled;
	}

	public String getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public AutomationCovsDTO getNonTransportcovs() {
		return nonTransportcovs;
	}

	public void setNonTransportcovs(AutomationCovsDTO nonTransportcovs) {
		this.nonTransportcovs = nonTransportcovs;
	}

	public AutomationCovsDTO getTransportCovs() {
		return transportCovs;
	}

	public void setTransportCovs(AutomationCovsDTO transportCovs) {
		this.transportCovs = transportCovs;
	}

}

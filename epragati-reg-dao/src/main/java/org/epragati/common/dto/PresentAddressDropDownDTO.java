package org.epragati.common.dto;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Document(collection = "master_present_address")
public class PresentAddressDropDownDTO {
	
    private Boolean addressDropDownEnabled;
    
    private String ownerType;
	
	private List<String> addressItem;
	
    private Boolean isDeclarationEnabled;
	
    private String declarationStart;
	
	private List<DeclarationsDTO> declartionDetails;
	
	private String declarationEnd;

	public Boolean getIsDeclarationEnabled() {
		return isDeclarationEnabled;
	}

	public void setIsDeclarationEnabled(Boolean isDeclarationEnabled) {
		this.isDeclarationEnabled = isDeclarationEnabled;
	}

	public String getDeclarationStart() {
		return declarationStart;
	}

	public void setDeclarationStart(String declarationStart) {
		this.declarationStart = declarationStart;
	}

	public List<DeclarationsDTO> getDeclartionDetails() {
		return declartionDetails;
	}

	public void setDeclartionDetails(List<DeclarationsDTO> declartionDetails) {
		this.declartionDetails = declartionDetails;
	}

	public String getDeclarationEnd() {
		return declarationEnd;
	}

	public void setDeclarationEnd(String declarationEnd) {
		this.declarationEnd = declarationEnd;
	}

	public Boolean getAddressDropDownEnabled() {
		return addressDropDownEnabled;
	}

	public void setAddressDropDownEnabled(Boolean addressDropDownEnabled) {
		this.addressDropDownEnabled = addressDropDownEnabled;
	}

	public String getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public List<String> getAddressItem() {
		return addressItem;
	}

	public void setAddressItem(List<String> addressItem) {
		this.addressItem = addressItem;
	}
	
	
}

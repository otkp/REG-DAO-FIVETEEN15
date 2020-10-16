package org.epragati.master.dto;

import org.epragati.regservice.dto.RegServiceDTO;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "collectionCorrectionLogs")
public class CollectionCorrectionDTO {

private RegServiceDTO regService;	
private  RegistrationDetailsDTO  regDetails;
/**
 * @return the regDetails
 */
public RegistrationDetailsDTO getRegDetails() {
	return regDetails;
}
/**
 * @param regDetails the regDetails to set
 */
public void setRegDetails(RegistrationDetailsDTO regDetails) {
	this.regDetails = regDetails;
}
/**
 * @return the regService
 */
public RegServiceDTO getRegService() {
	return regService;
}
/**
 * @param regService the regService to set
 */
public void setRegService(RegServiceDTO regService) {
	this.regService = regService;
}

}

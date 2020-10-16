package org.epragati.common.dto;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dealer_declarations")
public class DealerDeclarationsDTO {
	
  private String applicationNo;
  
  private List<DeclarationsDTO> declartions;
  
  private LocalDate createdDate;
  

public LocalDate getCreatedDate() {
	return createdDate;
}

public void setCreatedDate(LocalDate createdDate) {
	this.createdDate = createdDate;
}

public String getApplicationNo() {
	return applicationNo;
}

public void setApplicationNo(String applicationNo) {
	this.applicationNo = applicationNo;
}

public List<DeclarationsDTO> getDeclartions() {
	return declartions;
}

public void setDeclartions(List<DeclarationsDTO> declartions) {
	this.declartions = declartions;
}
}

package org.epragati.secondvehicle.dto;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "master_secondvehicle_results")
public class SecondVehicleSearchResultsDTO {
	@Id
	private String applicationNo;

	private List<SecondVehicleResultsDTO> svResults;

	/**
	 * @param applicationNo
	 *            the applicationNo to set
	 */
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	/**
	 * @return the svResults
	 */
	public List<SecondVehicleResultsDTO> getSvResults() {
		return svResults;
	}

	/**
	 * @param svResults the svResults to set
	 */
	public void setSvResults(List<SecondVehicleResultsDTO> svResults) {
		this.svResults = svResults;
	}

	/**
	 * @return the applicationNo
	 */
	public String getApplicationNo() {
		return applicationNo;
	}

}

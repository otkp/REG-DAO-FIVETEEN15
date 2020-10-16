package org.epragati.master.dto;


import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author sai.naganaboyena
 *
 */
@Document(collection = "eibt_institute_vehicle_details_log")
public class EductaionInstituteVehicleDetailsLogDto extends BaseEntity{
	private static final long serialVersionUID = -2049605922960067126L;
	
	
	private EductaionInstituteVehicleDetailsDto eductaionInstituteVehicleDetails;


	/**
	 * @return the eductaionInstituteVehicleDetails
	 */
	public EductaionInstituteVehicleDetailsDto getEductaionInstituteVehicleDetails() {
		return eductaionInstituteVehicleDetails;
	}


	/**
	 * @param eductaionInstituteVehicleDetails the eductaionInstituteVehicleDetails to set
	 */
	public void setEductaionInstituteVehicleDetails(EductaionInstituteVehicleDetailsDto eductaionInstituteVehicleDetails) {
		this.eductaionInstituteVehicleDetails = eductaionInstituteVehicleDetails;
	}

	
}

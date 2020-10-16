package org.epragati.dto.enclosure;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "uploaded_excel")
public class UploadExcelDTO implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 3410244598915289058L;

	@Id
	private Long id;

	private String rcNo;

	private String ownersName;

	private LocalDate hpaDate;

	private String financierName;

	private String typeOfVehicle;

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	private String typeOfOwnerShip;

	private String extension;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRcNo() {
		return rcNo;
	}

	public void setRcNo(String rcNo) {
		this.rcNo = rcNo;
	}

	public String getOwnersName() {
		return ownersName;
	}

	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}

	public LocalDate getHpaDate() {
		return hpaDate;
	}

	public void setHpaDate(LocalDate hpaDate) {
		this.hpaDate = hpaDate;
	}

	public String getFinancierName() {
		return financierName;
	}

	public void setFinancierName(String financierName) {
		this.financierName = financierName;
	}

	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}

	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}

	public String getTypeOfOwnerShip() {
		return typeOfOwnerShip;
	}

	public void setTypeOfOwnerShip(String typeOfOwnerShip) {
		this.typeOfOwnerShip = typeOfOwnerShip;
	}

}

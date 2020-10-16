package org.epragati.dto.enclosure;

import java.time.LocalDate;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author madhu.uppu
 *
 */
@Document(collection = "financier_uploaded_details")
@CompoundIndexes({ @CompoundIndex(name = "Indx_rcNo", def = "{'rcNo': 1}") })
public class FinancerUploadedDetailsDTO extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@Id
	private String id;

	private String rcNo;

	private String ownersName;

	private LocalDate hpaDate;

	private String financierName;

	private String typeOfVehicle;

	private String typeOfOwnwerShip;

	private FinacierDetailsDTO finacierDetails;

	private Boolean isVerified = Boolean.TRUE;

	private String actionTaken;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the rcNo
	 */
	public String getRcNo() {
		return rcNo;
	}

	/**
	 * @param rcNo the rcNo to set
	 */
	public void setRcNo(String rcNo) {
		this.rcNo = rcNo;
	}

	/**
	 * @return the ownersName
	 */
	public String getOwnersName() {
		return ownersName;
	}

	/**
	 * @param ownersName the ownersName to set
	 */
	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}

	/**
	 * @return the hpaDate
	 */
	public LocalDate getHpaDate() {
		return hpaDate;
	}

	/**
	 * @param hpaDate the hpaDate to set
	 */
	public void setHpaDate(LocalDate hpaDate) {
		this.hpaDate = hpaDate;
	}

	/**
	 * @return the financierName
	 */
	public String getFinancierName() {
		return financierName;
	}

	/**
	 * @param financierName the financierName to set
	 */
	public void setFinancierName(String financierName) {
		this.financierName = financierName;
	}

	/**
	 * @return the typeOfVehicle
	 */
	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}

	/**
	 * @param typeOfVehicle the typeOfVehicle to set
	 */
	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}

	/**
	 * @return the typeOfOwnwerShip
	 */
	public String getTypeOfOwnwerShip() {
		return typeOfOwnwerShip;
	}

	/**
	 * @param typeOfOwnwerShip the typeOfOwnwerShip to set
	 */
	public void setTypeOfOwnwerShip(String typeOfOwnwerShip) {
		this.typeOfOwnwerShip = typeOfOwnwerShip;
	}

	/**
	 * @return the finacierDetails
	 */
	public FinacierDetailsDTO getFinacierDetails() {
		return finacierDetails;
	}

	/**
	 * @param finacierDetails the finacierDetails to set
	 */
	public void setFinacierDetails(FinacierDetailsDTO finacierDetails) {
		this.finacierDetails = finacierDetails;
	}

	/**
	 * @return the isVerified
	 */
	public Boolean getIsVerified() {
		return isVerified;
	}

	/**
	 * @param isVerified the isVerified to set
	 */
	public void setIsVerified(Boolean isVerified) {
		this.isVerified = isVerified;
	}

	/**
	 * @return the actionTaken
	 */
	public String getActionTaken() {
		return actionTaken;
	}

	/**
	 * @param actionTaken the actionTaken to set
	 */
	public void setActionTaken(String actionTaken) {
		this.actionTaken = actionTaken;
	}

}

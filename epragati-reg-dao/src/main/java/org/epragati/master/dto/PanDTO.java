package org.epragati.master.dto;

import java.io.Serializable;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author saroj.sahoo
 *
 */

@Document(collection = "pan_details")
public class PanDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String status;
	@Id
	private String panNumber;
	private String isValid;
	private String firstName;
	private String lastName;
	private String middleName;
	private String salutation;
	private String panUpdatedDateAtITDEnd;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the panNumber
	 */
	public String getPanNumber() {
		return panNumber;
	}

	/**
	 * @param panNumber the panNumber to set
	 */
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	/**
	 * @return the isValid
	 */
	public String getIsValid() {
		return isValid;
	}

	/**
	 * @param isValid the isValid to set
	 */
	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the salutation
	 */
	public String getSalutation() {
		return salutation;
	}

	/**
	 * @param salutation the salutation to set
	 */
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getPanUpdatedDateAtITDEnd() {
		return panUpdatedDateAtITDEnd;
	}

	public void setPanUpdatedDateAtITDEnd(String panUpdatedDateAtITDEnd) {
		this.panUpdatedDateAtITDEnd = panUpdatedDateAtITDEnd;
	}

	@Override
	public String toString() {
		return "PanResultDTO [status=" + status + ", panNumber=" + panNumber + ", isValid=" + isValid + ", firstName="
				+ firstName + ", lastName=" + lastName + ", middleName=" + middleName + ", salutation=" + salutation
				+ ", panUpdatedDateAtITDEnd=" + panUpdatedDateAtITDEnd + "]";
	}

}

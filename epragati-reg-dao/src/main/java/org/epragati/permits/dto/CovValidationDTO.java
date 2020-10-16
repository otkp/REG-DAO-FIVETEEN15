package org.epragati.permits.dto;

import java.util.List;

import org.epragati.constants.OwnerTypeEnum;

public class CovValidationDTO {
	private Integer weight;
	private String axleType;
	private Integer seatingCapacityFrom;
	private Integer seatingCapacityTo;
	private List<OwnerTypeEnum> ownerType;

	/**
	 * @return the weight
	 */
	public Integer getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	/**
	 * @return the axleType
	 */
	public String getAxleType() {
		return axleType;
	}

	/**
	 * @param axleType
	 *            the axleType to set
	 */
	public void setAxleType(String axleType) {
		this.axleType = axleType;
	}

	/**
	 * @return the seatingCapacityFrom
	 */
	public Integer getSeatingCapacityFrom() {
		return seatingCapacityFrom;
	}

	/**
	 * @param seatingCapacityFrom
	 *            the seatingCapacityFrom to set
	 */
	public void setSeatingCapacityFrom(Integer seatingCapacityFrom) {
		this.seatingCapacityFrom = seatingCapacityFrom;
	}

	/**
	 * @return the seatingCapacityTo
	 */
	public Integer getSeatingCapacityTo() {
		return seatingCapacityTo;
	}

	/**
	 * @param seatingCapacityTo
	 *            the seatingCapacityTo to set
	 */
	public void setSeatingCapacityTo(Integer seatingCapacityTo) {
		this.seatingCapacityTo = seatingCapacityTo;
	}

	/**
	 * @return the ownerType
	 */
	public List<OwnerTypeEnum> getOwnerType() {
		return ownerType;
	}

	/**
	 * @param ownerType the ownerType to set
	 */
	public void setOwnerType(List<OwnerTypeEnum> ownerType) {
		this.ownerType = ownerType;
	}
	
	
}

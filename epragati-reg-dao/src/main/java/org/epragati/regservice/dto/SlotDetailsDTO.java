package org.epragati.regservice.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.epragati.util.StatusRegistration;
import org.epragati.util.payment.ServiceEnum;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "slot_details")
public class SlotDetailsDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate slotDate;
	private String slotTime;
	@JsonFormat(pattern = "dd-MM-yyyy HH:MM:SS")
	private LocalDateTime createdDate;
	private String status;
	private String statusComment;
	private ServiceEnum serviceType;
	private StatusRegistration paymentStatus;
	private String ipAddress;
	
	
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	/**
	 * @return the testSlotDate
	 */
	public LocalDate getSlotDate() {
		return slotDate;
	}
	/**
	 * @param testSlotDate the testSlotDate to set
	 */
	public void setSlotDate(LocalDate testSlotDate) {
		this.slotDate = testSlotDate;
	}
	/**
	 * @return the slotTime
	 */
	public String getSlotTime() {
		return slotTime;
	}
	/**
	 * @param slotTime the slotTime to set
	 */
	public void setSlotTime(String slotTime) {
		this.slotTime = slotTime;
	}
	/**
	 * @return the slotCreatedDate
	 */
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param slotCreatedDate the slotCreatedDate to set
	 */
	public void setCreatedDate(LocalDateTime slotCreatedDate) {
		this.createdDate = slotCreatedDate;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the statusComment
	 */
	public String getStatusComment() {
		return statusComment;
	}
	/**
	 * @param statusComment the statusComment to set
	 */
	public void setStatusComment(String statusComment) {
		this.statusComment = statusComment;
	}
	/**
	 * @return the serviceType
	 */
	public ServiceEnum getServiceType() {
		return serviceType;
	}
	/**
	 * @param serviceType the serviceType to set
	 */
	public void setServiceType(ServiceEnum serviceType) {
		this.serviceType = serviceType;
	}
	/**
	 * @return the paymentStatus
	 */
	public StatusRegistration getPaymentStatus() {
		return paymentStatus;
	}
	/**
	 * @param paymentStatus the paymentStatus to set
	 */
	public void setPaymentStatus(StatusRegistration paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

}

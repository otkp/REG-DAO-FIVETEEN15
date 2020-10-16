package org.epragati.common.dto;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "Prajaasachivalayam_Details")
public class PrajaasachivalayamDTO {
	@Id
	private String applicationNo;
	private String ps_transaction_id;
	private String department_transaction_id;
	private String benficiary_id;
	private Integer status_Code;
	private String status_message;
	private String remarks;
	private String ps_userName;
	private String ps_password;
	private String ps_return_Url;
	private Integer service_id;
	private String dept_id;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime createdDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime lUpdate;
	private boolean status;
	
	
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDateTime getlUpdate() {
		return lUpdate;
	}
	public void setlUpdate(LocalDateTime lUpdate) {
		this.lUpdate = lUpdate;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getPs_transaction_id() {
		return ps_transaction_id;
	}
	public void setPs_transaction_id(String ps_transaction_id) {
		this.ps_transaction_id = ps_transaction_id;
	}
	public String getDepartment_transaction_id() {
		return department_transaction_id;
	}
	public void setDepartment_transaction_id(String department_transaction_id) {
		this.department_transaction_id = department_transaction_id;
	}
	public String getBenficiary_id() {
		return benficiary_id;
	}
	public void setBenficiary_id(String benficiary_id) {
		this.benficiary_id = benficiary_id;
	}
	public Integer getStatus_Code() {
		return status_Code;
	}
	public void setStatus_Code(Integer status_Code) {
		this.status_Code = status_Code;
	}
	public String getStatus_message() {
		return status_message;
	}
	public void setStatus_message(String status_message) {
		this.status_message = status_message;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getPs_userName() {
		return ps_userName;
	}
	public void setPs_userName(String ps_userName) {
		this.ps_userName = ps_userName;
	}
	public String getPs_password() {
		return ps_password;
	}
	public void setPs_password(String ps_password) {
		this.ps_password = ps_password;
	}
	public String getPs_return_Url() {
		return ps_return_Url;
	}
	public void setPs_return_Url(String ps_return_Url) {
		this.ps_return_Url = ps_return_Url;
	}
	@Override
	public String toString() {
		return "PrajaasachivalayamDTO [ps_transaction_id=" + ps_transaction_id + ", department_transaction_id="
				+ department_transaction_id + ", benficiary_id=" + benficiary_id + ", status_Code=" + status_Code
				+ ", status_message=" + status_message + ", remarks=" + remarks + ", ps_userName=" + ps_userName
				+ ", ps_password=" + ps_password + ", ps_return_Url=" + ps_return_Url + ", applicationNo="
				+ applicationNo + "]";
	}
	public Integer getService_id() {
		return service_id;
	}
	public void setService_id(Integer service_id) {
		this.service_id = service_id;
	}
	public String getDept_id() {
		return dept_id;
	}
	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}   
	   
}

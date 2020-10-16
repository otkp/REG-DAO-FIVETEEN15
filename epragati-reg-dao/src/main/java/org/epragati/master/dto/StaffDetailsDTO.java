package org.epragati.master.dto;

public class StaffDetailsDTO {
	private String name;
	private QualificationDTO qualification;
	private String role;
	private String aadharNo;
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public QualificationDTO getQualification() {
		return qualification;
	}
	public void setQualification(QualificationDTO qualification) {
		this.qualification = qualification;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}

package org.epragati.master.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;

//@Document(collection = "motor_driving_school_representative_details")

public class MotorDrivingSchoolRepresentativeDTO extends BaseEntity{

	@Id
	private String applicationNo;
	private String aadhaarNo;
	
	private String mobileNo;
	
	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getAadhaarNo() {
		return aadhaarNo;
	}

	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getRepresentativeName() {
		return representativeName;
	}

	public void setRepresentativeName(String representativeName) {
		this.representativeName = representativeName;
	}

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	private String representativeName;
	
	private String schoolId;

}

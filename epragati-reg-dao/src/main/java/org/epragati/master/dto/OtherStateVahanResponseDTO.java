package org.epragati.master.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="other_state_vahan_response")
public class OtherStateVahanResponseDTO extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7620203599467345137L;
	
	@Id
	private String prNo;
	
	private OtherStateVahanRegDTO otherStateVahanRegDto;

	private OtherStateVahanCovMakerDTO otherStateVahanCovMakerDto;
	
	

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the otherStateVahanRegDto
	 */
	public OtherStateVahanRegDTO getOtherStateVahanRegDto() {
		return otherStateVahanRegDto;
	}

	/**
	 * @param otherStateVahanRegDto the otherStateVahanRegDto to set
	 */
	public void setOtherStateVahanRegDto(OtherStateVahanRegDTO otherStateVahanRegDto) {
		this.otherStateVahanRegDto = otherStateVahanRegDto;
	}

	/**
	 * @return the otherStateVahanCovMakerDto
	 */
	public OtherStateVahanCovMakerDTO getOtherStateVahanCovMakerDto() {
		return otherStateVahanCovMakerDto;
	}

	/**
	 * @param otherStateVahanCovMakerDto the otherStateVahanCovMakerDto to set
	 */
	public void setOtherStateVahanCovMakerDto(OtherStateVahanCovMakerDTO otherStateVahanCovMakerDto) {
		this.otherStateVahanCovMakerDto = otherStateVahanCovMakerDto;
	}
	
	
}
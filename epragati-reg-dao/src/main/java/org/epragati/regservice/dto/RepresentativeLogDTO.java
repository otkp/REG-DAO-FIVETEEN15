package org.epragati.regservice.dto;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@Document(collection = "citizen_users_logs")
public class RepresentativeLogDTO extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private RepresentativeDTO representativeDTO;

	private Boolean isActive;

	public RepresentativeDTO getRepresentativeDTO() {
		return representativeDTO;
	}

	public void setRepresentativeDTO(RepresentativeDTO representativeDTO) {
		this.representativeDTO = representativeDTO;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "RepresentativeLogDTO [representativeDTO=" + representativeDTO + ", isActive=" + isActive + "]";
	}

}

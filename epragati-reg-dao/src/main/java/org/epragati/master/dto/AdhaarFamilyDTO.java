package org.epragati.master.dto;

import java.io.Serializable;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author naga.pulaparthi
 *
 */
@Document(collection = "aadhaar_family_details")
@CompoundIndexes({
	@CompoundIndex(name = "aadhaarNosIdx", def = "{'aadhaarNos': 1}"),
	@CompoundIndex(name = "memberDetailsPrNoIdx", def = "{'memberDetails.prNo': 1}")
})
public class AdhaarFamilyDTO extends BaseEntity implements Serializable {

	private static final long serialVersionUID = -5694842593217202657L;

	private List<String> aadhaarNos;
	
	private List<MemberDetails> memberDetails;

	/**
	 * @return the aadhaarNos
	 */
	public List<String> getAadhaarNos() {
		return aadhaarNos;
	}

	/**
	 * @param aadhaarNos the aadhaarNos to set
	 */
	public void setAadhaarNos(List<String> aadhaarNos) {
		this.aadhaarNos = aadhaarNos;
	}

	/**
	 * @return the memberDetails
	 */
	public List<MemberDetails> getMemberDetails() {
		return memberDetails;
	}

	/**
	 * @param memberDetails the memberDetails to set
	 */
	public void setMemberDetails(List<MemberDetails> memberDetails) {
		this.memberDetails = memberDetails;
	}

	

}

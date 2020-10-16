package org.epragati.regservice.mapper;

import java.util.List;

import org.epragati.aadhaar.AadhaarDetailsRequestVO;
import org.epragati.master.vo.FcDetailsVO;
import org.epragati.master.vo.RegistrationDetailsVO;
import org.epragati.permits.vo.PermitDetailsVO;
import org.epragati.rta.vo.RegistrationCardDetailsVO;
import org.epragati.rta.vo.RegistrationCorrectionsVO;
import org.epragati.util.CorrectionEnum;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public class TaxDataVO {

	private RegistrationDetailsVO registrationDetails;

	private PermitDetailsVO permitDetailsVO;

	private List<PermitDetailsVO> permitDetailsList;

	private TaxDetailsMasterVO taxDetailsMasterVO;

	public AadhaarDetailsRequestVO aadhaarDetailsRequestVO;

	private FcDetailsVO fcDetailsVO;

	private RegistrationCardDetailsVO registrationCardDetailsVO;

	private String prNo;

	private Integer mId;

	private List<CorrectionEnum> correctionServices;

	private RegistrationCorrectionsVO registrationCorrectionsVO;

	public RegistrationDetailsVO getRegistrationDetails() {
		return registrationDetails;
	}

	public void setRegistrationDetails(RegistrationDetailsVO registrationDetails) {
		this.registrationDetails = registrationDetails;
	}

	public PermitDetailsVO getPermitDetailsVO() {
		return permitDetailsVO;
	}

	public void setPermitDetailsVO(PermitDetailsVO permitDetailsVO) {
		this.permitDetailsVO = permitDetailsVO;
	}

	public List<PermitDetailsVO> getPermitDetailsList() {
		return permitDetailsList;
	}

	public void setPermitDetailsList(List<PermitDetailsVO> permitDetailsList) {
		this.permitDetailsList = permitDetailsList;
	}

	public TaxDetailsMasterVO getTaxDetailsMasterVO() {
		return taxDetailsMasterVO;
	}

	public void setTaxDetailsMasterVO(TaxDetailsMasterVO taxDetailsMasterVO) {
		this.taxDetailsMasterVO = taxDetailsMasterVO;
	}

	public AadhaarDetailsRequestVO getAadhaarDetailsRequestVO() {
		return aadhaarDetailsRequestVO;
	}

	public void setAadhaarDetailsRequestVO(AadhaarDetailsRequestVO aadhaarDetailsRequestVO) {
		this.aadhaarDetailsRequestVO = aadhaarDetailsRequestVO;
	}

	public FcDetailsVO getFcDetailsVO() {
		return fcDetailsVO;
	}

	public void setFcDetailsVO(FcDetailsVO fcDetailsVO) {
		this.fcDetailsVO = fcDetailsVO;
	}

	public RegistrationCardDetailsVO getRegistrationCardDetailsVO() {
		return registrationCardDetailsVO;
	}

	public void setRegistrationCardDetailsVO(RegistrationCardDetailsVO registrationCardDetailsVO) {
		this.registrationCardDetailsVO = registrationCardDetailsVO;
	}

	public String getPrNo() {
		return prNo;
	}

	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the mId
	 */
	public Integer getmId() {
		return mId;
	}

	/**
	 * @param mId
	 *            the mId to set
	 */
	public void setmId(Integer mId) {
		this.mId = mId;
	}

	/**
	 * @return the correctionServices
	 */
	public List<CorrectionEnum> getCorrectionServices() {
		return correctionServices;
	}

	/**
	 * @param correctionServices
	 *            the correctionServices to set
	 */
	public void setCorrectionServices(List<CorrectionEnum> correctionServices) {
		this.correctionServices = correctionServices;
	}

	/**
	 * @return the registrationCorrectionsVO
	 */
	public RegistrationCorrectionsVO getRegistrationCorrectionsVO() {
		return registrationCorrectionsVO;
	}

	/**
	 * @param registrationCorrectionsVO
	 *            the registrationCorrectionsVO to set
	 */
	public void setRegistrationCorrectionsVO(RegistrationCorrectionsVO registrationCorrectionsVO) {
		this.registrationCorrectionsVO = registrationCorrectionsVO;
	}

}

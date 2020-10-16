package org.epragati.master.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.epragati.common.dto.BaseEntity;
import org.epragati.permits.dto.PermitClassDTO;
import org.epragati.permits.dto.PermitGoodsDetailsDTO;
import org.epragati.permits.dto.PermitRouteDetails;
import org.epragati.permits.dto.PermitTypeDTO;
import org.epragati.permits.dto.PermitValidityDetailsDTO;
import org.epragati.permits.dto.STCTvehcleDetailsDTO;
import org.epragati.util.payment.ServiceEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sairam.cheruku
 *
 */
@Document(collection = "SAS_permit_details")
public class PermitDetails_last5d extends BaseEntity implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5900945815569386695L;

	@Id
	private String id;

	private String permitNo;

	private String permitAuthorizationNo;

	private String prNo;

	private PermitClassDTO permitClass;

	private PermitTypeDTO permitType;

	private PermitGoodsDetailsDTO goodsDetails;

	private PermitValidityDetailsDTO permitValidityDetails;

	private PermitRouteDetails routeDetails;

	private RegistrationDetailsDTO rdto;

	private String permitStatus;

	private boolean isPermitSurrender = false;

	private LocalDate permitSurrenderDate;

	private STCTvehcleDetailsDTO sTCTvehcleDetailsDTO;

	private List<ServiceEnum> serviceType;

	private Set<Integer> serviceIds;

	private Boolean isPermitSurrenderWithTOW;

	private String nonPermitPrNo;

	private Boolean isPermitSurrenderWithCOA;

	private Boolean isPermitDataEntry = Boolean.FALSE;

	private Boolean isRelacementOfVehicle = Boolean.FALSE;

	private LocalDate RelacementDate;

	private Boolean isRecommendationLetter = Boolean.FALSE;

	private String recomendationLetterNo;

	/**
	 * @return the isPermitSurrenderWithCOA
	 */
	public Boolean getIsPermitSurrenderWithCOA() {
		return isPermitSurrenderWithCOA;
	}

	/**
	 * @param isPermitSurrenderWithCOA
	 *            the isPermitSurrenderWithCOA to set
	 */
	public void setIsPermitSurrenderWithCOA(Boolean isPermitSurrenderWithCOA) {
		this.isPermitSurrenderWithCOA = isPermitSurrenderWithCOA;
	}

	/**
	 * @return the isPermitSurrenderWithTOW
	 */
	public Boolean getIsPermitSurrenderWithTOW() {
		return isPermitSurrenderWithTOW;
	}

	/**
	 * @param isPermitSurrenderWithTOW
	 *            the isPermitSurrenderWithTOW to set
	 */
	public void setIsPermitSurrenderWithTOW(Boolean isPermitSurrenderWithTOW) {
		this.isPermitSurrenderWithTOW = isPermitSurrenderWithTOW;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the permitNo
	 */
	public String getPermitNo() {
		return permitNo;
	}

	/**
	 * @param permitNo
	 *            the permitNo to set
	 */
	public void setPermitNo(String permitNo) {
		this.permitNo = permitNo;
	}

	/**
	 * @return the prNo
	 */
	public String getPrNo() {
		return prNo;
	}

	/**
	 * @param prNo
	 *            the prNo to set
	 */
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}

	/**
	 * @return the permitClass
	 */
	public PermitClassDTO getPermitClass() {
		return permitClass;
	}

	/**
	 * @param permitClass
	 *            the permitClass to set
	 */
	public void setPermitClass(PermitClassDTO permitClass) {
		this.permitClass = permitClass;
	}

	/**
	 * @return the permitType
	 */
	public PermitTypeDTO getPermitType() {
		return permitType;
	}

	/**
	 * @param permitType
	 *            the permitType to set
	 */
	public void setPermitType(PermitTypeDTO permitType) {
		this.permitType = permitType;
	}

	/**
	 * @return the goodsDetails
	 */
	public PermitGoodsDetailsDTO getGoodsDetails() {
		return goodsDetails;
	}

	/**
	 * @param goodsDetails
	 *            the goodsDetails to set
	 */
	public void setGoodsDetails(PermitGoodsDetailsDTO goodsDetails) {
		this.goodsDetails = goodsDetails;
	}

	/**
	 * @return the permitValidityDetails
	 */
	public PermitValidityDetailsDTO getPermitValidityDetails() {
		return permitValidityDetails;
	}

	/**
	 * @param permitValidityDetails
	 *            the permitValidityDetails to set
	 */
	public void setPermitValidityDetails(PermitValidityDetailsDTO permitValidityDetails) {
		this.permitValidityDetails = permitValidityDetails;
	}

	/**
	 * @return the routeDetails
	 */
	public PermitRouteDetails getRouteDetails() {
		return routeDetails;
	}

	/**
	 * @param routeDetails
	 *            the routeDetails to set
	 */
	public void setRouteDetails(PermitRouteDetails routeDetails) {
		this.routeDetails = routeDetails;
	}

	/**
	 * @return the rdto
	 */
	public RegistrationDetailsDTO getRdto() {
		return rdto;
	}

	/**
	 * @param rdto
	 *            the rdto to set
	 */
	public void setRdto(RegistrationDetailsDTO rdto) {
		this.rdto = rdto;
	}

	/**
	 * @return the permitStatus
	 */
	public String getPermitStatus() {
		return permitStatus;
	}

	/**
	 * @param permitStatus
	 *            the permitStatus to set
	 */
	public void setPermitStatus(String permitStatus) {
		this.permitStatus = permitStatus;
	}

	/**
	 * @return the permitAuthorizationNo
	 */
	public String getPermitAuthorizationNo() {
		return permitAuthorizationNo;
	}

	/**
	 * @param permitAuthorizationNo
	 *            the permitAuthorizationNo to set
	 */
	public void setPermitAuthorizationNo(String permitAuthorizationNo) {
		this.permitAuthorizationNo = permitAuthorizationNo;
	}

	/**
	 * @return the isPermitSurrender
	 */
	public boolean isPermitSurrender() {
		return isPermitSurrender;
	}

	/**
	 * @param isPermitSurrender
	 *            the isPermitSurrender to set
	 */
	public void setPermitSurrender(boolean isPermitSurrender) {
		this.isPermitSurrender = isPermitSurrender;
	}

	/**
	 * @return the permitSurrenderDate
	 */
	public LocalDate getPermitSurrenderDate() {
		return permitSurrenderDate;
	}

	/**
	 * @param permitSurrenderDate
	 *            the permitSurrenderDate to set
	 */
	public void setPermitSurrenderDate(LocalDate permitSurrenderDate) {
		this.permitSurrenderDate = permitSurrenderDate;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	/**
	 * @return the sTCTvehcleDetailsDTO
	 */
	public STCTvehcleDetailsDTO getsTCTvehcleDetailsDTO() {
		return sTCTvehcleDetailsDTO;
	}

	/**
	 * @param sTCTvehcleDetailsDTO
	 *            the sTCTvehcleDetailsDTO to set
	 */
	public void setsTCTvehcleDetailsDTO(STCTvehcleDetailsDTO sTCTvehcleDetailsDTO) {
		this.sTCTvehcleDetailsDTO = sTCTvehcleDetailsDTO;
	}

	/**
	 * @return the serviceType
	 */
	public List<ServiceEnum> getServiceType() {
		return serviceType;
	}

	/**
	 * @param serviceType
	 *            the serviceType to set
	 */
	public void setServiceType(List<ServiceEnum> serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * @return the serviceIds
	 */
	public Set<Integer> getServiceIds() {
		return serviceIds;
	}

	/**
	 * @param serviceIds
	 *            the serviceIds to set
	 */
	public void setServiceIds(Set<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}

	/**
	 * @return the nonPermitPrNo
	 */
	public String getNonPermitPrNo() {
		return nonPermitPrNo;
	}

	/**
	 * @param nonPermitPrNo
	 *            the nonPermitPrNo to set
	 */
	public void setNonPermitPrNo(String nonPermitPrNo) {
		this.nonPermitPrNo = nonPermitPrNo;
	}

	public Boolean getIsPermitDataEntry() {
		return isPermitDataEntry;
	}

	public void setIsPermitDataEntry(Boolean isPermitDataEntry) {
		this.isPermitDataEntry = isPermitDataEntry;
	}

	/**
	 * @return the isRelacementOfVehicle
	 */
	public Boolean getIsRelacementOfVehicle() {
		return isRelacementOfVehicle;
	}

	/**
	 * @param isRelacementOfVehicle
	 *            the isRelacementOfVehicle to set
	 */
	public void setIsRelacementOfVehicle(Boolean isRelacementOfVehicle) {
		this.isRelacementOfVehicle = isRelacementOfVehicle;
	}

	/**
	 * @return the relacementDate
	 */
	public LocalDate getRelacementDate() {
		return RelacementDate;
	}

	/**
	 * @param relacementDate
	 *            the relacementDate to set
	 */
	public void setRelacementDate(LocalDate relacementDate) {
		RelacementDate = relacementDate;
	}

	/**
	 * @return the isRecommendationLetter
	 */
	public Boolean getIsRecommendationLetter() {
		return isRecommendationLetter;
	}

	/**
	 * @param isRecommendationLetter
	 *            the isRecommendationLetter to set
	 */
	public void setIsRecommendationLetter(Boolean isRecommendationLetter) {
		this.isRecommendationLetter = isRecommendationLetter;
	}

	/**
	 * @return the recomendationLetterNo
	 */
	public String getRecomendationLetterNo() {
		return recomendationLetterNo;
	}

	/**
	 * @param recomendationLetterNo
	 *            the recomendationLetterNo to set
	 */
	public void setRecomendationLetterNo(String recomendationLetterNo) {
		this.recomendationLetterNo = recomendationLetterNo;
	}

}

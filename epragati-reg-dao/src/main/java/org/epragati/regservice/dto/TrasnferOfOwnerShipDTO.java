package org.epragati.regservice.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.epragati.common.dto.BaseEntity;
import org.epragati.constants.OwnerType;
import org.epragati.constants.TransferType;
import org.epragati.master.dto.ApplicantDetailsDTO;
import org.epragati.master.dto.OwnershipDTO;
import org.epragati.util.payment.FinanceTowEnum;
import org.epragati.util.payment.ServiceEnum;

/**
 * Transfer of Ownership
 * 
 * @author pbattula
 *
 */
public class TrasnferOfOwnerShipDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private OwnerType buyer;
	private OwnerType seller;
	private TransferType transferType;
	private String tokenNo;
	private boolean tokenStatus;
	private LocalDateTime tokenNoGeneratedTime;
	private LocalDateTime tokenUsedTime;
	private String buyerAadhaarNo;
	private UUID buyerUUID;
	private List<ServiceEnum> buyerServiceTypes;
	private Boolean isTokenCanceledBySeller;
	private LocalDateTime tokenCanceledTime;
	private String sellerFinancierId;
	private Boolean isFinancierAgreed;
	
	private TransferType.permitTranfer buyerRecommedationLetterStatus;

	private TransferType.permitTranfer sellerRecommedationLetterStatus;
	
	private Boolean isMobileService;

	public Boolean getIsMobileService() {
		return isMobileService;
	}

	public void setIsMobileService(Boolean isMobileService) {
		this.isMobileService = isMobileService;
	}

	/**
	 * @return the isTokenCanceledBySeller
	 */
	public Boolean getIsTokenCanceledBySeller() {
		return isTokenCanceledBySeller;
	}

	/**
	 * @param isTokenCanceledBySeller the isTokenCanceledBySeller to set
	 */
	public void setIsTokenCanceledBySeller(Boolean isTokenCanceledBySeller) {
		this.isTokenCanceledBySeller = isTokenCanceledBySeller;
	}

	/**
	 * @return the buyerServiceType
	 */
	public List<ServiceEnum> getBuyerServiceType() {
		return buyerServiceTypes;
	}

	/**
	 * @param buyerServiceType the buyerServiceType to set
	 */
	public void setBuyerServiceType(List<ServiceEnum> buyerServiceType) {
		this.buyerServiceTypes = buyerServiceType;
	}

	/**
	 * @return the buyerUUID
	 */
	public UUID getBuyerUUID() {
		return buyerUUID;
	}

	/**
	 * @param buyerUUID the buyerUUID to set
	 */
	public void setBuyerUUID(UUID buyerUUID) {
		this.buyerUUID = buyerUUID;
	}

	private String sellerAadhaarNo;
	private String sellerFinanceStatus;
	private String buyerFinanceStatus;
	private OwnershipDTO ownerShipType;
	private List<LegalHiresDTO> legalHire;
	private String sellerFinanceType;
	
	private TransferType.permitTranfer buyerPermitStatus;
	/**
	 * @return the buyerPermitStatus
	 */
	public TransferType.permitTranfer getBuyerPermitStatus() {
		return buyerPermitStatus;
	}

	/**
	 * @param buyerPermitStatus the buyerPermitStatus to set
	 */
	public void setBuyerPermitStatus(TransferType.permitTranfer buyerPermitStatus) {
		this.buyerPermitStatus = buyerPermitStatus;
	}
	
	private TransferType.permitTranfer sellerPermitStatus;
	/**
	 * @return the sellerPermitStatus
	 */
	public TransferType.permitTranfer getSellerPermitStatus() {
		return sellerPermitStatus;
	}

	/**
	 * @param sellerPermitStatus the sellerPermitStatus to set
	 */
	public void setSellerPermitStatus(TransferType.permitTranfer sellerPermitStatus) {
		this.sellerPermitStatus = sellerPermitStatus;
	}

	/**
	 * @return the legalHire
	 */
	public List<LegalHiresDTO> getLegalHire() {
		return legalHire;
	}

	/**
	 * @param legalHire the legalHire to set
	 */
	public void setLegalHire(List<LegalHiresDTO> legalHire) {
		this.legalHire = legalHire;
	}

	/**
	 * @return the ownerShipType
	 */
	public OwnershipDTO getOwnerShipType() {
		return ownerShipType;
	}

	/**
	 * @param ownerShipType the ownerShipType to set
	 */
	public void setOwnerShipType(OwnershipDTO ownerShipType) {
		this.ownerShipType = ownerShipType;
	}

	private ApplicantDetailsDTO buyerApplicantDetails;
	
	/**
	 * @return the buyerAadhaarNo
	 */
	public String getBuyerAadhaarNo() {
		return buyerAadhaarNo;
	}

	/**
	 * @param buyerAadhaarNo the buyerAadhaarNo to set
	 */
	public void setBuyerAadhaarNo(String buyerAadhaarNo) {
		this.buyerAadhaarNo = buyerAadhaarNo;
	}

	public ApplicantDetailsDTO getBuyerApplicantDetails() {
		return buyerApplicantDetails;
	}

	public void setBuyerApplicantDetails(ApplicantDetailsDTO buyerApplicantDetails) {
		this.buyerApplicantDetails = buyerApplicantDetails;
	}



	private FinanceTowEnum sellerDecision;

	public FinanceTowEnum getSellerDecision() {
		return sellerDecision;
	}

	public void setSellerDecision(FinanceTowEnum sellerDecision) {
		this.sellerDecision = sellerDecision;
	}

	public String getSellerFinanceStatus() {
		return sellerFinanceStatus;
	}

	public void setSellerFinanceStatus(String sellerFinanceStatus) {
		this.sellerFinanceStatus = sellerFinanceStatus;
	}

	public String getBuyerFinanceStatus() {
		return buyerFinanceStatus;
	}

	public void setBuyerFinanceStatus(String buyerFinanceStatus) {
		this.buyerFinanceStatus = buyerFinanceStatus;
	}

	

	/**
	 * @return the sellerAadhaarNo
	 */
	public String getSellerAadhaarNo() {
		return sellerAadhaarNo;
	}

	/**
	 * @param sellerAadhaarNo
	 *            the sellerAadhaarNo to set
	 */
	public void setSellerAadhaarNo(String sellerAadhaarNo) {
		this.sellerAadhaarNo = sellerAadhaarNo;
	}

	/**
	 * @return the tokenStatus
	 */
	public boolean isTokenStatus() {
		return tokenStatus;
	}

	/**
	 * @param tokenStatus
	 *            the tokenStatus to set
	 */
	public void setTokenStatus(boolean tokenStatus) {
		this.tokenStatus = tokenStatus;
	}

	public TransferType getTransferType() {
		return transferType;
	}

	public void setTransferType(TransferType transferType) {
		this.transferType = transferType;
	}

	public String getTokenNo() {
		return tokenNo;
	}

	public void setTokenNo(String tokenNo) {
		this.tokenNo = tokenNo;
	}

	public OwnerType getBuyer() {
		return buyer;
	}

	public void setBuyer(OwnerType buyer) {
		this.buyer = buyer;
	}

	public OwnerType getSeller() {
		return seller;
	}

	public void setSeller(OwnerType seller) {
		this.seller = seller;
	}

	public LocalDateTime getTokenNoGeneratedTime() {
		return tokenNoGeneratedTime;
	}

	public void setTokenNoGeneratedTime(LocalDateTime tokenNoGeneratedTime) {
		this.tokenNoGeneratedTime = tokenNoGeneratedTime;
	}

	public LocalDateTime getTokenUsedTime() {
		return tokenUsedTime;
	}

	public void setTokenUsedTime(LocalDateTime tokenUsedTime) {
		this.tokenUsedTime = tokenUsedTime;
	}

	public LocalDateTime getTokenCanceledTime() {
		return tokenCanceledTime;
	}

	public void setTokenCanceledTime(LocalDateTime tokenCanceledTime) {
		this.tokenCanceledTime = tokenCanceledTime;
	}

	public String getSellerFinanceType() {
		return sellerFinanceType;
	}

	public void setSellerFinanceType(String sellerFinanceType) {
		this.sellerFinanceType = sellerFinanceType;
	}

	public String getSellerFinancierId() {
		return sellerFinancierId;
	}

	public void setSellerFinancierId(String sellerFinancierId) {
		this.sellerFinancierId = sellerFinancierId;
	}

	public Boolean getIsFinancierAgreed() {
		return isFinancierAgreed;
	}

	public void setIsFinancierAgreed(Boolean isFinancierAgreed) {
		this.isFinancierAgreed = isFinancierAgreed;
	}

	public TransferType.permitTranfer getBuyerRecommedationLetterStatus() {
		return buyerRecommedationLetterStatus;
	}

	public void setBuyerRecommedationLetterStatus(TransferType.permitTranfer buyerRecommedationLetterStatus) {
		this.buyerRecommedationLetterStatus = buyerRecommedationLetterStatus;
	}

	public TransferType.permitTranfer getSellerRecommedationLetterStatus() {
		return sellerRecommedationLetterStatus;
	}

	public void setSellerRecommedationLetterStatus(TransferType.permitTranfer sellerRecommedationLetterStatus) {
		this.sellerRecommedationLetterStatus = sellerRecommedationLetterStatus;
	}

	
}

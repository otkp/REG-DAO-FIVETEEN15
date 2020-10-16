package org.epragati.payment.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import javax.persistence.Id;

import org.epragati.common.dto.BaseEntity;
import org.epragati.payments.vo.BreakPayments;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author naga.pulaparthi
 *
 */

@Document(collection = "payments")
@CompoundIndexes({ @CompoundIndex(name = "moduleCode", def = "{'payStatus': 1}") })
public class PaymentTransactionDTO extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String applicationFormRefNum;

	private Integer paymentGatewayType;

	private String transactioNo;

	private PaymentTransactionRequestDTO request;

	private PaymentVerifyRequestDTO paymentVerifyRequest;

	private PaymentTransactionResponseDTO response;

	private List<PaymentTransactionResponseDTO> responseLog;

	private PayURefundResponse payURefundResponse;

	private List<PayURefundResponse> payURefundResponseLog;

	private ChalanaDetailsDTO challanDetails;

	private String payStatus;

	private FeeDetailsDTO feeDetailsDTO;

	private String officeCode;

	private Set<Integer> serviceIds;

	private List<BreakPayments> breakPayments;
	
	private Boolean deductionMode;
	
	private boolean isFeeDetailsEnabled;

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	private String vehicleType;

	public BreakPaymentsSaveDTO getBreakPaymentsSave() {
		return breakPaymentsSave;
	}

	public void setBreakPaymentsSave(BreakPaymentsSaveDTO breakPaymentsSave) {
		this.breakPaymentsSave = breakPaymentsSave;
	}

	private BreakPaymentsSaveDTO breakPaymentsSave;

	private String sbiTransactionNumber;

	private String moduleCode;

	private Boolean isAgreeToEnablePayment;

	private String payUKey;

	private String payUSalt;

	private String payUMarchantId;

	private String payUAuthorizationHeader;

	private boolean isCfstSync;

	private String paymentTransactionNo;

	private boolean isCancelledTransaction;

	private LocalDateTime cancelledDate;

	private boolean isDoubleVerified;

	public boolean isCfstSync() {
		return isCfstSync;
	}

	public void setCfstSync(boolean isCfstSync) {
		this.isCfstSync = isCfstSync;
	}

	public String getPayUAuthorizationHeader() {
		return payUAuthorizationHeader;
	}

	public void setPayUAuthorizationHeader(String payUAuthorizationHeader) {
		this.payUAuthorizationHeader = payUAuthorizationHeader;
	}

	public String getPayUKey() {
		return payUKey;
	}

	public void setPayUKey(String payUKey) {
		this.payUKey = payUKey;
	}

	public String getPayUSalt() {
		return payUSalt;
	}

	public void setPayUSalt(String payUSalt) {
		this.payUSalt = payUSalt;
	}

	public String getPayUMarchantId() {
		return payUMarchantId;
	}

	public void setPayUMarchantId(String payUMarchantId) {
		this.payUMarchantId = payUMarchantId;
	}

	/**
	 * @return the sbiTransactionNumber
	 */
	public String getSbiTransactionNumber() {
		return sbiTransactionNumber;
	}

	/**
	 * @param sbiTransactionNumber the sbiTransactionNumber to set
	 */
	public void setSbiTransactionNumber(String sbiTransactionNumber) {
		this.sbiTransactionNumber = sbiTransactionNumber;
	}

	/**
	 * @return the breakPayments
	 */
	public List<BreakPayments> getBreakPayments() {
		return breakPayments;
	}

	/**
	 * @param breakPayments the breakPayments to set
	 */
	public void setBreakPayments(List<BreakPayments> breakPayments) {
		this.breakPayments = breakPayments;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the applicationFormRefNum
	 */
	public String getApplicationFormRefNum() {
		return applicationFormRefNum;
	}

	/**
	 * @param applicationFormRefNum the applicationFormRefNum to set
	 */
	public void setApplicationFormRefNum(String applicationFormRefNum) {
		this.applicationFormRefNum = applicationFormRefNum;
	}

	/**
	 * @return the paymentGatewayType
	 */
	public Integer getPaymentGatewayType() {
		return paymentGatewayType;
	}

	/**
	 * @param paymentGatewayType the paymentGatewayType to set
	 */
	public void setPaymentGatewayType(Integer paymentGatewayType) {
		this.paymentGatewayType = paymentGatewayType;
	}

	/**
	 * @return the transactioNo
	 */
	public String getTransactioNo() {
		return transactioNo;
	}

	/**
	 * @param transactioNo the transactioNo to set
	 */
	public void setTransactioNo(String transactioNo) {
		this.transactioNo = transactioNo;
	}

	/**
	 * @return the request
	 */
	public PaymentTransactionRequestDTO getRequest() {
		return request;
	}

	/**
	 * @param request the request to set
	 */
	public void setRequest(PaymentTransactionRequestDTO request) {
		this.request = request;
	}

	/**
	 * @return the response
	 */
	public PaymentTransactionResponseDTO getResponse() {
		return response;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(PaymentTransactionResponseDTO response) {
		this.response = response;
	}

	/**
	 * @return the challanDetails
	 */
	public ChalanaDetailsDTO getChallanDetails() {
		return challanDetails;
	}

	/**
	 * @param challanDetails the challanDetails to set
	 */
	public void setChallanDetails(ChalanaDetailsDTO challanDetails) {
		this.challanDetails = challanDetails;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the payStatus
	 */
	public String getPayStatus() {
		return payStatus;
	}

	/**
	 * @param payStatus the payStatus to set
	 */
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public FeeDetailsDTO getFeeDetailsDTO() {
		return feeDetailsDTO;
	}

	public void setFeeDetailsDTO(FeeDetailsDTO feeDetailsDTO) {
		this.feeDetailsDTO = feeDetailsDTO;
	}

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public Set<Integer> getServiceIds() {
		return serviceIds;
	}

	public void setServiceIds(Set<Integer> serviceIds) {
		this.serviceIds = serviceIds;
	}

	/**
	 * @return the responseLog
	 */
	public List<PaymentTransactionResponseDTO> getResponseLog() {
		return responseLog;
	}

	/**
	 * @param responseLog the responseLog to set
	 */
	public void setResponseLog(List<PaymentTransactionResponseDTO> responseLog) {
		this.responseLog = responseLog;
	}

	/**
	 * @return the payURefundResponse
	 */
	public PayURefundResponse getPayURefundResponse() {
		return payURefundResponse;
	}

	/**
	 * @param payURefundResponse the payURefundResponse to set
	 */
	public void setPayURefundResponse(PayURefundResponse payURefundResponse) {
		this.payURefundResponse = payURefundResponse;
	}

	/**
	 * @return the payURefundResponseLog
	 */
	public List<PayURefundResponse> getPayURefundResponseLog() {
		return payURefundResponseLog;
	}

	/**
	 * @param payURefundResponseLog the payURefundResponseLog to set
	 */
	public void setPayURefundResponseLog(List<PayURefundResponse> payURefundResponseLog) {
		this.payURefundResponseLog = payURefundResponseLog;
	}

	public String getModuleCode() {
		return moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	public Boolean getIsAgreeToEnablePayment() {
		return isAgreeToEnablePayment;
	}

	public void setIsAgreeToEnablePayment(Boolean isAgreeToEnablePayment) {
		this.isAgreeToEnablePayment = isAgreeToEnablePayment;
	}

	/**
	 * @return the paymentTransactionNo
	 */
	public String getPaymentTransactionNo() {
		return paymentTransactionNo;
	}

	/**
	 * @param paymentTransactionNo the paymentTransactionNo to set
	 */
	public void setPaymentTransactionNo(String paymentTransactionNo) {
		this.paymentTransactionNo = paymentTransactionNo;
	}

	public PaymentVerifyRequestDTO getPaymentVerifyRequest() {
		return paymentVerifyRequest;
	}

	public void setPaymentVerifyRequest(PaymentVerifyRequestDTO paymentVerifyRequest) {
		this.paymentVerifyRequest = paymentVerifyRequest;
	}

	/**
	 * @return the isCancelledTransaction
	 */
	public boolean isCancelledTransaction() {
		return isCancelledTransaction;
	}

	/**
	 * @param isCancelledTransaction the isCancelledTransaction to set
	 */
	public void setCancelledTransaction(boolean isCancelledTransaction) {
		this.isCancelledTransaction = isCancelledTransaction;
	}

	/**
	 * @return the cancelledDate
	 */
	public LocalDateTime getCancelledDate() {
		return cancelledDate;
	}

	/**
	 * @param cancelledDate the cancelledDate to set
	 */
	public void setCancelledDate(LocalDateTime cancelledDate) {
		this.cancelledDate = cancelledDate;
	}

	/**
	 * @return the isDoubleVerified
	 */
	public boolean isDoubleVerified() {
		return isDoubleVerified;
	}

	/**
	 * @param isDoubleVerified the isDoubleVerified to set
	 */
	public void setDoubleVerified(boolean isDoubleVerified) {
		this.isDoubleVerified = isDoubleVerified;
	}

	public Boolean getDeductionMode() {
		return deductionMode;
	}

	public void setDeductionMode(Boolean deductionMode) {
		this.deductionMode = deductionMode;
	}

	/**
	 * @return the isFeeDetailsEnabled
	 */
	public boolean isFeeDetailsEnabled() {
		return isFeeDetailsEnabled;
	}

	/**
	 * @param isFeeDetailsEnabled the isFeeDetailsEnabled to set
	 */
	public void setFeeDetailsEnabled(boolean isFeeDetailsEnabled) {
		this.isFeeDetailsEnabled = isFeeDetailsEnabled;
	}
	
	
	
}

package org.epragati.dto.enclosure;

import java.time.LocalDateTime;
import java.util.List;

import org.epragati.common.dto.BaseEntity;
import org.epragati.master.vo.ActionDetailsVO;
import org.springframework.data.annotation.Id;

/**
 * 
 * @author naga.pulaparthi
 *
 */
public class ImageEnclosureDTO extends BaseEntity {

	private static final long serialVersionUID = 8488327069524580222L;

	@Id
	private String imageId;

	private String isDone;

	private String serviceId;

	private String referenceId;

	private String imageType;

	private String imageDetails;

	private String imagCheckSum;

	private String imageStaus;// imageStaus

	private String reason;

	private String imageComment;

	private Integer pageNo;

	private String enclosureName;

	private List<String> basedOnRole;

	private String applicantId;

	private String imageUrl;

	private List<ActionDetailsVO> actionLog;

	private boolean required;

	private Integer slNo;

	private boolean isDifferentlyAbled;

	private boolean active;

	private List<ImageActionsDTO> imageActions;
	
	private Integer quarterNumber;

	/**
	 * for VCR Api use
	 */
	private String latitude;
	private String longitude;
	private LocalDateTime timestamp;

	/**
	 * @return the slNo
	 */
	public Integer getSlNo() {
		return slNo;
	}

	/**
	 * @param slNo the slNo to set
	 */
	public void setSlNo(Integer slNo) {
		this.slNo = slNo;
	}

	/**
	 * @return the basedOnRole
	 */

	public List<String> getBasedOnRole() {
		return basedOnRole;
	}

	/**
	 * @param basedOnRole the basedOnRole to set
	 */
	public void setBasedOnRole(List<String> basedOnRole) {
		this.basedOnRole = basedOnRole;
	}

	public String getImageComment() {
		return imageComment;
	}

	public void setImageComment(String imageComment) {
		this.imageComment = imageComment;
	}

	/**
	 * @return the imageId
	 */
	public String getImageId() {
		return imageId;
	}

	/**
	 * @param imageId the imageId to set
	 */
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	/**
	 * @return the serviceId
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the referenceId
	 */
	public String getReferenceId() {
		return referenceId;
	}

	/**
	 * @param referenceId the referenceId to set
	 */
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	/**
	 * @return the imageType
	 */
	public String getImageType() {
		return imageType;
	}

	/**
	 * @param imageType the imageType to set
	 */
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	/**
	 * @return the imageDetails
	 */
	public String getImageDetails() {
		return imageDetails;
	}

	/**
	 * @param imageDetails the imageDetails to set
	 */
	public void setImageDetails(String imageDetails) {
		this.imageDetails = imageDetails;
	}

	/**
	 * @return the imagCheckSum
	 */
	public String getImagCheckSum() {
		return imagCheckSum;
	}

	/**
	 * @param imagCheckSum the imagCheckSum to set
	 */
	public void setImagCheckSum(String imagCheckSum) {
		this.imagCheckSum = imagCheckSum;
	}

	/**
	 * @return the imageStaus
	 */
	public String getImageStaus() {
		return imageStaus;
	}

	/**
	 * @param imageStaus the imageStaus to set
	 */
	public void setImageStaus(String imageStaus) {
		this.imageStaus = imageStaus;
	}

	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
	 * @return the pageNo
	 */
	public Integer getPageNo() {
		return pageNo;
	}

	/**
	 * @param pageNo the pageNo to set
	 */
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the enclosureName
	 */
	public String getEnclosureName() {
		return enclosureName;
	}

	/**
	 * @param enclosureName the enclosureName to set
	 */
	public void setEnclosureName(String enclosureName) {
		this.enclosureName = enclosureName;
	}

	/**
	 * @return the isDone
	 */
	public String getIsDone() {
		return isDone;
	}

	/**
	 * @param isDone the isDone to set
	 */
	public void setIsDone(String isDone) {
		this.isDone = isDone;
	}

	/**
	 * @return the applicantId
	 */
	public String getApplicantId() {
		return applicantId;
	}

	/**
	 * @param applicantId the applicantId to set
	 */
	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @return the image
	 */

	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * @return the required
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * @param required the required to set
	 */
	public void setRequired(boolean required) {
		this.required = required;
	}

	/**
	 * @return the actionLog
	 */
	public List<ActionDetailsVO> getActionLog() {
		return actionLog;
	}

	/**
	 * @param actionLog the actionLog to set
	 */
	public void setActionLog(List<ActionDetailsVO> actionLog) {
		this.actionLog = actionLog;
	}

	/**
	 * @return the isDifferentlyAbled
	 */
	public boolean isDifferentlyAbled() {
		return isDifferentlyAbled;
	}

	/**
	 * @param isDifferentlyAbled the isDifferentlyAbled to set
	 */
	public void setDifferentlyAbled(boolean isDifferentlyAbled) {
		this.isDifferentlyAbled = isDifferentlyAbled;
	}

	/**
	 * @return the imageActions
	 */
	public List<ImageActionsDTO> getImageActions() {
		return imageActions;
	}

	/**
	 * @param imageActions the imageActions to set
	 */
	public void setImageActions(List<ImageActionsDTO> imageActions) {
		this.imageActions = imageActions;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Integer getQuarterNumber() {
		return quarterNumber;
	}

	public void setQuarterNumber(Integer quarterNumber) {
		this.quarterNumber = quarterNumber;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the image
	 */

	
}

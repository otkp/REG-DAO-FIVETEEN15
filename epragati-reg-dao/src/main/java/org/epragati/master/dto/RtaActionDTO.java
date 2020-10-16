package org.epragati.master.dto;

import org.epragati.service.enclosure.vo.ImageInput;

public class RtaActionDTO {

	private RejectionHistoryDTO rejectionHistory;
	private ImageInput imageInput;
	/**
	 * @return the rejectionHistory
	 */
	public RejectionHistoryDTO getRejectionHistory() {
		return rejectionHistory;
	}
	/**
	 * @param rejectionHistory the rejectionHistory to set
	 */
	public void setRejectionHistory(RejectionHistoryDTO rejectionHistory) {
		this.rejectionHistory = rejectionHistory;
	}
	/**
	 * @return the imageInput
	 */
	public ImageInput getImageInput() {
		return imageInput;
	}
	/**
	 * @param imageInput the imageInput to set
	 */
	public void setImageInput(ImageInput imageInput) {
		this.imageInput = imageInput;
	}
	
	
}

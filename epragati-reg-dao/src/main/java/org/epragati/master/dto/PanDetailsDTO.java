package org.epragati.master.dto;

public class PanDetailsDTO {

	private String panNo;
	private boolean isPanVerifiedInOnlne;
	/**
	 * @return the panNo
	 */
	public String getPanNo() {
		return panNo;
	}
	/**
	 * @param panNo the panNo to set
	 */
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	/**
	 * @return the isPanVerifiedInOnlne
	 */
	public boolean isPanVerifiedInOnlne() {
		return isPanVerifiedInOnlne;
	}
	/**
	 * @param isPanVerifiedInOnlne the isPanVerifiedInOnlne to set
	 */
	public void setPanVerifiedInOnlne(boolean isPanVerifiedInOnlne) {
		this.isPanVerifiedInOnlne = isPanVerifiedInOnlne;
	}
	
}

package org.epragati.dto.enclosure;

import java.time.LocalDateTime;
import java.util.List;

import org.epragati.util.document.KeyValue;

public class EnclosuresDtoLog {

	private LocalDateTime createDate;

	private List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures;

	private String reason;

	/**
	 * @return the createDate
	 */
	public LocalDateTime getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate
	 *            the createDate to set
	 */
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the enclosures
	 */
	public List<KeyValue<String, List<ImageEnclosureDTO>>> getEnclosures() {
		return enclosures;
	}

	/**
	 * @param enclosures
	 *            the enclosures to set
	 */
	public void setEnclosures(List<KeyValue<String, List<ImageEnclosureDTO>>> enclosures) {
		this.enclosures = enclosures;
	}

	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @param reason
	 *            the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

}

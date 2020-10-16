package org.epragati.payment.dto;

import java.io.Serializable;
import java.util.List;

import org.epragati.payments.vo.BreakPayments;

public class BreakPaymentsSaveDTO implements Serializable {

	private List<BreakPayments> breakPayments;
	private Double grandTotalFees;

	private Double diffTax;

	/**
	 * @return the breakPayments
	 */
	public List<BreakPayments> getBreakPayments() {
		return breakPayments;
	}

	/**
	 * @param breakPayments
	 *            the breakPayments to set
	 */
	public void setBreakPayments(List<BreakPayments> breakPayments) {
		this.breakPayments = breakPayments;
	}

	/**
	 * @return the grandTotalFees
	 */
	public Double getGrandTotalFees() {
		return grandTotalFees;
	}

	/**
	 * @param grandTotalFees
	 *            the grandTotalFees to set
	 */
	public void setGrandTotalFees(Double grandTotalFees) {
		this.grandTotalFees = grandTotalFees;
	}

	/**
	 * @return the diffTax
	 */
	public Double getDiffTax() {
		return diffTax;
	}

	/**
	 * @param diffTax
	 *            the diffTax to set
	 */
	public void setDiffTax(Double diffTax) {
		this.diffTax = diffTax;
	}
}

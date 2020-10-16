package org.epragati.master.dto;

import org.epragati.common.dto.BaseEntity;

public class BankDetailsDTO extends BaseEntity {



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String accountNo;
	private String branch;
	private String ifscCode;

	/**
	 * 
	 * @return
	 */
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	@Override
	public String toString() {
		return "BankDetailsDTO [accountNo=" + accountNo + ", branch=" + branch + ", ipscCode=" + ifscCode + "]";
	}

	
}

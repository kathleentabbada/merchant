package com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain;

public class EnrolledMerchantUI {
	
	private String enrolledMerchantId;
	private String merchantId;
	private String accountNumber;
	
	protected EnrolledMerchantUI() {
		
	}
	
	public EnrolledMerchantUI(String enrolledMerchantId, String merchantId, String accountNumber) {
		this.enrolledMerchantId = enrolledMerchantId;
		this.merchantId = merchantId;
		this.accountNumber = accountNumber;
	}

	public String getEnrolledMerchantId() {
		return enrolledMerchantId;
	}

	public void setEnrolledMerchantId(String enrolledMerchantId) {
		this.enrolledMerchantId = enrolledMerchantId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return String.format("EnrolledMerchant[enrolledmerchantid='%s', merchantid='%s', accountnumber='%s']"
							, enrolledMerchantId, merchantId, accountNumber);
	}
	
	
	
}


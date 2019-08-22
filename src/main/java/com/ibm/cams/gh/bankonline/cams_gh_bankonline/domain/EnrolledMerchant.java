package com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain;

import java.util.List;

import javax.persistence.*;

@Entity

@Table(name = "enrolledmerchant_tbl")
public class EnrolledMerchant {

	@Id
	@Column(name = "enrolledmerchantid", unique = true, columnDefinition = "VARCHAR(10)", nullable = false)
	String enrolledMerchantId;

	@Column(name = "merchantid")
	private String merchantId;

	@Column(name = "accountnumber")
	private String accountNumber;
	
	public EnrolledMerchant() {

	}

	public EnrolledMerchant(String enrolledMerchantId, String merchantId, String accountNumber) {
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
		return String.format("EnrolledMerchant[enrolledmerchantid='%s', merchantid='%s', accountnumber='%s']",
				enrolledMerchantId, merchantId, accountNumber);
	}

}

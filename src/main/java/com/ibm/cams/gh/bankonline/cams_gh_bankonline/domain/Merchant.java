package com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain;
import javax.persistence.*;

@Entity

@Table(name = "merchant_tbl")

public class Merchant {
	
	@Id
	@Column(name = "merchantid", unique = true, columnDefinition = "VARCHAR(10)", nullable = false)
	String merchantId;

	@Column(name = "merchantname")
	private String merchantName;

	public Merchant() {

	}

	public Merchant(String merchantId, String merchantName) {
		this.merchantId = merchantId;
		this.merchantName = merchantName;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	@Override
	public String toString() {
		return String.format("Merchant[merchantid='%s', merchantname='%s']", merchantId, merchantName);
	}

}

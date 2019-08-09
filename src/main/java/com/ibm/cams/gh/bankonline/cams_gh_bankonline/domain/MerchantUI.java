package com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain;

public class MerchantUI {

	private String merchantId;
	private String merchantName;

	protected MerchantUI() {

	}

	public MerchantUI(String merchantId, String merchantName) {
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

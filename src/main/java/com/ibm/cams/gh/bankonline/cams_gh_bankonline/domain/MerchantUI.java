package com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain;

public class MerchantUI {

	private String merch_id;
	private String merch_name;
	
	protected MerchantUI() {
		
	}
	public MerchantUI(String merch_id, String merch_name) {
		this.merch_id = merch_id;
		this.merch_name = merch_name;
	}


	public String getMerch_id() {
		return merch_id;
	}

	public void setMerch_id(String merch_id) {
		this.merch_id = merch_id;
	}

	public String getMerch_name() {
		return merch_name;
	}

	public void setMerch_name(String merch_name) {
		this.merch_name = merch_name;
	}
	public String toString() {
		return String.format("Merchant[merch_id='%s', merch_name='%s']", merch_id, merch_name);
	}
}

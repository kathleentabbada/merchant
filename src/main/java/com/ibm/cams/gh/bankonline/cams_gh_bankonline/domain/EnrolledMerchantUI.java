package com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain;

public class EnrolledMerchantUI {
	
	private String enmerch_id;
	private String merch_id;
	private String accountnumber;
	
	protected EnrolledMerchantUI() {
		
	}

	public EnrolledMerchantUI(String enmerch_id, String merch_id, String accountnumber) {
		this.enmerch_id = enmerch_id;
		this.merch_id = merch_id;
		this.accountnumber = accountnumber;
	}

	public String getEnmerch_id() {
		return enmerch_id;
	}

	public void setEnmerch_id(String enmerch_id) {
		this.enmerch_id = enmerch_id;
	}

	public String getMerch_id() {
		return merch_id;
	}

	public void setMerch_id(String merch_id) {
		this.merch_id = merch_id;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	
	public String toString() {
		return String.format("EnrolledMerchant[enmerch_id='%s', merch_id='%s', accountnumber='%s']"
							, enmerch_id, merch_id, accountnumber);
	}
	
	
	
}


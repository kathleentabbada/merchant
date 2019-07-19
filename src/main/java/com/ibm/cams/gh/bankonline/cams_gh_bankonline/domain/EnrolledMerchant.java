package com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain;

import javax.persistence.*;

@Entity

@Table(name = "enrolledmerchant_tbl")
public class EnrolledMerchant {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "enmerch_id", unique=true, columnDefinition="VARCHAR(10)", nullable = false)
	String enmerch_id;
	
	@Column(name = "merch_id")
	private String merch_id;
	
	@Column(name = "accountnumber")
	private String accountnumber;

	public EnrolledMerchant() {
		
	}
	
	public EnrolledMerchant(String merch_id, String accountnumber) {
		this(null, merch_id, accountnumber);
	}

	public EnrolledMerchant(String enmerch_id, String merch_id, String accountnumber) {
		this.enmerch_id = merch_id;
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
}

package com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain;

import javax.persistence.*;

@Entity

@Table(name = "merchant")

public class Merchant {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	String merch_id;
	private String merch_name;
	
	public Merchant() {
		
	}
	
	public Merchant(String merch_name) {
		this(null, merch_name);
	}

	public Merchant(String merch_id, String merch_name) {
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
}

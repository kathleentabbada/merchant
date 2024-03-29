package com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain;

import java.sql.Date;

public class TransactionUI {

	private String trans_id;
	private String merch_id;
	private String accountnumber;
	private Double amount;
	private Date trans_date;

	protected TransactionUI() {
		
	}

	public TransactionUI(String trans_id, String merch_id, String accountnumber, Double amount, Date trans_date) {
		this.trans_id = trans_id;
		this.merch_id = merch_id;
		this.accountnumber = accountnumber;
		this.amount = amount;
		this.trans_date = trans_date;
	}

	public String getTrans_id() {
		return trans_id;
	}

	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
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

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getTrans_date() {
		return trans_date;
	}

	public void setTrans_date(Date trans_date) {
		this.trans_date = trans_date;
	}
	
	public String toString() {
		return String.format("Transaction[trans_id='%s', merch_id='%s', accountnumber='%s', amount='%s', trans_date='%s']"
							, trans_id, merch_id, accountnumber, amount, trans_date);
	}

}

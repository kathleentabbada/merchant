package com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain;

import java.sql.Date;
import javax.persistence.*;

@Entity

@Table(name = "transaction_tbl")

public class Transaction {
	
	@Id
	@Column(name = "transactionid", unique=true, columnDefinition="VARCHAR(10)", nullable = false)
	String transactionId;
	
	@Column(name = "merchantid")
	private String merchantId;

	@Column(name = "accountnumber")
	private String accountNumber;
	
	@Column(name = "amount")
	private Double amount;
	
	@Column(name = "transactiondate")
	private Date transactionDate;
	
	public Transaction() {
		
	}

	public Transaction(String transactionId, String merchantId, String accountNumber, Double amount,
			Date transactionDate) {
		this.transactionId = transactionId;
		this.merchantId = merchantId;
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.transactionDate = transactionDate;
	}

	@Override
	public String toString() {
		return String.format("Transaction[transactioinid='%s', merchantid='%s', accountnumber='%s', amount='%s', transactiondate='%s']"
							, transactionId, merchantId, accountNumber, amount, transactionDate);
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
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

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	
}

package com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain;
import java.sql.Date;
public class TransactionUI {
	
	private String transactionId;
	private String merchantId;
	private String accountNumber;
	private Double amount;
	private Date transactionDate;

	protected TransactionUI() {
		
	}

	public TransactionUI(String transactionId, String merchantId, String accountNumber, Double amount,
			Date transactionDate) {
		this.transactionId = transactionId;
		this.merchantId = merchantId;
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.transactionDate = transactionDate;
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

	@Override
	public String toString() {
		return String.format("Transaction[transactionid='%s', merchantid='%s', accountnumber='%s', amount='%s', transactiondate='%s']"
							, transactionId, merchantId, accountNumber, amount, transactionDate);
	}

}

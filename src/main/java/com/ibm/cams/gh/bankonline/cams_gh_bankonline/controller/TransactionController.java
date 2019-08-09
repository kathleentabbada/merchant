package com.ibm.cams.gh.bankonline.cams_gh_bankonline.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.Merchant;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.Transaction;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.TransactionUI;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository.TransactionRepo;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/transaction")
@EnableSwagger2
public class TransactionController {
	@Autowired
	TransactionRepo transactionRepo; 
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json") 
	public List<Transaction> getMerchantList() {

		List<Transaction> transaction = transactionRepo.findAll();

		return transaction;
	}
	@RequestMapping(method = RequestMethod.GET, produces = "application/json", value = "/TransactionId/{transactionid}")
	public Transaction getTransactionById(@PathVariable("transactionid") String transactionid) {
		Transaction transaction = transactionRepo.findById(transactionid).orElseThrow(null);

		return transaction;
	}
	@RequestMapping(method = RequestMethod.GET, produces = "application/json", value = "/MerchantId/{merchantid}")
	public List<Transaction> getMerchantId(@PathVariable String merchantid){
		List<Transaction> transaction= transactionRepo.findByMerchantId(merchantid);
		return transaction;
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json", value = "/TransactionDate/{transactiondate}")
	public List<Transaction> findByTransactionDate(@PathVariable String transactiondate){
		List<Transaction> transaction= transactionRepo.findByTransactionDate(transactiondate);
		return transaction;
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json", value = "/AccountNumber/{accountnumber}")
	public List<Transaction> findByAccountNumber(@PathVariable String accountnumber){
		List<Transaction> transaction= transactionRepo.findByAccountNumber(accountnumber);
		return transaction;
	}
	
	@RequestMapping(method = RequestMethod.POST, produces = "application/json", value = "/addTransaction")
	public String create(@RequestBody TransactionUI transaction){
		transactionRepo.save(new Transaction(transaction.getTransactionId(), transaction.getMerchantId(), 
							transaction.getAccountNumber(), transaction.getAmount(),transaction.getTransactionDate()));

		return "Transaction is created";
	}
}

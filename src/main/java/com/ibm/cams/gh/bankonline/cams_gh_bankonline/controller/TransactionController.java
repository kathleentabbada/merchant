package com.ibm.cams.gh.bankonline.cams_gh_bankonline.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.Transaction;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.TransactionUI;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository.TransactionRepo;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	@Autowired
	TransactionRepo transactionRepo; 
	
	@GetMapping
	public List<Transaction> getMerchantList() {

		List<Transaction> transaction = transactionRepo.findAll();

		return transaction;
	}
	
	@PostMapping("/addTransaction")
	public String create(@RequestBody TransactionUI transaction){
		// save a single Customer
		transactionRepo.save(new Transaction(transaction.getTrans_id(), transaction.getMerch_id(), 
							transaction.getAccountnumber(), transaction.getAmount(),transaction.getTrans_date()));

		return "Transaction is created";
	}
}

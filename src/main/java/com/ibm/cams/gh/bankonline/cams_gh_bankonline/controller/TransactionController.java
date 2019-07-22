package com.ibm.cams.gh.bankonline.cams_gh_bankonline.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.Transaction;
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
}

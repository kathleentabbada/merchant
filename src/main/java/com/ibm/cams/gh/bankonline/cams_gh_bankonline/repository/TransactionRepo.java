package com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.Transaction; 

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, String>{
	
	List<Transaction> findAll();
	List<Transaction> findByMerchantId(String merchantid);
	List<Transaction> findByTransactionDate(String transactiondate);
	List<Transaction> findByAccountNumber(String accountnumber);
}

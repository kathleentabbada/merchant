package com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.Transaction; 

@Repository
public interface TransactionRepo extends CrudRepository<Transaction, String>{
	
	List<Transaction> findAll();

}

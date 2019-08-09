package com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.EnrolledMerchant;

@Repository
public interface EnrolledMerchantRepo extends JpaRepository<EnrolledMerchant, String> {

	@Override
	List<EnrolledMerchant> findAll();
	List<EnrolledMerchant> findByMerchantId(String merchantid);
	List<EnrolledMerchant> findByAccountNumber(String accountnumber);
	

}

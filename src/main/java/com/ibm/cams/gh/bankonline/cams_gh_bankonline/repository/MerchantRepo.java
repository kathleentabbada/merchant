package com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.Merchant;

@Repository
public interface MerchantRepo extends JpaRepository<Merchant, String> {

	List<Merchant> findAll();
	List<Merchant> findByMerchantName(String merchantname);
	

}

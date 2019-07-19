package com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.EnrolledMerchant;

@Repository
public interface EnrolledMerchantRepo extends CrudRepository<EnrolledMerchant, String> {

	List<EnrolledMerchant> findAll();

}

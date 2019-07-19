package com.ibm.cams.gh.bankonline.cams_gh_bankonline.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.EnrolledMerchant;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository.EnrolledMerchantRepo;

@RestController
@RequestMapping("/enrolledmerchant")

public class EnrolledMerchantController {
	@Autowired
	EnrolledMerchantRepo EnrolledmerchRepo;
	
	@GetMapping
	public List<EnrolledMerchant> getMerchantList() {

		List<EnrolledMerchant> merchants = EnrolledmerchRepo.findAll();

		return merchants;
	}
	
	
	
}

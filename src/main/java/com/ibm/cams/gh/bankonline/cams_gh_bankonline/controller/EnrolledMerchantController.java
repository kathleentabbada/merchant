package com.ibm.cams.gh.bankonline.cams_gh_bankonline.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.EnrolledMerchant;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.EnrolledMerchantUI;
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
	
	@PostMapping("/addEnMerchant")
	public String create(@RequestBody EnrolledMerchantUI enrolledMerchant){
		// save a single Customer
		EnrolledmerchRepo.save(new EnrolledMerchant(enrolledMerchant.getEnmerch_id(),
							   enrolledMerchant.getMerch_id(),enrolledMerchant.getAccountnumber()));

		return "Transaction is created";
	}
	
}

package com.ibm.cams.gh.bankonline.cams_gh_bankonline.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.Merchant;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository.MerchantRepo;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
	@Autowired
	MerchantRepo merchantRepo;
	
//	@GetMapping("/merch")
//	public void merch(){
//		merchantRepo.save(new Merchant("FFF111FF11", "Raquel"));
//	}
	
	@GetMapping
	public List<Merchant> getMerchantList() {
		
		List<Merchant> merchants = merchantRepo.findAll();
		
		return merchants;
	}
	
	@GetMapping("{id}")
	public Merchant getMerchantById(@PathVariable("id") String merch_id) {
			
			Merchant merchant = merchantRepo.findById(merch_id).orElseThrow(null);
			
			return merchant;
	}

	@GetMapping("/addDummy")
	public void dummyData() {
		
		Merchant newMerchant = new Merchant();
		newMerchant.setMerch_id("ZZZ000HH66");
		newMerchant.setMerch_name("IBM");

		
		merchantRepo.save(newMerchant);
	}
}

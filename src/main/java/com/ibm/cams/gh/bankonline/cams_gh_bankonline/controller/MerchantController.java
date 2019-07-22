package com.ibm.cams.gh.bankonline.cams_gh_bankonline.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.Merchant;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.MerchantUI;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository.MerchantRepo;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
	@Autowired
	MerchantRepo merchantRepo;

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

//	@GetMapping ("/addDummy")
//	public void dummyData() {
//		
//		Merchant newMerch = new Merchant();
//		newMerch.setMerch_id("ZZZ000HH66");
//		newMerch.setMerch_name("IBM");
//		merchantRepo.save(newMerch);
//	}

	@PostMapping("/addMerchant")
	public String create(@RequestBody MerchantUI merchant){
		// save a single Customer
		merchantRepo.save(new Merchant(merchant.getMerch_id(), merchant.getMerch_name()));

		return "Merchant is created";
	}
	
//	@GetMapping("/addDummy")
//	public void dummyData() {
//		// save a single Customer
//		merchantRepo.save(new Merchant("333CCC44DD", "IBM"));
//
//	}
}

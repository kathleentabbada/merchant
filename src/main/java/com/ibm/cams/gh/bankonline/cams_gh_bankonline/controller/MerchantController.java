package com.ibm.cams.gh.bankonline.cams_gh_bankonline.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.Merchant;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.MerchantUI;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository.MerchantRepo;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/merchant")
@EnableSwagger2
public class MerchantController {
	@Autowired
	MerchantRepo merchantRepo;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json", value = "/merchant") 
//	@GetMapping
	public List<Merchant> getMerchantList() {

		List<Merchant> merchants = merchantRepo.findAll();

		return merchants;
	}

	@GetMapping("{id}")
	public Merchant getMerchantById(@PathVariable("id") String merch_id) {

		Merchant merchant = merchantRepo.findById(merch_id).orElseThrow(null);

		return merchant;
	}
	@RequestMapping(method = RequestMethod.POST, produces = "application/json", value = "/merchant/addMerchant") 
//	@PostMapping("/addMerchant")
	public String create(@RequestBody MerchantUI merchant){
		// save a single Customer
		merchantRepo.save(new Merchant(merchant.getMerch_id(), merchant.getMerch_name()));

		return "Merchant is created";
	}
}

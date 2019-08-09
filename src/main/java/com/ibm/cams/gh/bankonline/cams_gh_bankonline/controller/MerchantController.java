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

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public List<Merchant> getMerchantList() {
		List<Merchant> merchants = merchantRepo.findAll();
		return merchants;
	}

	@RequestMapping(method = RequestMethod.GET, produces = "application/json", value = "/MechantId/{id}")
	public Merchant getMerchantById(@PathVariable("id") String merchantId) {
		Merchant merchant = merchantRepo.findById(merchantId).orElseThrow(null);
		return merchant;
	}
	

	@RequestMapping(method = RequestMethod.GET, produces = "application/json", value = "/MerchantName/{merchantname}")
	public List<Merchant> getAccountByFirstname(@PathVariable String merchantname){
		List<Merchant> merch= merchantRepo.findByMerchantName(merchantname);
		return merch;
	}

	@RequestMapping(method = RequestMethod.POST, produces = "application/json", value = "/addMerchant")
	public String create(@RequestBody MerchantUI merchant) {
		merchantRepo.save(new Merchant(merchant.getMerchantId(), merchant.getMerchantName()));

		return "Merchant is created";
	}

	
}

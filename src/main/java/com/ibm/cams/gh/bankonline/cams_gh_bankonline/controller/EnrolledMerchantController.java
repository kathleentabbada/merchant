package com.ibm.cams.gh.bankonline.cams_gh_bankonline.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.EnrolledMerchant;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.EnrolledMerchantUI;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain.Transaction;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.generateid.GenerateID;
import com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository.EnrolledMerchantRepo;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/enrolledmerchant")
@EnableSwagger2
public class EnrolledMerchantController {
	@Autowired
	EnrolledMerchantRepo EnrolledmerchRepo;
	@Autowired
	GenerateID id;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public List<EnrolledMerchant> getMerchantList() {

		List<EnrolledMerchant> merchants = EnrolledmerchRepo.findAll();

		return merchants;
	}

	@RequestMapping(method = RequestMethod.GET, produces = "application/json", value = "/EnrolledMerchantId/{id}")
	public EnrolledMerchant getTransactionById(@PathVariable("id") String enrolledmerchantid) {
		EnrolledMerchant enmerchant = EnrolledmerchRepo.findById(enrolledmerchantid).orElseThrow(null);

		return enmerchant;
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json", value = "/MerchantId/{merchantid}")
	public List<EnrolledMerchant> getMerchantId(@PathVariable String merchantid){
		List<EnrolledMerchant> enmerchant= EnrolledmerchRepo.findByMerchantId(merchantid);
		return enmerchant;
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json", value = "/AccountNumber/{accountnumber}")
	public List<EnrolledMerchant> findByAccountNumber(@PathVariable String accountnumber){
		List<EnrolledMerchant> enmerchant= EnrolledmerchRepo.findByAccountNumber(accountnumber);
		return enmerchant;
	}
	

	@RequestMapping(method = RequestMethod.POST, produces = "application/json", value = "/addEnMerchant")
	public String create(@RequestBody EnrolledMerchantUI enrolledMerchant) {
		EnrolledmerchRepo.save(new EnrolledMerchant(id.generateid(),
				enrolledMerchant.getMerchantId(), enrolledMerchant.getAccountNumber()));
		return "Transaction is created";
	}

}

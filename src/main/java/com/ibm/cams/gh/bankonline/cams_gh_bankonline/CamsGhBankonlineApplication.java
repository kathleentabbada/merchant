package com.ibm.cams.gh.bankonline.cams_gh_bankonline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository.MerchantRepo;

@SpringBootApplication
public class CamsGhBankonlineApplication {

	@Autowired
	MerchantRepo merchantRepo;
	public static void main(String[] args) {
		SpringApplication.run(CamsGhBankonlineApplication.class, args);
	}

}

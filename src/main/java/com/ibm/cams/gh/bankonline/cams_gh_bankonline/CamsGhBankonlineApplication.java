package com.ibm.cams.gh.bankonline.cams_gh_bankonline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.ibm.cams.gh.bankonline.cams_gh_bankonline.repository.MerchantRepo;

@SpringBootApplication
public class CamsGhBankonlineApplication {

	@Autowired
	MerchantRepo merchantRepo;
	public static void main(String[] args) {
		SpringApplication.run(CamsGhBankonlineApplication.class, args);
	}
	
		@Bean
        public CorsFilter corsFilter() {
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*"); // this allows all origin
        config.addAllowedHeader("*"); // this allows all headers
        config.addAllowedMethod("GET");
        config.addAllowedMethod("POST");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
		}
    

}

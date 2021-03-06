package com.gmf.dps.oauthauthentication;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableOAuth2Sso
@SpringBootApplication
public class OauthAuthenticationApplication {

	@GetMapping("/")
	public String message(Principal principal) {
		return "Hi "+principal.getName()+", Welcome to Spring Cloud OAuth 2 Application";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(OauthAuthenticationApplication.class, args);
	}

}

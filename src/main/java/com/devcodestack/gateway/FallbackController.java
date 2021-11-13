package com.devcodestack.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/cinemaxFallBack")
	public String cinemaxFallBackMethod() {
		return "Cinemax services unavailable at the moment";
	}
}

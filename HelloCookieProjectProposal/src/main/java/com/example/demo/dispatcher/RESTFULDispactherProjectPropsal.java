package com.example.demo.dispatcher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class RESTFULDispactherProjectPropsal {
	
	@GetMapping("/")
	public String landingPage() {
		return("LandingPage.html");
	}

}

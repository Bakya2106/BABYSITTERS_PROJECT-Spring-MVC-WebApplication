package com.bae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Payment_gatewayController {
	
	//new 
	@RequestMapping(value="payment",method=RequestMethod.GET)
	public String payment() {
		
		return "payment";
	}
	//new
	@RequestMapping(value="thank",method=RequestMethod.GET)
	public String thank() {
		
		return "thank";
	} 

}

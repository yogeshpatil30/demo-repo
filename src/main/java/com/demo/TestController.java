package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class TestController {
	
	 @GetMapping("/send")
	    public String sendMessage() {
		 	System.out.println("START");
	        return "Demo of CICD";
	 }
	       
}

package com.cg.ofr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class UserController {
	
	@RequestMapping("/user")
	public String service() {
		return "service";
	}
}
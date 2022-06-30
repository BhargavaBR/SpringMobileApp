package com.appsdeveloperblogapp.ws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
/*@RequestMapping("/user")*/
public class userContriller {
	@GetMapping("/user")
	public String getUser() {
		return "users";
	}

}

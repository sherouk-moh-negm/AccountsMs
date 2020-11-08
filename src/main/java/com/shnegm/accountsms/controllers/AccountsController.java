package com.shnegm.accountsms.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountsController {
	@Value("${server.port}")
	private String portNumber;
	@GetMapping("/status")
	public String status() {
		return "accounts-ms is working..."+portNumber;
	}
}

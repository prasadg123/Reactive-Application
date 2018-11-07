package com.prasad.reacive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.prasad.reacive.repository.AccountRepository;

@RestController
public class AccountController {

	@Autowired
	private AccountRepository accountRepository;
	
	
}

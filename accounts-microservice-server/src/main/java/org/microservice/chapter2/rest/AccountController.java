package org.microservice.chapter2.rest;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	@RequestMapping("/accounts")
	public Account[] all() {
		List<Account> accounts = accountRepository.getAllAccounts();
		return accounts.toArray(new Account[accounts.size()]);
	}
	
	@RequestMapping("/accounts/{id}")
	public Account byId(@PathVariable("id") String id) {
		Account account = accountRepository.getAccount(id);
		return account;
	}
	
}

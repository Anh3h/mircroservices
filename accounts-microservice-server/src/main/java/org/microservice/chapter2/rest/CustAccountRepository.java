package org.microservice.chapter2.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CustAccountRepository implements AccountRepository {

private Map<String, Account> accountsByNumber = new HashMap<String, Account>();
	
	public CustAccountRepository() {
		Account account = new Account(1000l, "Arnav" , "5115");
		accountsByNumber.put("5115", account);
		account = new Account(2000l, "Anamika" , "2089");
		accountsByNumber.put("2089", account);
		account = new Account(3000l, "Dinesh" , "1286");
		accountsByNumber.put("1286", account);
	}
	
	@Override
	public List<Account> getAllAccounts() {
		return new ArrayList<Account>(accountsByNumber.values());
	}

	@Override
	public Account getAccount(String number) {
		return accountsByNumber.get(number);
	}

}
package org.microservice.chapter2;

import java.util.List;

public interface AccountRepository {
	List<Account> getAllAccounts();
	
	Account getAccount(String number);
}

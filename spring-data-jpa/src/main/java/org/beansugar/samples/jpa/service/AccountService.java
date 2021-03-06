package org.beansugar.samples.jpa.service;

import lombok.Setter;
import org.beansugar.samples.jpa.model.Account;
import org.beansugar.samples.jpa.repository.AccountRepository;

/**
 * @author archmagece
 * @since 2014. 7. 27.
 * beansguar.org
 */
public class AccountService {

	@Setter
	private AccountRepository accountRepository;

	public void addUser(Account account){
		accountRepository.saveAndFlush(account);
	}

	public Account showUser(String username){
		return accountRepository.findByUsername(username).get(0);
	}
}

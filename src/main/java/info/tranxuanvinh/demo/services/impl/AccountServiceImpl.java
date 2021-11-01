/**
 * 
 */
package info.tranxuanvinh.demo.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import info.tranxuanvinh.demo.entities.Account;
import info.tranxuanvinh.demo.repositories.AccountRepository;
import info.tranxuanvinh.demo.services.AccountService;

/**
 * @author vinht
 *
 */
public class AccountServiceImpl implements AccountService {
	@Autowired private AccountRepository accountRepository;
	
	@Transactional
	@Override
	public List<Account> findByAccountOwnerId(Integer accountOwnerId) {
		return accountRepository.findByAccountOwnerId(accountOwnerId);
	}

}

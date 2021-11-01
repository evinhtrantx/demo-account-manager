/**
 * 
 */
package info.tranxuanvinh.demo.services;

import java.util.List;

import info.tranxuanvinh.demo.entities.Account;

/**
 * @author vinht
 *
 */
public interface AccountService {
	public List<Account> findByAccountOwnerId(Integer accountOwnerId);
}

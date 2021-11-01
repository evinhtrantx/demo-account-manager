/**
 * 
 */
package info.tranxuanvinh.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import info.tranxuanvinh.demo.entities.Account;

/**
 * @author vinht
 *
 */
public interface AccountRepository extends CrudRepository<Account, Integer> {
	public List<Account> findByAccountOwnerId(Integer accountOwnerId);
}

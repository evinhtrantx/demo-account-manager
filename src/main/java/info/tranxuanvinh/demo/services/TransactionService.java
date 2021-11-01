/**
 * 
 */
package info.tranxuanvinh.demo.services;

import java.util.List;

import info.tranxuanvinh.demo.entities.Transaction;

/**
 * @author vinht
 *
 */
public interface TransactionService {
	public List<Transaction> findByAccountNumber(String accountNumber);
}

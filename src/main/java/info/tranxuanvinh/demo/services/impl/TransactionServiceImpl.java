/**
 * 
 */
package info.tranxuanvinh.demo.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.tranxuanvinh.demo.entities.Transaction;
import info.tranxuanvinh.demo.repositories.TransactionRepository;
import info.tranxuanvinh.demo.services.TransactionService;

/**
 * @author vinht
 *
 */
@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired private TransactionRepository transactionRepository;
	@Transactional
	@Override
	public List<Transaction> findByAccountNumber(String accountNumber) {
		return transactionRepository.findByAccountNumber(accountNumber);
	}

}

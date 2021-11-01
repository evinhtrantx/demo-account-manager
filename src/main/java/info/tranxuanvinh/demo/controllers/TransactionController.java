package info.tranxuanvinh.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import info.tranxuanvinh.demo.entities.Transaction;
import info.tranxuanvinh.demo.services.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

	@Autowired private TransactionService transactionService;
	@GetMapping("/{accountNumber:[0-9]+}")
	public List<Transaction> getAccountTransaction(@PathVariable("accountNumber") String accountNumber){
		return transactionService.findByAccountNumber(accountNumber);
	}
}

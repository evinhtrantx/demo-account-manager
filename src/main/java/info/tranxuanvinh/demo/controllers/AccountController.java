/**
 * 
 */
package info.tranxuanvinh.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import info.tranxuanvinh.demo.entities.Account;
import info.tranxuanvinh.demo.services.AccountService;

/**
 * @author vinht
 *
 */
@RestController
@RequestMapping("/accounts")
public class AccountController {

	@Autowired	private AccountService accountService;
	@GetMapping("/{accountOwnerId:[0-9]+}")
	public List<Account> getAccountList(@PathVariable("accountOwnerId") Integer accountOwnerId){
		return accountService.findByAccountOwnerId(accountOwnerId);
	}
}

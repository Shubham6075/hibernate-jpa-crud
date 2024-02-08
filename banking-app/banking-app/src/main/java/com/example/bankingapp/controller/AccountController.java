package com.example.bankingapp.controller;

import com.example.bankingapp.dto.AccountDto;
import com.example.bankingapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;

	// add account rest api
	@PostMapping("/save")
	public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
		return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
	}

	// get account by id rest api
	@GetMapping("/get/{id}")
	public ResponseEntity<AccountDto> getAccountById(@PathVariable("id") Long id){
		AccountDto accountDto = accountService.getAccountById(id);

		return ResponseEntity.ok(accountDto);
	}

	// deposit rest api
	@PutMapping("/put/{id}/deposit")
	public ResponseEntity<AccountDto> deposit(@PathVariable Long id,
	                                          @RequestBody Map<String,Double> request){

		Double amount = request.get("amount");

		AccountDto accountDto = accountService.deposit(id,amount);

		return ResponseEntity.ok(accountDto);
	}

	// withdraw rest api
	@PutMapping("/put/{id}/withdraw")
	public ResponseEntity<AccountDto> withdraw(@PathVariable Long id,
	                                          @RequestBody Map<String,Double> request){

		double amount = request.get("amount");

		AccountDto accountDto = accountService.withdraw(id,amount);

		return ResponseEntity.ok(accountDto);
	}

	// get all accounts rest api
	@GetMapping("/get/all")
	public ResponseEntity<List<AccountDto>> getAllAccounts(){

		List<AccountDto> accounts = accountService.getAllAccounts();

		return ResponseEntity.ok(accounts);
	}

	// delete account rest api
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteAccount(@PathVariable Long id){

		accountService.deleteAccount(id);

		return ResponseEntity.ok("Account deleted successfully");
	}
}

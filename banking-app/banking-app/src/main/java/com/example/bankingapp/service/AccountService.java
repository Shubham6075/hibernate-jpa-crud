package com.example.bankingapp.service;

import com.example.bankingapp.dto.AccountDto;
import com.example.bankingapp.entity.Account;

import java.util.List;

public interface AccountService {

	AccountDto createAccount(AccountDto accountDto);

	AccountDto getAccountById(Long id);

	AccountDto deposit(Long id, double amount);

	AccountDto withdraw(Long id, double amount);

	List<AccountDto> getAllAccounts();

	void deleteAccount(Long id);
}

package com.example.bankingapp.mapper;

import com.example.bankingapp.dto.AccountDto;
import com.example.bankingapp.entity.Account;

public class AccountMapper {  // this is used to map dto to entity and vice versa

	public static Account mapToAccount(AccountDto accountDto) {

		Account account = new Account(
				accountDto.getId(),
				accountDto.getAccountHolderName(),
				accountDto.getBalance()
		);

		return account;
	}

	public static AccountDto mapToAccountDto(Account account){

		AccountDto accountDto = new AccountDto(
				account.getId(),
				account.getAccountHolderName(),
				account.getBalance()
		);
		return accountDto;
	}
}

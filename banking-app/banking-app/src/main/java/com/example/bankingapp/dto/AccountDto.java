package com.example.bankingapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
public class AccountDto {

	private Long id;
	private String accountHolderName;
	private double balance;
}


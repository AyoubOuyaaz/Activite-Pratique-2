package com.sid.bankaccountservice.service;

import com.sid.bankaccountservice.dto.BankAccountRequestDTO;
import com.sid.bankaccountservice.dto.BankAccountResponseDTO;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}


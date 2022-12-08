package com.sid.bankaccountservice.repositories;

import com.sid.bankaccountservice.entities.BankAccount;
import com.sid.bankaccountservice.enums.AccountType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {

}

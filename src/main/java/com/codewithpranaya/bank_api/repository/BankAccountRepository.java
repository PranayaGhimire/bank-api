package com.codewithpranaya.bank_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithpranaya.bank_api.entity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
    BankAccount findByAccountNumber(String accountNumber);
}

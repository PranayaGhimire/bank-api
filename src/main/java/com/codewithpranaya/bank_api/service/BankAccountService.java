package com.codewithpranaya.bank_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithpranaya.bank_api.entity.BankAccount;
import com.codewithpranaya.bank_api.repository.BankAccountRepository;

@Service
public class BankAccountService {
    
    @Autowired
    private  BankAccountRepository repository;

    public BankAccount createAccount(BankAccount account) {
        return repository.save(account);
    }

    public List<BankAccount> getAllAccounts() {
        return repository.findAll();
    }

    public BankAccount getAccountById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public BankAccount updateAccount(Long id, BankAccount updatedAccount) {
        BankAccount existing = repository.findById(id).orElse(null);
        if(existing != null){
            existing.setAccountHolderName(updatedAccount.getAccountHolderName());
            existing.setBalance(updatedAccount.getBalance());
            existing.setAccountType(updatedAccount.getAccountType());
            return repository.save(existing);
        }
        return null;
    }

    public void deleteAccount(Long id) {
        repository.deleteById(id);
    }
}

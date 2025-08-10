package com.codewithpranaya.bank_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithpranaya.bank_api.entity.BankAccount;
import com.codewithpranaya.bank_api.service.BankAccountService;

@RestController
@RequestMapping("/api/accounts")
public class BankAccountController {
    
    @Autowired
    private BankAccountService service;

    @PostMapping
    public BankAccount create(@RequestBody BankAccount account) {
        return service.createAccount(account);
    }

    @GetMapping
    public List<BankAccount> getAll() {
        return service.getAllAccounts();
    }

    @GetMapping("/{id}")
    public BankAccount getById(@PathVariable Long id) {
        return service.getAccountById(id);
    }

    @PutMapping("/{id}")
    public BankAccount update(@PathVariable Long id, @RequestBody BankAccount account) {
        return service.updateAccount(id, account);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteAccount(id);
    }
}

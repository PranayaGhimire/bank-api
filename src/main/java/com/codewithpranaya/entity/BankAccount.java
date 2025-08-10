package com.codewithpranaya.entity;

import jakarta.persistence.*;

@Entity
public class BankAccount {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String accountHolderName;

    @Column(unique = true)
    private String accountNumber;

    private Double balance;
    private String accountType;

    // Constructors
    public BankAccount(String accountHolderName, String accountNumber, Double balance, String accountType) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType =accountType; 
    }

    // Getters and Setters
    public Long getId() { return id; }
    
    public String getAccountHolderName() { return accountHolderName; }
    public void setAccountHolderName(String name) { this.accountHolderName = name; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accNo) { this.accountNumber =accNo; }

    public  Double getBalance() { return balance; }
    public void setBalance(Double balance) { this.balance = balance; }

    public String getAccountType() { return accountType; }
    public void setAccountType(String type) { this.accountType=type; }
}


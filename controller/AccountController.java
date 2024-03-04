package controller;

import model.Account;
import service.AccountService;
import serviceImpl.AccountServiceImpl;

import java.util.Scanner;

public class AccountController {
    AccountService account;
    public AccountController(){
        this.account = AccountServiceImpl.getInstance(); }

    public String create(Scanner sc){
        return account.createAccount(Account.builder()
                .id(sc.nextLong())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build()
        );
    }

    public String deposit(Scanner sc) {
        return account.deposit(Account.builder()
            .id(sc.nextLong())
            .accountNumber(sc.next())
            .accountHolder(sc.next())
            .balance(sc.nextDouble())
            .transactionDate(null)
            .build());
    }

    public String withdraw(Scanner sc) {
        return account.withdraw(Account.builder()
            .id(sc.nextLong())
            .accountNumber(sc.next())
            .accountHolder(sc.next())
            .balance(sc.nextDouble())
            .transactionDate(null)
            .build());
    }

    public String getBalance() {
        return null;
    }

    public String deleteAccount(Scanner sc) {
        return account.deleteAccount(sc.next());
    }
}

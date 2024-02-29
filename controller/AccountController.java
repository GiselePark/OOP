package controller;

import builder.AccountBuilder;
import model.AccountDto;
import service.AccountService;
import serviceImpl.AccountServiceImpl;

import java.util.List;
import java.util.Scanner;

public class AccountController {
    AccountService account;
    public AccountController(){
        this.account = AccountServiceImpl.getInstance(); }


    public String create(Scanner sc) {
        return null;
    }

    public String login(Scanner sc) {
        return null;
    }

    public String deposit(Scanner sc) {
        return null;
    }

    public String withdraw(Scanner sc) {
        return null;
    }

    public String getBalance() {
        return null;
    }

    public String deleteAccount(Scanner sc) {
        return null;
    }
}

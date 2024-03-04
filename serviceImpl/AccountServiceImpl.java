package serviceImpl;

import model.Account;
import model.User;
import service.AccountService;


import java.util.*;

public class AccountServiceImpl implements AccountService {

    private static AccountService instance = new AccountServiceImpl();
    Map<String, User> users;

    private AccountServiceImpl() {
        this.users = new HashMap<>();
    }

    public static AccountService getInstance() {
        return instance;
    }

    @Override
    public String createAccount(Account account) {
        return null;
    }

    @Override
    public String deposit(Account account) {
        return null;
    }

    @Override
    public String withdraw(Account account) {
        return null;
    }

    @Override
    public List<Account> getBalance(String accountNumber) {
        return null;
    }

    @Override
    public List<Account> getAccount(String accountNumber) {
        return null;
    }

    @Override
    public String deleteAccount(String account) {
        return null;
    }
}

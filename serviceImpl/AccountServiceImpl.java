package serviceImpl;

import model.AccountDto;
import model.UserDto;
import service.AccountService;


import java.util.*;

public class AccountServiceImpl implements AccountService {

    private static AccountService instance = new AccountServiceImpl();
    Map<String, UserDto> users;

    private AccountServiceImpl() {
        this.users = new HashMap<>();
    }

    public static AccountService getInstance() {
        return instance;
    }


    @Override
    public String createAccount(AccountDto account) {
        return null;
    }

    @Override
    public String deposit(AccountDto account) {
        return null;
    }

    @Override
    public String withdraw(AccountDto account) {
        return null;
    }

    @Override
    public List<AccountDto> getBalance(String accountNumber) {
        return null;
    }

    @Override
    public List<AccountDto> getAccount(String accountNumber) {
        return null;
    }

    @Override
    public String cancelAccount(String accountNumber) {
        return null;
    }
}

package service;

import model.Account;
import java.util.List;

public interface AccountService {
    String createAccount(Account account);
    String deposit(Account account);
    String withdraw(Account account);
    List<Account> getBalance(String accountNumber);
    List<Account> getAccount(String accountNumber);
    String deleteAccount(String account);
}

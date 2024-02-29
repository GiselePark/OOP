package service;

import model.AccountDto;
import java.util.List;
import java.util.Scanner;

public interface AccountService {
    String createAccount(AccountDto account);

    String deposit(AccountDto account);

    String withdraw(AccountDto account);

    List<AccountDto> getBalance(String accountNumber);
    List<AccountDto> getAccount(String accountNumber);

    String cancelAccount(String accountNumber);
}

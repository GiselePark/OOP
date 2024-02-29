package view;

import controller.AccountController;
import java.util.Scanner;

public class AccountView {
    public static void main(Scanner sc) {
        AccountController accountController = new AccountController();
        while (true) {
            System.out.println("================== Banking Service ==================");
            System.out.println("[Banking] 0-Exit\n" +
                    "1-Create Account\n" +
                    "2-Deposit\n" +
                    "3-Withdraw\n" +
                    "4-Balance\n" +
                    "5-DeleteAccount");
            switch (sc.next()) {
                case "0":
                    System.out.println(" === Close the banking program. === ");
                    return;
                case "1":
                    System.out.println("Create Account");
                    System.out.println(accountController.create(sc));
                    break;
                case "2":
                    System.out.println("Deposit");
                    System.out.println(accountController.deposit(sc));
                    break;
                case "3":
                    System.out.println("Withdraw");
                    System.out.println(accountController.withdraw(sc));
                    break;
                case "4":
                    System.out.println("Balance");
                    System.out.println(accountController.getBalance());
                    break;
                case "5":
                    System.out.println("Delete Account");
                    System.out.println(accountController.deleteAccount(sc));
                    break;
            }
        }
    }
}

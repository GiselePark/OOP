package service;

import model.User;

import java.util.Map;
import java.util.Scanner;

public interface UserService {
    String join(Scanner sc);
    String addUsers();
    User findUserById(Scanner sc);
    String count();
    Map userList();
    String login(User build);
    String updatePassword(Scanner sc);
    String deleteAccount(Scanner sc);
}

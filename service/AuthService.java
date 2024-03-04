package service;

import model.User;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {

    String join(User user);
    String login(User user);
    String  addUsers();
    User updatePassword(Scanner sc);
    Map<String, User> getUserMap();
    String count();
}

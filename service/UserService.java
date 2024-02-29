package service;

import model.UserDto;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface UserService {
    String join(Scanner sc);
    String addUsers();
    UserDto findUserById(Scanner sc);
    String count();
    Map userList();
    String login(UserDto build);
    String updatePassword(Scanner sc);
    String deleteAccount(Scanner sc);
}

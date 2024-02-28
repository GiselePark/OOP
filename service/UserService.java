package service;

import model.UserDto;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface UserService {
    String join(Scanner sc);
    String addUsers();
    String count();
    Map userList();

    String login(UserDto build);
}

package service;

import model.UserDto;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface AuthService {

    String join(UserDto user);
    String login(UserDto user);
    String  addUsers();
    Map<String, UserDto> getUserMap();
    String count();
}

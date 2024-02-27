package service;

import model.UserDto;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {

    //login. join 회원가입, 로그인
    String join(Scanner sc);
    String login(); //현재 public
     String addUsers();
    UserDto findUser(String username);
    Map<String, UserDto> getUserMap();
    String count();
}

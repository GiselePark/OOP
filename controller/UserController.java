package controller;

import builder.UserBuilder;
import model.UserDto;
import service.AuthService;
import service.UserService;
import serviceImpl.AuthServiceImpl;
import serviceImpl.UserServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserController {
    UserService user;
    public UserController(){
        this.user = UserServiceImpl.getInstance();
    }

    public String join(Scanner sc) {
        return user.join(sc);
    }

    public String addUsers() {
        return user.addUsers();
    }

    public UserDto findUserById(Scanner sc){
        return user.findUserById(sc);
    }

    public String count() {
        return user.count();
    }

    public Map userList() {
        return user.userList();
    }

    public String login(Scanner sc) {
        System.out.println("아이디, 비밀번호 입력해 주세요.");
        return user.login(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }

    public String updatePassword(Scanner sc) {
        return user.updatePassword(sc);
    }

    public String deleteAccount(Scanner sc) {
        return user.deleteAccount(sc);
    }
}


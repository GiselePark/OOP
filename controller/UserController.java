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
    UserService service;
    public UserController(){
        this.service = UserServiceImpl.getInstance();
    }

    public String join(Scanner sc) {
        return service.join(sc);
    }

    public String addUsers() {
        return service.addUsers();
    }

    public String count() {
        return service.count();
    }


    public Map userList() {
        return service.userList();
    }

    public String login(Scanner sc) {
        System.out.println("아이디, 비밀번호 입력해 주세요.");
        return service.login(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }
}


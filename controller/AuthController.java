package controller;

import model.UserDto;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class AuthController {// implements AuthService 추가해 Service와 Controller 일치하는 지 확인, 이후 지워야 함
    AuthService service;

    public AuthController() {
        this.service = AuthServiceImpl.getInstance();
    }

    public String join(Scanner sc) {
        return service.join(sc);
    }

    public String login() {
        return service.login();
    }

    public String addUsers() {
        return service.addUsers();
    }

    public UserDto findUser(String username) {
        return service.findUser(username);
    }

    public Map<String, UserDto> getUserMap() {
        return service.getUserMap();
    }

    public String count() {
        return service.count();
    }


}

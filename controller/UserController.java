package controller;

import model.UserDto;
import service.AuthService;
import service.UserService;
import serviceImpl.AuthServiceImpl;
import serviceImpl.UserServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserController {
    UserService service;
    public String join(UserDto user) {
        return null;
    }

    public String login(UserDto user) {
        return null;
    }

    public UserDto findUser(String username) {
        return null;
    }

    public void updatePassword(UserDto user) {

    }

    public String deleteUser(String username) {
        return null;
    }

    public List<UserDto> getUserlist() {
        return null;
    }

    public List<UserDto> findUserByName(String name) {
        return null;
    }

    public List<UserDto> findUserByJob(String job) {
        return null;
    }

    public int countUsers() {
        return 0;
    }
}


package controller;

import model.User;
import service.UserService;
import serviceImpl.UserServiceImpl;

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

    public User findUserById(Scanner sc){
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
        return user.login(User.builder()
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


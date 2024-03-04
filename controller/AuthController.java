package controller;

import model.User;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AuthController {// implements AuthService 추가해 Service와 Controller 일치하는 지 확인, 이후 지워야 함
    static AuthService service;


    public AuthController() {
        this.service = AuthServiceImpl.getInstance();
    }

    public String join(Scanner sc) {

        System.out.println("ID, " +
                "비밀번호, " +
                "비밀번호 확인, " +
                "이름, " +
                "주민번호 " +
                "전화번호, " +
                "주소, " +
                "직업을 입력해주세요");
        return service.join(User.builder()
                .username(sc.next())
                .password(sc.next())
                .passwordConfirm(sc.next())
                .name(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build());
    }

    public String login(Scanner sc) {
        System.out.println("아이디를 입력해 주세요.: ");
        return service.login(User.builder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }

    public String addUsers() {
        return service.addUsers();
    }



    public static Map<String, User> getUserMap() {
        return service.getUserMap();
    }

    public static String count() {
        return service.count();
    }


    public String updatePassword(Scanner sc) {
        return null;
    }

    public User deleteAccount(Scanner sc) {
        return null;
    }

    public List<String> findUserByName(Scanner sc) {
        return null;
    }

    public List<String> findUserByJob(Scanner sc) {
        return null;
    }
}

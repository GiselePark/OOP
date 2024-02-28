package serviceImpl;

import builder.UserBuilder;
import model.UserDto;
import service.AuthService;
import service.UtilService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    Map<String, UserDto> users;
    UtilService util = UtilServiceImpl.getInstance();

    private AuthServiceImpl() {
        this.users = new HashMap<>();
    }

    public static AuthService getInstance() {
        return instance;
    }

    @Override
    public String join(UserDto user) {
        users.put(user.getUsername(), user);
        return "회원가입을 축하합니다.";
    }

    public String login(UserDto user) {
        String msg = "";
        UserDto userInMap = users.get(user.getUsername());
        if (userInMap == null) {
            msg = "미등록 아이디";
        } else {
            if (userInMap.getPassword().equals((user.getUsername()))) {
                msg = "로그인 성공";
            } else {
                msg = "비밀번호 불일치";
            }
        }
        return msg;
    }


    @Override
    public String count() {
        return users.size() + "";
    }

    @Override
    public String addUsers() {
        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUsername();
            users.put(username, new UserBuilder()
                    .username(username)
                    .password("1")
                    .passwordConfirm("1")
                    .name(util.createRandomName())
                    .build());
        }
        System.out.println(users.size() + "명");
        return users.size() + "";
    }

    @Override
    public Map<String, UserDto> getUserMap() {
        users.forEach((k, v) -> System.out.print("{" + k + "," + v + "},"));
        return users;
    }
}


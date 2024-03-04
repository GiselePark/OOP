package serviceImpl;

import model.User;
import service.AuthService;
import service.UtilService;

import java.util.*;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    UtilService util = UtilServiceImpl.getInstance();

    Map<String, User> users;
    List<User> userList;

    private AuthServiceImpl() {
        this.users = new HashMap<>();
        this.userList = new ArrayList<>();
    }


    public static AuthService getInstance() {
        return instance;
    }


    @Override
    public String join(User user) {
        users.put(user.getUsername(), user);
        return "회원가입을 축하합니다.";
    }

    public String login(User user) {
        String msg = "";
        User userInMap = users.get(user.getUsername());
        if (userInMap == null) {
            msg = "계정을 찾을 수 없습니다.";
        } else {
            if (userInMap.getPassword().equals((user.getUsername()))) {
                msg = "로그인에 성공했습니다!";
            } else {
                msg = "비밀번호가 일치하지 않습니다.";
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
            users.put(username, User.builder()
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
    public User updatePassword(Scanner sc) {
        return null;
    }

    @Override
    public Map<String, User> getUserMap() {
        users.forEach((k, v) -> System.out.print("{" + k + "," + v + "},"));
        return users;
    }
}


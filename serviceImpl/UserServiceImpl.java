package serviceImpl;

import builder.UserBuilder;
import model.UserDto;
import repository.UserRepository;
import service.UserService;
import service.UtilService;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    UserRepository userRepository;
    Map<String, UserDto> users;

    public UserServiceImpl() {
        userRepository = new UserRepository();
        users = new HashMap<>();
    }

    public String addUsers() {

        UtilService util = UtilServiceImpl.getInstance();

        Map<String, UserDto> map = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUsername(); // util.을 통해 UtilServiceImpl 클래스의 createRandomUsername 이라는 기능을 가져와 String 타입의 문자열 값을 넣기 위해 username 이라는 변수에 참조값을 할당하였음.
            map.put(username,
                    new UserBuilder()
                            .username(username)
                            .password("1")
                            .passwordConfirm("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return "addusers 결과 : " + users + "개 더미값 추가";
    }

    @Override
    public UserDto findUserById(Scanner sc) {
        System.out.println("찾을 계정의 아이디를 입력하세요.");
        String userId = sc.next();
        UserDto user = users.get(userId);
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("아이디가 존재하지 않습니다");
        }

        return user;
    }

    private static UserServiceImpl instance = new UserServiceImpl();

    public static UserServiceImpl getInstance() {
        return instance;
    }

    @Override
    public String join(Scanner sc) {
        System.out.println("아이디, 비밀번호, 비밀번호 확인, 이름, 주민번호, 전화번호, 주소, 직업을 입력하세요.");
        String username = sc.next();
        users.put(username,
                new UserBuilder()
                        .username(username)
                        .password(sc.next())
                        .passwordConfirm(sc.next())
                        .name(sc.next())
                        .ssn(sc.next())
                        .phoneNumber(sc.next())
                        .address(sc.next())
                        .job(sc.next())
                        .build());

        return "회원가입을 축하합니다!";
    }

    @Override
    public String count() {
        return users.size() + "";
    }  //int -> String

    @Override
    public Map<String, UserDto> userList() {
        return users;
    }

    @Override
    public String login(UserDto build) {
        String msg = "";
        UserDto userInMap = users.get(build.getUsername());
        if (userInMap == null) {
            msg = "계정을 찾을 수 없습니다.";
        } else {
            if (userInMap.getPassword().equals(userInMap.getPassword())) {
                msg = "로그인에 성공했습니다!";
            } else {
                msg = "비밀번호가 일치하지 않습니다.";
            }
        }
        return msg;
    }

    @Override
    public String updatePassword(Scanner sc) {
        String msg = "";
        System.out.println("아이디를 입력하세요.");
        String username = sc.next();
        UserDto user = users.get(username);
        if (user != null) {
            System.out.println("비밀번호를 입력하세요.");
            String password = sc.next();

            if (user.getPassword().equals(password)) {
                System.out.println(username + "님 안녕하세요." + '\n'
                        + "새로운 비밀번호를 입력하세요.");
                String newPassword = sc.next();
                user.setPassword(newPassword);
                msg = "비밀번호가 변경되었습니다.";
            } else {
                msg = "비밀번호가 틀렸습니다.";
            }
        } else {
            msg = "존재하지 않는 아이디입니다.";
        }
        return msg;
    }

    @Override
    public String deleteAccount(Scanner sc) {
        String msg = "";
        System.out.println("삭제할 계정의 아이디를 입력하세요.");
        String username = sc.next();
        UserDto user = users.get(username);
        if (username != null) ;
        {
            System.out.println("비밀번호를 입력하세요.");
            String password = sc.next();
            if (password != null) {
                msg = "계정이 삭제됩니다.";
            } else {
                msg = "존재하지 않는 아이디입니다.";
            }
            return null;

        }
    }
}

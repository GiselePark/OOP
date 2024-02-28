package serviceImpl;

import builder.UserBuilder;
import model.UserDto;
import repository.UserRepository;
import service.UserService;
import service.UtilService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    UserRepository userRepository;
    Map<String, UserDto> users;
    public UserServiceImpl() {
        userRepository = new UserRepository();
        users = new HashMap<>();
    }

    public String addUsers(){

        UtilService util = UtilServiceImpl.getInstance();

        Map<String, UserDto> map=new HashMap<>();

        for(int i=0; i<5; i++){
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
        return "addusers 결과 : "+users+"개 더미값 추가";
    }
    private static UserServiceImpl instance = new UserServiceImpl();

    public static UserServiceImpl getInstance() {
        return instance;
    }
    @Override
    public String join(Scanner sc) {
        System.out.println("ID, 비밀번호, 비밀번호 확인, 이름, 주민번호, 전화번호, 주소, 직업을 입력해 주세요.");
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

        return "회원가입을 축하합니다.";
    }

    @Override
    public String count() {
        return users.size()+"";
    }  //int -> String

    @Override
    public Map<String, UserDto> userList() {
        return users;
    }

    @Override
    public String login(UserDto build) {

        String msg = "";
        UserDto userInMap = users.get(build.getUsername());
        if(userInMap==null) {
            msg = "아이디 불일치";
        }else{
            if(userInMap.getPassword().equals(userInMap.getPassword())){
                msg = "로그인 성공";
            }else{
                msg ="비밀번호 불일치";
            }
        }
        return msg;
    }
}

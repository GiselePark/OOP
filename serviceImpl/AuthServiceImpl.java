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
    private static AuthServiceImpl instance = new AuthServiceImpl();
    Map<String, UserDto> users;
    private AuthServiceImpl() {
        this.users = new HashMap<>();
    }
    public static AuthServiceImpl getInstance() {
        return instance;
    }
    @Override
    public String join (Scanner sc) {
        return null;
    }

    @Override
    public String login() {
        return null;
    }
    @Override
    public String addUsers(){ Map<String, UserDto> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0; i<5; i++){
            String username = util.createRandomUsername();
            map.put(username,
                    new UserBuilder()
                            .username(username)
                            .password("1")
                            .passwordConfirm("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return "더미값 추가";
    }

    @Override
    public UserDto findUser(String username) {
        UserDto user = new UserBuilder().build();
        return user;
    }
    @Override

    public Map<String, UserDto> getUserMap() {
        users.forEach((k,v)-> System.out.print("{"+k+","+v+"},"));
        return users;
    }
    @Override
    public String count(){
        System.out.println(users.size()+"명");
        return users.size()+"";
    }
}

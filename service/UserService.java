package service;

import model.UserDto;

import java.util.List;

public interface UserService {
    String join(UserDto user);
    String login(UserDto user);
    UserDto findUser(String username);
    void updatePassword(UserDto user);
    String deleteUser(String username);
    List<UserDto> getUserlist();
    List<UserDto> findUserByName(String name);
    List<UserDto> findUserByJob(String job);
    int countUsers();

}

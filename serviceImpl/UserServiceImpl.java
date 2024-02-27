package serviceImpl;

import model.UserDto;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public String join(UserDto user) {
        return null;
    }

    @Override
    public String login(UserDto user) {
        return null;
    }

    @Override
    public UserDto findUser(String username) {
        return null;
    }

    @Override
    public void updatePassword(UserDto user) {

    }

    @Override
    public String deleteUser(String username) {
        return null;
    }

    @Override
    public List<UserDto> getUserlist() {
        return null;
    }

    @Override
    public List<UserDto> findUserByName(String name) {
        return null;
    }

    @Override
    public List<UserDto> findUserByJob(String job) {
        return null;
    }

    @Override
    public int countUsers() {
        return 0;
    }
}

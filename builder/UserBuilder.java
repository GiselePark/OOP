package builder;

import model.UserDto;

public class UserBuilder {
    private String username;
    private String password;
    private String pwAgain;
    private String name;
    private String ssn;
    private String phoneNumber;
    private String address;
    private String job;

    public UserBuilder username(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder password(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder pwAgain(String pwAgain) {
        this.pwAgain = pwAgain;
        return this;
    }

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder ssn(String ssn) {
        this.ssn = ssn;
        return this;
    }

    public UserBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder job(String job) {
        this.job = job;
        return this;
    }

    public UserDto build() {
        return new UserDto(username, password, pwAgain, name, ssn, phoneNumber, address, job);

        }
    }

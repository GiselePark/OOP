package model;

public class UserDto {
    private int id;
    private String username;
    private String password;
    private String pwAgain;
    private String name;
    private String ssn;
    private String phoneNumber;
    private String address;
    private String job;
    private double height;
    private double weight;

    public UserDto(String username, String password, String pwAgain, String name,
                   String ssn, String phoneNumber, String address,
                   String job, double height, double weight) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
    }

    public UserDto(String username, String password, String pwAgain, String name, String ssn, String phoneNumber, String address, String job) {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getssn() {
        return this.ssn;
    }

    public void setssn(String ssn) {
        this.ssn = ssn;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }


    public String toString() {
        return "MemberModel{" +
                "username='" + username +
                ", passWord='" + password +
                ", userName='" + name +
                ", ssn='" + ssn +
                ", phoneNumber='" + phoneNumber +
                ", address='" + address +
                ", job='" + job +
//                ", name='" + name +
//                ", bmi=" + bmi +
//                ", bodyMass='" + bodyMass +  +
                '}'+"\n";

    }

}

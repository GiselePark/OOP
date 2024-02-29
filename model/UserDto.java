package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDto {
    private String username;
    private String password;
    private String pwAgain;
    private String name;
    private String ssn;
    private String phoneNumber;
    private String address;
    private String job;



}

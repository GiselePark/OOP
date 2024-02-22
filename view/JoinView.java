package view;

import builder.UserBuilder;
import model.UserDto;

import java.util.Scanner;

public class JoinView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID,비밀번호, 비밀번호 확인, 이름, 주민번호, 전화번호, 주소, 직업을 입력해 주세요.");
        int a = 0;
        UserDto user = new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .pwAgain(sc.next())
                .name(sc.next())
                .ssn(sc.next())
                .phoneNumber(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build();

        System.out.println(user.toString());
    }
}

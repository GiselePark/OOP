package view;

import controller.UserController;

import java.util.Map;
import java.util.Scanner;

public class UserView {
    public static void main(Scanner sc) {
        UserController userController = new UserController();
        String msg = userController.addUsers();

        while(true){
            System.out.println("[메뉴] 0-종료\n" +
                    "1-회원가입\n" +
                    "2-로그인\n" +
                    "3-아이디검색\n" +
                    "4-비밀번호 변경\n" +
                    "5-회원탈퇴\n" +
                    "6-회원목록\n" +
                    "7-이름검색\n" +
                    "8-직업검색\n" +
                    "9-회원수");
            switch (sc.next()){
                case "0":
                    System.out.println("종료");return;
                case "1":
                    System.out.println(userController.join(sc));
                    break;
                case "2":
                    System.out.println(userController.login(sc));
                    break;
                case "3":
                    System.out.println(userController.findUserById(sc));
                    break;
                case "4":
                    System.out.println(userController.updatePassword(sc));
                    break;
                case "5":
                    System.out.println(userController.deleteAccount(sc));
                    break;
                case "6":
                    Map userList = userController.userList();
                    System.out.println("회원목록"+'\n'+userList);
                    break;
                case "7":
                    break;
                case "8":
                    break;
                case "9":
                   String count = userController.count();
                    System.out.println("회원수: "+count);
                    break;
            }
        }
    }
}

package view;

import builder.UserBuilder;
import model.KaupDto;
import model.UserDto;
import service.KaupService;
import service.UtilService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class KaupView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UtilService util = new UtilServiceImpl.getInstance();
        double height = util.createRandomDouble(150, 50);
        double weight = util.createRandomDouble(30, 70);

        KaupDto person = new UserBuilder()
                .height(height)
                .weight(weight)
                .build();

        System.out.printf("키 : %.1f mm, 몸무게 : %.1f kg",person.getHeight(),person.getWeight());
        KaupService service = new KaupServiceImpl();

        double bmi =service.createBMI();
        String bodyMass = service.createBodyMass();
        System.out.println("============ BMI 계산기 ============");

        System.out.printf("BMI : %.1f",bmi);
        System.out.println();
        System.out.println("체질량 : "+bodyMass);
        System.out.println("============ 체질량 계산기 ============");
        }

}
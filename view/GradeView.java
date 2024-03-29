package view;

import controller.UserController;
import model.Subject;
import model.User;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    UserController ctrl = new UserController();
    public static void main(Scanner sc) {
        UtilService util = UtilServiceImpl.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();
        System.out.println("학생 이름: ");
        String name = sc.next();

        Subject subjects = Subject.builder()
                .korean(util.createRandomInteger(0,100))
                .english(util.createRandomInteger(0,100))
                .math(util.createRandomInteger(0,100))
                .build();

        int total = grade.getTotal(subjects.getKorean(), subjects.getEnglish(), subjects.getMath());
        double average = (grade.getAverage(subjects.getKorean(), subjects.getEnglish(), subjects.getMath()))/3;

        System.out.printf("===================성적표===================\n"+
                        "Korean : %s\n" +
                        "Math : %s\n"+
                        "English : %s\n Total : %s\n Average :%s",
                String.valueOf(subjects.getKorean()),
                String.valueOf(subjects.getEnglish()),
                String.valueOf(subjects.getMath()),
                String.valueOf(total),
                String.valueOf(average));

        Subject subject = Subject.builder()
                .korean(sc.nextInt())
                .english(sc.nextInt())
                .math(sc.nextInt())
                .build();

        GradeService gradeService = GradeServiceImpl.getInstance();

        System.out.println(subject.toString());

        System.out.println("평균 점수: "+average);

    }

}

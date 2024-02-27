import view.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AuthView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("0-종료, 1-회원관리 2-성적표 3-게시판 4-카우프 5-사용자관리(맵)");
            switch (sc.next()){
                case "0": return;
                //main(String[] args)를 main()으로 수정해서 가져옴
                case "1": JoinView.main(sc);break;
                case "2": GradeView.main(sc);break;
                case "3": BoardView.main();break;
                case "4": KaupView.main(sc);break;
                case "5": UserView.main(sc);break;
            }
        }
    }
}
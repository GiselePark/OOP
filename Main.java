import view.BoardView;
import view.GradeView;
import view.JoinView;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("0-종료, 1-회원가입 2-성적표 3-게시판 4-카우프");
            switch (sc.next()){
                case "0": return;
                //main(String[] args)를 main()으로 수정해서 가져옴
                case "1": JoinView.main(sc);break;
                case "2": GradeView.main(sc);break;
                case "3": BoardView.main();break;
                case "4": break;
            }
        }
    }
}
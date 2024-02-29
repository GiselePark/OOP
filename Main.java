import view.*;

import view.AuthView;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("[메뉴] 0-종료 1-Auth관리 2-성적표 3-게시판 4-카우프 5-User관리(맵) 6-계좌관리");
            switch (sc.next()){
                case "0": return;
                //main(String[] args)를 main()으로 수정해서 가져옴
                case "1": AuthView.main(sc);break;
                case "2": GradeView.main(sc);break;
                case "3": BoardView.main();break;
                case "4": KaupView.main(sc);break;
                case "5": UserView.main(sc);break;
                case "6": AccountView.main(sc);break;
            }
        }
    }
}
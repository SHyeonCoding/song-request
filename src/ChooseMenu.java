import java.util.Scanner;

public class ChooseMenu {
    Scanner sc = new Scanner(System.in);

    public int selectOption() {
        System.out.println("-".repeat(30));
        System.out.println("1. 신청곡 추가하기");
        System.out.println("2. 신청곡 수정하기");
        System.out.println("3. 신청곡 삭제하기");
        System.out.println("0. 종료하기");
        System.out.println("-".repeat(30));

        System.out.print("실행할 번호를 입력해주세요 : ");
        return sc.nextInt();
    }
}

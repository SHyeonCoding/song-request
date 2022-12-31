import java.util.Scanner;

public class DeleteMusic {
    Scanner sc = new Scanner(System.in);

    public int deleteMusic() {
        System.out.print("삭제할 신청곡 번호를 입력해주세요 : ");
        return sc.nextInt();
    }
}

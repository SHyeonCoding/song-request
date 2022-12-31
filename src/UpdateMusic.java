import java.util.Scanner;

public class UpdateMusic {
    Scanner sc = new Scanner(System.in);

    public int updateMusic() {
        System.out.println("수정할 신청곡 번호를 입력해주세요.");
        return sc.nextInt();
    }
}

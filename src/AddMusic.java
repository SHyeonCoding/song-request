import java.util.Scanner;

public class AddMusic {
    Scanner sc = new Scanner(System.in);

    public String insertMusic() {
        System.out.print("신청곡을 입력해주세요 : ");
        return sc.nextLine();
    }
}

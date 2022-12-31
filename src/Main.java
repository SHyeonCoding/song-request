import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChooseMenu option = new ChooseMenu();
        AddMusic insertList = new AddMusic();
        UpdateMusic updateList = new UpdateMusic();
        DeleteMusic deleteList = new DeleteMusic();

        List<String> musicList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int optionNum;

        loof: while(true) {
            System.out.println("-".repeat(9) + "Song Request" + "-".repeat(9));
            if(musicList.size() == 0) {
                System.out.println("신청곡이 없습니다.");
            } else {
                int numbering = 1;
                for(String s : musicList) {
                    System.out.println(numbering + ". " + s);
                    numbering++;
                }
            }
            System.out.println("-".repeat(30));

            optionNum = option.selectOption();
            switch (optionNum) {
                case 1:
                    String music = insertList.insertMusic();
                    musicList.add(music);
                    System.out.println("신청곡이 등록되었습니다.");
                    continue loof;
                case 2:
                    int update = updateList.updateMusic();
                    if(update > musicList.size()) {
                        System.out.println("선택한 신청곡 번호가 존재하지 않습니다.");
                        continue loof;
                    } else {
                        System.out.println("변경할 신청곡을 입력해주세요 : ");
                        musicList.set(update - 1, sc.nextLine());
                        System.out.println("신청곡이 변경되었습니다.");
                    }
                    continue loof;
                case 3:
                    int del = deleteList.deleteMusic();
                    if(del > musicList.size()) {
                        System.out.println("선택한 신청곡 번호가 존재하지 않습니다.");
                        continue loof;
                    } else {
                        musicList.remove(del - 1);
                        System.out.println("신청곡이 삭제되었습니다.");
                        continue loof;
                    }
                case 0:
                    break loof;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다. 다시 입력해주세요.");
                    continue loof;
            }
        }


    }
}

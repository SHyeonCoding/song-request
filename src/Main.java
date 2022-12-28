import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Option option = new Option();
        InsertList insertList = new InsertList();
        UpdateList updateList = new UpdateList();
        DeleteList deleteList = new DeleteList();

        List<String> musicList = new ArrayList<>();
        int optionNum;

        loof: while(true) {
            System.out.println("--------------Song Request--------------");
            if(musicList.size() == 0) {
                System.out.println("신청곡이 없습니다.");
            } else {
                int numbering = 1;
                for(String s : musicList) {
                    System.out.println(numbering + ". " + s);
                    numbering++;
                }
            }
            System.out.println("----------------------------------------");

            optionNum = option.selectOption();
            switch (optionNum) {
                case 1:
                    String music = insertList.insertMusic();
                    musicList.add(music);
                    System.out.println("신청곡이 등록되었습니다.");
                    continue loof;
                case 2:
                    continue loof;
                case 3:
                    continue loof;
                case 0:
                    break loof;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다. 다시 입력해주세요.");
                    continue loof;
            }
        }


    }
}

class Option {
    Scanner sc = new Scanner(System.in);

    public int selectOption() {
        System.out.println("----------------------------------------");
        System.out.println("1. 신청곡 추가하기");
        System.out.println("2. 신청곡 수정하기");
        System.out.println("3. 신청곡 삭제하기");
        System.out.println("0. 종료하기");
        System.out.println("----------------------------------------");

        System.out.print("실행할 번호를 입력해주세요 : ");
        return sc.nextInt();
    }
}

class InsertList {
    Scanner sc = new Scanner(System.in);

    public String insertMusic() {
        System.out.print("신청곡을 입력해주세요 : ");
        return sc.nextLine();
    }
}

class UpdateList {

}

class DeleteList {

}


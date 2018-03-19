package bitcamp.project.pms;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("팀명? ");
        String name = keyScan.nextLine();
        System.out.print("설명? ");
        String disc = keyScan.nextLine();
        System.out.print("최대 인원? ");
        int maxQty = keyScan.nextInt();
        keyScan.nextLine();
        System.out.print("시작일? ");
        String start = keyScan.nextLine();
        System.out.print("종료일? ");
        String end = keyScan.nextLine();

        System.out.println("------------------");
        System.out.printf("팀명: %s, 설명: %s, 최대인원: %d, 기간: %s ~ %s",
            name, disc, maxQty, start, end);
        
    }
}
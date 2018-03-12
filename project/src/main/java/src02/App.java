package scr02.pms;

import java.util.Scanner;
import src02.pms.domain.Team;
public class App{
    public static void main(String[] args){

        Scanner keyScan = new Scanner(System.in);
        Team[] teams = new Team[5];
        for (int i = 0; i < teams.length; i++){
            teams[i] = new Team();
            System.out.print("팀명: ");
            teams[i].name = keyScan.nextLine();
            System.out.print("설명: ");
            teams[i].ex = keyScan.nextLine();
            System.out.print("최대인원: ");
            teams[i].mem = keyScan.nextInt();
            keyScan.nextLine();
            System.out.print("시작일: ");
            teams[i].start = keyScan.nextLine();
            System.out.print("팀명: ");
            teams[i].end = keyScan.nextLine();
            
            String str = new String();
            System.out.print("계속하시겠습니까?(Y/n)");
            str = keyScan.nextLine();
        }

    }

}
package bitcamp.project.pms;

import java.util.Scanner;
import bitcamp.project.pms.domain.Team;


public class App { 
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        Team[] teams = new Team[5];

        int count = 0;
        for (int i = 0; i < teams.length; i++) {

            Team team = new Team();
            System.out.print("팀명: ");
            team.name = keyScan.nextLine();
            System.out.print("설명: ");
            team.disc = keyScan.nextLine();
            System.out.print("최대인원: ");
            team.max = keyScan.nextInt();
            keyScan.nextLine();
            System.out.print("시작일: ");
            team.start = keyScan.nextLine();
            System.out.print("종료일: ");
            team.end = keyScan.nextLine();
            
        
            teams[count++] = team;
            System.out.print("계속 입력하시겠습니까?(Y/n) ");
            String input = keyScan.nextLine().toLowerCase();
         
            if (input.equals("y"))
                continue;
            else 
                break;
        }
            
            for (int i = 0; i < count; i++) {

                System.out.printf("팀명: %s, 설명: %s, 최대인원: %d, 기간: %s ~ %s",
                    teams[i].name, teams[i].disc, teams[i].max,
                    teams[i].start, teams[i].end);
            }


    }
}
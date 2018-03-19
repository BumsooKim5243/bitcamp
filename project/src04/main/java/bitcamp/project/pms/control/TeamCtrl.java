package bitcamp.project.pms.control;

import bitcamp.project.pms.domain.Team;
import bitcamp.project.pms.util.Console;
import bitcamp.project.pms.util;
public class TeamCtrl {
    public static Scanner keyScan;
   
    static Team[] teams = new Team[1000];
    static int teamIndex = 0;
   
    public static void service(String menu, String option) {

        if (menu.equals("team/add")) {
            onTeamAdd();
        } else if (menu.equals("team/list")) {
            onTeamList();
        } else if (menu.equals("team/view")) {
            onTeamView(option);
        } else if (menu.equals("team/update")) {
            onTeamUpdate(option);
        } else if (menu.equals("team/delete")) {
            onTeamDelete(option);
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
    }

    static int getTeamIndex(String name) {
        for (int i = 0; i < teamIndex; i++) {
            if (teams[i] == null) continue;
            if (option.equals(teams[i].name.toLowerCase())) {
                                
                return i;
            }
        }
        return -1;
    }
    
    
    static void onTeamAdd() {
        Team team = new Team();
                System.out.print("팀명? ");
                team.name = keyScan.nextLine();
                System.out.print("설명? ");
                team.desc = keyScan.nextLine();
                System.out.print("최대인원? ");
                team.max = keyScan.nextInt();
                keyScan.nextLine();
                System.out.print("시작일? ");
                team.start = keyScan.nextLine();
                System.out.print("종료일? ");
                team.end = keyScan.nextLine();
                
                teams[teamIndex++] = team;
    }
    static void onTeamList() {
        for (int i = 0; i < teamIndex; i++) {
            if (teams[i] == null) 
                continue;
            System.out.printf("%s, %s, %d, %s ~ %s\n",
                teams[i].name, teams[i].desc, teams[i].max,
                teams[i].start, teams[i].end);
        }
    }
    static void onTeamView() {
        if (option == null){
            System.out.println("팀 이름을 입력해주세요");
            System.out.println();
            return;
        }
                
        int i = getTeamIndex(option);

        if (i == -1){
            System.out.println("해당 팀 이름이 없습니다.");
        } else {
            Team team = teams[i];
            System.out.printf("팀명: %s\n", team.name);
            System.out.printf("설명: %s\n", team.desc);
            System.out.printf("최대인원: %d\n", team.max);
            System.out.printf("기간: %s ~ %s\n", 
                team.start, team.end);
        }

        
    }
    static void onTeamUpdate() {
        if (option == null) {
            System.out.println("팀명을 입력해주시기 바랍니다.");
            System.out.println();
            return;
        }
        
        int i = getTeamIndex(option);

        if (i == -1){
            System.out.println("해당 팀 이름이 없습니다.");
        } else {
            Team team = teams[i];
            Team upTeam = new Team();
            System.out.printf("팀명(%s)  ", team.name);
            upTeam.name = keyScan.nextLine();
            System.out.printf("설명(%s)  ", team.desc);
            upTeam.desc = keyScan.nextLine();
            System.out.printf("최대인원(%s)  ", team.max);
            upTeam.max = keyScan.nextInt();
            keyScan.nextLine();
            System.out.printf("시작일(%s)  ", team.start);
            upTeam.start = keyScan.nextLine();
            System.out.printf("종료일(%s)  ", team.end);
            upTeam.end = keyScan.nextLine();

            System.out.print("정말 변경하시겠습니까?(y/N)");
            
                teams[i] = upTeam;
                System.out.println("변경되었습니다.");
            
        }
    }
    static void onTeamDelete() {
        if (option == null) {
            System.out.println("팀명을 입력해주시기 바랍니다.");
            System.out.println();
            return;
        }
        int i = getTeamIndex(option);

        if (i == -1){
            System.out.println("해당 팀 이름이 없습니다.");
        } else {
            Team team = teams[i];
            System.out.printf("팀명: %s  ", team.name);
            System.out.printf("설명: %s  ", team.desc);
            System.out.printf("최대인원: %s  ", team.max);
            System.out.printf("시작일: %s  ", team.start);
            System.out.printf("종료일: %s  \n", team.end);
            
            
            System.out.print("정말 삭제하시겠습니까?(y/N)");
            String input = keyScan.nextLine().toLowerCase();
            if (input.equals("n")) {
                
            } else if(input.equals("y")) {
                teams[i] = null;
                System.out.println("삭제 되었습니다.");
            }
        }
    }
}
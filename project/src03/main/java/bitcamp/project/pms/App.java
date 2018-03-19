package bitcamp.project.pms;

import bitcamp.project.pms.domain.Member;
import bitcamp.project.pms.domain.Team;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        Team[] teams = new Team[1000];
        int teamIndex = 0;

        Member[] mems = new Member[1000];
        int memIndex = 0;

        
        while (true) {
            System.out.print("명령> ");
            String[] arr = keyScan.nextLine().toLowerCase().split(" ");
            String menu = arr[0];
            String option = null;
            if (arr.length == 2) {
                option = arr[1];
            }

            if (menu.equals("quit")) {
                System.out.println("안녕히가세요!");
                break;
            } else if (menu.equals("help")) {
                System.out.println("팀 등록 명령 : team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view 팀명");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 조회 명령 : member/list");
                System.out.println("회원 상세조회 명령 : member/view 아이디");
                System.out.println("종료 : quit");
           
            } else if (menu.equals("team/add")) {
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
            

            } else if (menu.equals("team/list")) {
                for (int i = 0; i < teamIndex; i++) {
                    if (teams[i] == null) 
                        continue;
                    System.out.printf("%s, %s, %d, %s ~ %s\n",
                        teams[i].name, teams[i].desc, teams[i].max,
                        teams[i].start, teams[i].end);
                }
            } else if (menu.equals("team/view")) {
                if (option == null){
                    System.out.println("팀 이름을 입력해주세요");
                    System.out.println();
                    continue;
                }
                
                Team team = null;
                for (int i = 0; i < teamIndex; i++) {
                    if (teams[i] == null) 
                        continue;
                    if (option.equals(teams[i].name.toLowerCase())) {
                        team = teams[i];
                        break;
                    }
                }
                if (team == null){
                    System.out.println("해당 팀 이름이 없습니다.");
                } else {
                    System.out.printf("팀명: %s\n", team.name);
                    System.out.printf("설명: %s\n", team.desc);
                    System.out.printf("최대인원: %d\n", team.max);
                    System.out.printf("기간: %s ~ %s\n", 
                        team.start, team.end);
                }

                
            } else if (menu.equals("team/update")) {
                if (option == null) {
                    System.out.println("팀명을 입력해주시기 바랍니다.");
                    System.out.println();
                    continue;
                }
                Team team = null;
                int i;
                for (i = 0; i < teamIndex; i++) {
                    if (teams[i] == null) 
                        continue;
                    if (option.equals(teams[i].name.toLowerCase())){
                        team = teams[i];
                        break;
                    }
                }
                if (team == null) {
                    System.out.println("해당 팀 이름이 없습니다.");
                    
                } else {
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
                    String input = keyScan.nextLine().toLowerCase();
                    if (input.equals("n")) {
                        
                    } else if(input.equals("y")) {
                        teams[i] = upTeam;
                        System.out.println("변경되었습니다.");
                    }
                }
            } else if (menu.equals("team/delete")) {
                if (option == null) {
                    System.out.println("팀명을 입력해주시기 바랍니다.");
                    System.out.println();
                    continue;
                }
                Team team = null;
                int i;
                for (i = 0; i < teamIndex; i++) {
                    if (teams[i] == null) 
                        continue;
                    if (option.equals(teams[i].name.toLowerCase())){
                        team = teams[i];
                        break;
                    }
                } if (team == null) {
                    System.out.println("해당 팀 이름이 없습니다.");
                    
                } else {
                    System.out.printf("팀명: %s  ", team.name);
                    System.out.printf("설명: %s  ", team.desc);
                    System.out.printf("최대인원: %s  ", team.max);
                    System.out.printf("시작일: %s  ", team.start);
                    System.out.printf("종료일: %s  ", team.end);
                    
                    
                    System.out.print("정말 삭제하시겠습니까?(y/N)");
                    String input = keyScan.nextLine().toLowerCase();
                    if (input.equals("n")) {
                        
                    } else if(input.equals("y")) {
                        teams[i] = null;
                        System.out.println("삭제 되었습니다.");
                    }
                }
            } else if (menu.equals("member/add")) {
                Member mem = new Member();
                System.out.print("아이디? ");
                mem.id = keyScan.nextLine();
                System.out.print("이메일? ");
                mem.email = keyScan.nextLine();
                System.out.print("암호? ");
                mem.pass = keyScan.nextLine();
                
                mems[memIndex++] = mem;

            } else if (menu.equals("member/list")) {
                for (int i = 0; i < memIndex; i++) {
                    if (mems[i] == null) 
                        continue;
                    System.out.printf("%s, %s, %s\n",
                        mems[i].id, mems[i].email, mems[i].pass);
                }
            } else if (menu.equals("member/view")) {
                if (option == null) {
                    System.out.println("아이디를 입력해주시기 바랍니다.");
                    System.out.println();
                    continue;
                }
                Member mem = null;
                for (int i = 0; i < memIndex; i++) {
                    if (mems[i] == null) 
                        continue;
                    if (option.equals(mems[i].id.toLowerCase())) {
                        mem = mems[i];
                        break;
                    }
                }
                if (mem == null) {
                    System.out.println("해당 아이디가 없습니다.");

                } else {
                    System.out.printf("아이디: %s\n", mem.id);
                    System.out.printf("이메일: %s\n", mem.email);
                    System.out.printf("암호: %s\n", mem.pass);
                }
            } else if (menu.equals("member/update")) {
                if (option == null) {
                    System.out.println("회원 이름을 입력하세요.");
                    System.out.println();
                    continue;
                }
                Member mem = null;
                int i;
                for (i = 0; i < memIndex; i++) {
                    if (mems[i] == null) 
                        continue;
                    if (option.equals(mems[i].id.toLowerCase())) {
                        mem = mems[i];
                        break;
                    }
                }
                if (mem == null) {
                    System.out.println("해당 회원이 없습니다.");

                } else {
                    Member upMem = new Member();
                    System.out.printf("아이디(%s) ", mem.id);
                    upMem.id = keyScan.nextLine();
                    System.out.printf("이메일(%s) ", mem.email);
                    upMem.email = keyScan.nextLine();
                    System.out.printf("암호(%s) ", mem.pass);
                    upMem.pass = keyScan.nextLine();

                    System.out.print("정말 변경하시겠습니까?(y/N)");
                    String input = keyScan.nextLine().toLowerCase();
                    if (input.equals("n")) {
                    } else if (input.equals("y")) {
                        mems[i] = upMem;
                        System.out.println("변경되었습니다.");
                    }
                        
                }
            } else if (menu.equals("member/delete")) {
                if (option == null) {
                    System.out.println("아이디를 입력해주시기 바랍니다.");
                    System.out.println();
                    continue;
                }
                Member mem = null;
                int i;
                for (i = 0; i < memIndex; i++) {
                    if (mems[i] == null) 
                        continue;
                    if (option.equals(mems[i].id.toLowerCase())){
                        mem = mems[i];
                        break;
                    }
                } if (mem == null) {
                    System.out.println("해당 아이디를 이름이 없습니다.");
                    
                } else {
                    System.out.printf("아이디: %s  ", mem.id);
                    System.out.printf("이메일: %s  ", mem.email);
                    System.out.printf("암호: %s  ", mem.pass);
                    
                    
                    System.out.print("정말 삭제하시겠습니까?(y/N)");
                    String input = keyScan.nextLine().toLowerCase();
                    if (input.equals("n")) {
                        
                    } else if(input.equals("y")) {
                        mems[i] = null;
                        System.out.println("삭제 되었습니다.");
                    }
                }
            }
            System.out.println();
        }
    }
}
                   
                    
                   

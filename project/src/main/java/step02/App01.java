package main.java.step02;

import java.util.Scanner;
import main.java.step02.domain.Team;
import main.java.step02.domain.Member;
public class App01{
    
    static Scanner keyScan = new Scanner(System.in);
    static Team[] teams = new Team[1000];
    static int teamIndex = 0;
    static Member[] members = new Member[1000];
    static int memberIndex = 0;
    static String option = null;
    
    static String[] prompt(){
        System.out.print("명령> ");
        return keyScan.nextLine().toLowerCase().split(" ");
    }
    static void onQuit() {
        System.out.println("안녕히 가세요!");
    }
    static void onHelp() {
        System.out.println("[도움말]");
        System.out.println("팀 등록 명령 : team/add");
        System.out.println("팀 조회 명령 : team/list");
        System.out.println("팀 상세조회 명령 : team/view 팀명");
        System.out.println("회원 등록 명령 : member/add");
        System.out.println("회원 조회 명령 : member/list");
        System.out.println("회원 상세조회 명령 : member/view 아이디");
        System.out.println("종료 : quit");
        
    }
    static void onTeamadd(){
        Team team = new Team();
        System.out.print("팀명: ");
        team.name = keyScan.nextLine();
        System.out.print("설명: ");
        team.desciption = keyScan.nextLine();
        System.out.print("최대인원: ");
        team.maxQty = keyScan.nextInt();
        keyScan.nextLine();
        System.out.print("시작일: ");
        team.startDate = keyScan.nextLine();
        System.out.print("종료일: ");
        team.endDate = keyScan.nextLine();
        
        teams[teamIndex++] = team;
        
    }
    static void onTeamlist(){
        System.out.println("[팀 목록]");
        for(int i = 0; i < teamIndex; i++){
            System.out.printf("%s, %d, %s ~ %s",
                teams[i].name, teams[i].maxQty,
                teams[i].startDate, teams[i].endDate);
        }
        
    }
    static void onTeamview(){
        System.out.println("[팀 정보 조회]");
        if (option == null) {
            System.out.println("해당 팀명을 입력하세요");
            System.out.println();
            return;
        }
        Team team = null;
        for (int i = 0; i < teamIndex; i++){
            if (option.equals(teams[i].name.toLowerCase())){
                team = teams[i];
                break;
            }
        }
        if (team == null) {
            System.out.println("해당 이름의 팀이 없습니다.");
        }else{
            System.out.printf("팀명: %s\n", team.name);
            System.out.printf("설명: %s\n", team.desciption);
            System.out.printf("최대인원: &d\n", team.maxQty);
            System.out.printf("기간: %s ~ %s\n",
            team.startDate , team.endDate);
        }
        
    }
    static void onMemberadd(){
        Member member = new Member();
        System.out.print("아이디: ");
        member.id = keyScan.nextLine();
        System.out.print("이메일: ");
        member.email = keyScan.nextLine();
        System.out.print("암호: ");
        member.password = keyScan.nextLine();
       
        members[memberIndex++] = member;
    
    }
    static void onMemberlist(){
        for (int i = 0; i < memberIndex; i++){
            System.out.printf("%s, %s, %s\n", members[i].id,
                members[i].email, members[i].password);
               
        }
    }
    static void onMemberview(){
        System.out.println("[회뭔 정보 목록]");
                
        if (option == null) {
            System.out.println("아이디를 입력하시기 바랍니다.");
            System.out.println();
            return;
        }
        Member member = null;
        for (int i = 0; i < memberIndex; i++) {
            if (option.equals(members[i].id.toLowerCase())) {
                member = members[i];
                break;
            }
        }
        if (member == null){
            System.out.println("회원 아이디의 회원이 없습니다.");

        }else{
            System.out.printf("아이디: %s\n이메일: %s\n암호: %s\n",
                member.id, member.email, member.password);
            }   
    }

    public static void main(String[] args){
       

        while(true){
            String[] arr = prompt();
           
            String menu = arr[0];
            if (arr.length == 2) {
              option = arr[1];
            } else {
                option = null;
            }

            if (menu.equals("quit")) {
                onQuit();
                break;
            }
            else if (menu.equals("help")) {
                onHelp();
            }else if (menu.equals("team/add")) {
                onTeamadd();
            }else if (menu.equals("team/list")) {
                onMemberlist();
            }else if (menu.equals("team/view")){
                onMemberview();
            }else if (menu.equals("member/add")) {
                onMemberadd();
            }else if (menu.equals("member/list")) {
                onMemberlist();
            }else if (menu.equals("member/view")) {
               onMemberview();
            }else {
                System.out.println("명령어가 올바르지 않습니다.");
            }
            System.out.println();
        }
    }
}

                        
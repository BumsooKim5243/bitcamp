package bitcamp.java106.pms.controller;

import java.util.Scanner;
import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.dao.MemberDao;
import bitcamp.java106.pms.dao.TeamDao;
import bitcamp.java106.pms.util.Console;
public class TeamMember {
    Scanner keyScan;
    public TeamMember(Scanner scanner) {
        this.keyScan = scanner;
    }

    TeamDao teamDao = new TeamDao();
    Team[] teams = new Team[1000];
    int teamIndex = 0;
    int t;


    MemberDao memberDao = new MemberDao();
    Member[] members = new Member[1000];
    int memberIndex = 0;
    int m;    

    
    public void service(String menu, String option) {
        if (menu.equals("team/member/add")) {
            this.OnTMAdd(option);
        }
    }

    public void OnTMAdd(String name) {
        Team team = teamDao.get(name);
        if(team == null) {
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            System.out.println("추가할 회원의 아이디는? ");
        }

    }
}



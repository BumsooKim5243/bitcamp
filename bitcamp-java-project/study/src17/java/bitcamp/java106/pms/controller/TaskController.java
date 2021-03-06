// 팀 관련 기능을 모아 둔 클래스
package bitcamp.java106.pms.controller;

import java.sql.Date;
import java.util.Scanner;

import bitcamp.java106.pms.dao.MemberDao;
import bitcamp.java106.pms.dao.TeamDao;
import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Task;
import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.util.Console;

public class TaskController {
    Scanner keyScan;
    TeamDao teamDao;
    MemberDao memberDao;
    Task task;
    int taskIndex = 0;
    public TaskController(Scanner scanner, TeamDao teamDao, MemberDao memberDao) {
        this.keyScan = scanner;
        this.teamDao = teamDao;
        this.memberDao = memberDao;
    }

    public void service(String menu, String option) {
        if (menu.equals("task/add")) {
            this.onTaskAdd(option);
        } else if (menu.equals("task/list")) {
            this.onTaskList();
        } else if (menu.equals("task/view")) {
            this.onTaskView(option);
        } else if (menu.equals("task/update")) {
            this.onTaskUpdate(option);
        } else if (menu.equals("task/delete")) {
            this.onTaskDelete(option);
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
    }

    void onTaskAdd(String teamName) {
        Task task = new Task();
        if (teamName == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return; 
        }
        
        Team team = teamDao.get(teamName);
        if (team == null) {
            System.out.printf("%s 팀은 존재하지 않습니다.", teamName);
            return;
        }
        String memberId = keyScan.nextLine();
        Member member = memberDao.get(memberId);
       
        System.out.println("[팀 작업 입력]");

        System.out.print("작업명? ");
        task.setName(this.keyScan.nextLine());

        System.out.print("시작일? ");
        team.setStartDate(Date.valueOf(this.keyScan.nextLine()));
        System.out.print("종료일? ");
        team.setEndDate(Date.valueOf(this.keyScan.nextLine()));
        System.out.println("작업자? ");
        member.setId(this.keyScan.nextLine());
        if (team.isExist(memberId)) {
            System.out.println("이미 등록된 회원입니다.");
            return;
        }
        taskIndex = task.count(taskIndex);
        teamDao.insert(team);
        
    }

    void onTaskList() {
        System.out.println("[팀 목록]");
        Team[] list = teamDao.list();
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) continue;
            System.out.printf("%s, %d, %s ~ %s\n", 
                    list[i].getName(), list[i].getMaxQty(), 
                    list[i].getStartDate(), list[i].getEndDate());
        }
    }

    void onTaskView(String name) {
        System.out.println("[팀 정보 조회]");
        if (name == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return; // 값을 리턴하면 안되기 때문에 return 명령만 작성한다.
                    // 의미? 즉시 메서드 실행을 멈추고 이전 위치로 돌아간다.
        }
        
        Team team = teamDao.get(name);

        if (team == null) {
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            System.out.printf("팀명: %s\n", team.getName());
            System.out.printf("설명: %s\n", team.getDescription());
            System.out.printf("최대인원: %d\n", team.getMaxQty());
            System.out.printf("기간: %s ~ %s\n", 
                team.getStartDate(), team.getEndDate());
        }
    }

    void onTaskUpdate(String teamName) {
        System.out.println("[팀 정보 변경]");
        if (teamName == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return; 
        }
        
        Team team = teamDao.get(teamName);

        if (team == null) {
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            Team updateTeam = new Team();
            System.out.printf("팀명 : %s\n", team.getName());
            updateTeam.setName(team.getName());
            System.out.printf("설명(%s)? ", team.getDescription());
            updateTeam.setDescription(this.keyScan.nextLine());
            System.out.printf("최대인원(%d)? ", team.getMaxQty());
            updateTeam.setMaxQty(this.keyScan.nextInt());
            this.keyScan.nextLine();
            System.out.printf("시작일(%s)? ", team.getStartDate());
            updateTeam.setStartDate(Date.valueOf(this.keyScan.nextLine()));
            System.out.printf("종료일(%s)? ", team.getEndDate());
            updateTeam.setEndDate(Date.valueOf(this.keyScan.nextLine()));
            
            teamDao.update(updateTeam);
            System.out.println("변경하였습니다.");
        }
    }

    void onTaskDelete(String name) {
        System.out.println("[팀 정보 삭제]");
        if (name == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return; 
        }
        
        Team team = teamDao.get(name);

        if (team == null) {
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            if (Console.confirm("정말 삭제하시겠습니까?")) {
                teamDao.delete(team.getName());
                System.out.println("삭제하였습니다.");
            }
        }
    }
    
}

//ver 15 - TeamDao를 생성자에서 주입 받도록 변경.
//ver 14 - TeamDao를 사용하여 팀 데이터를 관리한다.
//ver 13 - 시작일, 종료일을 문자열로 입력 받아 Date 객체로 변환하여 저장.
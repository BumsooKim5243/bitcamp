// 팀 작업 관리 기능을 모아 둔 클래스
package bitcamp.java106.pms.controller;

import java.sql.Date;
import java.util.Scanner;

import bitcamp.java106.pms.dao.ClassroomDao;
import bitcamp.java106.pms.domain.Classroom;
import bitcamp.java106.pms.util.Console;

public class ClassroomController {

    Scanner keyScan;
    ClassroomDao classroomDao;
    
    public ClassroomController(Scanner scanner,ClassroomDao classroomDao) {
        this.keyScan = scanner;
        this.classroomDao = classroomDao;
    }

    public void service(String menu, String option) {
        if (option == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return; 
        }

        ClassroomDao classroom = classroomDao.get(Integer.parseInt(option));
        if (classroom == null) {
            System.out.printf("'%s' 팀은 존재하지 않습니다.", option);
            return;
        }

        if (menu.equals("classroom/add")) {
            this.onClassroomAdd();
        } else if (menu.equals("classroom/list")) {
            //this.onClassroomList();
        } else if (menu.equals("classroom/view")) {
            //this.onClassroomView();
        } else if (menu.equals("classroom/update")) {
            //this.onClassroomUpdate();
        } else if (menu.equals("classroom/delete")) {
            //this.onClassroomDelete();
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
    }

    private void onClassroomAdd() {
        Classroom classroom = new Classroom();

        System.out.println("[팀 작업 추가]");

        System.out.print("작업명? ");
        classroom.setTitle(keyScan.nextLine());

        System.out.print("시작일? ");
        String str = keyScan.nextLine();
        if (str.length() == 0) {
            classroom.setStartDate(classroom.getStartDate());
        } else {
            Date date = Date.valueOf(str);
            if (date.getTime() < classroom.getStartDate().getTime()) {
                classroom.setStartDate(classroom.getStartDate());
            } else {
                classroom.setStartDate(date);
            }
        }

        System.out.print("종료일? ");
        str = keyScan.nextLine();
        if (str.length() == 0) {
            classroom.setEndDate(classroom.getEndDate());
        } else { 
            Date date = Date.valueOf(str);
            if (date.getTime() > classroom.getEndDate().getTime()) {
                classroom.setEndDate(classroom.getEndDate());
            } else {    
                classroom.setEndDate(date);
            }
        }

        System.out.print("교실번호? ");
        classroom.setClassroomNum(keyScan.nextLine());
        if (cR.length() != 0) {
            if (!classroomDao.isExist(classroom.getClassroomNum(cR))) {
                System.out.printf("%s 회원은 없습니다. 작업자는 비워 두겠습니다.", cR);
            } else {
                classroom.setClassroomNum(this.classroomDao.get(Integer.parseInt(cR)));
            }
        }
        classroomDao.insert(classroom);
    }
/*
    private void onClassroomList(final Classroom classroom) {
        System.out.println("[팀 작업 목록]");

        Classroom[] classrooms = classroomDao.list(classroom.getTitle());

        // for each문
        for (Classroom classroom : classrooms) {
            System.out.printf("%d,%s,%s,%s,%s\n",
                    classroom.getNo(), classroom.getTitle(),
                    classroom.getStartDate(), classroom.getEndDate(),
                    (classroom.getWorker() == null) ? 
                            "-" : classroom.getWorker().getId());
        }
        System.out.println();

    }

    private void onClassroomView(final Classroom classroom) {
        System.out.println("[작업 정보]");
        System.out.print("작업 번호? ");
        int classroomNo = Integer.parseInt(keyScan.nextLine());

        Classroom classroom = classroomDao.get(classroomNo);

        if (classroom == null) {
            System.out.printf("'%s'팀의 %d번 작업을 찾을 수 없습니다.\n",
                    classroom.getTitle(), classroomNo);
            return;
        }

        System.out.printf("작업명: %s\n", classroom.getTitle());
        System.out.printf("시작일: %s\n", classroom.getStartDate());
        System.out.printf("종료일: %s\n", classroom.getEndDate());
        System.out.printf("작업자: %s\n",
                (classroom.getWorker() == null) ? "-" : classroom.getWorker().getId());
        System.out.printf("작업상태: %s\n", getStateLaber(classroom.getState()));
    }

    private void onClassroomUpdate(final Classroom classroom) {
        System.out.println("[팀 작업 변경]");
        System.out.print("변경할 작업의 번호? ");
        int classroomNo = Integer.parseInt(keyScan.nextLine());

        Classroom originClassroom = classroomDao.get(classroomNo);
        if (originClassroom == null) {
            System.out.printf("'%s'팀의 %d번 작업을 찾을 수 없습니다.\n",
                    classroom.getTitle(), classroomNo);
            return;
        }

        Classroom classroom = new Classroom(classroom);
        classroom.setNo(originClassroom.getNo());

        System.out.printf("작업명(%s)? ", originClassroom.getTitle());
        String str = keyScan.nextLine();
        if (str.length() == 0) {
            classroom.setTitle(originClassroom.getTitle());
        } else {
            classroom.setTitle(str);
        }

        System.out.printf("시작일(%s)? ", originClassroom.getStartDate());
        str = keyScan.nextLine();
        if (str.length() == 0) {
            classroom.setStartDate(originClassroom.getStartDate());
        } else {
            Date date = Date.valueOf(str);
            if (date.getTime() < classroom.getStartDate().getTime()) {
                classroom.setStartDate(classroom.getStartDate());
            } else {
                classroom.setStartDate(date);
            }
        }

        System.out.printf("종료일(%s)? ", originClassroom.getEndDate());
        str = keyScan.nextLine();
        if (str.length() == 0) {
            classroom.setEndDate(originClassroom.getEndDate());
        } else { 
            Date date = Date.valueOf(str);
            if (date.getTime() > classroom.getEndDate().getTime()) {
                classroom.setEndDate(classroom.getEndDate());
            } else {    
                classroom.setEndDate(date);
            }
        }

        System.out.printf("작업자 아이디(%s)? ",
                (originClassroom.getWorker() == null) ? 
                        "-" : originClassroom.getWorker().getId());
        String memberId = keyScan.nextLine();
        if (memberId.length() == 0) {
            classroom.setWorker(originClassroom.getWorker());
        } else {
                if (!classroomMemberDao.isExist(classroom.getTitle(), memberId)) {
                    System.out.printf("%s 회원은 없습니다. 작업자는 비워 두겠습니다.", memberId);
                } else {
                    classroom.setWorker(this.memberDao.get(memberId));
                }
        }

        if (Console.confirm("변경하시겠습니까?")) {
            classroomDao.update(classroom);
            System.out.println("변경하였습니다.");
        } else {
            System.out.println("취소하였습니다.");
        }
    }

    private void onClassroomDelete(final Classroom classroom) {
        System.out.println("[팀 작업 삭제]");
        System.out.print("삭제할 작업의 번호? ");
        int classroomNo = Integer.parseInt(keyScan.nextLine());

        Classroom classroom = classroomDao.get(classroomNo);
        if (classroom == null) {
            System.out.printf("'%s'팀의 %d번 작업을 찾을 수 없습니다.\n",
                    classroom.getTitle(), classroomNo);
            return;
        }
        if (Console.confirm("삭제하시겠습니까?")) {
            classroomDao.delete(classroom.getNo());
            System.out.println("삭제하였습니다.");
        } else {
            System.out.println("취소하였습니다.");
        }
    }
*/
}

//ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
// ver 15 - 팀 멤버를 등록, 조회, 삭제할 수 있는 기능 추가. 
// ver 14 - ClassroomDao를 사용하여 팀 데이터를 관리한다.
// ver 13 - 시작일, 종료일을 문자열로 입력 받아 Date 객체로 변환하여 저장.




//
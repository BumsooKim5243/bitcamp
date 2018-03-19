package bitcamp.project.pms;

import bitcamp.project.pms.util.Console.Console;
import bitcamp.project.pms.domain.Member;
import bitcamp.project.pms.control.TeamCtrl;
import java.util.Scanner;
public class App {
    static Scanner keyScan = new Scanner(System.in);
    
    static String option = null;
    
    static Member[] mems = new Member[1000];
    static int memIndex = 0;

    
    static void onQuit() {
        System.out.println("안녕히가세요!");
        
    }
    static void onHelp() {
        System.out.println("팀 등록 명령 : team/add");
        System.out.println("팀 조회 명령 : team/list");
        System.out.println("팀 상세조회 명령 : team/view 팀명");
        System.out.println("회원 등록 명령 : member/add");
        System.out.println("회원 조회 명령 : member/list");
        System.out.println("회원 상세조회 명령 : member/view 아이디");
        System.out.println("종료 : quit");
    }
    
    static void onMemberAdd() {
        Member mem = new Member();
        System.out.print("아이디? ");
        mem.id = keyScan.nextLine();
        System.out.print("이메일? ");
        mem.email = keyScan.nextLine();
        System.out.print("암호? ");
        mem.pass = keyScan.nextLine();
        
        mems[memIndex++] = mem;

    }
    static void onMemberList() {
        for (int i = 0; i < memIndex; i++) {
            if (mems[i] == null) 
                continue;
            System.out.printf("%s, %s, %s\n",
                mems[i].id, mems[i].email, mems[i].pass);
        }
    }
    static void onMemberView() {
        if (option == null) {
            System.out.println("아이디를 입력해주시기 바랍니다.");
            System.out.println();
            return;
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
    }
    static void onMemberUpdate() {
        if (option == null) {
            System.out.println("회원 이름을 입력하세요.");
            System.out.println();
            return;
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
    }
    static void onMemberDelete() {
        if (option == null) {
            System.out.println("아이디를 입력해주시기 바랍니다.");
            System.out.println();
            return;
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
            System.out.printf("암호: %s  \n", mem.pass);
            
            
            System.out.print("정말 삭제하시겠습니까?(y/N)");
            String input = keyScan.nextLine().toLowerCase();
            if (input.equals("n")) {
                
            } else if(input.equals("y")) {
                mems[i] = null;
                System.out.println("삭제 되었습니다.");
            }
        }
    }

    
    public static void main(String[] args) {
        
        while (true) {
            String[] arr = prompt();
            String menu = arr[0];
            if (arr.length == 2) {
                option = arr[1];
            }
            
            if (menu.equals("quit")) {
                onQuit();
                break;
            } else if (menu.equals("help")) {
               onHelp();
            } else if (menu.startsWith("team/")) {
                TeamCtrl.service(menu,option);
            } else if (menu.equals("member/add")) {
               onMemberAdd();
            } else if (menu.equals("member/list")) {
              onMemberList();
            } else if (menu.equals("member/view")) {
                onMemberView();
            } else if (menu.equals("member/update")) {
                onMemberUpdate();
            } else if (menu.equals("member/delete")) {
                onMemberDelete();
            }
            System.out.println();
        }
    }
}
                   
                    
                   

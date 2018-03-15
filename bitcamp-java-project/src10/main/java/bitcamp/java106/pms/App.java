package bitcamp.java106.pms;


import bitcamp.java106.pms.controller.TeamController;
import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.controller.MemberController;
import bitcamp.java106.pms.util.Console;
import java.util.Scanner;

public class App {
    
    static Scanner keyScan = new Scanner(System.in);
    public static String option = null; 
    
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

    public static void main(String[] args) {
        // 클래스를 사용하기 전에 필수 값을 설정한다.
        TeamController.keyScan = keyScan;
        MemberController.keyScan = keyScan;
        Console.keyScan = keyScan;
        Board[] boards = new Board[1000];
        int boardIndex = 0;
        

        while (true) {
            String[] arr = Console.prompt();
            String menu = arr[0];
            if (arr.length == 2) {
                option = arr[1];
            }
            
            if (menu.equals("quit")) {
                onQuit();
            } else if (menu.equals("help")) {
                onHelp();
            } else if (menu.startsWith("team/")){
                TeamController.service(menu, option);
            } else if (menu.startsWith("member/")){
                MemberController.service(menu, option);
            } else if (menu.equals("board/add")){
                System.out.println("[게시물 등록]");
                Board board = new Board();
               
                System.out.print("제목? ");
                board.post = keyScan.nextLine();
                System.out.print("설명? ");
                board.description = keyScan.nextLine();
                System.out.print("등록일? ");
                board.date = keyScan.nextLine();
                board.count = boardIndex;
               
                boards[boardIndex++] = board;
              
            } else if (menu.equals("board/list")) {
                System.out.println("[게시물 목록]");
                int i;
                for (i = 0; i < boardIndex; i++){
                    System.out.printf("%d, %s, %s, %s\n",
                        boards[i].count, boards[i].post,
                        boards[i].description, boards[i].date); 
                }
            } else if (menu.equals("board/view")) {
                System.out.println("[게시물 조회]");

                if(option == null){
                    System.err.println("게시물 이름을 입력하세요");
                }
                Board board =null;
                int i;
                for(i = 0; i < boardIndex; i++){
                    if(option.equals(Integer.toString(boards[i].count))) {
                        board = boards[i];
                        break;
                    } 
                }
                    if(board ==null){
                        System.out.println("검색할 게시물이 없습니다.");
                    }else{
                        System.out.printf("제목: %s\n", board.post);
                        System.out.printf("내용: %s\n", board.description);
                        System.out.printf("등록일: %s\n", board.date);
                    }
                
            } else if (menu.equals("board/update")){
                System.out.println("[게시물 변경]");
                if(option == null){
                    System.err.println("게시물 이름을 입력하세요");
                }
                Board board =null;
                int i;
                for(i = 0; i < boardIndex; i++){
                    if(option.equals(Integer.toString(boards[i].count))) {
                        board = boards[i];
                        break;
                    } 
                }
                    if(board ==null){
                        System.out.println("변경할 게시물이 없습니다.");
                    }else{
                        Board upboard = new Board();
                        System.out.printf("제목(%s)", board.post);
                        upboard.post = keyScan.nextLine();
                        System.out.printf("내용(%s)", board.description);
                        upboard.description = keyScan.nextLine();
                        upboard.date = board.date;
                        boards[i] = upboard;
                    }
            } else if (menu.equals("board/delete")){
                System.out.println("[게시물 삭제]");
                 if(option == null){

                    System.err.println("게시물 이름을 입력하세요");
                }
               
                Board board =null;
                int i;
                for(i = 0; i < boardIndex; i++){
                    if (boards[i] == null) continue;

                    if(option.equals(Integer.toString(i))) {
                        board = boards[i];
                        break;
                    } 
                }  
                        if(board ==null){
                            System.out.println("변경할 게시물이 없습니다.");
                        }else{
                            System.out.print("정말 삭제하시겠습니까?(Y/n)");
                            String input = keyScan.nextLine().toLowerCase();
                            
                            if(input.equals("y")){
                                boards[i] = null;
                                System.out.println("삭제하였습니다.");
                            }
                        }   
            } else {
                    System.out.println("명령어가 올바르지 않습니다.");
                }    
                 System.out.println();
        }
    }
}



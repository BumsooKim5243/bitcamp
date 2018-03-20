package bitcamp.java106.pms.controller;

import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.util.Console;
import java.util.Scanner;

public class BoardController {

    public static Scanner keyScan;

    static Board[] boards = new Board[1000];
    static int boardIndex = 0;

    public static void service(String menu, String option){
        if (menu.equals("board/add")){
            onBoardAdd();
        } else if (menu.equals("board/list")) {
            onBoardList();
        } else if (menu.equals("board/view")) {
            onBoardView(option);
        } else if (menu.equals("board/update")){
            onBoardUpdate(option);
        } else if (menu.equals("board/delete")){
            onBoardDelete(option);
        } 
    }
    static int getBoardIndex(String post) {
        for(int i = 0; i < boardIndex; i++){
            if(boards[i] == null)
                continue;
            if(post.equals(Integer.toString(boards[i].count))) {
                return i;
            } 
        }
        return -1;
    }
    static void onBoardAdd() {
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

    }
    static void onBoardList() {
        System.out.println("[게시물 목록]");
        int i;
        for (i = 0; i < boardIndex; i++){
            if (boards[i] == null)
                continue;
            System.out.printf("%d, %s, %s, %s\n",
                    boards[i].count, boards[i].post,
                    boards[i].description, boards[i].date); 
        }
    }
    static void onBoardView(String id) {
        System.out.println("[게시물 조회]");

        if(id == null){
            System.err.println("게시물 이름을 입력하세요");
            System.out.println();
            return;
        }

        int i = getBoardIndex(id);

        if(i == -1){
            System.out.println("해당 게시물이 없습니다.");
        }else{
            Board board = boards[i];
            System.out.printf("제목: %s\n", board.post);
            System.out.printf("내용: %s\n", board.description);
            System.out.printf("등록일: %s\n", board.date);
        }
    }
    static void onBoardUpdate(String post) {
        System.out.println("[게시물 변경]");
        if(post == null){
            System.err.println("게시물 이름을 입력하세요");
        }
        int i = getBoardIndex(post);

        if(i == -1){
            System.out.println("해당 게시물이 없습니다.");
        }else{
            Board board = boards[i];
            Board upboard = new Board();
            System.out.printf("제목(%s)", board.post);
            upboard.post = keyScan.nextLine();
            System.out.printf("내용(%s)", board.description);
            upboard.description = keyScan.nextLine();
            upboard.date = board.date;
            upboard.count = board.count;
            boards[i] = upboard;
            
        }
    }
    static void onBoardDelete(String post) {
        System.out.println("[게시물 삭제]");
        if(post == null){

            System.err.println("게시물 이름을 입력하세요");
        }
        int i = getBoardIndex(post);

        if(i == -1){
            System.out.println("해당 게시물이 없습니다.");
        }else{

           if (Console.confirm("정말 삭제하시겠습니까?")){
                boards[i] = null;
                System.out.println("삭제하였습니다.");
            }
        }   
    }


}

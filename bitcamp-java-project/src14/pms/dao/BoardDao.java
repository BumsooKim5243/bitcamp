package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Board;

public class BoardDao {
    Board[] boards = new Board[1000];
    int boardIndex = 0;
    
    public void insert(Board board) {
        this.boards[this.boardIndex++] = board;
    }
    
    public Board[] list() {
        Board[] arr = new Board[boardIndex];
        for (int i = 0; i < boardIndex; i++)
            arr[i] = boards[i];
        return arr;
    }
    
    public Board get(int i) {
        if (i < 0 || i >= boardIndex)
            return null;
        return boards[i];
    }
    
    public void update(int i, Board board) {
        boards[i] = board;
    }
    
    public void delete(int i) {
        boards[i] = null;
    }
}

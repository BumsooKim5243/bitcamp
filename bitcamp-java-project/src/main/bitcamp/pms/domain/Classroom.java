package bitcamp.java106.pms.domain;

import java.sql.Date;

public class Classroom {
    
    private static int count = 1;
    private int no;
    private String title;   // 수업명
    private Date startDate; // 시작일
    private Date endDate;   // 종료일
    private Classroom classroomNum; // 교실번호
    private Classroom classroom;
    
    public Classroom() {}
    
    public Classroom(Classroom classroom) {
        this.classroom = classroom;
        this.no = count++;
    }
    
    public Classroom(Classroom classroom, String title, Date startDate, Date endDate) {
        this(classroom);
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Classroom getClassroomNum() {
        return classroomNum;
    }
    
    public void setClassroomNum(Classroom classroomNum) {
        this.classroomNum = classroomNum;
    }
    
    public Classroom getClassroom() {
        return classroom;
    }
    
    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
    
    public int getNo() {
        return no;
    }
    
    public void setNo(int no) {
        this.no = no;
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Task [title=" + title + ", startDate=" + startDate + ", " + "endDate=" + endDate + "]";
    }
    
}

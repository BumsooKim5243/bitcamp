package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Classroom;
import bitcamp.java106.pms.util.ArrayList;

public class ClassroomDao {
    
    private ArrayList collection = new ArrayList();
    
    private int getIndex(String cRTitle) {
        String crt = cRTitle.toLowerCase();
        for (int i = 0; i < this.collection.size(); i++) {
            
            String mi = ((String)this.collection.get(i)).toLowerCase();
            if (mi.equals(crt)) {
                return i;
            }
        }
        return -1;
    }

    public void insert(ClassroomDao classroomDao) {
        this.collection.add(classroomDao);
    }

    private int count(String title) {
        int cnt = 0;
        for (int i = 0; i < collection.size(); i++) {
            Classroom classroom = (Classroom)collection.get(i);
            if (classroom.getTitle().toLowerCase().equals(
                    title.toLowerCase())) {
                cnt++;
            }
        }
        return cnt;
    }

    public Classroom[] list(String title) {
        Classroom[] arr = new Classroom[this.count(title)];
        for (int i = 0, x = 0; i < this.collection.size(); i++) {
            Classroom classroom = (Classroom)this.collection.get(i);
            if (classroom.getTitle().toLowerCase().equals(
                    title.toLowerCase())) {
                arr[x++] = classroom;
            }
        }
        return arr;
    }

    public ClassroomDao get(int classroomNo) {
        int index = this.getClassroomIndex(classroomNo);
        if (index < 0) {
            return null;
        }
            return (ClassroomDao)collection.get(index);
    }

    public void update(Classroom classroom) {
        int index = this.getClassroomIndex(classroom.getNo());
        if (index < 0)
            return;
        collection.set(index, classroom);
    }

    public void delete(int classroomNo) {
        int index = this.getClassroomIndex(classroomNo);
        if (index < 0)
            return;
                collection.remove(index);
    }
    
    public boolean isExist(String cRTitle) {
        if (this.getIndex(cRTitle) < 0) { // 이미 존재하는 멤버라면,
            return false;
        } else {
            
            return true;
        }
    }
    
    private int getClassroomIndex(int classroomNo) {
        for (int i = 0; i < collection.size(); i ++) {
            Classroom classroom = (Classroom) collection.get(i);
            if (classroom.getNo() == classroomNo) {
                return i;
            }
        }
        return -1;
    }
}
// ver 18
// ver 17 - 클래스 생성

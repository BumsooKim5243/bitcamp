package bitcamp.java106.pms.domain;

public class Task {
    private String name;
    private int count;
    private String worker;
    int taskIndex = 0;
    private Member[] members = new Member[10];
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public String getWorker() {
        return worker;
    }
    public void setWorker(String worker) {
        this.worker = worker;
    }
    public int addTask(Member member) {
        for (int i = 0; i < this.members.length; i++) {
            if (this.members[i] == null) {
                this.members[i] = null;
               return 1;
            }
        }
        return 0;
    }
    public int count(int number) {
        number++;
        return number;
    }
    
}

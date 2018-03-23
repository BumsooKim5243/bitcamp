package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Member;

public class MemberDao {
    Member[] members = new Member[1000];
    int memberIndex = 0;
    private int i;
    
    public void insert(Member member) {
        this.members[this.memberIndex++] = member;
    }
    
    public Member[] list() {
        Member[] arr = new Member[this.memberIndex];
        for (int i = 0; i < this.memberIndex; i++) 
            arr[i] = this.members[i];
        return arr;
    }
    public Member get(String id) {
        
        for (i = 0; i < this.memberIndex; i++) {
            if (this.members[i] == null) continue;
            if (id.equals(this.members[i].id.toLowerCase())) {
                return this.members[i];
            }
        }
        return null;
    }
    
    public void update(Member member) {
        this.members[i] = member;
    }
    
    public void delete(String id) {
        this.members[i] = null;
    }
}




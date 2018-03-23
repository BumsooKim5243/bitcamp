package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Member;

public class MemberDao {
    Member[] members = new Member[1000];
    int memberIndex = 0;
    
    public void insert(Member member) {
        this.members[this.memberIndex++] = member;
    }
    
    public Member[] list() {
        Member[] arr = new Member[memberIndex];
        for (int i = 0; i < memberIndex; i++) 
            arr[i] = members[i];
        return arr;
    }
    int i;
    public Member get(String id) {
        
        for (i = 0; i < this.memberIndex; i++) {
            if (members[i] == null) continue;
            if (id.equals(members[i].id.toLowerCase())) {
                return members[i];
            }
        }
        return null;
    }
    
    public void update(Member member) {
        members[i] = member;
    }
    
    public void delete(String id) {
        members[i] = null;
    }
}




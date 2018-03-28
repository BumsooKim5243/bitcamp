package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.util.ArrayList;

public class TeamMemberDao {
    private ArrayList teamCollection = new ArrayList();
    private ArrayList memberCollection = new ArrayList();
    
    private int getIndex(String teamName, String memberId) {
        String ptn = teamName.toLowerCase();
        String pmi = memberId.toLowerCase();
        for (int i = 0; i < this.teamCollection.size(); i++) {
            
            String tn = ((String)this.teamCollection.get(i)).toLowerCase();
            String mi = ((String)this.memberCollection.get(i)).toLowerCase();
            if (tn.equals(ptn) && mi.equals(pmi)) {
                return i;
            }
        }
        return -1;
    }
    
    // 연산자는 외부에서 사용하는 것이기 때문에 공개해야 한다.
    // => 그래서 public modifier를 사용한다.
    public int addMember(String teamName, String memberId) {
        if (this.isExist(teamName, memberId)) {
            return 0;
        }
        this.teamCollection.add(teamName);
        this.memberCollection.add(memberId);
        return 1;
    }

    public int deleteMember(String teamName, String memberId) {
        int index = this.getIndex(teamName, memberId);
        if (index < 0) { // 존재하지 않는 멤버라면,
            return 0;
        }
        this.teamCollection.remove(index);;
        this.memberCollection.remove(index);;
        return 1;
    }


    public boolean isExist(String teamName, String memberId) {
        if (this.getIndex(teamName, memberId) < 0) { // 이미 존재하는 멤버라면,
            return false;
        } else {
            
            return true;
        }
    }
    
    private int getMemberCount(String teamName) {
        int cnt = 0;
        String ptn = teamName.toLowerCase();
        
        for (int i = 0; i < this.teamCollection.size(); i++) {

            String tn = ((String)this.teamCollection.get(i)).toLowerCase();
            if (tn.equals(ptn)) {
                cnt++;
            }
        }
        return cnt;
    }
    
    public String[] getMembers(String teamName) {
        int cnt = 0;
        String ptn = teamName.toLowerCase();
        String[] members = new String[this.getMemberCount(teamName)];
        for (int i = 0, x = 0; i < this.teamCollection.size(); i++) {

            String tn = ((String)this.teamCollection.get(i)).toLowerCase();
            if (tn.equals(ptn)) {
                members[x++] = (String)this.memberCollection.get(i);
            }
        }
        return members;
    } 
}
// 용어 정리!
// 메서드 시그너처(method signature) = 함수 프로토타입(function prototype)
// 메서드의 이름과 파라미터 형식, 리턴 타입에 대한 정보를 말한다.

// ver17 - 클래스 추가





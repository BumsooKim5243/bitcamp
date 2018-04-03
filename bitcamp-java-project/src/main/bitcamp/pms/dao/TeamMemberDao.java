package bitcamp.java106.pms.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TeamMemberDao {

    private HashMap<String, ArrayList<String>> collection = new HashMap<>();


    public int addMember(String teamName, String memberId) {
        String teamNameLC = teamName.toLowerCase();
        String memberIdLC = memberId.toLowerCase();

        // 팀 이름으로 멤버 아이다가 들어 있는 ArrayList를 가져온다
        ArrayList<String>members = collection.get(teamNameLC);

        if (members == null) { // 해당팀의 멤버가 추가된 적이 없다면,
            members = new ArrayList<>();
            members.add(memberId);
            collection.put(teamNameLC, members);
            return 1;
        }

        // ArrayLIst에 해당 아이디를 가진 멤버가 들어 있다면,
        if(members.contains(memberIdLC)) {
            return 0;
        }

        members.add(memberIdLC);
        return 1;
    }

    public int deleteMember(String teamName, String memberId) {
        String teamNameLC = teamName.toLowerCase();
        String memberIdLC = memberId.toLowerCase();

        ArrayList<String> members = collection.get(teamNameLC);
        if (members == null || !members.contains(memberIdLC))
            return 0;

        members.remove(memberIdLC);
        return 1;
    }

    public Iterator<String> getMembers(String teamName) {
        ArrayList<String> members = collection.get(teamName.toLowerCase());
        if (members == null)
            return null;
        return members.iterator();
    } 
    
    public boolean isExist(String teamName, String memberId) {
        String teamNameLC = teamName.toLowerCase();
        String memberIdLC = memberId.toLowerCase();

        // 팀 이름으로 멤버 아이다가 들어 있는 ArrayList를 가져온다
        ArrayList<String> members = collection.get(teamNameLC);
        if (members == null || !members.contains(memberIdLC))
            return false;

        return true;
    }
}
// 용어 정리!
// 메서드 시그너처(method signature) = 함수 프로토타입(function prototype)
// 메서드의 이름과 파라미터 형식, 리턴 타입에 대한 정보를 말한다.

// ver18 - ArrayList를 적용 객체(의 주소)를 관리한다.
// ver17 - 클래스 추가





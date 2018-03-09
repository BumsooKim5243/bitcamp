package bitcamp.java106.pms.domain;


public class Help{
        String helps;
    
    public static void main(String[] args){
        Help[] he = new Help[7]; 
        
        for(int i = 0; i < he.length; i++){
            he[i] = new Help();
        }
           
            he[0].helps ="팀 등록 명령 : team/add";
            he[1].helps ="팀 조회 명령 : team/list";
            he[2].helps ="팀 상세조회 명령 :team/view 팀명";
            he[3].helps ="회원 등록 명령 : member/add";
            he[4].helps ="회원 조회 명령 : member/list";
            he[5].helps ="회원 상세조회 명령 : member/view 아이디";
            he[6].helps ="종료 : quit";

        for(int i = 0; i < he.length; i++){
            System.out.println(he[i].helps);
    
        }
    }
}
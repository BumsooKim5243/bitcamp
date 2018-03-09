package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.MemberAdd;
import bitcamp.java106.pms.domain.TeamAdd;
public class App{
    public static void main(String[] args) {
        java.util.Scanner keyScan = new java.util.Scanner(System.in);
        int i1 = 0;
        int i2 = 0;
        int count1 = 0;
        int count2 = 0;
        String str1;
        TeamAdd[] team = new TeamAdd[100];
        MemberAdd[] mem = new MemberAdd[100];
        for(;;){
            System.out.print("명령: ");
            str1 = keyScan.nextLine();
            if(str1.toLowerCase().equals("help")){
                System.out.print("팀 등록 명령 : team/add\n");
                System.out.print("팀 조회 명령 : team/list\n");
                System.out.print("팀 상세조회 명령 :team/view 팀명\n");
                System.out.print("회원 등록 명령 : member/add\n");
                System.out.print("회원 조회 명령 : member/list\n");
                System.out.print("회원 상세조회 명령 : member/view 아이디\n");
                System.out.print("종료 : quit\n");
                        
            }if(str1.toLowerCase().equals("team/add")){
                                  
                    team[count1] = new TeamAdd();
                    System.out.print("팀명? ");
                    team[count1].name = keyScan.nextLine();
                    System.out.print("설명? ");
                    team[count1].description = keyScan.nextLine();
                    System.out.print("최대인원? ");
                    team[count1].maxQty = keyScan.nextInt();
                    keyScan.nextLine(); 
                    System.out.print("시작일? ");
                    team[count1].startDay = keyScan.nextLine();
                    System.out.print("종료일? ");
                    team[count1].endDay = keyScan.nextLine();
                    System.out.println();

                    count1++;
            }if (str1.toLowerCase().equals("team/list")){
                for (i1 = 0; i1 < count1; i1++){
                    
                    System.out.printf("%s, %s, %d, %s, %s\n",
                    team[i1].name, team[i1].description,
                    team[i1].maxQty, team[i1].startDay,
                    team[i1].endDay);
            }if (str1.toLowerCase().contains("team/view")){

                if(str1.equals("team/view")){
                    System.out.println("팀명을 입력하시기 바랍니다.");
                    continue;
                }
                    
            }
            for(i1 = 0; i1 < count1; i1++){
                if(str1.contains( mem[i2].Name)){
                    System.out.print("팀명: " + team[i1].name );
                    System.out.print("설명: " + team[i1].description );
                    System.out.print("최대인원: " + team[i1].maxQty );
                    System.out.printf("기간: %d ~ %d\n",
                         team[i1].startDay, team[i1].endDay);
                    break;
                }
            }

            if(i1 == count1){
                System.out.println("해당 이름의 없습니다.");
            }
            }
            }if (str1.toLowerCase().equals("member/add")){
                                   
                    mem[count2] = new MemberAdd();
                    System.out.print("아이디? ");
                    mem[count2].Name = keyScan.nextLine();
                    System.out.print("이메일? ");
                    mem[count2].id = keyScan.nextLine();
                    System.out.print("암호? ");
                    mem[count2].pas = keyScan.nextLine();
                    System.out.println();

                    count2++;
            }if (str1.toLowerCase().equals("member/list")){
                for (i2 = 0; i2 < count2; i2++){
                    
                    System.out.printf("%s, %s, %s\n",
                         mem[i2].Name, mem[i2].id, mem[i2].pas);
                }
            }if (str1.toLowerCase().contains("member/view")){

                if(str1.equals("member/view")){
                    System.out.println("아이디를 입력하시기 바랍니다.");
                    continue;
                }
                    
           
            for(i2 = 0; i2 < count2; i2++){
                if(str1.contains( mem[i2].Name)){
                    System.out.print("아이디: " + mem[i2].Name );
                    System.out.print("설명: " + mem[i2].id );
                    System.out.println("암호: " + mem[i2].pas );
                    break;
                }
            }

            if(i2 == count2){
                System.out.println("해당 아이디의 회원이 없습니다.");
            }
            }if(str1.toLowerCase().equals("quit")){
                System.out.println("안녕히가세요!");
                
            }
 
    }
}


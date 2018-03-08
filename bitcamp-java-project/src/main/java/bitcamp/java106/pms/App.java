package bitcamp.java106.pms;

public class App {
    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;

        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        String team,  description, mem, start, end;
        
        System.out.print("팀명? ");
        team = keyScan.nextLine();
       
       
        System.out.print("설명? ");
        description = keyScan.nextLine();
        
        System.out.print("최대인원? ");
        mem = keyScan.nextLine();
        
        System.out.print("시작일? ");
        start = keyScan.nextLine();
        
        System.out.print("종료일? ");
        end = keyScan.nextLine();

        System.out.println("---------------------------------------------");
    
        System.out.println("프로젝트: " + team);
        System.out.println("설명: \n" +  description);
        System.out.println("최대인원: " + mem);
        System.out.println("일자 : " + start +" ~ " +end); 
        
    }
}
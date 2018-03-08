package bitcamp.java106.pms;

public class App{
    public static void main(String[] args) {
        java.util.Scanner keyScan = new java.util.Scanner(System.in);
        Score[] sc = new Score[5];
        String answer;
        int i;
 
        for ( i = 0; i < sc.length; i++){
            sc[i] = new Score();

            System.out.print("팀명? ");
            sc[i].teamName = keyScan.nextLine();
            System.out.print("설명? ");
            sc[i].description = keyScan.nextLine();
            System.out.print("최대인원? ");
            sc[i].maxQty = keyScan.nextInt();
            keyScan.nextLine(); 
            System.out.print("시작일? ");
            sc[i].startDay = keyScan.nextLine();
            System.out.print("종료일? ");
            sc[i].endDay = keyScan.nextLine();
            System.out.print("계속 입력하시겠습니까?(Y/n)");
            answer = keyScan.nextLine();
           
            if(answer.equals("Y")){
            }else if(answer.equals("n")){          
                i += 1;
                break;
            }
        }
        System.out.println("------------------------");
        for (int a = 0; a < i; a++){

            System.out.printf("%s, %d명, %s ~ %s\n",
             sc[a].teamName, sc[a].maxQty,
             sc[a].startDay, sc[a].endDay);
        }
    }
}
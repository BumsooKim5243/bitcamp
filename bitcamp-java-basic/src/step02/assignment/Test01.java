package step02.assignment;
public class Test01{
    public static void main(String[] args){

        java.io.InputStream keyboard = System.in;

        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        int score1, score2, score3;
        String name = new String();

        
        System.out.print("이름 ? ");
        name = keyScan.nextLine();
              
        System.out.print("국어 ? ");
        score1 = keyScan.nextInt();
               
        System.out.print("영어 ? ");
        score2 = keyScan.nextInt();
               
        System.out.print("수학 ? ");
        score3 = keyScan.nextInt();
        
        int result = score1 + score2 + score3;
        float average = result/3F;
        
        System.out.println("---------------------------------------------");
         
        System.out.println("이름 : " +name);
        System.out.println("국어 : " +score1);
        System.out.println("영어 : " +score2);
        System.out.println("수학 : " +score3);
        System.out.println("합계 : " +result);
        System.out.print("평균 : " +average);
       


                    

        



    }
}
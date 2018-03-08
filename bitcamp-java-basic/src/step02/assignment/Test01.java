package step02.assignment;

public class Test01 {
    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        int kor, eng, math;
        String name = new String();

        
        System.out.print("이름 ? ");
        name = keyScan.nextLine();
              
        System.out.print("국어 ? ");
        kor = keyScan.nextInt();
               
        System.out.print("영어 ? ");
        eng = keyScan.nextInt();
               
        System.out.print("수학 ? ");
        math = keyScan.nextInt();
        
        int result = kor + eng + math;
        float average = result/3F;
        
        System.out.println("---------------------------------------------");
         
        System.out.print("이름: " +name);
        System.out.print(" ");
        System.out.print("국어: " +kor);
        System.out.print(" ");
        System.out.print("영어: " +eng);
        System.out.print(" ");
        System.out.print("수학: " +math);
        System.out.print(" ");
        System.out.print("합계: " +result);
        System.out.print(" ");
        System.out.print("평균: " +average);
       
    }
}
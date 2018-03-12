package step01;
public class Step02_1{
    public static void main(String[] args){
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        String name1;
        int kor1;
        int eng1;
        int math1;
        int sum1;
        float average1;

        System.out.print("이름: ");
        name1 = keyScan.nextLine();
        System.out.print("국어: ");
        kor1 = keyScan.nextInt();
        System.out.print("영어: ");
        eng1 = keyScan.nextInt();
        System.out.print("수학: ");
        math1 = keyScan.nextInt();
       
        sum1 = kor1 + eng1 + math1;
        average1 = sum1 / 3f;

        System.out.printf("%s %d %d %d %d %.2f",
                 name1, kor1, eng1, math1, sum1, average1);

    }
}
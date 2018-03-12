package src01;
import java.util.Scanner;
public class App{
    public static void main(String[] args){
        Scanner keyScan = new Scanner(System.in);

        String name;
        String ex ;
        int mem;
        String start ;
        String end ;

        System.out.print("팀명: ");
        name = keyScan.nextLine();
        System.out.println("설명: ");
        ex = keyScan.nextLine();
        System.out.print("최대인원: ");
        mem = keyScan.nextInt();
        keyScan.nextLine();
        System.out.print("시작일: ");
        start = keyScan.nextLine();
        System.out.print("종료일: ");
        end = keyScan.nextLine();

        System.out.println("-----------------");
        System.out.printf("팀명: %s%n설명:%n%s%n최대인원: %d명%n일자: %s ~ %s",
            name, ex, mem, start, end);




    }
}
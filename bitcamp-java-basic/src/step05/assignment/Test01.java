package step05.assignment;

import java.util.Scanner;

public class Test01{
    public static void main(String[] agrs){
        Scanner keyScan = new Scanner(System.in);

        System.out.print("밑변 길이? ");
        int len = keyScan.nextInt();
        int count = 1;

        while (count <= len){
            int starcnt = 1;
            while (starcnt <= count){
                System.out.print("*");
                starcnt++;
            }
            System.out.println();
            count++;
        }
    }
}

package step05.assignment;

import java.util.Scanner;

public class Test02{
    public static void main(String[] agrs){
        Scanner keyScan = new Scanner(System.in);

        System.out.print("가로 길이? ");
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
        count = len - 1;
        while (count >= 1){
            int starcnt = 1;
            while (starcnt <= count){
                System.out.print("*");
                starcnt++;
            }
            System.out.println();
            count--;
        }
    }
}

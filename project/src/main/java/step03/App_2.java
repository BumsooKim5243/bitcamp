package main.java.step03;

import java.util.Scanner;
public class App_2 {

    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        System.out.print("가로길이: ");
        int len = keyScan.nextInt();
        int count = 1;
        while (count <= len){

            int star = 1;
            while (star <= count){
                System.out.print("*");
                star++;
            }
            System.out.println();
            count++;
        }
        count = len - 1;
        while (count >= 1){

            int star = 1;
            while (star <= count){
                System.out.print("*");
                star++;
            }
            System.out.println();
            count--;
        }
    }
}
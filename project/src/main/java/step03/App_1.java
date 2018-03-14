package main.java.step03;

import java.util.Scanner;

public class App_1{
    public static void main(String[] args){
        Scanner keyScan = new Scanner(System.in);

        System.out.print("밑변의 값: ");
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

    }
}
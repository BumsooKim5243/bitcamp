package main.java.step03;

import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("값: ");
        int len = keyScan.nextInt();
        int count = 1;

        while (count <= len){

            for (int space = 1, spCnt = (len - count)/2;
                 space <= spCnt; space++){
                     System.out.print(" ");
                 }

            for (int star = 1; star <= count; star++){
                System.out.print("*");
            }
            System.out.println();
            count+=2;
        }
        
        }
    }

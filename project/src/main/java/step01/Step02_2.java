package step01;

import java.util.Scanner;

public class Step02_2{
    public static void main(String[] args){
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new Scanner(keyboard);

        String[] name = new String[5];
        int[] kor = new int[5];
        int[] eng = new int[5];
        int[] math = new int[5];
        int[] sum = new int[5];
        float[] average = new float[5];
        int min;
        int max;
       
        for(int i = 0; i < 5; i++){
            System.out.print("이름: ");
            name[i] = keyScan.next();
            System.out.print("국어: ");
            kor[i] = keyScan.nextInt();
            System.out.print("영어: ");
            eng[i] = keyScan.nextInt();
            System.out.print("수학: ");
            math[i] = keyScan.nextInt();
            System.out.println();
        
            sum[i] = kor[i] + eng[i] + math[i];
            average[i] = sum[i] / 3f;
        }
        

        for(int i = 0; i < 5; i++){
            System.out.printf("%s의 성적은 국어 %d점, 영어 %d점, 수학%d점, ", 
                            name[i], kor[i], eng[i], math[i]);
            System.out.printf("합계: %d점, 평균: %.2f점%n", sum[i], average[i]);
            System.out.println();
        }
        
        max = 0;
        min = max;
        for(int i = 0; i < 5; i++){
            if(sum[i] > max){
                max = sum[i];
            
                
            }else if(sum[i] > min){
                min = sum[i];
            }
        }
        System.out.printf(" 최고 점수는 %d이고, 최저 점수는 %d 이다%n",
           max, min);
           
     
        for(int a = 0 ; a < 5 ; a++){
            if(sum[a] == max) {
                System.out.printf("%s", name[a]);
            }else{
                
            }
     
        
        
        }
    }
}
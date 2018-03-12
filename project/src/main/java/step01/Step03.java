package step02;

import javax.lang.model.util.ElementScanner6;

public class Step03{
    public static void main(String[] args){
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);
        int max, min, num1, num2, num3, sum;
        float aver;

        System.out.print("첫번째 숫자: ");
        num1 = keyScan.nextInt();
        System.out.print("두번째 숫자: ");
        num2 = keyScan.nextInt();
        System.out.print("세번째 숫자: ");
        num3 = keyScan.nextInt();

        if(num1 < num2){
             max = num2;
             min = num1;
        }else{
            max = num1;
            min = num2;
        }if(max < num3){
            max = num3;
        }if(min > num3){
            min = num3;
        }
        sum = num1 + num2 + num3;
        aver = sum /3f;
        System.out.printf("최댓값: %d, 최솟값: %d, 합계: %d, 평균: %.2f",
                        max, min, sum, aver);

        
    }
}
            
// 흐름 제어문 - break와 continue
package step05;

import java.util.Scanner;

public class Exam03_2 {
    public static void main(String[] args) {
       
        int count = 0;
        int sum = 0;
        
        //continue 사용전
        // 1부터 100까지의 합은?
        while (count < 100) {
            count++;
            sum += count;
        }
        System.out.printf("count = %d, sum = %d\n", count, sum);
        System.out.println("----------------------------");

        count = 0;
        sum = 0;
        
        //continue 사용전
        // 1부터 100까지의 짝수의 합은?
        while (count < 100) {
            count++;
            if(count % 2 == 0) {
                sum += count;
            }
        }
        System.out.printf("count = %d, sum = %d\n", count, sum);

        System.out.println("----------------------------");

        count = 0;
        sum = 0;
        
        //continue 사용 후
        // 1부터 100까지의 짝수의 합은?
        while (count < 100) {
            count++;
            if(count % 2 == 1) 
                continue; // 다음 문장을 실행하지 않고 즉시 조건 검사로 이동한다.
            sum += count;
        }
        System.out.printf("count = %d, sum = %d\n", count, sum);

        System.out.println("----------------------------");

        count = 0;
        sum = 0;
        
        // break 사용 전
        // 1부터 100까지의 카운트를 하는데 단 합은 50까지만 계산한다.
        while (count < 100) {
            count++;
            if(count > 50) // 50 넘어가면 합을 수행하지 않는다. 
            continue; 
            sum += count;
        }
        System.out.printf("count = %d, sum = %d\n", count, sum);

        System.out.println("----------------------------");

        count = 0;
        sum = 0;
        
        // break 사용 후
        // 1부터 100까지의 카운트를 하는데 단 합은 50까지만 계산한다.
        while (count < 100) {
            count++;
            if(count > 50) 
            break; // 반복문을 나간다.
            sum += count;
        }
        System.out.printf("count = %d, sum = %d\n", count, sum);
    }
}


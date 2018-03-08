// 문자 변수 - UTF-16(Unicode 2) 코드값 저장
package step02;

public class Exam06_2 {   
    public static void main(String [] args) {
       char c1, c2, c3;
       c1 = 0x41;
       c2 = 65;
       c3 = 0b0100_0001;

       System.out.println(c1);
       System.out.println(c2);
       System.out.println(c3);

       char c4;
       c4 = '헐';

       System.out.println(c4);

    }
}


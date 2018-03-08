// 변수 - 변수 선언과 값 저장하기
package step02;

public class Exam03_4 {   
    public static void main(String [] args) {
        int a1, a2;
        a1 = 100;
        a2 = 200;
        System.out.println(a1);
        System.out.println(a2);
        
        int b1 =100, b2 =200;
        System.out.println(b1);
        System.out.println(b2);

        int c1 =100, c2, c3 =300, c4;
        System.out.println(c1);
        //System.out.println(c2); 컴파일 오류(값이 초기화 되지 않았음)
        System.out.println(c3);
        //System.out.println(c4); 컴파일 오류(값이 초기화 되지 않았음)
    }
}


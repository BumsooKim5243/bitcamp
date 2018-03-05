// 부동소수점 변수 - 단정도와 배정도
package step02;

public class Exam05_2{   
    public static void main(String [] args) {
        float f;
        double d;

        f = 9876.98769876f;
        d = 9876.98769876f;

        System.out.println(f);     
        System.out.println(d); 

        f = 9876.98769876f;
        d = 9876.98769876;

        System.out.println(f);     
        System.out.println(d); 

        // double(8byte) ==> float(4byte) 컴파일 오류 !
        // f = 9876.98769876; // 컴파일 오류 발생 !

    }
}


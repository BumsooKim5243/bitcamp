//산술 연산자 : 연산의 결과 타입
package step04;

public class Exam01_4 {
    public static void main(String[] args){
        int i = 5;
        int j = 2;
        float r = i / j;
        System.out.println(r);
        r =(float) i / (float) j;
        System.out.println(r);

        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        int r1 = x + y;
        long r2 = x + y;
        System.out.println(r1);
        System.out.println(r2);

        float f1 = 987.6543f;
        float f2 = 1.111111f;
        float f3 = f1 + f2;
        double r4 = f1 + f2;
        System.out.println(f3);
        System.out.println(r4);

        double d1 = 987.6543;
        double d2 = 1.111111;
        double r5 = d1 + d2;
        System.out.println(r5);
        

    }
}
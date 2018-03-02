package step01;

public class Exam06_2 {
    public static void main(String[] args) {
        
        System.out.println(3.14); // 8바이트
        System.out.println(3.14f); // 4바이트, 주로 소문자를 사용
        
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println("---------------------------");
        
        // 4byte 부동소수점 테스트
        System.out.println(987.6543f);
        System.out.println(987654.3f);
        System.out.println(9.876543f);

        System.out.println(987654.345678f);
        System.out.println(98765434567.8f);
        System.out.println(9.87654345678f);
        System.out.println("---------------------------");

        // 8byte 부동소수점 테스트
        System.out.println(987.6543);
        System.out.println(987654.3);
        System.out.println(9.876543);

        System.out.println(987654.345678);
        System.out.println(98765434567.8);
        System.out.println(9.87654345678);

        System.out.println(7 * 0.1);

               

    }
}
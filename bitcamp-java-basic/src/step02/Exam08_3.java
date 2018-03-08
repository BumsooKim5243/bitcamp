// 형변환 - 정수 변수의 값을 부동소수점 변수에 저장
package step02;

public class Exam08_3 {   
    public static void main(String [] args) {
      byte b = 100;
      short s = 100;
      int i = 98765678;
      long l = 98765678;
      char c = 100;

      float f;
      double d;


      // 정수 변수의 값을 부동소수점 변수에 저장할 때 
      // 값이 짤릴 수 있다.
      f = b;
      System.out.println(f);
      f = s;
      System.out.println(f);
      f = c;
      System.out.println(f);
      f = i;
      System.out.println(f);
      f = l;
      System.out.println(f);
      

      d = i;
      System.out.println(d);
      
      l = 18_2345_3456_4567_5678L;
      d = l;
      System.out.println(d);

    }
}
// 정수 메모리의 값(byte, short, char, int, long)을 
// 부동소수점 메모리(float, double)에 저장할 때
// 주의해서 사용하라!
// 큰 정수 값이 부동소수점 메모리에 저장될 때 짤flf 수 있다.
// 컴파일 오류가 발생하지 않기 때문에
// 개발자들이 놓치는 경우가 많다!

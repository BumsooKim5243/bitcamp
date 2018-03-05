// 형변환 - 메모리 크기가 다른 변수 값을 저장 될 때
package step02;

public class Exam08_1{   
    public static void main(String [] args) {
      byte b =100;
      short s = 100;
      int i = 100;
      long l = 100;
      char c = 100;

      byte b2;
      short s2;
      int i2;
      long l2;
      char c2;

      // 컴파일 오류
      b2 = s;
      s2 = i;
      i2 = l;
      c2 = s;


    }
}


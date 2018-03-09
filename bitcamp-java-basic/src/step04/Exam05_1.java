// 조건 연산자 => ? :
package step04;

public class Exam05_1 {
    public static void main(String[] args){
      // 조건 연산자
      // 조건 ? 표현식1 : 표현식2
      // => 조건이 참이면 표현식1을 실행하고,
      //    조건이 거짓이면 표현식2를 실행한다.

      int age = 20;
      /*(age > 18) ? System.out.println("성인이다."); :
                   System.out.println"미성년자이다."); 컴파일 오류!*/
    
      String message = (age > 18) ? "성년" : "미성년";
      System.out.printf("나이 %d는(은) %s이다\n", age, message);
    }
}


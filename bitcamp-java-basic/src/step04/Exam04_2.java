// 비트 이동 연산자 : >>, >>>, <<
package step04;

public class Exam04_2 {
    public static void main(String[] args){
       int i = 0b01101001;
       System.out.println(i);
       System.out.println(i >> 1);
       System.out.println(i >> 2);
       System.out.println(i >> 3);
       System.out.println(i >> 4);
       // 오른쪽으로 이동 후,
       // 왼쪽쪽 빈자리 : 원래 숫자와 같은 부호로 값으로 채운다.
       //                양수면 0, 음수면 1을 채운다.
       // 오른쪽 경계를 넘어간 비트 : 짜른다      

       // 음수를 이동
       i = 0b11111111_11111111_11111111_10101001;
       System.out.println(i);
       System.out.println(i >> 1);
       System.out.println(i >> 2);
       System.out.println(i >> 3);
       System.out.println(i >> 4);
    }
}

// 오른쪽 이동
// - 1비트 이동은 나누기 2한 것과 같은효과를 준다.
// - 소수점 이하는 짤리는 효과를 갖는다
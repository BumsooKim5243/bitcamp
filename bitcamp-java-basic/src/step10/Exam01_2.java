// String - 문자열 비교

package step10;

public class Exam01_2 {

    public static void main(String[] args) {
        // Heap 메모리 영역에 String 인스턴스를 생성하는 방법
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = "Hello";
        
        // 인스턴스의 주소가 아닌 인스턴스의 데이터가 같은지 비교할 때는
        // equals()라는 메서드를 사용하라!
        // == 주소값 비교
        if (s1.equals(s2))
            System.out.println("s1과 s2는 같다");
        else 
            System.out.println("s1과 s2다르다");
        
        if (s1.equals(s3))
            System.out.println("s1과 s3는 같다");
        else 
            System.out.println("s1과 s3다르다");
    }

}

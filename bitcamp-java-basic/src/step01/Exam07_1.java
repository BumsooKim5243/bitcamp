package step01;

public class Exam07_1 {
    public static void main(String[] args) {

        // 소스 코드에 10진수가 아닌 16진수가 있다면,
        // 그것은 개발자가 의도적으로 값이 아닌 2진수를 강조하기 위함이다.
        System.out.println(0x41); // 출력시 10진수가 출력됨    
        
        
        // 해당 숫자가 단순한 정수값이 아니라,
        // 문자 코드 값임을 알려주면,
        // println() 명령어는 그문자 코드에 해당하는 문자를
        // 폰트파일에서 찾아 출력한다.
        System.out.println((char)0x41);
                
        System.out.println('A');
        
        System.out.println('\u3182'); 


    }
}
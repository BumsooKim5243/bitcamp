// 흐름 제어문 - switch 문 사용 후
package step05;

public class Exam02_3 {
    public static void main(String[] args) {
        // switch (값) {}
        // 값으로 가능한 데이터 타입은?
        // => int정수 (byte,short,int,char), 문자열, 특별한 상수 Enum 타입
        // => case 값으로 변수를 사용할 수 없다. 리터럴만 가능하다.
        byte b =2;
        switch (b) {
            case 1:
            case 2:
            default :
        }
       
        short s = 2;
        switch (s) {
            case 1:
            case 2:
            default :
        }

        int i = 2;
        switch (i) {
            case 1:
            case 2:
            default :
        }
       
        //컴파일 오류
        /*long l = 2;
        switch (l) {
            case 1:
            case 2:
            default :
        }*/

        char c = 'A'; // A문자의 유니코드 값 (UTF-16) 0x41(65)을 c에 저장한다.
        switch (c) {
        // case 의 값도 int 값이면 무엇이든 된다.
        case 'A': // 0x41 = 65
        case 66:
        case 0x43:
        default :
        }

        // String 값을 switch 와 case의 값으로 사용할 수 있다.
        String str = "Hello";
        switch (str) {
        // case 의 값으로 switch 문을 쓸 수 있다.
        case "hello": // 0x41 = 65
        case "ohora":
        case "hul":
        default :
        }
       
        // boolean 값을 switch와 case에 사용할 수 없다.
        /*
        boolean bool = true;
        switch (bool) {
        case true:
        case false:
        }*/

        // case에는 리터럴만 올 수 있다.
        // 즉 변수를 사용할 수 없다.
        int x = 1, y = 300;
        switch (x) {
        case 1 * 300: // ok
        case 1 * x: // 컴파일 오류!
        }
        
    }
}
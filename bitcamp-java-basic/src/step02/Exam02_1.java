// 키보드 입력 받기
package step02;

public class Exam02_1{   
    public static void main(String [] args) {
        // 키보드 정보를 가져온다.
        java.io.InputStream keyboard = System.in;

        // 키보드에서 값을 꺼내주는 도구를 연결한다.
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        //print()는 문자열을 출력한 후 줄바꿈을 하지않는다.
        System.out.print("팀명 ? "); 
        
        // Scanner 도구를 사용하여 키보드로부터 입력된 
        // 한 줄의 문자열을 가져온다.
        // 그리고 곧 바로 println() 명령을 사용하여 콘솔로 출력한다.
        System.out.println(keyScan.nextLine());
       
    }
}


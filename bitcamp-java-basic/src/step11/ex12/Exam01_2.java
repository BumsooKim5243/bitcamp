// Object 클래스의 메서드를 오버라이딩 하기 - toString()
package step11.ex12;

public class Exam01_2 {
    static class Score {
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float aver;

        public Score(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
            this.sum = this.kor + this.sum + this.eng;
            this.aver = this.sum/3F;
        }
        // Object로부터 상속 받은 toString() 리턴 값이 마음에 들지않으면 재정의 하라!
        
        @Override
        public String toString() {
            return String.format("%s,%d,%d,%d,%d,%.1f",
                    this.name, this.kor, this.eng, this.math,
                    this.sum, this.aver);
        }
    }

    public static void main(String[] args) {
        Score s1 = new Score("홍길동",100,100,100);
        System.out.println(s1.toString());
        // to String()을 오버라이딩 했기 때문에 다른결과가 출력 된다.
        
        System.out.println(s1);
        
    }
}

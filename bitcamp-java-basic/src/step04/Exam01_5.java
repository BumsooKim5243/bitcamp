//산술 연산자 : 암시적 형변환
package step04;

public class Exam01_5 {
    public static void main(String[] args){
        byte b = 1;
        short s = 2;
        int i = 3; 
        long l = 4;
        float f = 5.2f;
        double d = 6.6;
        char c= 7;
        boolean bool = true;

        
        //byte r1 = b + b;
        
        //short r2 = s + s;
        
        //short r3 = b + s;
        
        int r4 = b + i;
        
        int r5 = s + i;
        
        //int r6 = i + l;
        
        //long r7 = l + f;
        
        //int r8 = i + f;
        
        //float r9 = f + d;
        
        //long r10 = b + s + i + l + f +d;
        
        //long r11 = f + i + l;
        
        //int r12 = bool + i;
    }
}
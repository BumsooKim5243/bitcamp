package step02.assignment;

public class Test02 {
    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        String[] name = new String[5];
        int[] kor = new int[5];
        int[] eng = new int[5];
        int[] math = new int[5];
        int[] result = new int[5];
        float[] average = new float[5];
        
        
        for (int i = 0; i < 5; i++) {
            System.out.print("입력? ");
            name[i] = keyScan.next();
            kor[i] = keyScan.nextInt();
            eng[i] = keyScan.nextInt();
            math[i] = keyScan.nextInt();
            
            result[i] = kor[i] + eng[i] + math[i];
            average[i] = result[i]/3f;
        }
        
        System.out.println("---------------------------------------------");
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %d %d %d %d %f\n",
                 name[i], kor[i], eng[i], math[i], result[i], average[i]);
            
        }

        
    }
}
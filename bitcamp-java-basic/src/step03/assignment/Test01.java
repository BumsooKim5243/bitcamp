package step03.assignment;

public class Test01 {
    public static void main(String[] args){
               java.util.Scanner keyscan = new java.util.Scanner(System.in);

         class Score{
             String name;
             int kor;
             int eng;
             int math;
             int sum;
             float aver;
         }
        

        Score[] arr = new Score[3];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = new Score();

            System.out.print("입력: ");
            arr[i].name = keyscan.next();
            arr[i].kor = keyscan.nextInt();
            arr[i].eng = keyscan.nextInt();
            arr[i].math = keyscan.nextInt();

            arr[i].sum = arr[i].kor + arr[i].eng + arr[i].math;
            arr[i].aver = arr[i].sum / 3f;
        }
        System.out.println("---------------------------");

        for(int i= 0; i < arr.length; i++){
            System.out.printf("입력: %1s %d %d %d %d %.1f\n",
                arr[i].name, arr[i].kor, arr[i].eng, arr[i].math, arr[i].sum, 
                arr[i].aver);
        }
    }
}
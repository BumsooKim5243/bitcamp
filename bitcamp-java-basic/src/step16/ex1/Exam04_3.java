package step16.ex1;

import java.io.File;

public class Exam04_3 {

    public static void main(String[] args) throws Exception {
        File file = new File("temp2/a/test.txt");
        
        //File dir = new File(file.getParent());
        File dir = file.getParentFile();
        
        if (dir.mkdirs()) {
            System.out.println("temp/a 디렉토리를 생성하였습니다.");
        } else {
            System.out.println("temp/a 디렉토리를 생성할 수 없습니다.");
        }
        
        if (file.createNewFile()) {
            System.out.println("test.txt 파일을 생성하였습니다.");
        } else {
            System.out.println("test.txt 파일을 생성할 수 없습니다");
        }
        
    }

}

package bitcamp.project.pms.util;

import java.util.Scanner;
public class Console {
    public static boolean Confirm(String message) {
        System.out.printf("%s (y/N)", message);
        String input = keyScan.nextLine().toLowerCase();
            if (input.equals("n")) {
                return false;
            } else if(input.equals("y")) {
                return true;
            }
    }
    public static String[] prompt() {
        System.out.print("명령> ");
        return keyScan.nextLine().toLowerCase().split(" ");
    }
}
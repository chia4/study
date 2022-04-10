package test;

/*
编写static方法，返回一个字符串中指定字符的个数
22.4.7
*/

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int j = 0;
        String c = null;
        String text = null;
        System.out.println("Input a char and some word:");
        if (scan.hasNextLine()) {
            c = scan.nextLine();
        }
        if (scan.hasNextLine()) {
            text = scan.nextLine();
        }
        assert text != null;
        for (int i = 0; i < text.length(); i++) {
            assert c != null;
            if (text.charAt(i) == c.charAt(0)) {
                j++;
            }
        }
        System.out.println("There is " + j + " place.");
    }
}

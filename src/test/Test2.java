package test;

/*
输入n，输出n位的随机字符串，由大小写字母和数字构成
22.3.24
*/

import java.util.Scanner;

public class Test2 {
    static int translate(int n) {
        if (n < 10) return n + 48;
        else if (n < 36) return n + 55;
        else return n + 61;
    }

    public static void main(String[] args) {
        String text = "";
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++)
            text = text.concat(String.valueOf((char) translate((int) (Math.random() * 52))));
        System.out.println(text);
    }
}

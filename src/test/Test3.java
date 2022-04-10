package test;

/*
提示用户输入一个年份和一个3字母月份的字符串，显示该月的天数
22.4.7
*/

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = null;
        System.out.println("Input year and month:");
        if (scan.hasNextLine()) {
            text = scan.nextLine();
        }
        assert text != null;
        int year = Integer.parseInt(text.substring(0, 4));
        switch (text.substring(5, 8)) {
            case "jan":
            case "mar":
            case "may":
            case "jul":
            case "aug":
            case "oct":
            case "dec":
                System.out.println("This month has 31 days.");
                break;
            case "feb":
                if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                    System.out.println("This month has 29 days.");
                } else {
                    System.out.println("This month has 28 days.");
                }
                break;
            default:
                System.out.println("This month has 30 days.");
                break;
        }
    }
}

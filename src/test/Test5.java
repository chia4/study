package test;

/*
编写static方法，完成英尺和米之间的转换
22.4.7
*/

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 1.Meter or 2.Inch:");
        int i = scan.nextInt();
        System.out.println("Input value:");
        float j = scan.nextFloat();
        if (i == 1) {
            System.out.printf("%.2f Meter(s) = %.2f Inch(s)", j, j / 0.3048);
        } else {
            System.out.printf("%.2f Inch(s) = %.2f Meter(s)", j, j * 0.3048);
        }
    }
}

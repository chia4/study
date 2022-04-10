package test;

/*
输出100个从1到1000的随机数
22.3.22
*/

public class Test1 {
    static boolean exist(int[] ints, int i, int num) {
        for (int j = 0; j < i; j++) {
            if (ints[j] == num) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] ints = new int[100];
        for (int i = 0; i < 100; i++) {
            while (true) {
                int num = 1 + (int) (Math.random() * 1000);
                if (i == 0 || exist(ints, i, num)) {
                    ints[i] = num;
                    break;
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(i + 1 + " " + ints[i]);
        }
    }
}

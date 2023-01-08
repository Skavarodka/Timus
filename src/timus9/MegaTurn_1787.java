package timus9;

import java.util.Scanner;

public class MegaTurn_1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int count = 0;
        for (int i = 0 ; i < n ; i++) {
            int x = in.nextInt();
            count = count + x - k;
            if (count < 0) {
                count = 0;
            }
        }
        System.out.println(count);
    }
}

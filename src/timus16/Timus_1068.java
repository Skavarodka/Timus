package timus16;

import java.util.Scanner;

public class Timus_1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        if (n <= 0) {
            for (int i = n ; i <= 1 ; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else {
            for (int i = 1 ; i <= n ; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}

package timus13;

import java.util.Scanner;

public class Timus_1639 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        if ((m * n) % 2 == 0) {
            System.out.println("[:=[first]");
        } else {
            System.out.println("[second]=:]");
        }
    }
}

package timus6;

import java.util.Scanner;

public class Bicyle_1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if (num1 % 2 == 0 || num2 % 2 != 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

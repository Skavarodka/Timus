package timus7;

import java.util.Scanner;

public class MathBerry_2001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstMath1 = in.nextInt();
        int secondMath1 = in.nextInt();
        int firstMath2 = in.nextInt();
        int secondMath2 = in.nextInt();
        int firstMath3 = in.nextInt();
        int secondMath3 = in.nextInt();
        int secondMathBerry = secondMath1 - secondMath2;
        int firstMathBerry = secondMath3 - secondMath2 - secondMathBerry;
        System.out.println(firstMathBerry + " " + secondMathBerry);
    }
}

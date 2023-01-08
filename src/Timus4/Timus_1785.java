package Timus4;
import java.io.PrintWriter;
import java.util.Scanner;
public class Timus_1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int num = in.nextInt();
        if (num < 5) {
            out.print("few");
        } else if (num > 4 && num < 10) {
            out.print("several");
        } else if (num > 9 && num < 20) {
            out.print("pack");
        } else if (num > 19 && num < 50) {
            out.print("lots");
        } else if (num > 49 && num < 100) {
            out.print("horde");
        } else if (num > 99 && num < 250) {
            out.print("throng");
        } else if (num > 249 && num < 500) {
            out.print("swarm");
        } else if (num > 499 && num < 1000) {
            out.print("zounds");
        } else if (num > 999) {
            out.print("legion");
        }

        out.flush();
    }
}

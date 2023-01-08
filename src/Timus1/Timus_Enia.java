package Timus1;
import java.io.PrintWriter;
import java.util.Scanner;

public class Timus_Enia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int res = N * A * B * 2;
        out.println(res);
        out.flush();

    }
}

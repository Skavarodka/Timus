package Timus3;
import java.io.PrintWriter;
import java.util.Scanner;
public class Timus_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int garryShoot = in.nextInt();
        int larryShoot = in.nextInt();
        int resultGarry = --larryShoot;
        int resultLarry = --garryShoot;

        out.print(resultGarry);
        out.print(" ");
        out.print(resultLarry);
        out.flush();

    }

}

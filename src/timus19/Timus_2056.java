package timus19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Timus_2056 {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus19/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));
        int size1 = Integer.parseInt(bufferedReader.readLine());
        int sum = 0;
        int threeMark = 0;
        int[] readInt = new int[size1];
        for (int i = 0 ; i < size1 ; i++) {
            readInt[i] = Integer.parseInt(bufferedReader.readLine());
            sum += readInt[i];
            if (readInt[i] == 3) {
                threeMark++;
            }
        }
        if ((sum / size1) == 5) {
            System.out.println("Named");
        }
        else if (threeMark > 0) {
            System.out.println("None");
        }         else if (((double)sum / readInt.length) >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }
    }
}

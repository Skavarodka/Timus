package timus14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Timus_1910 {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus14/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));
        int wallSection = Integer.parseInt(bufferedReader.readLine());
        String[] magicField = bufferedReader.readLine().split(" ");
        int[] wallArray = new int[wallSection - 2];
        for (int i = 0 ; i < wallArray.length ; i++) {
            wallArray[i] = Integer.parseInt(magicField[i]) + Integer.parseInt(magicField[i + 1]) + Integer.parseInt(magicField[i + 2]);
        }
        int[] wallArraySort = Arrays.copyOf(wallArray, wallArray.length);
        Arrays.sort(wallArraySort);
        int fieldPower = wallArraySort[wallArraySort.length - 1];
        for (int i = 0 ; i < wallArray.length ; i++) {
            if (wallArray[i] == fieldPower) {
                System.out.println(fieldPower + " " + (i + 2));
            }
        }
    }
}

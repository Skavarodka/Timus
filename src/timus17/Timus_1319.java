package timus17;

import java.util.Scanner;

public class Timus_1319 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[][] table = new int[num][num];
        int count = 1;
        int countM = table.length - 1;
        while (countM >= 0) {
            int temp = 0;
            int countN = countM;
            while (countN < table.length) {
                table[temp][countN] = count++;
                temp++;
                countN++;
            }
            countM--;
        }
        int countN = 1;
        while (countN <= table.length) {
            int temp = 0;
            int countMi = countN;
            while (countMi < table.length) {
                table[countMi][temp] = count++;
                countMi++;
                temp++;
            }
            countN++;
        }
        for ( int i = 0 ; i < table.length ; i++ ) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.println(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}

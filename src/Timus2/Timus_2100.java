package Timus2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Timus_2100 {
    public static void main(String[] args) {
        String inputFileName = "src/Timus2/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int marshalAndLili = 2;
        try {

            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String readLine = "";
            int numberOfFriends = 0;
            int numberOfPlusOne = 0;
            while ((readLine = bufferedReader.readLine()) != null) {
                if (numberOfFriends == 0) {
                    numberOfFriends = Integer.parseInt(readLine);
                    continue;
                }
                if (readLine.contains("+")) {
                    numberOfPlusOne++;
                }
            }
            int result;
            int guest = (marshalAndLili + numberOfFriends + numberOfPlusOne);
            if (guest == 13) {
                result = (guest * 100) + 100;
            } else {
                result = guest * 100;
            }
            System.out.println(result);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}

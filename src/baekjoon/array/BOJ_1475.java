package baekjoon.array;

import java.io.*;
import java.util.Arrays;

public class BOJ_1475 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int[] countArray = new int[9];
            String roomNumber = br.readLine();

            for (int i = 0; i < roomNumber.length(); i++) {
                int number = Character.getNumericValue(roomNumber.charAt(i));
                if (number == 9) {
                    countArray[6]++;
                } else {
                    countArray[number]++;
                }
            }
            countArray[6] = (countArray[6] / 2) + (countArray[6] % 2);
            // O(NlogN)
            Arrays.sort(countArray);
            bw.write(countArray[8] + "\n");
            bw.flush();
        }
    }
}

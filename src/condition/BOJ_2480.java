package condition;

import java.io.*;
import java.util.*;

public class BOJ_2480 {

    private static final int THREE_EQUALS_BONUS = 10000;
    private static final int THREE_EQUALS_MULTIPLE = 1000;

    private static final int TWO_EQUALS_BONUS = 1000;
    private static final int ONE_OR_TWO_EQUALS_MULTIPLE = 100;

    public static void main(String[] args) throws Exception {
        String input = input();
        StringTokenizer st = new StringTokenizer(input);
        int result = dice(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
        output(result);
    }

    private static String input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    private static int dice(int x, int y, int z) {
        if (isEqualsThree(x, y, z)) {
            return THREE_EQUALS_BONUS + x * THREE_EQUALS_MULTIPLE;
        }
        if (isEqualsTwo(x, y, z)) {
            int sameNumber = findSameNumber(x, y, z);
            return TWO_EQUALS_BONUS + sameNumber * ONE_OR_TWO_EQUALS_MULTIPLE;
        }
        int max = getMax(x, y, z);
        return max * ONE_OR_TWO_EQUALS_MULTIPLE;
    }

    private static boolean isEqualsThree(int x, int y, int z) {
        return x == y && y == z;
    }

    private static boolean isEqualsTwo(int x, int y, int z) {
        return x == y || y == z || x == z;
    }

    private static int findSameNumber(int x, int y, int z) {
        if (x == y) {
            return x;
        }
        if (y == z) {
            return y;
        }
        return z; //x랑 z랑 같다.
    }
    private static int getMax(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }


    private static void output(int result) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}

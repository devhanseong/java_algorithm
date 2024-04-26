package array;

import java.io.*;

public class BOJ_10798 {

    private static final int ROW = 5;
    private static final int COLUMN = 15;

    public static void main(String[] args) throws Exception {
        String[][] arr = createArray();
        output(arr);
    }

    private static String[][] createArray() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[ROW][COLUMN];

        for (int i = 0; i < ROW; i++) {
            String[] strs = br.readLine().split("");
            for (int j = 0; j < strs.length; j++) {
                arr[i][j] = strs[j];
            }
        }
        return arr;
    }

    private static void output(String[][] arr) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < COLUMN; i++) {
            for (int j = 0; j < ROW; j++) {
                if (!isEmpty(arr[j][i])) {
                    bw.write(arr[j][i]);
                }
            }
        }
        bw.write("\n");
        bw.flush();
    }

    private static boolean isEmpty(String str) {
        return "".equals(str) || str == null;
    }

}
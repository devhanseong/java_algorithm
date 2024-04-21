package condition;

import java.io.*;

public class BOJ_14681 {

    /**
     * 백준에서 input()메서드로 2번받으면 NumberFomatException발생
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        String y = br.readLine();
        String result = quadrante(Integer.valueOf(x), Integer.valueOf(y));
        output(result);
    }

    private static String quadrante(int x, int y) {
        if (x > 0 && y > 0) {
            return "1";
        }
        if (x < 0 && y > 0) {
            return "2";
        }
        if (x < 0 && y < 0) {
            return "3";
        }
        return "4";
    }

    private static void output(String result) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}

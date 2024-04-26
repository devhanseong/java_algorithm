package array;

import java.io.*;
import java.util.*;

public class BOJ_2738 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.valueOf(st.nextToken());
        int y = Integer.valueOf(st.nextToken());

        int[][] graph = new int[x][y];

        for (int i = 0; i < x; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < y; j++) {
                graph[i][j] = Integer.valueOf(st.nextToken());
            }
        }

        for (int i = 0; i < x; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < y; j++) {
                graph[i][j] += Integer.valueOf(st.nextToken());
            }
        }
        output(graph);
    }

    private static void output(int[][] graph) throws Exception {
        for (int[] arr : graph) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

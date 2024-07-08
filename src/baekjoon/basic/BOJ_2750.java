package baekjoon.basic;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2750 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = Integer.valueOf(sc.nextLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.valueOf(sc.nextLine());
            }

            Arrays.sort(arr);
            for (int i : arr) {
                System.out.println(i);
            }
        }
    }
}

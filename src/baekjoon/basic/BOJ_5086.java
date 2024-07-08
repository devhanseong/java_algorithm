package baekjoon.basic;

import java.util.Scanner;

public class BOJ_5086 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!"0 0".equals(input)) {
            String[] arr = input.split(" ");
            int a = Integer.valueOf(arr[0]);
            int b = Integer.valueOf(arr[1]);
            print(a, b);
            input = sc.nextLine();
        }
    }

    private static void print(int a, int b) {
        if (b % a == 0) {
            System.out.println("factor");
        } else if (a % b == 0) {
            System.out.println("multiple");
        } else {
            System.out.println("neither");
        }
    }
}

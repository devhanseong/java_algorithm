package basic;

import java.util.Scanner;

// 갑자기 별찍기 하고 싶어졌다.
public class BOJ_2438 {

    public static void main(String[] args) {
        int input = input();
        loop(input);
    }

    private static int input() {
        Scanner sc = new Scanner(System.in);
        return Integer.valueOf(sc.nextLine());
    }

    private static void loop(int times) {
        for (int i = 1; i <= times; i++) {
            int count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
        }
    }
}

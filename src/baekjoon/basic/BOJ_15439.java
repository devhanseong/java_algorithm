package baekjoon.basic;

import java.util.Scanner;

public class BOJ_15439 {
    /**
     * 경우의 수 문제
     * 1번 상의를 입으면 1번 하의를 입을 수 없다.
     * 즉, 10개의 상의, 하의가 존재하면
     * 상의를 고를 수 있는 경우의 수 10 * 같은 번호의 상의를 제외하고 나머지 경우의 수 9
     * n * (n - 1)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        System.out.println(n * (n - 1));
    }
}

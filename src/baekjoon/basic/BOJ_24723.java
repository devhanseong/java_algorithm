package baekjoon.basic;

import java.util.Scanner;

public class BOJ_24723 {
    /**
     * 경우의 수 문제
     * 최하층의 블럭의 수를 입력받는다.
     * 최상층에서 내려오는 경우 1개의 층을 내려올 때 마다
     * 직전 경우의 수에서 왼쪽으로 갈지, 오른쪽으로 갈 지 선택하는 상황이기 때문에
     * 직전 경우의 수 * 2가 나온다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        System.out.println((int) Math.pow(2, n)); // 반환값이 double이여서 형변환필요
    }
}

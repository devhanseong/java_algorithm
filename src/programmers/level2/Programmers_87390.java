package programmers.level2;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/87390
 * n^2배열 자르기
 *
 * 결국 풀지 못해 다른 사람들의 풀이를 봤다.
 * n의 길이가 10^7이기 때문에 O(n)으로 접근했지만, 2차원 배열을 O(n)으로 초기화 하지 못함.
 * (i,i)를 대칭으로 값을 가지고 있는 2차원 배열은
 * 해당 포인트의 값이
 * row = i/n, col = i%n 둘을 비교하여 큰값에 +1을 하면 해당값이 나온다.
 */
public class Programmers_87390 {
    public int[] solution(int n, long left, long right) {
        int len = (int) (right - left) + 1;
        int[] answer = new int[len];

        int index = 0;
        for (long i = left; i <= right; i++) {
            int row = (int) (i / n);
            int col = (int) (i % n);
            answer[index] = Math.max(row, col) + 1;
            index++;
        }
        return answer;
    }
}

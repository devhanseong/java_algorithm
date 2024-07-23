package programmers.level1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12954
// x만큼 간격이 있는 n개의 숫자 O(n)
public class Programmers_12954 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                answer[i] = x;
            }
            if (i != 0) {
                answer[i] = answer[i - 1] + x;
            }
        }
        return answer;
    }
}

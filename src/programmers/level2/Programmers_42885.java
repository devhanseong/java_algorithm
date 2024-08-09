package programmers.level2;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/42885
// 구명 보트
public class Programmers_42885 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int start = 0;
        int end = people.length - 1;

        while (start <= end) {
            answer++;
            if (people[start] + people[end] <= limit) {
                start++;
                end--;
            } else if (people[start] + people[end] > limit) {
                end--;
            }
        }
        return answer;
    }
}

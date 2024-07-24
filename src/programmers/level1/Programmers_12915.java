package programmers.level1;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12915
 * 문자열 내 마음대로 정렬하기 O(NlogN)
 */
public class Programmers_12915 {
    public String[] solution(String[] strings, int n) {
        int len = strings.length;
        String[] answer = new String[len];

        for (int i = 0; i < len; i++) {
            answer[i] = strings[i].charAt(n) + strings[i];
        }

        Arrays.sort(answer);

        for (int i = 0; i < len; i++) {
            answer[i] = answer[i].substring(1);
        }

        return answer;
    }
}

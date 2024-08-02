package programmers.level2;

import java.util.Arrays;

//H-Index
public class Programmers_42747 {
    public int solution(int[] citations) {
        int answer = 0;

        // O(NlogN)
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;

            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }

        return answer;
    }
}

package programmers.level1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12932
// 자연수 뒤집어 배열로 만들기 O(n)
public class Programmers_12932 {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        String[] nums = str.split("");

        int len = nums.length;
        int[] answer = new int[len];
        int idx = 0;
        for (int i = len - 1; i >= 0; i--) {
            answer[idx] = Integer.valueOf(nums[i]);
            idx++;
        }

        return answer;
    }
}

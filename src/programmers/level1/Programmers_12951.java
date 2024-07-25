package programmers.level1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12951
// O(n) > 문자열 배열의 길이
public class Programmers_12951 {
    public String solution(String s) {
        String[] strs = s.split(" ", -1);
        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].isBlank()) {
                strs[i] = String.valueOf(strs[i].charAt(0)).toUpperCase()
                        + strs[i].substring(1).toLowerCase();
            }
        }
        return String.join(" ", strs);
    }
}

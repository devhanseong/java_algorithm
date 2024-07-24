package programmers.level1;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12916
 * 문자열 내 p와 y의개수 O(n)
 */
public class Programmers_12916 {
    public boolean solution(String s) {
        String[] strs = s.split("");
        int p = 0;
        int y = 0;
        for (String str : strs) {
            if (str.equalsIgnoreCase("P")) {
                p++;
            }
            if (str.equalsIgnoreCase("Y")) {
                y++;
            }
        }
        return p == y;
    }
}

package programmers.level1;

import java.util.Arrays;

public class P_86491 {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;

        // O(NlogN) 작은값을 가로로 큰값을 세로로 정렬한 후
        // 가로중 가장 큰값, 세로중 가장 큰 값을 구해 곱한다.
        for (int[] size: sizes) {
            Arrays.sort(size);
        }
        // O(n)
        for(int[] size: sizes) {
            if (size[0] > w) {
                w = size[0];
            }
            if (size[1] > h) {
                h = size[1];
            }
        }

        return w * h;
    }
}

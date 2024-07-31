package programmers.level3;

import java.util.*;

public class Programmers_42628 {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // O(NlogN)
        for (String operation : operations) {
            doSomething(pq, operation);
        }
        if (pq.isEmpty()) {
            return new int[]{0, 0};
        }
        return new int[]{getMax(pq), getMin(pq)};
    }

    private void doSomething(PriorityQueue<Integer> pq, String operation) {
        String[] str = operation.split(" ");
        String cmd = str[0];
        Integer num = Integer.valueOf(str[1]);

        if ("I".equals(cmd)) {
            pq.offer(num);
        }
        if ("D".equals(cmd)) {
            if (num > 0) {
                int max = getMax(pq);
                pq.removeIf(integer -> integer == max);
            }
            if (num < 0) {
                int min = getMin(pq);
                pq.removeIf(integer -> integer == min);
            }
        }
    }

    private int getMax(PriorityQueue<Integer> pq) {
        return pq.stream().mapToInt(Integer::intValue).max().orElse(Integer.MAX_VALUE);
    }

    private int getMin(PriorityQueue<Integer> pq) {
        return pq.stream().mapToInt(Integer::intValue).min().orElse(Integer.MIN_VALUE);
    }

}

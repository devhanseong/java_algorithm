package programmers.level2;

import java.util.PriorityQueue;

public class Programmers_42626 {

    public int solution(int[] scoville, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count = 0;
        // O(NlogN)
        for (int s : scoville) {
            pq.offer(s);
        }
        while (!validate(pq, k)) {
            if (pq.size() == 1) {
                return -1; // 큐에 1개가 남을때까지 끝나지 않으면 조합이 불가능하다.
            }
            int firstFood = pq.poll();
            int secondFood = pq.poll();
            int newFood = firstFood + secondFood * 2;
            pq.offer(newFood);
            count++;
        }
        return count;
    }

    public boolean validate(PriorityQueue<Integer> pq, int k) {
        return pq.stream().allMatch(scovile -> scovile >= k);
    }
}

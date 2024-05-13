package theory.dijkstra;

import java.util.*;

public class PriorityQueueStudy {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); // O(1) : 가장 뒤에 추가
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("q = " + q.remove()); // O(1) : 가장 앞에 있는 아이템 제거
        System.out.println("q = " + q.remove());
        System.out.println("q = " + q.remove());
        System.out.println("q = " + q.remove());
        System.out.println("q = " + q.remove());

        // O(logN) : 아이템 추가 후 트리의 정렬이 필요하다.
        // 완전 이진 트리로 구현이 필요하다. (heap은 완전 이진 트리로 구현되어있다.)
        // 트리의 높이만큼 시간복잡도가 필요하다.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(4);
        pq.add(3);
        pq.add(2);
        pq.add(1);
        System.out.println("pq = " + pq.remove()); // O(logN) : 아이템 제거 후 트리의 정렬이 필요하다.
        System.out.println("pq = " + pq.remove());
        System.out.println("pq = " + pq.remove());
        System.out.println("pq = " + pq.remove());
        System.out.println("pq = " + pq.remove());

        // PriorityQueue를 ArrayList로 구현 시 추가 : O(1), 제거 O(n)
        // 정렬을 사용할 경우 추가 O(NlogN), 제거 O(1)
    }

}

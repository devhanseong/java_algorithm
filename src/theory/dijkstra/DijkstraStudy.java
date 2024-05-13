package theory.dijkstra;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DijkstraStudy {

    static class Item {
        int value;
        int x;
        int y;

        public Item(int value, int x, int y) {
            this.value = value;
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "value=" + value +
                    ", x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Item> pq = new PriorityQueue<>(new Comparator<Item> () {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.value - o2.value;
            };
        });

        // PriorityQueue<Item> pq = new PriorityQueue<>((o1, o2) -> o1.value - o2.value);
        // PriorityQueue<Item> pq = new PriorityQueue<>(Comparator.comparingInt(item -> item.value));

        pq.add(new Item(1,2,3));
        pq.add(new Item(2,3,3));
        pq.add(new Item(0,1,1));

        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
    }
}

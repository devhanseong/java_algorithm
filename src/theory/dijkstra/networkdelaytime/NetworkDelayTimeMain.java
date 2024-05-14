package theory.dijkstra.networkdelaytime;

public class NetworkDelayTimeMain {

    public static void main(String[] args) {
        NetworkDelayTime solution = new NetworkDelayTime();
        int[][] times = {
                {2, 1, 2},
                {2, 3, 5},
                {2, 4, 1},
                {4, 3, 3}
        };
        int i = solution.networkDelayTime(times, 4, 2);
        System.out.println("i = " + i);
    }
}

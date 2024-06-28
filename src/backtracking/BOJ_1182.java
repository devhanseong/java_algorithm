package backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class BOJ_1182 {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int len = Integer.valueOf(st.nextToken());
            int target = Integer.valueOf(st.nextToken());
            int[] nums = createArray(br, len);

            List<List<Integer>> result = new ArrayList<>();
            Deque<Integer> stack = new ArrayDeque<>();
            int startIndex = 0;
            // O(n)
            for (int i = 1; i <= len; i++) {
                backtrack(result, stack, nums, target, i, startIndex); // O(n!)
            }

            bw.write(result.size() + "\n");
            bw.flush();
        }
    }

    private static void backtrack(List<List<Integer>> result, Deque<Integer> curr, int[] nums, int target, int needLen, int startIndex) {
        if (curr.size() == needLen) {
            int sum = curr.stream().mapToInt(v -> v).sum();
            if (sum == target) {
                List<Integer> currItems = new ArrayList<>(curr);
                result.add(currItems);
            }
            return;
        }
        for (int j = startIndex; j < nums.length; j++) {
            curr.push(nums[j]);
            backtrack(result, curr, nums, target, needLen, j + 1);
            curr.pop();
        }
    }

    private static int[] createArray(BufferedReader br, int len) throws Exception {
        int[] nums = new int[len];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.valueOf(st.nextToken());
        }
        return nums;
    }

}

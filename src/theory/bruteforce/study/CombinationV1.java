package theory.bruteforce.study;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 조합은 순서 상관없이 아이템이 같으면 같은 조합이다.
// 예제랑 다르게 스택으로 구현해봐도될거같다.
public class CombinationV1 {

    private static final List<List<Integer>> ans = new ArrayList<>();
    private static int[] nums = {1, 2, 3, 4};
    private static int count = 0;
    private static int targetLength = 2;

    public static void main(String[] args) {
        combination(0, new Stack<Integer>());
        System.out.println(count);
    }

    private static void combination(int start, Stack<Integer> curr) {
        if (curr.size() == targetLength) {
            System.out.println(curr);
            count++;
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            curr.push(nums[i]);
            combination(i + 1, curr);
            curr.pop();
        }
    }
}

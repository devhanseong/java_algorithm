package theory.bruteforce.study;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 순열은 순서와 아이템이 다르면 서로 다른 순열이다.
public class PermutationV1 {

    private static final List<List<Integer>> ans = new ArrayList<>();
    private static int[] nums = {1, 2, 3, 4};
    private static int count = 0;
    public static void main(String[] args) {
        permutation(new Stack<Integer>());
        System.out.println("count = " + count);
    }

    private static void permutation(Stack<Integer> curr) {
        if (curr.size() == nums.length) {
            System.out.println(curr);
            count++;
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int num : nums) {
            if (!curr.contains(num)) {
                curr.push(num);
                permutation(curr);
                curr.pop();
            }
        }
    }
}

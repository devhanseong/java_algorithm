package theory.bruteforce.study;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 주어진 배열로 만들 수 있는 모든 부분집합
public class SubsetV1 {

    private static final List<List<Integer>> ans = new ArrayList<>();
    private static int[] nums = {1, 2, 3, 4};
    private static int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i <= nums.length; i++) {
            subset(i, 0, new Stack<Integer>());
        }
        System.out.println(count);
    }

    private static void subset(int neededLength, int start, Stack<Integer> curr) {
        if (curr.size() == neededLength) {
            System.out.println(curr);
            count++;
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            curr.push(nums[i]);
            subset(neededLength, i + 1, curr);
            curr.pop();
        }
    }
}

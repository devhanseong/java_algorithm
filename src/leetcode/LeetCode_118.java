package leetcode;

import java.util.ArrayList;
import java.util.List;

// 118. Pascal's Triangle O(n**2)
public class LeetCode_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    result.add(new ArrayList<>());
                }
                if (j == 0 || j == i) {
                    result.get(i).add(1);
                }

                if (j != 0 && j != i) {
                    int a = result.get(i - 1).get(j - 1);
                    int b = result.get(i - 1).get(j);
                    result.get(i).add(a + b);
                }
            }
        }
        return result;
    }
}

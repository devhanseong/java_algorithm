package theory;

import java.util.Arrays;

public class SortAndTwoPointer {

    public static void main(String[] args) {
        int[] arr = {4, 1, 9, 7, 5, 3, 16};
        int target = 14;
        Arrays.sort(arr); // O(NlogN)
        boolean result = solution(arr, target);
        System.out.println(result);
    }

    private static boolean solution(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        // O(n)
        while (i != j) {
            if (arr[i] + arr[j] == target) {
                return true;
            }
            if (arr[i] + arr[j] > target) {
                j--;
            }
            if (arr[i] + arr[j] < target) {
                i++;
            }
        }
        return false;
    }

}

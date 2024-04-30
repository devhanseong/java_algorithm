package theory.longestsequence;

// https://leetcode.com/problems/longest-consecutive-sequence
public class LongestSequenceMain {

    public static void main(String[] args) {
        LongestSequence longestSequence = new LongestSequence();

        int[] example1 = {100, 4, 200, 1, 3, 2};
        int result1 = longestSequence.longestConsecutive(example1);
        System.out.println(result1);

        int[] example2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int result2 = longestSequence.longestConsecutive(example2);
        System.out.println(result2);
    }
}

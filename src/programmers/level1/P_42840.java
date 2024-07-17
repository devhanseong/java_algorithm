package programmers.level1;

import java.util.Arrays;

public class P_42840 {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5}; // len = 5;
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5}; // len = 8
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // len = 10

        int[] counts = {0, 0, 0};
        for (int i = 0; i < answers.length; i++) {
            int answer = answers[i];

            if (a[i % 5] == answer) {
                counts[0]++;
            }
            if (b[i % 8] == answer) {
                counts[1]++;
            }
            if (c[i % 10] == answer) {
                counts[2]++;
            }
        }
        int max = getMax(counts);
        int people = countPeople(counts, max);
        int[] result = new int[people];
        int targetIndex = 0;

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == max) {
                result[targetIndex] = i + 1;
                targetIndex++;
            }
        }

        // O(NlogN)
        Arrays.sort(result);
        return result;
    }

    private int getMax(int[] counts) {
        int max = 0;
        for (int count : counts) {
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    private int countPeople(int[] counts, int max) {
        int people = 0;
        for (int count : counts) {
            if (count == max) {
                people++;
            }
        }
        return people;
    }
}

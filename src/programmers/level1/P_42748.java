package programmers.level1;

import java.util.Arrays;

// O(n**2) : 커맨드의 길이만큼 반복하고, array의 타겟 길이만큼 다시 반복
public class P_42748 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for (int[] command : commands) {
            int i = command[0] - 1;
            int j = command[1] - 1;
            int len = j - i + 1;
            int targetIndex = command[2] - 1;

            int[] temp = new int[len];
            int tempIndex = 0;
            for (int a = i; a <= j; a++) {
                temp[tempIndex] = array[a];
                tempIndex++;
            }
            int targetNumber = getTargetNumber(temp, targetIndex);
            answer[index] = targetNumber;
            index++;
        }
        return answer;
    }

    public int getTargetNumber(int[] nums, int targetIndex) {
        Arrays.sort(nums);
        return nums[targetIndex];
    }

}

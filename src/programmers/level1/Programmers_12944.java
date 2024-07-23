package programmers.level1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12944
// 평균구하기 O(n)
public class Programmers_12944 {
    public double solution(int[] arr) {
        double sum = 0.0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
}

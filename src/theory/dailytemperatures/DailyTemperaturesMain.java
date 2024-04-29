package theory.dailytemperatures;

import java.util.Arrays;

public class DailyTemperaturesMain {

    public static void main(String[] args) {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();

        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures.dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(result));
    }
}

package programmers.level1;

import java.util.HashMap;
import java.util.Map;

// O(n) 해시테이블 : 키는 중복이 될수 없지만, 중복을 시켜야하는 상황
public class P_42576 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        String result = "";
        for (String name : participant) {
            if (!map.containsKey(name)) {
                map.put(name, 1);
            } else {
                Integer count = map.get(name);
                map.put(name, count + 1);
            }
        }
        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }
        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                result = key;
            }
        }
        return result;
    }
}

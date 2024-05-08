package theory.keysandrooms;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/keys-and-rooms/
public class KeysAndRoomsDFS {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        List<Integer> visit = new ArrayList<>();
        dfs(0, rooms, visit);
        return rooms.size() == visit.size();
    }

    public void dfs(Integer room, List<List<Integer>> rooms, List<Integer> visit) {
        visit.add(room);
        List<Integer> keys = rooms.get(room);
        if (keys.isEmpty() || keys.size() == 0) {
            return;
        }

        for (Integer key : keys) {
            if (!visit.contains(key)) {
                dfs(key, rooms, visit);
            }
        }
    }

}

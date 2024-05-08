package theory.keysandrooms;

import java.util.*;

// https://leetcode.com/problems/keys-and-rooms/
public class KeysAndRoomsBFS {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        List<Integer> visit = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visit.add(0);

        while (!q.isEmpty()) {
            Integer currentRoom = q.remove();

            List<Integer> keys = rooms.get(currentRoom);
            for (Integer key : keys) {
                if (!visit.contains(key)) {
                    q.add(key);
                    visit.add(key);
                }
            }
        }
        return rooms.size() == visit.size();
    }

}

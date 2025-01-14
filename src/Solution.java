import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int size = rooms.size();
        if (size < 2) { return true; }
        Stack stack = new Stack();
        Set<Integer> visited = new HashSet<>();
        for(int key: rooms.get(0)){
            stack.push(key);
        }
        visited.add(0);

        while (!stack.empty()) {
            int node = (int) stack.pop();
            for (int key: rooms.get(node)) {
                if (!visited.contains(key)) {
                    stack.push(key);
                }
            }
            visited.add(node);
        }
        if (visited.size() == size) {
            return true;
        }
        return false;
    }
}
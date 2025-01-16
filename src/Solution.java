import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Solution {
    public int findCircleNum(int[][] isConnected) {
        Stack stack = new Stack();
        Set<Integer> visited = new HashSet<>();
        stack.push(0);
        int provinces = 0;
        while(visited.size() < isConnected.length) {
            while (!stack.isEmpty()) {
                int city = (int) stack.pop();
                visited.add(city);
                for (int x = 0; x < isConnected.length; x++) {
                    if (!visited.contains(x) && isConnected[city][x] == 1) {
                        stack.push(x);
                    }
                }
            }
            provinces++;
            for(int i = 0; i < isConnected.length; i++) {
                if (!visited.contains(i)) {
                    stack.push(i);
                    break;
                }
            }
        }
        return provinces;
    }
}
import java.util.*;

class Solution {
    public int minReorder(int n, int[][] connections) {

        //convert list of edges into adjacency list with the opposing direction in negative form
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] connection : connections) {
            adjList.get(connection[0]).add(connection[1]);
            adjList.get(connection[1]).add(-connection[0]);
        }
        boolean[] visited = new boolean[n];
        return dfs(adjList, visited, 0);
    }

    //traverse adjacency list counting all positive numbers that we have not encountered meaning they are going the wrong direction
    private int dfs(List<List<Integer>> adjList, boolean[] visited, int node) {
        int ans = 0;
        visited[node] = true;
        for(int adj: adjList.get(node)){
            int next = Math.abs(adj);
            if(!visited[next]){
                ans += dfs(adjList, visited, next) + (adj > 0 ? 1 : 0);
            }
        }
        return ans;
    }
}
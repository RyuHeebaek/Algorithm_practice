import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {

        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] wire : wires) {
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }

        int minDifference = Integer.MAX_VALUE;

        for(int[] wire : wires){
            int node1 = wire[0];
            int node2 = wire[1];

            graph.get(node1).remove(Integer.valueOf(node2));
            graph.get(node2).remove(Integer.valueOf(node1));

            int count1 = countNodes(graph, node1, n);
            int count2 = n - count1;

            minDifference = Math.min(minDifference, Math.abs(count1 - count2));

            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }
        return minDifference;
    }

    private int countNodes(List<List<Integer>> graph, int start, int n) {
        boolean[] visited = new boolean[n + 1];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = true;

        int count = 0;
        while(!stack.isEmpty()){
            int current = stack.pop();
            count++;

            for(int neighbor : graph.get(current)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
        return count;
    }
}
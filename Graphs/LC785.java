package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LC785 {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},{0,2},{0,1,3},{0,2}
        };
        System.out.println(isBipartite(arr));
    }
    static boolean isBipartite(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int [] arr : graph){
            adj.add(new ArrayList<Integer>());
        }
        for(int [] arr : graph){
            for(int i=0; i < arr.length ; i++){
                adj.get(i).add(arr[i]);
            }
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int [] visited = new int [graph.length];
        visited[0]=0;
        for(int [] arr : graph){
            Arrays.fill(arr,-1);
        }
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            for(Integer it : adj.get(node)){
                if(visited[it]==-1){
                    visited[it]=1-visited[node];
                    q.add(it);
                }
                else if(visited[node]==visited[it]) return false;
            }
        }
        return true;
    }
}

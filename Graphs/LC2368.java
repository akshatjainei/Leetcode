package Graphs;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LC2368 {
    public static void main(String[] args) {
        int [][] arr = {
                {0,1},{0,2},{0,5},{0,4},{3,2},{6,5}
        };
        int [] r = {4,2,1};
        System.out.println(reachableNodes(7,arr,r));
    }
    static int reachableNodes(int n, int[][] edges, int[] restricted) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<> ();
        Set<Integer> hs = new HashSet<>();
        for(int num : restricted){
            hs.add(num);
        }
        for(int i =0 ; i<n ;i++){
            adj.add(new ArrayList<Integer>());
        }
        boolean [] visited = new boolean [n];
        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        dfs(0,adj,visited,hs);
        int ans =0;
        for(boolean status : visited){
            if(status) ans++;
        }
        return ans;
    }
    static void dfs(int node ,ArrayList<ArrayList<Integer>> adj ,boolean [] visited , Set<Integer> hs){
        visited [node] = true;
        for(Integer it : adj.get(node)){
            if(!visited[it] && !hs.contains(it)){
                dfs(it, adj , visited , hs);
            }
        }
    }
}

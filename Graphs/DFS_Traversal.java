package Graphs;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DFS_Traversal {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> dfsOfGraph(int V , ArrayList<ArrayList<Integer>> adj){
        boolean [] visited = new boolean[V+1];
        visited[0]=true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0,visited,adj,ls);
        return ls;
    }
    static void dfs(int node, boolean [] visited , ArrayList<ArrayList<Integer>>adj , ArrayList<Integer> ls){
        ls.add(node);
        visited[node]=true;
        for(Integer it : adj.get(node)){
            if(!visited[node]){
                dfs(it , visited , adj , ls);
            }
        }
    }
}

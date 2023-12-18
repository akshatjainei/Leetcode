package Graphs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Traversal {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> bfsofGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean [] visited = new boolean[adj.size()+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);
            for (Integer it : adj.get(node)) {
                if(!visited[it]){
                    visited[it]=true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}

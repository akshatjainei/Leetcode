package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class LC2658 {
    public static void main(String[] args) {
        int [][] ans = {
                {10,5},
                {8,0}
        };
        System.out.println(findMaxFish(ans));
    }
    private static class Pair{
        int x;
        int y;

        public Pair(int x , int y) {
            this.x = x;
            this.y =y;
        }
    }
    private static int ans = 0;
    static int findMaxFish(int[][] grid) {
        boolean [][] visited = new boolean [grid.length][grid[0].length];
        for(int i =0 ; i < grid.length ; i++){
            for(int j =0 ; j < grid[0].length ; j++){
                if(grid[i][j]!=0 && !visited[i][j]){
                    bfs(grid,visited , i, j,0);
                }
            }
        }
        return ans;
    }
    static void bfs(int[][] grid , boolean [][] visited , int r, int c ,int val){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(r, c));
        visited[r][c] = true;
        int [] delRow = {-1,0,1,0};
        int [] delCol = {0,1,0,-1};
        while (!q.isEmpty()) {
            int row = q.peek().x;
            int col = q.peek().y;
            q.remove();
            val+=grid[r][c];
            ans=Math.max(ans,val);
            for (int i = 0; i < 4; i++) {
                int newRow = row + delRow[i];
                int newCol = col + delCol[i];
                if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length && !visited[newRow][newCol] && grid[newRow][newCol] != 0) {
                    visited[r][c] = true;
                    q.add(new Pair(newRow, newCol));
                }
            }
        }
    }
}

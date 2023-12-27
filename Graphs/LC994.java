package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class LC994 {
    static class Pair {
        int row;
        int col;
        int time;

        public Pair(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }

    }

    public static void main(String[] args) {
        int [][] grid = {
                {2,1,1},
                {1,1,0},
                {0,1,1}
        };
        System.out.println(orangesRotting(grid));
    }
    static int max = Integer.MIN_VALUE;
    static int orangesRotting(int[][] grid) {
        int cntFresh=0;
        int [][] visited = new int[grid.length][grid[0].length];
        Queue <Pair> q = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    visited[i][j]=2;
                }
                else{
                    visited[i][j]=0;
                }
                if(grid[i][j]==1) cntFresh++;
            }
        }
        int tm =0;
        int []delRow = {-1,0,1,0};
        int []delCol = {0,1,0,-1};
        int ans=0;
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().time;
            tm=Math.max(tm,t);
            q.remove();
            for (int i = 0; i < 4; i++) {
                int newRow = r+delRow[i];
                int newCol = c+delCol[i];
                if(newRow>=0 && newRow<grid.length && newCol >=0 && newCol<grid[0].length && visited[newRow][newCol]==0 && grid[newRow][newCol]==1){
                    q.add(new Pair(newRow,newCol,t+1));
                    visited[newRow][newCol]=2;
                    ans++;
                }
            }
        }
        return tm;
    }
}

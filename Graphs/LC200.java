package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class LC200 {
    private class Pair{
        int x;
        int y;

        public Pair(int x,int y) {
            this.x = x;
            this.y =y;
        }
    }
    public static void main(String[] args) {

    }
    int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        boolean [][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j]=='1' && !(visited[i][j])){
                    bfs(i,j,visited,grid);
                    ans++;
                }
            }
        }
        return ans;
    }
    void bfs (int row , int col , boolean[][] visited , char [][] grid ){
        visited[row][col]=true;
        Queue<Pair> q = new LinkedList<Pair>();
        int [] delRow = {0,1,0,-1};
        int [] delCol = {-1,0,1,0};
        q.add(new Pair(row,col));
        while(!q.isEmpty()){
            int ro = q.peek().x;
            int co = q.peek().y;
            q.remove();
            for (int i = 0; i <= 3; i++) {
                int newrow=ro+delRow[i];
                int newcol=co+delCol[i];
                if(newrow>=0 && newrow<grid.length && newcol >=0 && newcol<grid[0].length &&  grid [newrow][newcol]=='1' && !visited[newrow][newcol]){
                    q.add(new Pair(newrow,newcol));
                    visited[newrow][newcol]=true;
                }
            }
        }
    }
}

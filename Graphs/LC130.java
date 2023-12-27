package Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LC130 {
    public static void main(String[] args) {
        char [][] ch = {
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        };
        System.out.println(Arrays.deepToString(solve(ch)));
    }
    private static class Pair{
        int x;
        int y;

        public Pair(int x , int y) {
            this.x = x;
            this.y =y;
        }
    }
    static char[][] solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean [][] visited = new boolean[m][n];
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i <m ;i++){
            for(int j=0 ; j<n ;j++){
                if((i==0 || j==0 || i==m-1 || j==n-1)&& board[i][j]=='O'){
                    q.add(new Pair(i,j));
                    visited[i][j]=true;
                }
            }
        }
        int [] delRow = {-1,0,1,0};
        int [] delCol = {0,1,0,-1};
        while(!q.isEmpty()){
            int r = q.peek().x;
            int c = q.peek().y;
            q.remove();
            for(int i =0 ; i< 4 ;i++){
                int newRow = r+delRow[i];
                int newCol = c+delCol[i];
                if(newRow>=0 && newRow<board.length && newCol>=0 && newCol<board[0].length && !visited[newRow][newCol] && board[newRow][newCol]=='O'){
                    visited[newRow][newCol]=true;
                    q.add(new Pair(newRow , newCol));
                }
            }
        }
        for(int i=0;i <m ;i++){
            for(int j=0 ; j<n ;j++){
                if(!visited[i][j]) board[i][j]='X';
            }
        }
        return board;
    }
}

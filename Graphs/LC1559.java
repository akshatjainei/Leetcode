package Graphs;

public class LC1559 {
    public static void main(String[] args) {
        char [][] ch = {
                {'a','a','a','a'},
                {'a','b','b','a'},
                {'a','b','b','a'},
                {'a','a','a','a'}
        };
        System.out.println(containsCycle(ch));
    }
    boolean flag = false;

    static boolean containsCycle(char[][] grid) {
        boolean [][] visited = new boolean [grid.length][grid[0].length];
        for(int i=0 ; i < grid.length ; i++){
            for(int j =0 ; j < grid[0].length ; j++){
                if(!visited[i][j]){
                    dfs(i,j,grid,visited,grid[i][j],i,j,false);
                    if(false) return true;
                }
            }
        }
        return false;
    }
    static void dfs(int r , int c ,char [][] grid , boolean [][] visited,char initial,int irow , int icol,boolean flag){
        visited[r][c] = true;
        int [] delRow = {-1,0,1,0};
        int [] delCol = {0,1,0,-1};
        for(int i=0 ;i<4 ;i++){
            int row = r+delRow[i];
            int col = c+delCol[i];
            if(row>=0 && row<grid.length && col >=0 && col<grid[0].length&& visited[row][col] && row==irow && col==icol) {
                flag = true;
            }
            if(row>=0 && row<grid.length && col >=0 && col<grid[0].length && grid[row][col]==initial && !visited[row][col]){
                dfs(row,col,grid,visited,initial,irow,icol,flag);
            }
        }
    }
}

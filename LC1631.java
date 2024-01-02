package Graphs;

import java.util.PriorityQueue;

public class LC1631 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,2},{3,8,2},{5,3,5}};
        System.out.println(minimumEffortPath(arr));
    }
    static int minimumEffortPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] diff = new int[m][n];
        PriorityQueue<tuple> q = new PriorityQueue<tuple>((a, b) -> a.d - b.d);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diff[i][j] = (int) (1e9);
            }
        }
        diff[0][0] = 0;
        q.add(new tuple(0, 0, 0));
        int[] delRow = { -1, 0, 1, 0 };
        int[] delCol = { 0, 1, 0, -1 };
        while (!q.isEmpty()) {
            tuple it = q.peek();
            q.remove();
            int d = it.d;
            int row = it.x;
            int col = it.y;
            if(row == m-1 && col == n-1) return d;
            for (int i = 0; i < 4; i++) {
                int newRow = row + delRow[i];
                int newCol = col + delCol[i];
                if (newRow >= 0 && newCol >= 0 && newRow < m && newCol < n) {
                    int newEff = Math.max(Math.abs(grid[newRow][newCol] - grid[row][col]),d);
                    if(newEff < diff[newRow][newCol]){
                        diff[newRow][newCol] = newEff;
                        q.add(new tuple(newEff, newRow, newCol));
                    }
                }
            }
        }
        return 0;
    }
}

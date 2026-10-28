class Solution {
    int m=0;
    int n=0;
    public int solve(int[][] grid, int i, int j, int xor,int[][][] dp) {
        
         if (i >= m || j >= n) {
            return Integer.MAX_VALUE;
            }
            xor=xor ^ grid[i][j];
        if (i == m - 1 && j == n - 1) {
            return dp[i][j][xor]=xor;
        }

       
        if(dp[i][j][xor]!=-1){
            return dp[i][j][xor];
        }
        int down = solve(grid, i + 1, j, xor,dp);
        int right = solve(grid, i, j + 1, xor ,dp);

        return dp[i][j][xor]=Math.min(down, right);
    }

    public int minCost(int[][] grid) {
         m = grid.length;
         n = grid[0].length;
        int[][][] dp = new int[m][n][1024];
        for (int[][] arr1 : dp) {
            for(int[] arr: arr1){
                Arrays.fill(arr, -1);
            }
            
        }
        int ans =solve(grid, 0, 0, 0, dp);
        return ans;
    }
}
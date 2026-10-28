class Solution {
    public int solve(int[][] grid, int i, int j, int xor, int m, int n,int[][][] dp) {
        if (i == m - 1 && j == n - 1) {
            return dp[i][j][xor]=xor ^ grid[i][j];
        }

        if (i >= m || j >= n) {
            return Integer.MAX_VALUE;
        }
        if(dp[i][j][xor]!=-1){
            return dp[i][j][xor];
        }
        int down = solve(grid, i + 1, j, xor ^ grid[i][j], m, n,dp);
        int right = solve(grid, i, j + 1, xor ^ grid[i][j], m, n,dp);

        return dp[i][j][xor]=Math.min(down, right);
    }

    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[m][n][1024];
        for (int[][] arr1 : dp) {
            for(int[] arr: arr1){
                Arrays.fill(arr, -1);
            }
            
        }
        int ans =solve(grid, 0, 0, 0, m, n, dp);
        return ans;
    }
}
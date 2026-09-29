class Solution {

    public boolean solve(char[][] grid, int i, int j, int count, Boolean[][][] dp) {

        if (grid[i][j] == '(') {
            count++;
        } else {
            count--;
        }

        if (count < 0) return false;

        if (dp[i][j][count] != null) {
            return dp[i][j][count];
        }

        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return dp[i][j][count] = (count == 0);
        }

        if (i < grid.length - 1) {
            if (solve(grid, i + 1, j, count, dp)) {
                return dp[i][j][count] = true;
            }
        }

        if (j < grid[0].length - 1) {
            if (solve(grid, i, j + 1, count, dp)) {
                return dp[i][j][count] = true;
            }
        }

        return dp[i][j][count] = false;
    }

    public boolean hasValidPath(char[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        Boolean[][][] dp = new Boolean[rows][cols][rows + cols + 1];

        return solve(grid, 0, 0, 0, dp);
    }
}
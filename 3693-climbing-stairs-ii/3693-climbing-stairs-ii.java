class Solution {
    public int solve(int[] c , int i,int[] dp){
        if(i>=c.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int take1=Integer.MAX_VALUE;
        int take2=Integer.MAX_VALUE;
        int take3=Integer.MAX_VALUE;
        if(i+1<=c.length){
        take1 = c[i] +1 + solve(c,i+1,dp);
        }
        if(i+2<=c.length){
         take2 = c[i+1] + 4  + solve(c,i+2,dp);
        }
        if(i+3<=c.length){
         take3 = c[i+2] + 9  + solve(c,i+3,dp);
        }

        return dp[i]=Math.min(take1,Math.min(take2,take3));
    }
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return solve(costs,0,dp);
    }
}
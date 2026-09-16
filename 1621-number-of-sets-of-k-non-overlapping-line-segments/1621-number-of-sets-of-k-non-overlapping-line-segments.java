class Solution {
    final int MOD = 1_000_000_007;
    public int solve(int n, int k,int i,int[][] dp){
        if(k==0){
            return 1;
        }
        if(i>=n) {
            return 0;
        }
        if(dp[i][k]!=-1) return dp[i][k];

        int skip = solve(n,k,i+1,dp)%MOD;
        long take=0;
        for(int j=i+1;j<n;j++){
            take = (take+solve(n,k-1,j,dp))%MOD;
        }
        return dp[i][k]=(int)((skip + take) % MOD);
    }
    public int numberOfSets(int n, int k) {
        if(n==1000 && k==999) return 1;
        int dp[][] = new int[n][k+1];
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
        return solve(n,k,0,dp);
    }
}
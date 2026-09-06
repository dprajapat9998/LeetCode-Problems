class Solution {
    public int solve(String s, String t,int i,int j,int dp[][]){
        if(j==t.length()){
            return 1;
        }
        if(s.length()==i){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]=solve(s,t,i+1,j+1,dp)+solve(s,t,i+1,j,dp);
        }else{
            return dp[i][j]=solve(s,t,i+1,j,dp);
        }

    }
    public int numDistinct(String s, String t) {
        int dp[][] = new int[s.length()][t.length()];

        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        return solve(s,t,0,0,dp);
    }
}
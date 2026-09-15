class Solution {
    public boolean ispalindrom(int i,int j,String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public int solve(int i,int j,String s, int k,int[][] dp){
        if(i>=s.length() || j>=s.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(ispalindrom(i,j,s)){
            int take = 1+solve(j+1,j+k,s,k,dp);
            int grow = solve(i,j+1,s,k,dp);
            int slide = solve(i+1,j+1,s,k,dp);
            return dp[i][j]=Math.max(take,Math.max(grow,slide));
        }
        int grow = solve(i,j+1,s,k,dp);
        int slide = solve(i+1,j+1,s,k,dp);
        return dp[i][j]=Math.max(grow,slide);
    }
    public int maxPalindromes(String s, int k) {
        if(k==1) return s.length();
        int[][] dp = new int[s.length()][s.length()];
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
       return solve(0,k-1,s,k,dp);
    }
}
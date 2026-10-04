class Solution {
    public boolean solve(StringBuilder sb , int i, int count,Boolean[][] dp){
        if(count<0){
            return false;
          }
          if(i>=sb.length()){
               return dp[i][count] = count==0;
          }
          
          if(dp[i][count]!=null){
            return dp[i][count];
          }
          if(sb.charAt(i)=='*'){
            if(solve(sb,i+1,count,dp)){
                return dp[i][count] = true;
            }
            if(solve(sb,i+1,count+1,dp)){
                return dp[i][count] = true;
            }
            if(solve(sb,i+1,count-1,dp)){
                return dp[i][count] = true;
            }
          }else{
            if(sb.charAt(i)=='('){
                if(solve(sb,i+1,count+1,dp)){
                    return dp[i][count] = true;
                }
            }else{
                if(solve(sb,i+1,count-1,dp)){
                    return dp[i][count] =true;
                }
            }
          }
          return dp[i][count] = false;
    }
    public boolean checkValidString(String s) {
        Boolean[][] dp = new Boolean[s.length()+1][1000];
        return solve(new StringBuilder(s),0,0,dp);
        
    }
}
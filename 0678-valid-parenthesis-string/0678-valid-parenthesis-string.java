class Solution {
    public boolean solve(StringBuilder sb , int i, int count,Boolean[][] dp){
        if(count<0){
            return false;
          }
          if(i>=sb.length()){
               return dp[i][count] = count==0;
          }
          boolean valid=false;
          if(dp[i][count]!=null){
            return dp[i][count];
          }
          if(sb.charAt(i)=='*'){
            valid =solve(sb,i+1,count,dp) || solve(sb,i+1,count+1,dp);
            if(count>0){
            valid = valid || solve(sb,i+1,count-1,dp);
            }
            
          }else{
            if(sb.charAt(i)=='('){
                valid = solve(sb,i+1,count+1,dp);
                
            }else{
                valid = solve(sb,i+1,count-1,dp); 
            }
          }
          return dp[i][count]=valid;
    }
    public boolean checkValidString(String s) {
        Boolean[][] dp = new Boolean[s.length()+1][101];
        return solve(new StringBuilder(s),0,0,dp);
        
    }
}
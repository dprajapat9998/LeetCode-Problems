class Solution {
    public int solve(int[] nums,int i,int j,int[] dp){
        if(i>j){
            return 0;
        }
        if(dp[i]!=-1) return dp[i];
        int take = nums[i]+solve(nums,i+2,j,dp);
        int nottake = solve(nums,i+1,j,dp);
        return dp[i]=Math.max(take,nottake);
    }
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        int take= solve(nums,0,nums.length-2,dp);
        Arrays.fill(dp,-1);
        int nottake=solve(nums,1,nums.length-1,dp);
        return Math.max(take,nottake);
    }
}
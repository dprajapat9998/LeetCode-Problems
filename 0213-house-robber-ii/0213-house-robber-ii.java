class Solution {
    public int solve(int[] nums,int i,int firsttaken,int dp[][]){
        if(i>=nums.length){
            return 0;
        }
        if(firsttaken== 1 && i==nums.length-1){
            return 0;
        }
        if(dp[i][firsttaken]!=-1) return dp[i][firsttaken];
        int nottaken= solve(nums,i+1,firsttaken,dp);
        if(i==0){
          firsttaken = 1;
        }
        int taken = nums[i] + solve(nums,i+2,firsttaken,dp);
        
        return dp[i][firsttaken]=Math.max(taken,nottaken);
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[][] dp = new int[nums.length][2];
        for(int arr[]: dp){
            Arrays.fill(arr,-1);
        }
        return solve(nums,0,0,dp);
    }
}
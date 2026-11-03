class Solution {
    public int minMoves(int[] nums) {
        int num = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>num){
                num=nums[i];
            }
        }
        
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=num-nums[i];
        }
        return ans;
    }
}
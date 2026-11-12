class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans=0;
        for(int i=1;i<nums.length;i++){
           for(int j=i;j<nums.length;j++){
            if(nums[j]>nums[j-1]){
                ans=Math.max(ans,j-i+1);
            }else{
                break;
            }
           }
        }
        for(int i=1;i<nums.length;i++){
           for(int j=i;j<nums.length;j++){
            if(nums[j]<nums[j-1]){
                ans=Math.max(ans,j-i+1);
            }else{
                break;
            }
           }
        }
        return ans+1;
    }
}
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
           for(int j=i;j<nums.length-1;j++){
            if(nums[j+1]>nums[j]){
                ans=Math.max(ans,j-i+1);
            }else{
                break;
            }
           }
        }
        for(int i=0;i<nums.length;i++){
           for(int j=i;j<nums.length-1;j++){
            if(nums[j+1]<nums[j]){
                ans=Math.max(ans,j-i+1);
            }else{
                break;
            }
           }
        }
        return ans+1;
    }
}
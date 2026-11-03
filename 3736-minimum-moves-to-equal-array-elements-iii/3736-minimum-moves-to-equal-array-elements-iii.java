class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int num = nums[nums.length-1];
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=num-nums[i];
        }
        return ans;
    }
}
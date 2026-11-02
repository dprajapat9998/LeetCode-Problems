class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int mid=nums[nums.length/2];
        for(int i=0;i<nums.length/2;i++){
            sum+=mid-nums[i];
            sum+=Math.abs(mid-nums[nums.length-1-i]);
        }
        return sum;
    }
}
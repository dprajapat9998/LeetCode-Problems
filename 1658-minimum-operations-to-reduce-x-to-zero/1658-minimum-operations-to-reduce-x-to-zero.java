class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            map.put(sum,i);
        }
        if(sum<x) return -1;

        int ans =Integer.MIN_VALUE;
        
        int target = sum-x;
         sum=0;
        for(int i=0;i<nums.length;i++){
             sum+=nums[i];
            int value = sum-target;
            if(map.containsKey(value)){
                ans=Math.max(ans,i-map.get(value));
            }
        }
        return ans==Integer.MIN_VALUE ? -1 : nums.length-ans; 
    }
}
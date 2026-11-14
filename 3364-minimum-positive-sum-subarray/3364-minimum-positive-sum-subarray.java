class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++){
            int count=1;
            int sum=0;
            for(int j=i;j<i+r && j<nums.size();j++){
                sum+=nums.get(j);
                if(count>=l && sum>0){
                        ans=Math.min(ans,sum);   
                }
                count++;
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}
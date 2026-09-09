class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int pointer=0;
        if(nums.length==0 ){
            return ans;
        }
        if(nums.length==1){
            ans.add(String.valueOf(nums[0]));
            return ans;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                continue;
            }else if(nums[i]!=nums[i-1]+1 && pointer == i-1){
                ans.add(String.valueOf(nums[pointer]));
                pointer++;
            }else{
                ans.add(String.valueOf(nums[pointer])+"->"+String.valueOf(nums[i-1]));
                pointer=i;
            }  
        }
        if(pointer==nums.length-1){
            ans.add(String.valueOf(nums[pointer]));
        }else{
            ans.add(String.valueOf(nums[pointer])+"->"+String.valueOf(nums[nums.length-1]));
        }
        return ans;
    }
}
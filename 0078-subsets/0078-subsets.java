class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void solve(int[] nums,List<Integer> list , int i){
        if(i>=nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        solve(nums,list,i+1);
        list.remove(list.size()-1);
        solve(nums,list,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        solve(nums,new ArrayList<>(),0);
        return ans;
    }
}
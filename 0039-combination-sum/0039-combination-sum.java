class Solution {
    public void solve(int[] c, int i,int t,List<List<Integer>> ans,List<Integer> arr){
        if(i>=c.length){
            if(t==0){
                ans.add(new ArrayList<>(arr));
            }
            return;
        }
        if(t >= c[i]){
        arr.add(c[i]);
        solve(c,i,t-c[i],ans,arr);
        arr.remove(arr.size()-1);
        }
        
        solve(c,i+1,t,ans,arr);
    }
    public List<List<Integer>> combinationSum(int[] c, int t) {
        List<List<Integer>> arr = new ArrayList<>();
        solve(c,0,t,arr,new ArrayList<>());
        return arr;
    }
}
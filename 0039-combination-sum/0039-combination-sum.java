class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void solve(int[] c, int i,int t,List<Integer> arr){
        if(i>=c.length || t<0) return;
        if(t==0){
            ans.add(new ArrayList<>(arr));
            return;
            }
        arr.add(c[i]);
        solve(c,i,t-c[i],arr);
        arr.remove(arr.size()-1);
        solve(c,i+1,t,arr);
    }
    public List<List<Integer>> combinationSum(int[] c, int t) {
        List<Integer> arr = new ArrayList<>();
        solve(c,0,t,arr);
        return ans;
    }
}
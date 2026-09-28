class Solution {
    public int maxDepth(String s) {
        int count=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }else if(s.charAt(i)==')'){
                count--;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}
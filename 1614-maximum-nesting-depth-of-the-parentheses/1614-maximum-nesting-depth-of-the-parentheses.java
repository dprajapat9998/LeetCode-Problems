class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                stack.pop();
            }
            ans=Math.max(ans,stack.size());
        }
        return ans;
    }
}
class Solution {
    public StringBuilder reverse(int i,int j,StringBuilder sb){
        while(i<j){
            Character temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        return sb;
    }
    public String reverseParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.add(ans.length());
            }else if(s.charAt(i)==')'){
                ans=reverse(stack.pop(),ans.length()-1,ans);
            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
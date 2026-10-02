class Solution {
    public boolean isValid(StringBuilder sb){
        if(sb.length()%2==1) return false;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='('){
                stack.push('(');
            }else if(!stack.isEmpty() && sb.charAt(i)==')'){
                stack.pop();
            }else{
                return false;
            }
        }
        
        return stack.isEmpty();
    }
    public void solve(int n, StringBuilder sb, List<String> list) {
        if (sb.length() == n * 2) {
            if(isValid(sb)){
                list.add(sb.toString());
            }
            return;
        }
        sb.append('(');
        solve(n, sb, list);
        sb.deleteCharAt(sb.length() - 1);
        sb.append(')');
        solve(n, sb, list);
        sb.deleteCharAt(sb.length() - 1);
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        solve(n, new StringBuilder(), list);
        return list;
    }
}
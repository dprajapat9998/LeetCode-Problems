class Solution {
    public boolean isValid(StringBuilder sb){
        if(sb.length()%2==1) return false;
        int count=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='('){
                count++;
            }else {
                count--;
            }
            if(count<0) return false;
        }
         return count==0;
    }
    public void solve(int n, StringBuilder sb, List<String> list,int open,int close) {
        if (sb.length() == n * 2) {
            if(open==close){
                list.add(sb.toString());
            }
            return;
        }
        if(open>n || close>open) return;
        sb.append('(');
        solve(n, sb, list,open+1,close);
        sb.deleteCharAt(sb.length() - 1);
        sb.append(')');
        solve(n, sb, list,open,close+1);
        sb.deleteCharAt(sb.length() - 1);
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        solve(n, new StringBuilder(), list,0,0);
        return list;
    }
}
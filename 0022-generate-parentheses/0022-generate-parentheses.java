class Solution {
    public void solve(int n, StringBuilder sb, List<String> list,int open,int close) {
        if (sb.length() == n * 2) {
            if(open==close){
                list.add(sb.toString());
            }
            return;
        }
        if(open>n || close>open) return;

        if(open<n){
        sb.append('(');
        solve(n, sb, list,open+1,close);
        sb.deleteCharAt(sb.length() - 1);
        }
        if(open>close){
        sb.append(')');
        solve(n, sb, list,open,close+1);
        sb.deleteCharAt(sb.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        solve(n, new StringBuilder(), list,0,0);
        return list;
    }
}
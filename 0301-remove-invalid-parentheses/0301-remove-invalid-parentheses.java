class Solution {
     int max = 0;
    public void solve(String s, Set<String> list, int i, StringBuilder sb, int open) {
        if (i >= s.length()) {
            if (open == 0) {
                    max = Math.max(max,sb.length());
                    list.add(sb.toString());
            }
            return;
        }
        if (open < 0) {
            return;
        }
        if (s.charAt(i) != '(' && s.charAt(i) != ')') {
            sb.append(s.charAt(i));
            solve(s, list, i + 1, sb, open);
            sb.deleteCharAt(sb.length() - 1);
            return;
        }
        sb.append(s.charAt(i));

        if (s.charAt(i) == '(') {
            solve(s, list, i + 1, sb, open + 1);
        } else {
            solve(s, list, i + 1, sb, open - 1);
        }

        sb.deleteCharAt(sb.length() - 1);
        solve(s, list, i + 1, sb, open);
    }

    public List<String> removeInvalidParentheses(String s) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        solve(s, set, 0, new StringBuilder(), 0);
        for(String s1: set){
            if(s1!="" && s1.length()==max)
            list.add(s1);
        }
        if (list.size() == 0) {
            list.add("");
        }
        
        return list;
    }
}
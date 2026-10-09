
class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    // Found a pair ))
                    if (open > 0) {
                        open--;
                    } else {
                        ans++; // Insert (
                    }
                    i++; // Consume the second )
                } else {
                    // Found a single )
                    if (open > 0) {
                        open--;
                        ans++; // Insert the missing )
                    } else {
                        ans += 2; // Insert ( and )
                    }
                }
            }
        }

        // Every remaining ( needs two )
        ans += open * 2;

        return ans;
    }
}

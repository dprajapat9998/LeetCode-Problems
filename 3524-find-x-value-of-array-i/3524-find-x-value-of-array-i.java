class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] result = new long[k];
        long[] current = new long[k];
        for (int num : nums) {
            long[] next = new long[k];
            for (int r = 0; r < k; r++) {
                if (current[r] > 0) {
                    int newRemainder = (int)((r * (long)num) % k);
                    next[newRemainder] += current[r];
                }
            }
            int remainder = num % k;
            next[remainder]++;
            for (int r = 0; r < k; r++) {
                result[r] += next[r];
            }
            current = next;
        }
        return result;
    }
}
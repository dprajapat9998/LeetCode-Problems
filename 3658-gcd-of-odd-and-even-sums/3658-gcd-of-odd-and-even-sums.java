class Solution {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
    public int gcdOfOddEvenSums(int n) {
        // int evensum=0,oddsum=-1;
        // int sumeven=0,sumodd=0;
        // for(int i=1;i<=n;i++){
        //     evensum+=2;
        //     sumeven=sumeven+evensum;
        //     oddsum+=2;
        //     sumodd+=oddsum;
        // }
       
        return n;
    }
}